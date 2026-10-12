package za.co.fraudengine.service;

import org.springframework.stereotype.Service;
import za.co.fraudengine.model.Transaction;

@Service
public class FraudRuleService {

    private final FraudRuleEngine fraudRuleEngine;

    public FraudRuleService(FraudRuleEngine fraudRuleEngine) {
        this.fraudRuleEngine = fraudRuleEngine;
    }

    public boolean isHighValueTransaction(Transaction transaction) {
        return fraudRuleEngine.isHighValueTransaction(transaction);
    }
}