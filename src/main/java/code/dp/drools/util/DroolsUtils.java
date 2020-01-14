package code.dp.drools.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.Message;
import org.kie.api.builder.Results;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * @Author: Dupeng
 * @Email: dupeng@baiyyy.com.cn
 * @Date: 2020/1/14 10:55
 * @Description:
 */
@Slf4j
public class DroolsUtils {

    private static KieServices kieServices = KieServices.Factory.get();

    /**
     * 规则推理
     *
     * @param dataParam   注入的数据类型
     * @param ruleName    待执行的规则文件名称
     * @param bizEstimate 注入的数据
     * @return true/false
     */
    public static boolean execDroolsEstimate(Object dataParam, String ruleName, Object bizEstimate) {
        if (dataParam == null) {
            log.error("请求规则推理的参数为空");
            return false;
        }
        if (!StringUtils.isNotEmpty(ruleName)) {
            log.error("推理的规则为空");
            return false;
        }
        KieContainer kieContainer = kieServices.newKieClasspathContainer();
        KieSession kieSession = null;
        try {
            kieSession = kieContainer.newKieSession(ruleName);

            kieSession.insert(bizEstimate);
            kieSession.insert(dataParam);

            kieSession.fireAllRules();

            log.info("推理结果:{}", bizEstimate.toString());
        } catch (Exception e) {
            log.error("规则推理出现错误:{}", e);
            return false;
        } finally {
            kieSession.dispose();
            kieContainer.dispose();
        }
        return true;
    }

    /**
     * 动态获取KieSession,写入规则到drools内存中
     *
     * @param rules 待注入的规则内容
     * @return {@link KieSession}
     */
    public KieSession getKieSession(String rules) throws Exception {
        KieFileSystem kfs = kieServices.newKieFileSystem();
        kfs.write("src/main/resources/rules/rules.drl", rules.getBytes());
        KieBuilder kieBuilder = kieServices.newKieBuilder(kfs).buildAll();
        Results results = kieBuilder.getResults();
        if (results.hasMessages(Message.Level.ERROR)) {
            log.error(String.valueOf(results.getMessages()));
            throw new Exception(results.getMessages().toString());
        }
        KieContainer kieContainer = kieServices.newKieContainer(kieServices.getRepository().getDefaultReleaseId());
        KieBase kieBase = kieContainer.getKieBase();

        return kieBase.newKieSession();
    }
}
