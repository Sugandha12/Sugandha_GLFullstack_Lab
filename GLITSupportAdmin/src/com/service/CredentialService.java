/* This service is used to generate the email and password */
package com.service;


import com.employee.Employee;

import java.util.Random;

public class CredentialService {
   String companyName ="greatLearning";
   String department="";
   String email;
    public String generatePassword() // This method uses the random method to generate the password by taking 2 characters each from the strings
    {
        String cap = "ABCDEFGHIJKLMOPQRSTUVWXYZ";
        String small ="abcdefghijklmopqrstuvwxyz";
        String num = "0123456789";
        String special ="!@#$%^&*()";
        Random random = new Random();
        String password="";
        password+=cap.charAt(random.nextInt(cap.length()));
        password+=cap.charAt(random.nextInt(cap.length()));
        password+=small.charAt(random.nextInt(small.length()));
        password+=small.charAt(random.nextInt(small.length()));
        password+=num.charAt(random.nextInt(num.length()));
        password+=num.charAt(random.nextInt(num.length()));
        password+=special.charAt(random.nextInt(special.length()));
        password+=special.charAt(random.nextInt(special.length()));


    return password;
    }
     public String generateEmailAddress(String firstName,String lastName,String department){
         return firstName+lastName+"@"+department+".gl.com";
     }
    public void showCredentials(Employee empl) {
        System.out.println("Dear" + " " +empl.getFirstName() + " "+"Your generated credentials are as follows");
        System.out.println("Email--->" + empl.getEmail());
        System.out.println("Password--->"+empl.getPassword());
    }




    }
