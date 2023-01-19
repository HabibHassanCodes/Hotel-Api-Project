package com.Bankproject.demo.Client;

public class ClientAccount {
    public class Account {
        private double balance = 0;
        private String firstName ="";


        public Account(){


        }

        // deposit and withdraw need to be in a dao
        public void deposit(double cash){
            balance = balance + cash;
            System.out.println("Hi "+firstName+" You have deposited $" + cash + ". Your current balance is now "+ balance+"\n");

        }
        public void withdrawal(double cash){
            if ( balance - cash >= 0 ) {
                balance = balance - cash;
                System.out.println("Hi "+firstName+" You have withdrawn $" + cash + ". Your current balance is now "+ balance+"\n");
            } else{
                System.out.println("Yikes"+" your current balance is $"+balance+" the max you can withdraw is $"+ balance );
            }

        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return firstName;
        }

        public double getBalance() {
            return balance;
        }
    }

}
