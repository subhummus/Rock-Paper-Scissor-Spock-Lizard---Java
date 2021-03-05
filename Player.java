import java.util.Random;

public class Player {
    private int winCounter = 0;
    private int drawCounter = 0;

    private String[] gameVariants = {"Scissor", "Stone", "Paper", "Spock", "Lizard"};

    public int getWinCounter() { return winCounter; }
    public int getDrawCounter() { return drawCounter; }

    public String verifyInput(String input) {
        if (input.equalsIgnoreCase("scissor")) {
            return "Scissor";
        }
        else if (input.equalsIgnoreCase("stone")) {
            return "Stone";
        }
        else if (input.equalsIgnoreCase("paper")) {
            return "Paper";
        }
        else if (input.equalsIgnoreCase("spock")) {
            return "Spock";
        }
        else if (input.equalsIgnoreCase("lizard")) {
            return "Lizard";
        }
        else return "Wrong";
    }

   public void increaseWinCounter() {
        winCounter++;
   }

   public void increaseDrawCounter() {
        drawCounter++;
   }

   public String generateRandomMove() {
       java.util.Random r = new Random();
       int move = r.nextInt(5);
       return gameVariants[move];
   }




}
