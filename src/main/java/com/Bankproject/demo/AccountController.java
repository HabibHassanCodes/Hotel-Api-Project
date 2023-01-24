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
    public Account findByEmail(@PathVariable String email){
        return accountServices.findByEmail(email);
    }
    @RequestMapping(path = "transfer/{money}/{email}/{email2}", method = RequestMethod.PUT)
    public void transfer(@PathVariable Double money, @PathVariable String email,@PathVariable String email2){
         accountServices.t(money,email,email2);
    }


}
