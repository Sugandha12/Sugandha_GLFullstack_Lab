/* This is the driver class used to call the methods  */

package com.app;
import com.employee.Employee;
import com.service.CredentialService;

import java.util.Scanner;// Util is being used for taking the input from user
public class Application {
    public static void main(String[] args) {
        String generatedEmail = "";
        String generatedPassword = "";
        String department = "";
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee("Sugandha", "Atrey");
        CredentialService cr = new CredentialService();
        int option;
        System.out.println("Please enter the department from the following");
        System.out.println(" 1.Technical");
        System.out.println(" 2.Admin");
        System.out.println(" 3.Human Resource");
        System.out.println(" 4.Legal");
        option = sc.nextInt();
        switch (option) {
            case 1: {
                generatedEmail = cr.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "tech");
                generatedPassword = cr.generatePassword();
                break;
            }

            case 2: {
                generatedEmail = cr.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "admin");
                generatedPassword = cr.generatePassword();
                break;
            }

            case 3: {
                generatedEmail = cr.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "hr");
                generatedPassword = cr.generatePassword();
                break;
            }

            case 4: {
                generatedEmail = cr.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "lg");
                generatedPassword = cr.generatePassword();
                break;

            }
            default:{
                System.out.println("please give valid option.....");
        }
    }

        emp.setEmail(generatedEmail);
        emp.setPassword(generatedPassword);
        if(generatedPassword!=""&&generatedEmail!="") {
            cr.showCredentials(emp);
        }
        sc.close();

        }
    }


