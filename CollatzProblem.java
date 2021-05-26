import java.util.Scanner;

public class CollatzProblem {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number To find Collatz Sequence: ");
        int number = scan.nextInt();

        System.out.println(number);

        //repeat until the number is 1
        while (number != 1) {

            //if number is even
            if (number % 2 == 0) {

                number = number / 2;

            }

            //if number is odd
            else{

                number = 3 * number + 1;

            }
            System.out.println(number);
        }

    }
}
