package za.co.fraudengine.service;

import org.springframework.stereotype.Component;
import za.co.fraudengine.model.Transaction;
import java.math.BigDecimal;

@Component
public class FraudRuleEngine {

public boolean isHighValueTransaction(Transaction transaction) {
    if (transaction == null || transaction.getAmount() == null) {
return false;
    }

return transaction.getAmount()
.compareTo(new BigDecimal("1000")) > 0;
}
}