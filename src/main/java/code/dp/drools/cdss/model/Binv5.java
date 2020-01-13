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
public class Binv5 implements Serializable {
    private Boolean fromPage4;

    //原发肿瘤分期
    private String primaryTumorStage;

    // 区域淋巴结分期
    private String regionalLymphNodesStage;

    //原发肿瘤直径cm
    private float primaryTumorSize;

    //淋巴转移灶直径大于2mm的个数
    private int lymphaticMetastasis;
    // 方案名称t
    private String name;
}
