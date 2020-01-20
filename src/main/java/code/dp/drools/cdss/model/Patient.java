package code.dp.drools.cdss.model;

import java.io.Serializable;
import java.util.HashSet;

/**
 * @Author: Dupeng
 * @Email: dupeng@baiyyy.com.cn
 * @Date: 2020/1/15 16:04
 * @Description:
 */

public class Patient implements Serializable {

    private static final long serialVersionUID = -6096428459909290663L;
    // TNM 分期(术前)
    private String cT;
    private String cN;
    private String cM;
    //前哨淋巴结活检
    private String slnb;
    //外科腋窝分期
    private String surgicalAxillaryStaging;
    //术前全身治疗方案名称
    private String systemicTherapyName;
    //术前全身治疗方案缓解情况
    private String systemicTherapyStatus;
    // 手术名称
    private String surgeryName;
    //术前方案是否完成 完成true/未完成false
    private Boolean beforeSurgeryStatus = false;
    // 术后腋窝淋巴结阴性
    private Boolean negativeAxillaryLymph = false;
    // 术后腋窝阳性淋巴结数量
    private Integer positiveAxillaryLymphNodes = 0;
    // 术后腋窝淋巴结阴性
    private Boolean negativeAxillaryLymphBeforeSurgery = false;
    // 术后腋窝阳性淋巴结数量
    private Integer positiveAxillaryLymphNodesBeforeSurgery = 0;
    //术前全身治疗淋巴结转为阴性的可能
    private Boolean positive2NegativeBeforeSurgery = false;
    // 保乳标准
    private Boolean conserveStandard = false;
    // 肿瘤大小cm
    private Integer cancerSize = 0;
    // 组织学类型
    private String histologyType;
    // 激素受体状态（术后）
    private Integer pr = 0;
    private Integer er = 0;
    private Integer her2 = 0;
    private Integer prBeforeSurgery = 0;
    private Integer erBeforeSurgery = 0;
    private Integer her2BeforeSurgery = 0;
    //原发肿瘤分期(术后pTNM)
    private String pT;
    private String pN;
    private String pM;
    private String ypT;
    private String ypN;
    private String ypM;

    //术前辅助治疗后腋窝淋巴结 1阳性0阴性
    private Integer preoperativeAdjuvantTreatmentOfAxillaryLymphNodes;
    //原发肿瘤直径cm
    private Float primaryTumorSize = 0f;
    //淋巴转移灶直径大于2mm的个数
    private Integer lymphaticMetastasis = 0;
    // 临床分期
    private String clinicalStage;
    //转移部位
    private String metastaticSites;
    //过去一年接受过治疗
    private Boolean treatedOfThePastYear = true;
    // 治疗状态：0未进行 1已进行
    private Integer frontLineStatus = 0;
    private Integer secondLineStatus = 0;
    private Integer thirdLineStatus = 0;
    // 疗效评估
    private String frontLineTreatEvaluation;
    private String secondLineTreatEvaluation;
    private String thirdLineTreatEvaluation;
    // 三线ECOG体力状况
    private Integer ecogPerformanceStatus = 0;
    // 毒性耐受
    private String frontLineToxicityOfTolerance;
    private String secondLineToxicityOfTolerance;
    // 方案名称
    private HashSet<String> treatmentName;
    //已用方案
    private String frontLineTreatUsed;
    private String secondLineTreatUsed;
    private String thirdLineTreatUsed;
    //临床腋窝淋巴结 阴性0/阳性1
    private int clinicalAxillaryLymphNode;
    // 腋窝淋巴结穿刺结果 阴性0/阳性1
    private int axillaryLymphNodePunctureResults;
    //新辅助化疗后临床腋窝淋巴结 阴性0/阳性1
    private int clinicalAxillaryLymphNodesAfterNeoadjuvantChemotherapy;
    //新辅助化疗后腋窝淋巴结穿刺结果 阴性0/阳性1
    private int resultsOfAxillaryLymphNodePunctureAfterNeoadjuvantChemotherapy;
    //术前辅助化疗
    private String preoperativeChemotherapy;

    private Boolean considerPreoperativeSystemicTreatment;

    public Boolean getConsiderPreoperativeSystemicTreatment() {
        return considerPreoperativeSystemicTreatment;
    }

