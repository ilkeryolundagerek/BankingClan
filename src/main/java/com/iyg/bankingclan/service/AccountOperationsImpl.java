package com.iyg.bankingclan.service;

import com.iyg.bankingclan.model.AccountModel;
import com.iyg.bankingclan.model.Bank;

public class AccountOperationsImpl implements AccountOperations{

  private Bank bank;
  private AccountModel accountModel;

  public AccountOperationsImpl(Bank bank, AccountModel accountModel) {
    this.bank = bank;
    this.accountModel = accountModel;
  }

  public void deposit(long amount) {
    accountModel.deposit(amount);
  }

  public void withdraw(long amount) {
    // TODO
    // accountModel.withdraw(amount);
  }
}
