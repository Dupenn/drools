package code.dp.drools.cdss.model;

import java.io.Serializable;

/**
 * @Author: Dupeng
 * @Email: dupeng@baiyyy.com.cn
 * @Date: 2020/1/15 16:04
 * @Description:
 */

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

    public Patient() {
    }

    public Patient(String cT, String cN, String cM) {
        this.cT = cT;
        this.cN = cN;
        this.cM = cM;
    }

    public String getcT() {
        return cT;
    }

    public void setcT(String cT) {
        this.cT = cT;
    }

    public String getcN() {
        return cN;
    }

    public void setcN(String cN) {
        this.cN = cN;
    }

    public String getcM() {
        return cM;
    }

    public void setcM(String cM) {
        this.cM = cM;
    }

    public String getSurgeryName() {
        return surgeryName;
    }

    public void setSurgeryName(String surgeryName) {
        this.surgeryName = surgeryName;
    }

    public Boolean getNegativeAxillaryLymph() {
        return negativeAxillaryLymph;
    }

    public void setNegativeAxillaryLymph(Boolean negativeAxillaryLymph) {
        this.negativeAxillaryLymph = negativeAxillaryLymph;
    }

    public Integer getPositiveAxillaryLymphNodes() {
        return positiveAxillaryLymphNodes;
    }

    public void setPositiveAxillaryLymphNodes(Integer positiveAxillaryLymphNodes) {
        this.positiveAxillaryLymphNodes = positiveAxillaryLymphNodes;
    }

    public Boolean getFromPage1() {
        return fromPage1;
    }

    public void setFromPage1(Boolean fromPage1) {
        this.fromPage1 = fromPage1;
    }

    public Boolean getConserveStandard() {
        return conserveStandard;
    }

    public void setConserveStandard(Boolean conserveStandard) {
        this.conserveStandard = conserveStandard;
    }

    public int getCancerSize() {
        return cancerSize;
    }

    public void setCancerSize(int cancerSize) {
        this.cancerSize = cancerSize;
    }

    public String getHistologyType() {
        return histologyType;
    }

    public void setHistologyType(String histologyType) {
        this.histologyType = histologyType;
    }

    public int getPr() {
        return pr;
    }

    public void setPr(int pr) {
        this.pr = pr;
    }

    public int getEr() {
        return er;
    }

    public void setEr(int er) {
        this.er = er;
    }

    public int getHer2() {
        return her2;
    }

    public void setHer2(int her2) {
        this.her2 = her2;
    }

    public String getPrimaryTumorStage() {
        return primaryTumorStage;
    }

    public void setPrimaryTumorStage(String primaryTumorStage) {
        this.primaryTumorStage = primaryTumorStage;
    }

    public String getRegionalLymphNodesStage() {
        return regionalLymphNodesStage;
    }

    public void setRegionalLymphNodesStage(String regionalLymphNodesStage) {
        this.regionalLymphNodesStage = regionalLymphNodesStage;
    }

    public float getPrimaryTumorSize() {
        return primaryTumorSize;
    }

    public void setPrimaryTumorSize(float primaryTumorSize) {
        this.primaryTumorSize = primaryTumorSize;
    }

    public int getLymphaticMetastasis() {
        return lymphaticMetastasis;
    }

    public void setLymphaticMetastasis(int lymphaticMetastasis) {
        this.lymphaticMetastasis = lymphaticMetastasis;
    }

    public String getClinicalStage() {
        return clinicalStage;
    }

    public void setClinicalStage(String clinicalStage) {
        this.clinicalStage = clinicalStage;
    }

    public Boolean getToPage2() {
        return toPage2;
    }

    public void setToPage2(Boolean toPage2) {
        this.toPage2 = toPage2;
    }

    public Boolean getToPage11() {
        return toPage11;
    }

    public void setToPage11(Boolean toPage11) {
        this.toPage11 = toPage11;
    }

    public Boolean getToPage15() {
        return toPage15;
    }

    public void setToPage15(Boolean toPage15) {
        this.toPage15 = toPage15;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "cT='" + cT + '\'' +
                ", cN='" + cN + '\'' +
                ", cM='" + cM + '\'' +
//                ", surgeryName='" + surgeryName + '\'' +
//                ", negativeAxillaryLymph=" + negativeAxillaryLymph +
//                ", positiveAxillaryLymphNodes=" + positiveAxillaryLymphNodes +
//                ", fromPage1=" + fromPage1 +
//                ", conserveStandard=" + conserveStandard +
//                ", cancerSize=" + cancerSize +
//                ", histologyType='" + histologyType + '\'' +
//                ", pr=" + pr +
//                ", er=" + er +
//                ", her2=" + her2 +
//                ", primaryTumorStage='" + primaryTumorStage + '\'' +
//                ", regionalLymphNodesStage='" + regionalLymphNodesStage + '\'' +
//                ", primaryTumorSize=" + primaryTumorSize +
//                ", lymphaticMetastasis=" + lymphaticMetastasis +
//                ", clinicalStage='" + clinicalStage + '\'' +
                ", toPage2=" + toPage2 +
                ", toPage11=" + toPage11 +
                ", toPage15=" + toPage15 +
                '}';
    }
}