    public void setConsiderPreoperativeSystemicTreatment(Boolean considerPreoperativeSystemicTreatment) {
        this.considerPreoperativeSystemicTreatment = considerPreoperativeSystemicTreatment;
    }

    /**
     * 页面跳转
     */
    private Boolean toPage2 = false;
    private Boolean toPage3 = false;
    private Boolean toPage4 = false;
    private Boolean toPage5 = false;
    private Boolean toPage6 = false;
    private Boolean toPage7 = false;
    private Boolean toPage8 = false;
    private Boolean toPage9 = false;
    private Boolean toPage10 = false;
    private Boolean toPage11 = false;
    private Boolean toPage12 = false;
    private Boolean toPage13 = false;
    private Boolean toPage14 = false;
    private Boolean toPage15 = false;
    private Boolean toPage16 = false;
    private Boolean toPage17 = false;
    private Boolean toPage18 = false;
    private Boolean toPage19 = false;
    private Boolean toPage20 = false;
    private Boolean toPage21 = false;
    private Boolean toPage22 = false;
    private Boolean toPage23 = false;
    private Boolean toPage24 = false;
    private Boolean toPage25 = false;
    private Boolean toPage26 = false;
    private Boolean toPage27 = false;
    private Boolean toPageJ = false;
    private Boolean toPageK = false;

    //绝经前0，绝经后1
    private Integer menstrualStatus;
    private String endocrinotherapy1;
    private String endocrinotherapy2;
    private String endocrinotherapy3;
    //禁忌
    private String taboos;

    public Patient() {
    }

    public Patient(String cT, String cN, String cM) {
        this.cT = cT;
        this.cN = cN;
        this.cM = cM;
    }

    public String getTaboos() {
        return taboos;
    }

    public void setTaboos(String taboos) {
        this.taboos = taboos;
    }

    public String getEndocrinotherapy1() {
        return endocrinotherapy1;
    }

    public void setEndocrinotherapy1(String endocrinotherapy1) {
        this.endocrinotherapy1 = endocrinotherapy1;
    }

    public String getEndocrinotherapy2() {
        return endocrinotherapy2;
    }

    public void setEndocrinotherapy2(String endocrinotherapy2) {
        this.endocrinotherapy2 = endocrinotherapy2;
    }

    public String getEndocrinotherapy3() {
        return endocrinotherapy3;
    }

    public void setEndocrinotherapy3(String endocrinotherapy3) {
        this.endocrinotherapy3 = endocrinotherapy3;
    }

    public Integer getMenstrualStatus() {
        return menstrualStatus;
    }

    public void setMenstrualStatus(Integer menstrualStatus) {
        this.menstrualStatus = menstrualStatus;
    }

    public Integer getPreoperativeAdjuvantTreatmentOfAxillaryLymphNodes() {
        return preoperativeAdjuvantTreatmentOfAxillaryLymphNodes;
    }

    public void setPreoperativeAdjuvantTreatmentOfAxillaryLymphNodes(Integer preoperativeAdjuvantTreatmentOfAxillaryLymphNodes) {
        this.preoperativeAdjuvantTreatmentOfAxillaryLymphNodes = preoperativeAdjuvantTreatmentOfAxillaryLymphNodes;
    }

    public String getYpT() {
        return ypT;
    }

    public void setYpT(String ypT) {
        this.ypT = ypT;
    }

    public String getYpN() {
        return ypN;
    }

    public void setYpN(String ypN) {
        this.ypN = ypN;
    }

    public String getYpM() {
        return ypM;
    }

    public void setYpM(String ypM) {
        this.ypM = ypM;
    }

    public String getPreoperativeChemotherapy() {
        return preoperativeChemotherapy;
    }

    public void setPreoperativeChemotherapy(String preoperativeChemotherapy) {
        this.preoperativeChemotherapy = preoperativeChemotherapy;
    }

    public String getSlnb() {
        return slnb;
    }

    public void setSlnb(String slnb) {
        this.slnb = slnb;
    }

    public String getSurgicalAxillaryStaging() {
        return surgicalAxillaryStaging;
    }

    public void setSurgicalAxillaryStaging(String surgicalAxillaryStaging) {
        this.surgicalAxillaryStaging = surgicalAxillaryStaging;
    }

    public String getSystemicTherapyStatus() {
        return systemicTherapyStatus;
    }

