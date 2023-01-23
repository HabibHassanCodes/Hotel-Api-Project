package com.Bankproject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="accounts")
public class AccountController {
    private final AccountServices accountServices;
    @Autowired
    public AccountController(AccountServices accountServices) {
        this.accountServices = accountServices;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Account> allAccounts(){
        return accountServices.allAccounts();
    }
    @RequestMapping(path="{email}", method = RequestMethod.GET)
    public List<Account> test(@PathVariable String email){
        return accountServices.findByEmail(email);
    }

}
