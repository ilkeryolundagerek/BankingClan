package com.iyg.bankingclan.model;

import lombok.Getter;

@Getter
public class BankUsa extends Bank{
  private Currency mainCurrency;

  private DollarAccountAdapter dollarAccountAdapter;

  public BankUsa() {
    this.dollarAccountAdapter = new DollarAccountAdapter(super.getAccountModel());
  }

  @Override
  public void deposit(long amount) {
    dollarAccountAdapter.deposit(amount);
  }
}
