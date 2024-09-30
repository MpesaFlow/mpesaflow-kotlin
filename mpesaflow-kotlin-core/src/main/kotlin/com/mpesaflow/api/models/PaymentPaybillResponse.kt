// File generated from our OpenAPI spec by Stainless.

package com.mpesaflow.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.mpesaflow.api.core.Enum
import com.mpesaflow.api.core.ExcludeMissing
import com.mpesaflow.api.core.JsonField
import com.mpesaflow.api.core.JsonMissing
import com.mpesaflow.api.core.JsonValue
import com.mpesaflow.api.core.NoAutoDetect
import com.mpesaflow.api.core.toUnmodifiable
import com.mpesaflow.api.errors.MpesaflowInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = PaymentPaybillResponse.Builder::class)
@NoAutoDetect
class PaymentPaybillResponse
private constructor(
    private val transactionId: JsonField<String>,
    private val mpesaRequestId: JsonField<String>,
    private val status: JsonField<Status>,
    private val message: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Unique identifier for the transaction */
    fun transactionId(): String? = transactionId.getNullable("transactionId")

    /** M-Pesa request identifier */
    fun mpesaRequestId(): String? = mpesaRequestId.getNullable("mpesaRequestId")

    /** The status of the transaction */
    fun status(): Status? = status.getNullable("status")

    /** Additional information about the transaction */
    fun message(): String? = message.getNullable("message")

    /** Unique identifier for the transaction */
    @JsonProperty("transactionId") @ExcludeMissing fun _transactionId() = transactionId

    /** M-Pesa request identifier */
    @JsonProperty("mpesaRequestId") @ExcludeMissing fun _mpesaRequestId() = mpesaRequestId

    /** The status of the transaction */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** Additional information about the transaction */
    @JsonProperty("message") @ExcludeMissing fun _message() = message

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PaymentPaybillResponse = apply {
        if (!validated) {
            transactionId()
            mpesaRequestId()
            status()
            message()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentPaybillResponse &&
            this.transactionId == other.transactionId &&
            this.mpesaRequestId == other.mpesaRequestId &&
            this.status == other.status &&
            this.message == other.message &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    transactionId,
                    mpesaRequestId,
                    status,
                    message,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "PaymentPaybillResponse{transactionId=$transactionId, mpesaRequestId=$mpesaRequestId, status=$status, message=$message, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var transactionId: JsonField<String> = JsonMissing.of()
        private var mpesaRequestId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paymentPaybillResponse: PaymentPaybillResponse) = apply {
            this.transactionId = paymentPaybillResponse.transactionId
            this.mpesaRequestId = paymentPaybillResponse.mpesaRequestId
            this.status = paymentPaybillResponse.status
            this.message = paymentPaybillResponse.message
            additionalProperties(paymentPaybillResponse.additionalProperties)
        }

        /** Unique identifier for the transaction */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /** Unique identifier for the transaction */
        @JsonProperty("transactionId")
        @ExcludeMissing
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /** M-Pesa request identifier */
        fun mpesaRequestId(mpesaRequestId: String) = mpesaRequestId(JsonField.of(mpesaRequestId))

        /** M-Pesa request identifier */
        @JsonProperty("mpesaRequestId")
        @ExcludeMissing
        fun mpesaRequestId(mpesaRequestId: JsonField<String>) = apply {
            this.mpesaRequestId = mpesaRequestId
        }

        /** The status of the transaction */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the transaction */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Additional information about the transaction */
        fun message(message: String) = message(JsonField.of(message))

        /** Additional information about the transaction */
        @JsonProperty("message")
        @ExcludeMissing
        fun message(message: JsonField<String>) = apply { this.message = message }

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

        fun build(): PaymentPaybillResponse =
            PaymentPaybillResponse(
                transactionId,
                mpesaRequestId,
                status,
                message,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val PENDING = Status(JsonField.of("pending"))

            val COMPLETED = Status(JsonField.of("completed"))

            val FAILED = Status(JsonField.of("failed"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            COMPLETED,
            FAILED,
        }

        enum class Value {
            PENDING,
            COMPLETED,
            FAILED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                COMPLETED -> Value.COMPLETED
                FAILED -> Value.FAILED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                COMPLETED -> Known.COMPLETED
                FAILED -> Known.FAILED
                else -> throw MpesaflowInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
