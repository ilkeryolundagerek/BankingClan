package com.iyg.bankingclan.model;

import lombok.Data;

@Data
public class Bank {
  private String name;
  private String address;
  protected AccountModel accountModel;

  public void deposit(long amount){
    accountModel.deposit(amount);
  }

}
