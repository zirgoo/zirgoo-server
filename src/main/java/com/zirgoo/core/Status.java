package com.zirgoo.core;

/**
 * Created by kosztope on 11/02/14.
 */
public enum Status {
    OKAY,
    INVALID_EMAIL,
    EMAIL_ALREADY_REGISTERED,
    INVALID_ACTIVATION_CODE,
    USER_ALREADY_ACTIVATED,
    USER_NOT_FOUND,
    INTERNAL_DATABASE_ERROR,
    INTERNAL_SMTP_ERROR,
    INTERNAL_APPLICATION_ERROR
}
