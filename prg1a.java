// 1.	Write a java program:
// a.	To calculate and display the area of a rectangle.

import java.util.*;

public class prg1a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the length of rectangle");
        double length = input.nextDouble();
        System.out.println("enter the width of rectangle");
        double width = input.nextDouble();

        double area = length * width;
        System.out.println("the area of  rectangle " + area);

        input.close();

    }
}