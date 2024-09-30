// File generated from our OpenAPI spec by Stainless.

package com.mpesaflow.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.mpesaflow.api.core.ExcludeMissing
import com.mpesaflow.api.core.JsonValue
import com.mpesaflow.api.core.NoAutoDetect
import com.mpesaflow.api.core.toUnmodifiable
import com.mpesaflow.api.models.*
import java.util.Objects

class PaymentCreateParams
constructor(
    private val accountReference: String,
    private val amount: Double,
    private val phoneNumber: String,
    private val transactionDesc: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountReference(): String = accountReference

    fun amount(): Double = amount

    fun phoneNumber(): String = phoneNumber

    fun transactionDesc(): String = transactionDesc

    internal fun getBody(): PaymentCreateBody {
        return PaymentCreateBody(
            accountReference,
            amount,
            phoneNumber,
            transactionDesc,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = PaymentCreateBody.Builder::class)
    @NoAutoDetect
    class PaymentCreateBody
    internal constructor(
        private val accountReference: String?,
        private val amount: Double?,
        private val phoneNumber: String?,
        private val transactionDesc: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** A reference for the transaction */
        @JsonProperty("accountReference") fun accountReference(): String? = accountReference

        /** The amount to be paid */
        @JsonProperty("amount") fun amount(): Double? = amount

        /** The phone number of the payer */
        @JsonProperty("phoneNumber") fun phoneNumber(): String? = phoneNumber

        /** A description of the transaction */
        @JsonProperty("transactionDesc") fun transactionDesc(): String? = transactionDesc

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentCreateBody &&
                this.accountReference == other.accountReference &&
                this.amount == other.amount &&
                this.phoneNumber == other.phoneNumber &&
                this.transactionDesc == other.transactionDesc &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountReference,
                        amount,
                        phoneNumber,
                        transactionDesc,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PaymentCreateBody{accountReference=$accountReference, amount=$amount, phoneNumber=$phoneNumber, transactionDesc=$transactionDesc, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountReference: String? = null
            private var amount: Double? = null
            private var phoneNumber: String? = null
            private var transactionDesc: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(paymentCreateBody: PaymentCreateBody) = apply {
                this.accountReference = paymentCreateBody.accountReference
                this.amount = paymentCreateBody.amount
                this.phoneNumber = paymentCreateBody.phoneNumber
                this.transactionDesc = paymentCreateBody.transactionDesc
                additionalProperties(paymentCreateBody.additionalProperties)
            }

            /** A reference for the transaction */
            @JsonProperty("accountReference")
            fun accountReference(accountReference: String) = apply {
                this.accountReference = accountReference
            }

            /** The amount to be paid */
            @JsonProperty("amount") fun amount(amount: Double) = apply { this.amount = amount }

            /** The phone number of the payer */
            @JsonProperty("phoneNumber")
            fun phoneNumber(phoneNumber: String) = apply { this.phoneNumber = phoneNumber }

            /** A description of the transaction */
            @JsonProperty("transactionDesc")
            fun transactionDesc(transactionDesc: String) = apply {
                this.transactionDesc = transactionDesc
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): PaymentCreateBody =
                PaymentCreateBody(
                    checkNotNull(accountReference) {
                        "`accountReference` is required but was not set"
                    },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(phoneNumber) { "`phoneNumber` is required but was not set" },
                    checkNotNull(transactionDesc) {
                        "`transactionDesc` is required but was not set"
                    },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentCreateParams &&
            this.accountReference == other.accountReference &&
            this.amount == other.amount &&
            this.phoneNumber == other.phoneNumber &&
            this.transactionDesc == other.transactionDesc &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountReference,
            amount,
            phoneNumber,
            transactionDesc,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "PaymentCreateParams{accountReference=$accountReference, amount=$amount, phoneNumber=$phoneNumber, transactionDesc=$transactionDesc, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountReference: String? = null
        private var amount: Double? = null
        private var phoneNumber: String? = null
        private var transactionDesc: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paymentCreateParams: PaymentCreateParams) = apply {
            this.accountReference = paymentCreateParams.accountReference
            this.amount = paymentCreateParams.amount
            this.phoneNumber = paymentCreateParams.phoneNumber
            this.transactionDesc = paymentCreateParams.transactionDesc
            additionalQueryParams(paymentCreateParams.additionalQueryParams)
            additionalHeaders(paymentCreateParams.additionalHeaders)
            additionalBodyProperties(paymentCreateParams.additionalBodyProperties)
        }

        /** A reference for the transaction */
        fun accountReference(accountReference: String) = apply {
            this.accountReference = accountReference
        }

        /** The amount to be paid */
        fun amount(amount: Double) = apply { this.amount = amount }

        /** The phone number of the payer */
        fun phoneNumber(phoneNumber: String) = apply { this.phoneNumber = phoneNumber }

        /** A description of the transaction */
        fun transactionDesc(transactionDesc: String) = apply {
            this.transactionDesc = transactionDesc
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): PaymentCreateParams =
            PaymentCreateParams(
                checkNotNull(accountReference) { "`accountReference` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(phoneNumber) { "`phoneNumber` is required but was not set" },
                checkNotNull(transactionDesc) { "`transactionDesc` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
