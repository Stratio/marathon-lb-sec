package com.stratio.marathonlbsec.functionalAT;

import com.stratio.qa.cucumber.testng.CucumberFeatureWrapper;
import com.stratio.qa.cucumber.testng.PickleEventWrapper;
import com.stratio.qa.utils.BaseGTest;
import cucumber.api.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = {
        "src/test/resources/features/functionalAT/040_IpTables/QATM_1685_Check_Iptables.feature"
},plugin = "json:target/cucumber.json")
public class QATM_1685_Check_Iptables_IT extends BaseGTest {

    public QATM_1685_Check_Iptables_IT() {
    }

    @Test(enabled = true, groups = {"iptables"}, dataProvider = "scenarios")
    public void QATM_1685_Check_Iptables_IT(PickleEventWrapper pickleWrapper, CucumberFeatureWrapper featureWrapper) throws Throwable {
        runScenario(pickleWrapper, featureWrapper);
    }
}
