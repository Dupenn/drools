package code.dp.drools.cdss.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: Dupeng
 * @Email: dupeng@baiyyy.com.cn
 * @Date: 2020/1/9 15:29
 * @Description:
 */
@Data
@NoArgsConstructor
public class Binv2 implements Serializable {
    // 方案名称
    private String name;

    // 手术名称
    private String surgeryName;

    // 淋巴结阴性
    private Boolean negativeAxillaryLymph;

    // 阳性淋巴结数量
    private Integer positiveAxillaryLymphNodes;

    private Boolean fromPage1;

    // 保乳标准
    private Boolean conserveStandard;
    // 肿瘤大小cm
    private int cancerSize;

    public Binv2(String surgeryName) {
        this.surgeryName = surgeryName;
    }

    public Binv2(String surgeryName, Boolean conserveStandard, int cancerSize) {
        this.surgeryName = surgeryName;
        this.conserveStandard = conserveStandard;
        this.cancerSize = cancerSize;
    }

    public Binv2(String surgeryName, Boolean negativeAxillaryLymph) {
        this.surgeryName = surgeryName;
        this.negativeAxillaryLymph = negativeAxillaryLymph;
        if (negativeAxillaryLymph) {
            this.positiveAxillaryLymphNodes = 0;
        }
    }

    public Binv2(String surgeryName, Integer positiveAxillaryLymphNodes) {
        this.surgeryName = surgeryName;
        this.positiveAxillaryLymphNodes = positiveAxillaryLymphNodes;
        if (positiveAxillaryLymphNodes > 0) {
            this.negativeAxillaryLymph = false;
        }
    }
}
