package emailapp;
import java.util.Random;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private int mailboxCapacity = 500;
    private int defaultLenght = 10;
    private String alternateEmail;
    private String companySuffix = "company.com";

    //Constructor
    public Email(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;

            this.department = setDepartment();


            this.password = randomPassword(defaultLenght);


        email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() +"@" + department + "." +this.companySuffix;


    }

    private String setDepartment() {
        System.out.println("Enter the department's code \n1 For Sale\n2 For Development\n3 For Accaunting\n0 For None");
        System.out.println("Enter your department:");
        Scanner scanner = new Scanner(System.in);
        int infoScan = scanner.nextInt();
        if (infoScan == 1) {
            return "sales";
        } else if (infoScan == 2) {
            return "dev";
        } else if (infoScan == 3) {
            return "acc";
        } else {
            return "none";
        }
    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            int rand = (int)(Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String (password);
    }

    // Set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternateEmail (String altEmail){
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword (String password){
        this.password = password;
    }

    //Retrieving data
    public int getMailboxCapacity() {return mailboxCapacity;}
    public String getAlternateEmail() {return alternateEmail;}
    public String getPassword() {return password;}

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName + "\n" +
                "COMPANY EMAIL: " + email + "\n" +
                "MAILBOX CAPACITY: " + mailboxCapacity + " mb";
    }
}

