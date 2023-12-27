
// write a java prg to deifne a base class called person which stores a info about person such as name age gender .
// derive two new classes employee and student from persion class  to read and display the details that are specific 
// to student and  employess.demonstarate the about scenario to read and display to read and display at least 5 students and
//  5 employees.
import java.util.Scanner;

class person {

    public String name;
    int age;
    String gender;

    Scanner input = new Scanner(System.in);

    public void get() {
        System.out.println("\nEnter name, age, gender");
        this.name = input.nextLine();
        this.age = input.nextInt();
        input.nextLine();
        this.gender = input.nextLine();
    }

    public void display() {
        System.out.println(
                "Person name: " + this.name + " Person age is: " + this.age + " Person gender: " + this.gender);
    }

}

class employee extends person {
    int empid;
    int salary;
    Scanner input = new Scanner(System.in);

    public void getE() {
        super.get();
        System.out.println("\nEnter employee id and salary");
        this.empid = input.nextInt();
        this.salary = input.nextInt();

    }

    public void displayE() {
        System.out.print("\nEmployee name: " + name + "\n Employee age is: " + age + "\n Employee gender: " + gender
                + "\n Employee salary is: " + this.salary + "\n Employee id: " + this.empid + "\n\n");
    }

}

class student extends person {

    int studId;
    float cgpa;
    Scanner input = new Scanner(System.in);

    public void getS() {
        super.get();
        System.out.print("\nEnter student id and cgpa\n");
        this.studId = input.nextInt();
        this.cgpa = input.nextFloat();

    }

    public void displayS() {
        System.out
                .print("\nStudent name: " + name + "\n Student age is: " + age + " \nStudent gender: " + gender
                        + " \nStudent id: "
                        + studId + "\n Student cgpa: " + cgpa + "\n");
    }
}

public class prg4 {

    public static void main(String[] args) {

        employee[] employees = new employee[5];
        student[] students = new student[5];

        System.out.println("\nenter employee detailes");
        for (int i = 0; i < 2; i++) {
            employees[i] = new employee();
            employees[i].getE();
            employees[i].displayE();
        }
        System.out.println("\n\nenter student detailes\n");

        for (int i = 0; i < 2; i++) {
            students[i] = new student();
            students[i].getS();
            students[i].displayS();
        }
    }
}