package org.redquark.web3.entities.transactions;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TransactionInput {

    // Reference to the transaction output
    private String transactionOutputId;
    // Unspent transaction output - it is actually the funds remaining
    // after a transaction (anlogous to change)
    private TransactionOutput utxo;
}
