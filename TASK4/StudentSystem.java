package TASK4;

import java.util.*;

public class StudentSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter GPA: ");
            double gpa = sc.nextDouble();
            sc.nextLine();

            students.add(new Student(name,gpa));
        }

        students.removeIf(s -> s.gpa < 2.0);

        Student topper = students.get(0);
        int deans = 0;

        for(Student s : students){

            if(s.gpa > topper.gpa)
                topper = s;

            if(s.gpa > 3.5)
                deans++;
        }

        System.out.println("Topper Student: " + topper.name);
        System.out.println("Dean List Students: " + deans);
    }
}