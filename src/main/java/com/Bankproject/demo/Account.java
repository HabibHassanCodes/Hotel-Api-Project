package com.Bankproject.demo;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name="Account")
@Table(name="account")
public class Account {
    @Id
    @SequenceGenerator(
            name="account_sequence",
            sequenceName = "account_sequence",
            allocationSize = 1,
            initialValue = 0
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "account_sequence"
    )
    @Column(
            name="id",
            updatable = false
    )
    private long id;
    @Column(
            name="first_name",
            updatable = false,
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String firstName;
    @Column(
            name="last_name",
            updatable = false,
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String lastName;
    @Column(
            name="checking",
            nullable = false
    )
    private double checking;
    @Column(
            name="savings",
            nullable = false
    )
    private double savings;
    @Column(
            name = "email",
            nullable = false
    )
    private String email;


    public Account() {
    }

    public Account(String firstName, String lastName, double checking, double savings, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.checking = checking;
        this.savings=savings;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setChecking(double checking) {
        this.checking += checking;
    }

    public void setSavings(double savings) {
        this.savings = savings;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getChecking() {
        return checking;
    }

    public double getSavings() {
        return savings;
    }
}
