package code.dp.drools.template;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: Dupeng
 * @Email: dupeng@baiyyy.com.cn
 * @Date: 2020/1/14 16:55
 * @Description: drools中的单条规则模板
 */
//@Data
public class RuleTemplate implements Serializable {
    /**
     * 规则名称
     */
    private String name;

    /**
     * 规则执行优先级，为整数，默认为0，数字越大越早执行，可为正整数，0，负整数
     */
    @Builder.Default
    private Integer salience = 0;

    /**
     * 定义当前的规则是否不允许多次循环执行，默认是 false，也就是当前的规则只要满足条件，可以无限次执行。
     */
    @Builder.Default
    private Boolean noLoop = false;

    /**
     * 默认值：N/A
     * <p>
     * 类型：String
     * <p>
     * Ruleflow是一个Drools功能，可让您控制规则的触发。由相同的规则流组标识汇编的规则仅在其组处于活动状态时触发。
     * 将规则划分为一个个的组，然后在规则流当中通过使用ruleflow-group属性的值，从而使用对应的规则。
     */
    @Builder.Default
    private Boolean ruleflowGroup = false;
    /**
     * 默认值：false
     * <p>
     * 类型：Boolean
     * <p>
     * 当在规则上使用ruleflow-group 属性或agenda-group 属性的时候，将lock-on-action 属性的值设置为true，
     * 可能避免因某些Fact 对象被修改而使已经执行过的规则再次被激活执行。可以看出该属性与no-loop 属性有相似之处，
     * no-loop 属性是为了避免Fact 修改或调用了insert、retract、update 之类而导致规则再次激活执行，
     * 这里的lock-on-action 属性也是起这个作用，lock-on-active 是no-loop 的增强版属性，
     * 它主要作用在使用ruleflow-group 属性或agenda-group 属性的时候
     */
    @Builder.Default
    private Boolean lockOnActive = false;
    private String whenStr;
    private String thenStr;
    private String endStr = "end";
}
