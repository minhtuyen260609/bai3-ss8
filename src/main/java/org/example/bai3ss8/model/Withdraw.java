package org.example.bai3ss8.model;

public class Withdraw {

    private Long withdrawAmount;

    public Withdraw() {
    }

    public Withdraw(Long withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public Long getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(Long withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}
