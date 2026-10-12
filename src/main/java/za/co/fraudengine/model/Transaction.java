package za.co.fraudengine.model;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public class Transaction {

private UUID id;

@NotBlank(message = "Account ID is required")
private String accountId;

@NotNull(message = "Amount is required")
@DecimalMin(value = "0.00", inclusive = false,
message = "Amount must be greater than zero")
private BigDecimal amount;

@NotBlank(message = "Currency is required")
private String currency;

@NotNull(message = "Transaction timestamp is required")
private Instant timestamp;

public Transaction() {
}

public Transaction(String accountId, BigDecimal amount,
String currency, Instant timestamp) {
this.id = UUID.randomUUID();
this.accountId = accountId;
this.amount = amount;
this.currency = currency;
this.timestamp = timestamp;
}

public UUID getId() {
return id;
}

public void setId(UUID id) {
this.id = id;
}

public String getAccountId() {
return accountId;
}

public void setAccountId(String accountId) {
this.accountId = accountId;
}

public BigDecimal getAmount() {
return amount;
}

public void setAmount(BigDecimal amount) {
this.amount = amount;
}

public String getCurrency() {
return currency;
}

public void setCurrency(String currency) {
this.currency = currency;
}

public Instant getTimestamp() {
return timestamp;
}

public void setTimestamp(Instant timestamp) {
this.timestamp = timestamp;
}
}

