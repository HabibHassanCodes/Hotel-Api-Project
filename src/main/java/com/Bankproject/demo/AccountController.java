package com.Bankproject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api")
public class AccountController {
    private final AccountServices accountServices;
    @Autowired
    public AccountController(AccountServices accountServices) {
        this.accountServices = accountServices;
    }

    @GetMapping
    public List<Account> allAccounts(){
        return accountServices.allAccounts();
    }
    @RequestMapping(path="{email}")
    public String test(@PathVariable String email){
        return accountServices.findByEmail(email);
    }

}
