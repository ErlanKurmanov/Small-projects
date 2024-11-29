package studentDataBaseApp;

import java.util.Scanner;

public class StudentDataBaseApp {
    public static void main (String[] args){
        // Ask how many students we want to add
        System.out.println("Enter the number of students: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfStud = scanner.nextInt();
        Student [] stud = new Student [numberOfStud];

        //Create n number of students
        //Need to be fixed here !!!!!!!!!!!
        for (int i=1; i<=numberOfStud;i++){
            stud[i] = new Student();
            stud[i].enrolmentCourse();
            stud[i].payment();
            System.out.println(stud[i].showInfo());
        }




    }
}
