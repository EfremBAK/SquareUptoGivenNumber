/* write a program to display the numbers from 1 to a user
specified number and their squares using a for loop.
 */


import java.util.Scanner;

public class SquareUptoGivenNumber {
    public static void main(String[] args) {

        int start = 1, end, sqr;
        Scanner keybd = new Scanner(System.in);

        System.out.println("Enter a number:");

        end = keybd.nextInt();
        System.out.println("number     square");
        System.out.println("_______    _______");
        for (int i = 1; i <= end; i += 1) {
            sqr = i * i;
            System.out.println(i + "          " + sqr);
        }

    }
}
