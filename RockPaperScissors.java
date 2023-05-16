package RockPaperScissors;

import java.util.*;

public class RockPaperScissors {
    public static void main(String args[]) {
        // scanner object initialization
        Scanner inp = new Scanner(System.in);

        // mode choice, between another human or computer
        System.out.println("Choose a mode, either vs 'human' or 'computer'");
        String mode = inp.nextLine();
        boolean cpu = false;
        if (mode.equals("computer")) {
            cpu = true;
        }

        // choice between rock paper and scissors. contains initial choice as well as
        // while looped choice. sentinel is exit
        System.out.println("Choose 'rock', 'paper', or 'scissors'. Exit using 'exit'");
        String input = inp.nextLine();
        String input2 = "";
        while (input != "exit" || input2 != "exit") {
            if (!check(input)) {
                System.out.println(input + " is not a valid choice. Please try again");
                input = inp.nextLine();
                continue;
            }

            if (cpu) {
                input2 = Computer.choice();
            } else {
                System.out.println("Player 2, choose 'rock', 'paper', or 'scissors'. Exit using 'exit'");
                input2 = inp.nextLine();
            }

            // winner decider
            if (Winner.winner(input, input2)) {
                System.out.println("Player 1 wins with the decisive " + input + " over " + input2);
            } else if (cpu) {
                System.out.println("you lost to a bot lmfao loser");
            } else {
                System.out.println("Player 2 wins with the decisive " + input2 + " over " + input);
            }
            System.out.println("Thank you for playing. Try again?");
            input = inp.nextLine();
        }

        System.out.println("Thank you for playing");
        inp.close();
    }

    public static boolean check(String choice) {
        // create hashmap of choices for convienience
        Set<String> choices = new HashSet<>();
        choices.add("rock");
        choices.add("paper");
        choices.add("scissors");
        return !choices.contains(choice.toLowerCase());
    }

}