package za.co.fraudengine;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import za.co.fraudengine.service.FraudRuleService;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class FraudRuleEngineServiceApplicationTests {

@Autowired
private FraudRuleService fraudRuleService;

@Test
void contextLoads() {
assertNotNull(fraudRuleService);
}
}