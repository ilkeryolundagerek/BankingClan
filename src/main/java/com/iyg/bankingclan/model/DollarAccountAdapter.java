package com.iyg.bankingclan.model;

public class DollarAccountAdapter extends AccountAdapter {

  public DollarAccountAdapter(AccountModel accountModel) {
    super(accountModel);
  }

  @Override
  public double getAmount(AccountModel accountModel) {
    return accountModel.getBalance();
  }

  public double getBalanceInDollars(AccountModel accountModel) {
    // some code - get live currency
    double currency = 13.489283923;
    return (double)accountModel.getBalance()/currency;
  }

  public double getBalanceInDifferentCurrency(AccountModel accountModel, Currency currency) {
    // some code - get live currency
    return (double)accountModel.getBalance()/currency.getRatio();
  }

  public void deposit(long amount){
    double currency = 13.489283923;
    accountModel.deposit((long) (amount / currency));
  }

}
