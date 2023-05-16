package RockPaperScissors;

public class Winner {

    public static boolean winner(String p1, String p2) {
        // comparison method
        // code copied from
        // https://medium.com/geekculture/how-to-code-a-simple-rock-paper-scissors-game-in-java-7ec5dda68be1
        if (p1.equals("rock")) {
            return p2.equals("scissors");
        } else if (p1.equals("paper")) {
            return p2.equals("rock");
        } else {
            return p2.equals("paper");
        }
    }
}
