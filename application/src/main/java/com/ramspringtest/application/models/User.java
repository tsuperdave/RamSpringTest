package com.ramspringtest.application.models;

import javax.validation.constraints.NotBlank;

public class User {

    private static long ID = 1L;

    @NotBlank(message = "First Name Required")
    private String firstName;
    private String middleName;
    @NotBlank(message = "Last Name Required")
    private String lastName;
    @NotBlank(message = "Phone number Required")
    private String phoneNumber;
    @NotBlank(message = "Email Required")
    private String email;
    private long id;

    public User(String firstName, String middleName, String lastName, String phoneNumber, String email) {
        this.id = ID++;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public static long getID() {
        return ID;
    }

    public static void setID(long ID) {
        User.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
