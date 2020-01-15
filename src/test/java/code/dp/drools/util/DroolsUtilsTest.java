package code.dp.drools.util;

import org.junit.jupiter.api.Test;
import org.kie.api.runtime.KieSession;

/**
 * @Author: Dupeng
 * @Email: dupeng@baiyyy.com.cn
 * @Date: 2020/1/14 17:14
 * @Description:
 */
class DroolsUtilsTest {

    @Test
    public void getKieSession() throws Exception {
        TNM tnm = new TNM("T0", "N1", "M0");
        String namespace = "package drools.test;";
        String import_prefix = "import code.dp.drools.util.TNM;";
        String rule = import_prefix + " rule \"AC-T_followed_by_Surgery\" when TNM(cT==\"T0\",cN==\"N1\",M==\"M0\") then System.out.println(\"AC-T_followed_by_Surgery\"); end";
        KieSession kieSession = new DroolsUtils().getKieSession(rule);
        kieSession.insert(tnm);
        kieSession.fireAllRules();
        kieSession.dispose();
    }
}