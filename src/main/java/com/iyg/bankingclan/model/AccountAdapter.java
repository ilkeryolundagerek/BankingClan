package com.iyg.bankingclan.model;

abstract class AccountAdapter {
  protected AccountModel accountModel;

  public AccountAdapter(AccountModel accountModel) {
    accountModel = accountModel;
  }

  abstract double getAmount(AccountModel accountModel);

  abstract double getBalanceInDifferentCurrency(AccountModel accountModel, Currency currency);

  abstract public void deposit(long amount);

}