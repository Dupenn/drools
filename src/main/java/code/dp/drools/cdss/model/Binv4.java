package code.dp.drools.cdss.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: Dupeng
 * @Email: dupeng@baiyyy.com.cn
 * @Date: 2020/1/9 16:47
 * @Description:
 */
@Data
@NoArgsConstructor
public class Binv4 implements Serializable {
    private Boolean fromPage2;
    // 方案名称
    private String name;

    // 组织学类型
    private String histologyType;

    // 激素受体状态
    private int pr;
    private int er;
    private int her2;
}
