package code.dp.drools.cdss;

import code.dp.drools.cdss.model.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.kie.api.KieServices;
import org.kie.api.event.rule.AfterMatchFiredEvent;
import org.kie.api.event.rule.DefaultAgendaEventListener;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * @Author: Dupeng
 * @Email: dupeng@baiyyy.com.cn
 * @Date: 2020/1/13 9:27
 * @Description:
 */
@Slf4j
public class BinvTest
//        extends DroolsApplicationTests
{

    private static KieServices kieServices = KieServices.Factory.get();
    private static KieContainer kieContainer = kieServices.newKieClasspathContainer();

    @AfterAll
    public static void cleanUp() {
        kieContainer.dispose();
    }

    public static Patient fifthCase() {

        Patient p = new Patient("T1", "N0", "M0");

        // 判断[局域治疗（Page2）]所需参数
        p.setSurgeryName("乳房肿瘤切除术并外科腋窝分期(1类)");
        p.setPositiveAxillaryLymphNodes(5);//阳性腋窝淋巴结
//        p.setNegativeAxillaryLymph(true);
//        p.setCancerSize(3);//乳房肿瘤大小
//        p.setConserveStandard(true);//保乳标准

        //判断[全身辅助治疗（PAGE4）]所需参数
        p.setHistologyType("导管癌");//组织学类型
        p.setEr(0);
        p.setPr(0);
        p.setHer2(1);

        //判断[随访（PAGE8）]所需参数
        p.setPrimaryTumorStage("pT2");//原发肿瘤分期
        p.setRegionalLymphNodesStage("pN0");//区域淋巴结分期
        p.setLymphaticMetastasis(0);//淋巴结转移灶个数
        p.setPrimaryTumorSize(1.88f);//原发肿瘤大小

        //判断[复发/IV期（PAGE18）]所需参数
        p.setClinicalStage("复发");

        //判断[复发/IV期（M1）的全身治疗]所需参数
        p.setMetastaticSites("肝转移");
        p.setTreatedOfThePastYear(true);//过去一年是否接受过治疗

        //判断[复发/IV期（M1）的全身治疗:ER和/或PR阴性；HER2阳性]所需参数
        p.setFrontLineTreatEvaluation("疾病进展");
//        p.setFrontLineToxicityOfTolerance("无法耐受");
        p.setFrontLineStatus(1);
        p.setSecondLineStatus(0);
        p.setThirdLineStatus(0);

        //已用方案
        p.setFrontLineTreatUsed("曲妥珠单抗+美坦新偶联物(T-DM1)");

        return p;
    }

    public static Patient fakeCase1(){
        Patient p = new Patient("T2", "N1", "M0");

        // 判断[局域治疗（Page2）]所需参数
        p.setSurgeryName("乳房肿瘤切除术并外科腋窝分期(1类)");
        p.setPositiveAxillaryLymphNodes(5);//阳性腋窝淋巴结
//        p.setNegativeAxillaryLymph(true);
//        p.setCancerSize(3);//乳房肿瘤大小
//        p.setConserveStandard(true);//保乳标准

        //判断[全身辅助治疗（PAGE4）]所需参数
        p.setHistologyType("导管癌");//组织学类型
        p.setEr(1);
        p.setPr(1);
        p.setHer2(1);

        //判断[随访（PAGE8）]所需参数
        p.setPrimaryTumorStage("pT2");//原发肿瘤分期
        p.setRegionalLymphNodesStage("pN0");//区域淋巴结分期
        p.setLymphaticMetastasis(0);//淋巴结转移灶个数
        p.setPrimaryTumorSize(1.88f);//原发肿瘤大小

        //判断[复发/IV期（PAGE18）]所需参数
        p.setClinicalStage("复发");

        //判断[复发/IV期（M1）的全身治疗]所需参数
        p.setMetastaticSites("肝转移");
        p.setTreatedOfThePastYear(true);//过去一年是否接受过治疗

        //判断[复发/IV期（M1）的全身治疗:ER和/或PR阴性；HER2阳性]所需参数
        p.setFrontLineTreatEvaluation("疾病进展");
//        p.setFrontLineToxicityOfTolerance("无法耐受");
        p.setFrontLineStatus(0);
        p.setSecondLineStatus(0);
        p.setThirdLineStatus(0);

        //已用方案
        p.setFrontLineTreatUsed("曲妥珠单抗+多西他赛");

        return p;
    }

    public static Patient fakeCase2(){
        Patient p = new Patient("T2", "N1", "M0");

        // 判断[局域治疗（Page2）]所需参数
        p.setSurgeryName("乳房肿瘤切除术并外科腋窝分期(1类)");
        p.setPositiveAxillaryLymphNodes(5);//阳性腋窝淋巴结
//        p.setNegativeAxillaryLymph(true);
//        p.setCancerSize(3);//乳房肿瘤大小
//        p.setConserveStandard(true);//保乳标准

        //判断[全身辅助治疗（PAGE4）]所需参数
        p.setHistologyType("导管癌");//组织学类型
        p.setEr(0);
        p.setPr(0);
        p.setHer2(1);

        //判断[随访（PAGE8）]所需参数
        p.setPrimaryTumorStage("pT2");//原发肿瘤分期
        p.setRegionalLymphNodesStage("pN0");//区域淋巴结分期
        p.setLymphaticMetastasis(0);//淋巴结转移灶个数
        p.setPrimaryTumorSize(1.88f);//原发肿瘤大小

        //判断[复发/IV期（PAGE18）]所需参数
        p.setClinicalStage("复发");

        //判断[复发/IV期（M1）的全身治疗]所需参数
        p.setMetastaticSites("肝转移");
        p.setTreatedOfThePastYear(true);//过去一年是否接受过治疗

        //判断[复发/IV期（M1）的全身治疗:ER和/或PR阴性；HER2阳性]所需参数
        p.setFrontLineTreatEvaluation("疾病进展");
//        p.setFrontLineToxicityOfTolerance("无法耐受");
        p.setFrontLineStatus(0);
        p.setSecondLineStatus(0);
        p.setThirdLineStatus(0);

        //已用方案
        p.setFrontLineTreatUsed("曲妥珠单抗+多西他赛");

        return p;
    }

    @Test
    public void testBinv() {
        Binv1 binv1 = new Binv1("t2", "n1", "m0");
        Binv1 binv121 = new Binv1("t2", "n1", "m0");
        Binv2 binv2 = new Binv2("乳房肿瘤切除术并腋窝外科分期（1类）", true);
        binv2.setCancerSize(3);
        binv2.setConserveStandard(true);
        Binv3 binv3 = new Binv3();
        Binv4 binv4 = new Binv4();
        binv4.setHistologyType("小管癌");
        binv4.setEr(0);
        binv4.setPr(1);
//        binv4.setHer2(1);
        Binv5 binv5 = new Binv5();
        binv5.setPrimaryTumorStage("pt1");
        binv5.setRegionalLymphNodesStage("pn0");
        Binv6 binv6 = new Binv6();
        Binv7 binv7 = new Binv7();
        Binv8 binv8 = new Binv8();
        Binv9 binv9 = new Binv9();
        Binv10 binv10 = new Binv10();

        Binv11 binv11 = new Binv11();
        Binv15 binv15 = new Binv15();
        KieSession kieSession = kieContainer.newKieSession("cdss-binv");
        kieSession.insert(binv1);
        kieSession.insert(binv2);
        kieSession.insert(binv3);
        kieSession.insert(binv4);
        kieSession.insert(binv5);
        kieSession.insert(binv6);
        kieSession.insert(binv7);
        kieSession.insert(binv8);
        kieSession.insert(binv9);
        kieSession.insert(binv10);
        kieSession.insert(binv11);
        kieSession.insert(binv15);

        kieSession.fireAllRules();
        kieSession.dispose();
    }

    @Test
    @Disabled
    public void testRules() {
        Inspect inspect = new Inspect(-1, 0, 1);
        KieSession kieSession = kieContainer.newKieSession("ksession-test");
        kieSession.insert(inspect);
        kieSession.fireAllRules();
        kieSession.dispose();
    }

    @Test
    public void testPatient() {
        KieSession kieSession = kieContainer.newKieSession("rules-patient");
//        kieSession.addEventListener( new DebugRuleRuntimeEventListener() );
        kieSession.addEventListener(new DefaultAgendaEventListener() {
            public void afterMatchFired(AfterMatchFiredEvent event) {
                super.afterMatchFired(event);
//                System.out.println(event);
            }
        });
        Patient patient = fifthCase();
//        Patient patient = fakeCase1();
//        Patient patient = fakeCase2();
        kieSession.insert(patient);
        kieSession.fireAllRules();
        kieSession.dispose();
    }

}
