package com.iyg.bankingclan.service;

import com.iyg.bankingclan.model.AccountModel;

public interface AccountOperations {

  void deposit(long amount);

  void withdraw(long amount);

}
