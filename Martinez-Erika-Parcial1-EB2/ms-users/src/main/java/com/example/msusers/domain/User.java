package com.example.msusers.domain;


public class User {
    private String id;
    private String name;
    private String lastName;
    private String email;
    private BillDTO bill;

    public User() {
    }

    public User(String id, String name, String lastName, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public User(String id, String name, String lastName, String email, BillDTO bill) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.bill = bill;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BillDTO getBill() {
        return bill;
    }

    public void setBill(BillDTO bill) {
        this.bill = bill;
    }
}
