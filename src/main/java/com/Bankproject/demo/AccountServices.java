package com.Bankproject.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public Account findByEmail(String email){
        Account account = new Account();
    for(int i =0; i<allAccounts().size();i++)
       if (allAccounts().get(i).getEmail().equals(email)){
           account = allAccounts().get(i);
       }
        return account;
    }

    public Account transferMoney(double money, String email, String email2){
        Account account = findByEmail(email);
        Account account2= findByEmail(email2);
        double accountChecking = account.getChecking() - money;
        double account2Checking= account2.getChecking() + money;
            return account;

    }
    public void t(double money, String email, String email2){
        double t = findByEmail(email).getChecking();
        double v = t + money;
        accountRepository.updateChecking(email2,v);
    }

}
