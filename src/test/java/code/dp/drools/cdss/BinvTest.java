package code.dp.drools.cdss;

import code.dp.drools.cdss.model.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.kie.api.KieServices;
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
//        kieSession.insert(new Patient().setCT("T1").setCN("N0").setCM("M0"));
        kieSession.insert(new Patient().setCT("T2").setCN("N0").setCM("M0"));
//        kieSession.insert(new Patient().setCT("T3").setCN("N2").setCM("M0"));
        kieSession.fireAllRules();
        kieSession.dispose();
    }

    @AfterAll
    public static void cleanUp() {
        kieContainer.dispose();
    }

}
