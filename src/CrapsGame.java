//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

public class CrapsGame{
    public void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String playAgain = "y";
        System.out.println("Welcome to Craps!");
        while(playAgain.equalsIgnoreCase("y")){
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println("You rolled a " + die1 + " and a " + die2 + " Sum: " + sum);
            if(sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps! You just crapped out and lost.");
            } else if (sum == 7 || sum == 11){
                System.out.println("You won with a natural!");
            } else {
                int point = sum;
                System.out.println("The point is " + point + ".");

                boolean gameOver = false;

                while(!gameOver) {
                    die1 = random.nextInt(6) + 1;
                    die2 = random.nextInt(6) + 1;
                    sum = die1 + die2;

                    System.out.println("You rolled a " + die1 + " and a " + die2 + " Sum: " + sum);

                    if(sum == point) {
                        System.out.println("Made point and won!");
                        gameOver = true;
                    } else if (sum == 7){
                        System.out.println("Got a seven and lost!");
                        gameOver = true;
                    } else {
                        System.out.println("Trying for point.");
                    }
                }
            }
            System.out.println("Would you like to play again? (y/n): ");
            playAgain = input.next();
        }
        System.out.println("Thanks for playing!");
        input.close();
    }
}
