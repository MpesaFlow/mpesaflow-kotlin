// File generated from our OpenAPI spec by Stainless.

package com.mpesaflow.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionStatusTest {

    @Test
    fun createTransactionStatus() {
        val transactionStatus =
            TransactionStatus.builder()
                .resultDesc("resultDesc")
                .status(TransactionStatus.Status.PENDING)
                .transactionId("transactionId")
                .build()
        assertThat(transactionStatus).isNotNull
        assertThat(transactionStatus.resultDesc()).isEqualTo("resultDesc")
        assertThat(transactionStatus.status()).isEqualTo(TransactionStatus.Status.PENDING)
        assertThat(transactionStatus.transactionId()).isEqualTo("transactionId")
    }
}
