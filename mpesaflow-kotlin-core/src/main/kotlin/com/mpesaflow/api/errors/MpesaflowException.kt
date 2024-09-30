package com.mpesaflow.api.errors

open class MpesaflowException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
