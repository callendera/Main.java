import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;
        Dice die1 = new Dice();
        Dice die2 = new Dice();
        int die1Value, die2Value, roll2 = 0;
        do {
            die1Value = die1.getRoll();
            die2Value = die2.getRoll();
            int points = die1Value + die2Value;
            System.out.println("\nYou rolled " + die1Value + "," + die2Value + " and the sum is : " + points);
            if (points == 7 || points == 11) {
                System.out.println("\nYou win!");
            } else if (points == 2 || points == 3 || points == 12)
            {
                System.out.println("\nYou lose!");
            } else {
                roll2 = 0;
                while (roll2 != 7) {
                    die1Value = die1.getRoll();
                    die2Value = die2.getRoll();
                    roll2 = die1Value + die2Value;
                    System.out.println("\nYou rolled " + die1Value + "," + die2Value + " and the sum is : " + roll2);
                    if (points == roll2) {
                        System.out.println("\nYou win!");
                        break;
                    } else if (roll2 == 7) {
                        System.out.println("\nYou lose!");
                    }

                }
            }
            System.out.print("\nWould you like to play again? [y/n] ");
            choice = input.nextLine();
        } while (choice.equals("y") || choice.equals("Y"));
    }
}