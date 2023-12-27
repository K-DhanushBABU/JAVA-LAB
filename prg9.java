
// write a program  to dcefine an interface "compute" with an abstract method convert.
//  define two classes which implements this compute interface and extend the convert method to KB to GB EURO to RUPEE and
// declare objects for the both the  classes and demonstrate the conversion feom kb to GB and euro to rupee

//  1GB = 1024MB, 1MB= 1024KB.

//  1Euro = 85.76 Rupees.

import java.util.*;

interface compute {
    void convert();
}

class KBtoGB implements compute {

    public void convert() {
        System.out.println("Enter the Value in KB to convert to Gb");
        Double kilobytes;
        Scanner input = new Scanner(System.in);

        kilobytes = input.nextDouble();

        double result = (kilobytes / 1024) / 1024;
        System.out.printf("%.3f GB\n", result);

    }
}

class eurotoRupee implements compute {
    public void convert() {
        System.out.println("Enter the Value in Euro");
        Double euro;
        Scanner input = new Scanner(System.in);

        euro = input.nextDouble();

        double result = euro * 85.76;
        System.out.printf("%.3f Rupees", result);

    }
}

public class prg9 {
    public static void main(String[] args) {

        compute ob1 = new KBtoGB();
        compute ob2 = new eurotoRupee();

        ob1.convert();
        ob2.convert();
    }
}
