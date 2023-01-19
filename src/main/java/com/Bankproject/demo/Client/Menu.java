package com.Bankproject.demo.Client;

import org.springframework.web.client.RestTemplate;

import java.util.Scanner;

public class Menu {
    public void atmMenu(){

        System.out.println("Your current balance is $" +". Please enter 1 to deposit funds");
        System.out.println(" To make a deposit enter 1\n" +
                " To make a withdrawal enter 2\n" +
                " | Enter number below the arrows |\n" +
                " V                               V");


    }
    public void menuActions(String str){
        Scanner input = new Scanner(System.in);
        if(str.equals("1")){
            System.out.println("Enter the amount you are depositing below ");
            String userDeposit = input.nextLine();
            int deposit = Integer.parseInt(userDeposit);
         //  account.deposit(deposit);
            System.out.println("deposit function reached");

            System.out.println("If you are not finished enter 'N' else enter 'Y'");
            String yorN = input.nextLine();

            if (yorN.equals("N")) {
                atmMenu();
                String userInput2 = input.nextLine();
                menuActions(userInput2);
            }else{
                System.out.println("Thank you for banking with us Goodbye\n\n");
            }


        } else if (str.equals("2")) {
            System.out.println("Enter the amount you are withdrawing below ");
            String userWithdrawal = input.nextLine();
            int withdrawal = Integer.parseInt(userWithdrawal);
          //  account.withdrawal(withdrawal);
            System.out.println("withdrawal function reached");

            System.out.println("If you are not finished enter 'N' else enter 'Y'");
            String yorN = input.nextLine();

            if (yorN.equals("N")) {
                atmMenu();
                String userInput2 = input.nextLine();
                menuActions(userInput2);
            }else{
                System.out.println("Thank you for banking with us Goodbye\n\n\n\n");
            }


        } else {
            System.out.println("The character you have entered is invalid try again by Typing 1 to deposit or 2 to withdraw\n");
            atmMenu();



        }
    }
}
