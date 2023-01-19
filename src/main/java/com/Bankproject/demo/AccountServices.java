package com.Bankproject.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServices {
    private final AccountRepository accountRepository;

    public AccountServices(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> allAccounts() {
        return accountRepository.findAll();
    }
    public String findByEmail(String email){
    for(int i =0; i<allAccounts().size();i++)
       if (allAccounts().get(i).getEmail().equals(email)){
           return "boom";
       }
        return "p";
    }

}
