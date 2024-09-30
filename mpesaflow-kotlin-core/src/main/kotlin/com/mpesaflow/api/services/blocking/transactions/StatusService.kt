// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.mpesaflow.api.services.blocking.transactions

import com.mpesaflow.api.core.RequestOptions
import com.mpesaflow.api.models.TransactionStatus
import com.mpesaflow.api.models.TransactionStatusRetrieveParams

interface StatusService {

    /** Get transaction status */
    fun retrieve(
        params: TransactionStatusRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionStatus
}
