package com.dgn.springbootactiveprofiles.service;

import com.dgn.springbootactiveprofiles.model.Account;
import com.dgn.springbootactiveprofiles.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account addAccount(Account account){
        return accountRepository.save(account);
    }
}
