package za.co.fraudengine;

import org.junit.jupiter.api.Test;
import za.co.fraudengine.service.FraudRuleEngine;
import za.co.fraudengine.model.Transaction;

import java.math.BigDecimal;
import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

class FraudRuleEngineTest {

private final FraudRuleEngine fraudRuleEngine = new FraudRuleEngine();

@Test
void shouldIdentifyHighValueTransaction() {
Transaction transaction = new Transaction(
"ACC123",
new BigDecimal("1500.00"),
"ZAR",
Instant.now()
);

assertTrue(
fraudRuleEngine.isHighValueTransaction(transaction)
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
fraudRuleEngine.isHighValueTransaction(transaction)
);

}
}