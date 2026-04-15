package org.example.bai3ss8.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MultipleOfTenThousandValidator implements ConstraintValidator<MultipleOfTenThousand, Long> {

    private static final long WITHDRAWAL_STEP = 10_000L;

    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }

        return value % WITHDRAWAL_STEP == 0;
    }
}
