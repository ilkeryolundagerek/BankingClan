package com.iyg.bankingclan.service;

import com.iyg.bankingclan.entity.Account;
import com.iyg.bankingclan.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	AccountRepository accountRepository;

	@Override
	public Account open(Account account) {
		return accountRepository.save(account);
	}

	@Override
	public List<Account> findAllAccounts() {
		return (List<Account>) accountRepository.findAll();
	}

	@Override
	public Optional<Account> findOne(Long accountId) {
		return accountRepository.findById(accountId);
	}

}
