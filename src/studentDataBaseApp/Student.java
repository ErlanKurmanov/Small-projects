package studentDataBaseApp;

import java.util.Scanner;

public class Student {
    String firstName;
    String lastName;
    int gradeYear;
    private String studentId;
    public static int id = 1000;
    String courses;
    int costOfCourse = 600;
    int tuitionBalance;


    // Constructor separately
    public Student() {
        Scanner scanner = new Scanner(System.in);
        //Get info
        System.out.println("Enter your name: ");
        this.firstName = scanner.nextLine();

        System.out.println("Enter your last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = scanner.nextInt();

        //Calling function to set id:
        setId();
    }

    void setId() {
        id++;
        this.studentId = gradeYear + "" + id;
    }

    //enroll in course
    void enrolmentCourse() {
        do {
            System.out.println("Enter your enrollment course or quit 'q': ");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();
            if (!course.equals("q")){
                courses = courses  + "\n    " + course;
            tuitionBalance = tuitionBalance + costOfCourse;
            } else {break;}

        } while (1 != 0);

    }

    // Pay tuition

    void showBalance(){
        System.out.println("Your current balance: $" + tuitionBalance);
    }

    void payment (){
        showBalance();
        System.out.println("Enter your payment: ");
        Scanner scanner = new Scanner(System.in);
        int getData = scanner.nextInt();
        System.out.println("Thank you for your payment: $" + getData);
        tuitionBalance = tuitionBalance - getData;

        showBalance();
    }

    //display all info below
    public String showInfo(){
        return "Name:" + firstName + "\n" +
                "Lastname:" + lastName + "\n" +
                "Grade level:" + gradeYear +"\n" +
                "Student Id:" + studentId + "\n";
    }
}