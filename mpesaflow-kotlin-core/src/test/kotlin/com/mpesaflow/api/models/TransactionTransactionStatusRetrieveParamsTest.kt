// File generated from our OpenAPI spec by Stainless.

package com.mpesaflow.api.models

import com.mpesaflow.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionTransactionStatusRetrieveParamsTest {

    @Test
    fun createTransactionTransactionStatusRetrieveParams() {
        TransactionTransactionStatusRetrieveParams.builder().transactionId("transactionId").build()
    }

    @Test
    fun getPathParam() {
        val params =
            TransactionTransactionStatusRetrieveParams.builder()
                .transactionId("transactionId")
                .build()
        assertThat(params).isNotNull
        // path param "transactionId"
        assertThat(params.getPathParam(0)).isEqualTo("transactionId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
