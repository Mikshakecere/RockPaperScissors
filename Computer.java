package RockPaperScissors;

public class Computer {
    // method for computer randomized choice
    public static String choice() {
        String[] choices = new String[] { "rock", "paper", "scissors" };
        return choices[(int) (Math.random() * 3)];
    }
}
