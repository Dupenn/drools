package code.dp.drools.cdss.model;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: Dupeng
 * @Email: dupeng@baiyyy.com.cn
 * @Date: 2020/1/15 16:04
 * @Description:
 */
@Data
@Accessors(chain = true)
public class Patient implements Serializable {

    // TNM 分期
    private String cT;
    private String cN;
    private String cM;

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

    // 组织学类型
    private String histologyType;

    // 激素受体状态
    private int pr;
    private int er;
    private int her2;

    //原发肿瘤分期
    private String primaryTumorStage;

    // 区域淋巴结分期
    private String regionalLymphNodesStage;

    //原发肿瘤直径cm
    private float primaryTumorSize;

    //淋巴转移灶直径大于2mm的个数
    private int lymphaticMetastasis;

    // 临床分期
    private String clinicalStage;

    /**
     * 页面跳转
     */
    private Boolean toPage2;
    private Boolean toPage11;
    private Boolean toPage15;

}
