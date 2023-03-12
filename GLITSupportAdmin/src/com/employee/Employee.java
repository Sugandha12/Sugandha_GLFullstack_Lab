/* This class is used to store the employee methods */
package com.employee;

public class Employee {

   private String firstName;
   private String lastName;
   private String password;// This is being used here so that we dont have to print the password and can be called directly using employee object

   private String email;
    public Employee(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