    public void setSystemicTherapyStatus(String systemicTherapyStatus) {
        this.systemicTherapyStatus = systemicTherapyStatus;
    }

    public Boolean getToPageJ() {
        return toPageJ;
    }

    public void setToPageJ(Boolean toPageJ) {
        this.toPageJ = toPageJ;
    }

    public Boolean getToPageK() {
        return toPageK;
    }

    public void setToPageK(Boolean toPageK) {
        this.toPageK = toPageK;
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

    public Boolean getConserveStandard() {
        return conserveStandard;
    }

    public void setConserveStandard(Boolean conserveStandard) {
        this.conserveStandard = conserveStandard;
    }

    public Integer getCancerSize() {
        return cancerSize;
    }

    public void setCancerSize(Integer cancerSize) {
        this.cancerSize = cancerSize;
    }

    public String getHistologyType() {
        return histologyType;
    }

    public void setHistologyType(String histologyType) {
        this.histologyType = histologyType;
    }

    public Integer getPr() {
        return pr;
    }

    public void setPr(Integer pr) {
        this.pr = pr;
    }

    public Integer getEr() {
        return er;
    }

    public void setEr(Integer er) {
        this.er = er;
    }

    public Integer getHer2() {
        return her2;
    }

    public void setHer2(Integer her2) {
        this.her2 = her2;
    }

    public String getpT() {
        return pT;
    }

    public void setpT(String pT) {
        this.pT = pT;
    }

    public String getpN() {
        return pN;
    }

    public void setpN(String pN) {
        this.pN = pN;
    }

    public Float getPrimaryTumorSize() {
        return primaryTumorSize;
    }

    public void setPrimaryTumorSize(Float primaryTumorSize) {
        this.primaryTumorSize = primaryTumorSize;
    }

    public Integer getLymphaticMetastasis() {
        return lymphaticMetastasis;
    }

    public void setLymphaticMetastasis(Integer lymphaticMetastasis) {
        this.lymphaticMetastasis = lymphaticMetastasis;
    }

    public String getClinicalStage() {
        return clinicalStage;
    }

    public void setClinicalStage(String clinicalStage) {
        this.clinicalStage = clinicalStage;
    }

    public String getMetastaticSites() {
        return metastaticSites;
    }

    public void setMetastaticSites(String metastaticSites) {
        this.metastaticSites = metastaticSites;
    }

    public Boolean getTreatedOfThePastYear() {
        return treatedOfThePastYear;
    }

    public void setTreatedOfThePastYear(Boolean treatedOfThePastYear) {
        this.treatedOfThePastYear = treatedOfThePastYear;
    }

    public Integer getFrontLineStatus() {
        return frontLineStatus;
    }

    public void setFrontLineStatus(Integer frontLineStatus) {
        this.frontLineStatus = frontLineStatus;
    }

    public Integer getSecondLineStatus() {
        return secondLineStatus;
    }

    public void setSecondLineStatus(Integer secondLineStatus) {
        this.secondLineStatus = secondLineStatus;
    }

    public Integer getThirdLineStatus() {
        return thirdLineStatus;
    }

    public void setThirdLineStatus(Integer thirdLineStatus) {
        this.thirdLineStatus = thirdLineStatus;
    }

    public String getFrontLineTreatEvaluation() {
        return frontLineTreatEvaluation;
    }

    public void setFrontLineTreatEvaluation(String frontLineTreatEvaluation) {
        this.frontLineTreatEvaluation = frontLineTreatEvaluation;
    }

    public String getSecondLineTreatEvaluation() {
        return secondLineTreatEvaluation;
    }

    public void setSecondLineTreatEvaluation(String secondLineTreatEvaluation) {
        this.secondLineTreatEvaluation = secondLineTreatEvaluation;
    }

    public String getThirdLineTreatEvaluation() {
        return thirdLineTreatEvaluation;
    }

    public void setThirdLineTreatEvaluation(String thirdLineTreatEvaluation) {
        this.thirdLineTreatEvaluation = thirdLineTreatEvaluation;
    }

    public Integer getEcogPerformanceStatus() {
        return ecogPerformanceStatus;
    }

    public void setEcogPerformanceStatus(Integer ecogPerformanceStatus) {
        this.ecogPerformanceStatus = ecogPerformanceStatus;
    }

    public String getFrontLineToxicityOfTolerance() {
        return frontLineToxicityOfTolerance;
    }

    public void setFrontLineToxicityOfTolerance(String frontLineToxicityOfTolerance) {
        this.frontLineToxicityOfTolerance = frontLineToxicityOfTolerance;
    }

    public String getSecondLineToxicityOfTolerance() {
        return secondLineToxicityOfTolerance;
    }

    public void setSecondLineToxicityOfTolerance(String secondLineToxicityOfTolerance) {
        this.secondLineToxicityOfTolerance = secondLineToxicityOfTolerance;
    }

    public HashSet<String> getTreatmentName() {
        return treatmentName;
    }

    public void setTreatmentName(HashSet<String> treatmentName) {
        this.treatmentName = treatmentName;
    }

    public String getFrontLineTreatUsed() {
        return frontLineTreatUsed;
    }

    public void setFrontLineTreatUsed(String frontLineTreatUsed) {
        this.frontLineTreatUsed = frontLineTreatUsed;
    }

    public String getSecondLineTreatUsed() {
        return secondLineTreatUsed;
    }

    public void setSecondLineTreatUsed(String secondLineTreatUsed) {
        this.secondLineTreatUsed = secondLineTreatUsed;
    }

    public String getThirdLineTreatUsed() {
        return thirdLineTreatUsed;
    }

    public void setThirdLineTreatUsed(String thirdLineTreatUsed) {
        this.thirdLineTreatUsed = thirdLineTreatUsed;
    }

    public Boolean getToPage2() {
        return toPage2;
    }

    public void setToPage2(Boolean toPage2) {
        this.toPage2 = toPage2;
    }

    public Boolean getToPage3() {
        return toPage3;
    }

    public void setToPage3(Boolean toPage3) {
        this.toPage3 = toPage3;
    }

    public Boolean getToPage4() {
        return toPage4;
    }

    public void setToPage4(Boolean toPage4) {
        this.toPage4 = toPage4;
    }

    public Boolean getToPage5() {
        return toPage5;
    }

    public void setToPage5(Boolean toPage5) {
        this.toPage5 = toPage5;
    }

    public Boolean getToPage6() {
        return toPage6;
    }

    public void setToPage6(Boolean toPage6) {
        this.toPage6 = toPage6;
    }

    public Boolean getToPage7() {
        return toPage7;
    }

    public void setToPage7(Boolean toPage7) {
        this.toPage7 = toPage7;
    }

    public Boolean getToPage8() {
        return toPage8;
    }

    public void setToPage8(Boolean toPage8) {
        this.toPage8 = toPage8;
    }

    public Boolean getToPage9() {
        return toPage9;
    }

    public void setToPage9(Boolean toPage9) {
        this.toPage9 = toPage9;
    }

    public Boolean getToPage10() {
        return toPage10;
    }

    public void setToPage10(Boolean toPage10) {
        this.toPage10 = toPage10;
    }

    public Boolean getToPage11() {
        return toPage11;
    }

    public void setToPage11(Boolean toPage11) {
        this.toPage11 = toPage11;
    }

    public Boolean getToPage12() {
        return toPage12;
    }

    public void setToPage12(Boolean toPage12) {
        this.toPage12 = toPage12;
    }

    public Boolean getToPage13() {
        return toPage13;
    }

    public void setToPage13(Boolean toPage13) {
        this.toPage13 = toPage13;
    }

    public Boolean getToPage14() {
        return toPage14;
    }

    public void setToPage14(Boolean toPage14) {
        this.toPage14 = toPage14;
    }

    public Boolean getToPage15() {
        return toPage15;
    }

    public void setToPage15(Boolean toPage15) {
        this.toPage15 = toPage15;
    }

    public Boolean getToPage16() {
        return toPage16;
    }

    public void setToPage16(Boolean toPage16) {
        this.toPage16 = toPage16;
    }

    public Boolean getToPage17() {
        return toPage17;
    }

    public void setToPage17(Boolean toPage17) {
        this.toPage17 = toPage17;
    }

    public Boolean getToPage18() {
        return toPage18;
    }

    public void setToPage18(Boolean toPage18) {
        this.toPage18 = toPage18;
    }

    public Boolean getToPage19() {
        return toPage19;
    }

    public void setToPage19(Boolean toPage19) {
        this.toPage19 = toPage19;
    }

    public Boolean getToPage20() {
        return toPage20;
    }

    public void setToPage20(Boolean toPage20) {
        this.toPage20 = toPage20;
    }

    public Boolean getToPage21() {
        return toPage21;
    }

    public void setToPage21(Boolean toPage21) {
        this.toPage21 = toPage21;
    }

    public Boolean getToPage22() {
        return toPage22;
    }

    public void setToPage22(Boolean toPage22) {
        this.toPage22 = toPage22;
    }

    public Boolean getToPage23() {
        return toPage23;
    }

    public void setToPage23(Boolean toPage23) {
        this.toPage23 = toPage23;
    }

    public Boolean getToPage24() {
        return toPage24;
    }

    public void setToPage24(Boolean toPage24) {
        this.toPage24 = toPage24;
    }

    public Boolean getToPage25() {
        return toPage25;
    }

    public void setToPage25(Boolean toPage25) {
        this.toPage25 = toPage25;
    }

    public Boolean getToPage26() {
        return toPage26;
    }

    public void setToPage26(Boolean toPage26) {
        this.toPage26 = toPage26;
    }

    public Boolean getToPage27() {
        return toPage27;
    }

    public void setToPage27(Boolean toPage27) {
        this.toPage27 = toPage27;
    }

    public String getpM() {
        return pM;
    }

    public void setpM(String pM) {
        this.pM = pM;
    }

    public Boolean getNegativeAxillaryLymphBeforeSurgery() {
        return negativeAxillaryLymphBeforeSurgery;
    }

    public void setNegativeAxillaryLymphBeforeSurgery(Boolean negativeAxillaryLymphBeforeSurgery) {
        this.negativeAxillaryLymphBeforeSurgery = negativeAxillaryLymphBeforeSurgery;
    }

    public Integer getPositiveAxillaryLymphNodesBeforeSurgery() {
        return positiveAxillaryLymphNodesBeforeSurgery;
    }

    public void setPositiveAxillaryLymphNodesBeforeSurgery(Integer positiveAxillaryLymphNodesBeforeSurgery) {
        this.positiveAxillaryLymphNodesBeforeSurgery = positiveAxillaryLymphNodesBeforeSurgery;
    }

    public Integer getPrBeforeSurgery() {
        return prBeforeSurgery;
    }

    public void setPrBeforeSurgery(Integer prBeforeSurgery) {
        this.prBeforeSurgery = prBeforeSurgery;
    }

    public Integer getErBeforeSurgery() {
        return erBeforeSurgery;
    }

    public void setErBeforeSurgery(Integer erBeforeSurgery) {
        this.erBeforeSurgery = erBeforeSurgery;
    }

    public Integer getHer2BeforeSurgery() {
        return her2BeforeSurgery;
    }

    public void setHer2BeforeSurgery(Integer her2BeforeSurgery) {
        this.her2BeforeSurgery = her2BeforeSurgery;
    }

    public Boolean getPositive2NegativeBeforeSurgery() {
        return positive2NegativeBeforeSurgery;
    }

    public void setPositive2NegativeBeforeSurgery(Boolean positive2NegativeBeforeSurgery) {
        this.positive2NegativeBeforeSurgery = positive2NegativeBeforeSurgery;
    }

    public String getSystemicTherapyName() {
        return systemicTherapyName;
    }

    public void setSystemicTherapyName(String systemicTherapyName) {
        this.systemicTherapyName = systemicTherapyName;
    }

    public int getClinicalAxillaryLymphNode() {
        return clinicalAxillaryLymphNode;
    }

    public void setClinicalAxillaryLymphNode(int clinicalAxillaryLymphNode) {
        this.clinicalAxillaryLymphNode = clinicalAxillaryLymphNode;
    }

    public int getAxillaryLymphNodePunctureResults() {
        return axillaryLymphNodePunctureResults;
    }

    public void setAxillaryLymphNodePunctureResults(int axillaryLymphNodePunctureResults) {
        this.axillaryLymphNodePunctureResults = axillaryLymphNodePunctureResults;
    }

    public int getClinicalAxillaryLymphNodesAfterNeoadjuvantChemotherapy() {
        return clinicalAxillaryLymphNodesAfterNeoadjuvantChemotherapy;
    }

    public void setClinicalAxillaryLymphNodesAfterNeoadjuvantChemotherapy(int clinicalAxillaryLymphNodesAfterNeoadjuvantChemotherapy) {
        this.clinicalAxillaryLymphNodesAfterNeoadjuvantChemotherapy = clinicalAxillaryLymphNodesAfterNeoadjuvantChemotherapy;
    }

    public int getResultsOfAxillaryLymphNodePunctureAfterNeoadjuvantChemotherapy() {
        return resultsOfAxillaryLymphNodePunctureAfterNeoadjuvantChemotherapy;
    }

    public void setResultsOfAxillaryLymphNodePunctureAfterNeoadjuvantChemotherapy(int resultsOfAxillaryLymphNodePunctureAfterNeoadjuvantChemotherapy) {
        this.resultsOfAxillaryLymphNodePunctureAfterNeoadjuvantChemotherapy = resultsOfAxillaryLymphNodePunctureAfterNeoadjuvantChemotherapy;
    }

    public Boolean getBeforeSurgeryStatus() {
        return beforeSurgeryStatus;
    }

    public void setBeforeSurgeryStatus(Boolean beforeSurgeryStatus) {
        this.beforeSurgeryStatus = beforeSurgeryStatus;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "cT='" + cT + '\'' +
                ", cN='" + cN + '\'' +
                ", cM='" + cM + '\'' +
                ", surgeryName='" + surgeryName + '\'' +
                ", negativeAxillaryLymph=" + negativeAxillaryLymph +
                ", positiveAxillaryLymphNodes=" + positiveAxillaryLymphNodes +
                ", conserveStandard=" + conserveStandard +
                ", cancerSize=" + cancerSize +
                ", histologyType='" + histologyType + '\'' +
                ", pr=" + pr +
                ", er=" + er +
                ", her2=" + her2 +
                ", primaryTumorStage='" + pT + '\'' +
                ", regionalLymphNodesStage='" + pN + '\'' +
                ", primaryTumorSize=" + primaryTumorSize +
                ", lymphaticMetastasis=" + lymphaticMetastasis +
                ", clinicalStage='" + clinicalStage + '\'' +
                ", metastaticSites='" + metastaticSites + '\'' +
                ", treatedOfThePastYear=" + treatedOfThePastYear +
                ", frontLineStatus=" + frontLineStatus +
                ", secondLineStatus=" + secondLineStatus +
                ", thirdLineStatus=" + thirdLineStatus +
                ", frontLineTreatEvaluation='" + frontLineTreatEvaluation + '\'' +
                ", secondLineTreatEvaluation='" + secondLineTreatEvaluation + '\'' +
                ", thirdLineTreatEvaluation='" + thirdLineTreatEvaluation + '\'' +
                ", ecogPerformanceStatus=" + ecogPerformanceStatus +
                ", frontLineToxicityOfTolerance='" + frontLineToxicityOfTolerance + '\'' +
                ", secondLineToxicityOfTolerance='" + secondLineToxicityOfTolerance + '\'' +
                ", treatmentName=" + treatmentName +
                ", frontLineTreatUsed='" + frontLineTreatUsed + '\'' +
                ", secondLineTreatUsed='" + secondLineTreatUsed + '\'' +
                ", thirdLineTreatUsed='" + thirdLineTreatUsed + '\'' +
                ", toPage2=" + toPage2 +
                ", toPage3=" + toPage3 +
                ", toPage4=" + toPage4 +
                ", toPage5=" + toPage5 +
                ", toPage6=" + toPage6 +
                ", toPage7=" + toPage7 +
                ", toPage8=" + toPage8 +
                ", toPage9=" + toPage9 +
                ", toPage10=" + toPage10 +
                ", toPage11=" + toPage11 +
                ", toPage12=" + toPage12 +
                ", toPage13=" + toPage13 +
                ", toPage14=" + toPage14 +
                ", toPage15=" + toPage15 +
                ", toPage16=" + toPage16 +
                ", toPage17=" + toPage17 +
                ", toPage18=" + toPage18 +
                ", toPage19=" + toPage19 +
                ", toPage20=" + toPage20 +
                ", toPage21=" + toPage21 +
                ", toPage22=" + toPage22 +
                ", toPage23=" + toPage23 +
                ", toPage24=" + toPage24 +
                ", toPage25=" + toPage25 +
                ", toPage26=" + toPage26 +
                ", toPage27=" + toPage27 +
                '}';
    }
}
