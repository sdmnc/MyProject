package sd;



import java.util.Scanner;


public class LuckyBet {

    static void luckyNumberInput() {
        int sum1 = 0, sum2 = 0;

        Scanner scanner = new Scanner(System.in);
        int[] luckyArray = new int[6];
        System.out.println("Please introduce 6 digest ticket's number");
        System.out.println("Press Enter after each digit");
        for (int i = 0; i < luckyArray.length; i++) {
            luckyArray[i] = scanner.nextInt();

        } //end loop1

        for (int i = 0; i <luckyArray.length - 3; i++)
            sum1 += luckyArray[i];


        for (int i = 3; i <=luckyArray.length - 1; i++)
            sum2 += luckyArray[i];

        System.out.println("Sum1 " + sum1);
        System.out.println("Sum2 " + sum2);

        if (sum1 == sum2) {
            System.out.println("Your ticket is lucky!!! Make a wish and eat it");
        } else {
            System.out.println("Your ticket is not lucky, you may throw it away");
        }

    }

    public static void main(String[] args) {
        luckyNumberInput();
    } // end main

} //end class
