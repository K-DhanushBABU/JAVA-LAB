// Write a Java program using compile time polymorphism to compare two strings.
// The program should implement two different versions of String comparisons
// 1. The first version compares complete first string with the second one
// 2. The second version should compare only specified number of characters from first string with the second string

import java.util.Scanner;

public class prg6 {
    public void userStrCmp(String S1, String S2) {
        if (S1.compareTo(S2) == 0)
            System.out.println("\nThe entered two Strings are the same");
        else
            System.out.println("\nThe entered two strings are not same");
    }

    public void userStrCmp(String S1, String S2, int n) {
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (S1.charAt(i) == S2.charAt(i))
                flag = 1;
            else {
                flag = 0;
                break;
            }
        }

        if (flag == 1)
            System.out.println("First " + n + " characters of both the strings are the same");
        else
            System.out.println("First " + n + " characters of both the strings are not the same");
    }

    public static void main(String[] args) {
        String S1, S2;
        prg6 obj = new prg6();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        S1 = sc.nextLine();
        System.out.print("Enter another string: ");
        S2 = sc.nextLine();
        System.out.print("Enter the number of characters to be compared in both the strings: ");
        int n = sc.nextInt();

        obj.userStrCmp(S1, S2);

        if (n > S1.length() || n > S2.length())
            System.out.println("Cannot compare strings more than their length");
        else
            obj.userStrCmp(S1, S2, n);

        sc.close();
    }
}