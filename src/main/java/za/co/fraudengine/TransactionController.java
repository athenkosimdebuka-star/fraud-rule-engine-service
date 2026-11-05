
package za.co.fraudengine.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.fraudengine.model.Transaction;
import za.co.fraudengine.service.FraudRuleService;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

private final FraudRuleService fraudRuleService;

public TransactionController(FraudRuleService fraudRuleService) {
this.fraudRuleService = fraudRuleService;
}

@PostMapping("/check")
public boolean checkTransaction(@RequestBody Transaction transaction) {
return fraudRuleService.isHighValueTransaction(transaction);
}
@PostMapping("/check/missing-account-id")
public boolean checkMissingAccountId(@RequestBody Transaction transaction) {
return fraudRuleService.isMissingAccountId(transaction);
}
}