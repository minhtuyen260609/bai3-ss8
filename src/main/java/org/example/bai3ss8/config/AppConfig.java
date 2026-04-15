package org.example.bai3ss8.config;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public final class AppConfig {

    public static final String VALIDATOR_ATTRIBUTE = "validator";
    private static final ValidatorFactory VALIDATOR_FACTORY = Validation.buildDefaultValidatorFactory();

    private AppConfig() {
    }

    public static Validator getValidator() {
        return VALIDATOR_FACTORY.getValidator();
    }

    public static void close() {
        VALIDATOR_FACTORY.close();
    }
}
