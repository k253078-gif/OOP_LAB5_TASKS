package TASK4;

class Student {

    String name;
    double gpa;

    Student(){
        this("unknowmn",0.00);
    }

    Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }
}