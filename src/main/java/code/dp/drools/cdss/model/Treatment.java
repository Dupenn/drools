package code.dp.drools.cdss.model;

import java.io.Serializable;

/**
 * @Author: Dupeng
 * @Email: dupeng@baiyyy.com.cn
 * @Date: 2020/1/17 13:54
 * @Description:
 */
public class Treatment implements Serializable {
    private static final long serialVersionUID = 6949751443164790255L;

    // 方案名称
    private String name;

    public Treatment() {
    }

    public Treatment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
