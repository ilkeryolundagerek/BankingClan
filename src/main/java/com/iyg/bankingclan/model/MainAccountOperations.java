package com.iyg.bankingclan.model;

public class MainAccountOperations {

  private MainAccount mainAccount;

  public MainAccountOperations(MainAccount mainAccount) {
    this.mainAccount = mainAccount;
  }

  public void depositAll(long amount) {
    double perAmount = (double) amount / mainAccount.getBanks().size();
    for (Bank bank : mainAccount.getBanks()) {
      bank.deposit(amount);
    }

  }
}
