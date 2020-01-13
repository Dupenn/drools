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
public class Binv11 implements Serializable {
    private Boolean fromPage1;
    private Boolean fromPage2;
    // 方案名称
    private String name;
}
