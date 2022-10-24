import java.util.Scanner; //import scanner from library
public class RockPepperScissors {


    class RockPaperScissors {
        public static void main(String[] args) {
            // Set up Rock Paper Scissors games
            String computerSelection; // declare variable of computerSelection
            String userSelection; // declare variable of userSelection
            double num; // declare variable of num
            Scanner scanner = new Scanner(System.in);
            System.out.println("What do you choose? paper? rock? or scissors?"); // obtain the answer from the user "paper
            // rock or scissors"
            userSelection = scanner.next(); // assign the value to userSelection
            // Checking whether the value put by user is valid or not
            if (!userSelection.equals("paper") && !userSelection.equals("rock") && !userSelection.equals("scissors")) {
                System.out.println("your answer is not valid!"); // in case, it is not valid, this statement will appear
                return; // return value, in case the value is not valid
            } else {
                System.out.println("User select : " + userSelection); // Print the valid value
            }

            // Random the number by function math.random
            num = Math.random();
            if (num >= 0.68) {
                computerSelection = "rock"; // in case this is true, assign the value of "rock" to the computerSelection
                // variable.
            } else if (num <= 0.34) {
                computerSelection = "scissors";// in case this is true, assign the value of "scissors" to the
                // computerSelection variable.
            } else {
                computerSelection = "paper";// in case this is true, assign the value of "paper" to the computerSelection
                // variable.
            }
            System.out.println("Computer select: " + computerSelection); // Print the value of computerSelection which is
            // assigned.

            // Check Who wins by if-elseif-else condition following by rock paper scissors
            // condition.
            if (userSelection.equals("rock") && computerSelection.equals("scissors")) {
                System.out.println("You win!"); // If user wins, then print" you win "
            } else if (userSelection.equals("rock") && computerSelection.equals("rock")) {
                System.out.println("it is tie");// if user is equal to computer, then print "it is tie"
            } else if (userSelection.equals("rock") && computerSelection.equals("paper")) {
                System.out.println("Computer wins!");// if user is fail, then print "computer wins"
            } else if (userSelection.equals("scissors") && computerSelection.equals("scissors")) {
                System.out.println("it is tie");
            } else if (userSelection.equals("scissors") && computerSelection.equals("rock")) {
                System.out.println("Computer Wins!");
            } else if (userSelection.equals("scissors") && computerSelection.equals("paper")) {
                System.out.println("You win!");
            } else if (userSelection.equals("paper") && computerSelection.equals("scissors")) {
                System.out.println("Computer wins!");
            } else if (userSelection.equals("paper") && computerSelection.equals("rock")) {
                System.out.println("You Win!");
            } else if (userSelection.equals("paper") && computerSelection.equals("paper")) {
                System.out.println("it is tie");
            }
        }
    }
}
