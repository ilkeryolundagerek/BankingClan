package com.iyg.bankingclan;

import com.iyg.bankingclan.model.AccountModel;
import com.iyg.bankingclan.model.ActiveAccount;
import com.iyg.bankingclan.model.Bank;
import com.iyg.bankingclan.model.BankUsa;
import com.iyg.bankingclan.model.Currency;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankingClanApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankingClanApplication.class, args);
        AccountModel accountModel = new ActiveAccount();
        BankUsa bankUSA = new BankUsa();
        bankUSA.getDollarAccountAdapter().getBalanceInDollars(accountModel);
        bankUSA.getDollarAccountAdapter().getBalanceInDifferentCurrency(accountModel, new Currency());
    }

}
