
import java.util.*;

class complex {
    private int real;
    private int img;

    public complex() {
        real = 0;
        img = 0;

    }

    complex(int x, int y) {
        this.real = x;
        this.img = y;

    }

    void add(complex c) {
        complex c3 = new complex();
        c3.real = this.real + c.real;
        c3.img = this.img + c.img;
        System.out.print("The sum of two complex numbers is (" + c3.real + ", " + c3.img + ")\n");

    }

    void sub(complex c) {
        complex c3 = new complex();
        c3.real = this.real - c.real;
        c3.img = this.img - c.img;
        System.out.print("The sum of two complex numbers is (" + c3.real + ", " + c3.img + ")\n");
    }

    void incement() {

        this.real++;
        this.img++;
        System.out.print("The increment  is (" + this.real + ", " + this.img + ")\n");
    }

    void decement() {

        this.real--;
        this.img--;
        System.out.print("The increment  is (" + this.real + ", " + this.img + ")\n");
    }

    void isequal(complex c) {
        if (this.real == c.real && this.img == c.img) {
            System.out.println("Both complex numbers are equal.");
        } else {
            System.out.println("Both complex numbers are not equal.");
        }
    }
}

public class prg3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        int x2, y2;
        System.out.println("enter the real part of the  1st complex number\n");
        x = input.nextInt();

        System.out.println("enter the imaginary part of the 1st complex number\n");
        y = input.nextInt();

        System.out.println("enter the real part 2nd complex number\n");
        x2 = input.nextInt();
        System.out.println("enter the imaginary part of the 2nd complex number\n");
        y2 = input.nextInt();

        complex c1 = new complex(x, y);
        complex c2 = new complex(x2, y2);

        int c;

        while (true) {
            System.out.println("enter choice\n1.add\n2.sub\n3.increment\n4.decrement\n5.compare two complex\n6.exit");
            c = input.nextInt();

            switch (c) {
                case 1:
                    c1.add(c2);
                    break;
                case 2:
                    c1.sub(c2);
                    break;

                case 3:
                    System.out.println("the 1st complex number ");
                    c1.incement();
                    System.out.println("the 2nd complex number ");

                    c2.incement();
                    break;
                case 4:
                    System.out.println("the first complex number ");

                    c1.decement();
                    System.out.println("the 2nd complex number ");

                    c2.decement();
                    break;

                case 5:
                    c1.isequal(c2);

                    break;
                case 6:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }

    }
}
