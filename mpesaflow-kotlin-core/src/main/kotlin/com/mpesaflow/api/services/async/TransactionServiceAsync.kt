// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.mpesaflow.api.services.async

import com.mpesaflow.api.core.RequestOptions
import com.mpesaflow.api.models.TransactionRetrieveStatusParams
import com.mpesaflow.api.models.TransactionStatus

interface TransactionServiceAsync {

    /** Get transaction status */
    suspend fun retrieveStatus(
        params: TransactionRetrieveStatusParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionStatus
}
