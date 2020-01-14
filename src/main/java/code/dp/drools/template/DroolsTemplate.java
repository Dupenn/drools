package code.dp.drools.template;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @Author: Dupeng
 * @Email: dupeng@baiyyy.com.cn
 * @Date: 2020/1/14 15:50
 * @Description: drools 规则语法模板
 */
@Data
public class DroolsTemplate implements Serializable {
    private static Logger logger = LoggerFactory.getLogger(DroolsTemplate.class);

    /**
     * package 表示一个命名空间.package是必须定义的，必须放在规则文件第一行.
     */
    private String namespace;
    /**
     * 规则中的对于Java类的依赖列表
     * import语句的工作方式类似于Java中的import语句。您需要为要在规则中使用的任何对象指定完全限定路径和类型名称。
     */
    private List<String> imports;

    /**
     * global用于定义全局变量。
     * eg. global java.util.List myGlobalList;
     */
    private Map<String, Object> globals;

    /**
     * 规则列表
     */
    private List<RuleTemplate> ruleTemplates;


    @Override
    public String toString() {
        if (!StringUtils.isNotEmpty(namespace)) {
            logger.error("规则文件命名空间为空！");
            return "";
        }


        return "DroolsTemplate{" +
                "namespace='" + namespace + '\'' +
                ", imports=" + imports +
                ", globals=" + globals +
                ", ruleTemplates=" + ruleTemplates +
                '}';
    }
}
