package org.example.bai3ss8.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.example.bai3ss8.validation.MultipleOfTenThousand;

public class WithdrawRequestDto {

    @NotNull(message = "withdrawAmount is required")
    @Positive(message = "withdrawAmount must be greater than 0")
    @Min(value = 50_000L, message = "withdrawAmount must be at least 50,000 VND")
    @MultipleOfTenThousand
    private Long withdrawAmount;

    public WithdrawRequestDto() {
    }

    public WithdrawRequestDto(Long withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public Long getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(Long withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}
