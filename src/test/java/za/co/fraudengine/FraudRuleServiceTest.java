package za.co.fraudengine;

import org.junit.jupiter.api.Test;
import za.co.fraudengine.model.Transaction;
import za.co.fraudengine.service.FraudRuleEngine;
import za.co.fraudengine.service.FraudRuleService;

import java.math.BigDecimal;
import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class FraudRuleServiceTest {

private final FraudRuleService fraudRuleService =
new FraudRuleService(new FraudRuleEngine());

@Test
void shouldIdentifyHighValueTransaction() {
Transaction transaction = new Transaction(
"ACC123",
new BigDecimal("1500.00"),
"ZAR",
Instant.now()
);

assertTrue(
fraudRuleService.isHighValueTransaction(transaction)
);
}

@Test
void shouldNotIdentifyTransactionOfExactly1000AsHighValue() {
Transaction transaction = new Transaction(
"ACC123",
new BigDecimal("1000.00"),
"ZAR",
Instant.now()
);

assertFalse(
fraudRuleService.isHighValueTransaction(transaction)
);
}

@Test
void shouldReturnFalseForNullTransaction() {
assertFalse(
fraudRuleService.isHighValueTransaction(null)
);
}
}