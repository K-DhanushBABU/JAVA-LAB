// 1.	Write a java program:
// b.	To multiply two arrays and display the result

public class prg2a {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 2, 2, 2, 2, 2 };
        int[] result = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] * array2[i];
        }
        System.out.println("Result array after multiplication is");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
