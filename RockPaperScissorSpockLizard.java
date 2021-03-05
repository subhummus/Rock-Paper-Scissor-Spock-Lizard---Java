import java.util.Scanner;

public class RockPaperScissorSpockLizard {

    public static void main(String[] args) {

        String repeatRound;
        Player player = new Player();
        Player bot = new Player();
        Gamelogic game = new Gamelogic();

        do {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Choose between scissor, stone, paper, Spock or lizard.");
            String humanInput = player.verifyInput(userInput.next());

            if (humanInput == "Wrong") {
                repeatRound = "Yes";
                System.out.println("Wrong Input!");
            }

            else {
                String botInput = bot.generateRandomMove();
                System.out.println("You have choosen: " + humanInput);
                System.out.println("Bot has choosen: " + botInput);

                int moveResult= game.analysisMove(humanInput, botInput);
                if (moveResult == 0) {
                    System.out.println("Draw! (￣～￣;)");
                    player.increaseDrawCounter();
                    bot.increaseDrawCounter();
                }
                else if (moveResult == 1) {
                    System.out.println("You win! (･ω･ﾉﾉﾞ");
                    player.increaseWinCounter();
                }
                else {
                    System.out.println("You lost! (╯︵╰,)");
                    bot.increaseWinCounter();
                }
                System.out.println("Do you want to play another round? Yes or no.");
                repeatRound = userInput.next();
            }
        }
        while (repeatRound.equalsIgnoreCase("Yes"));
        System.out.println("---Gamestats---");
        System.out.println("Player has " + player.getWinCounter() + " wins & " + player.getDrawCounter() + " draws.");
        System.out.println("Bot has " + bot.getWinCounter() + " wins & " + bot.getDrawCounter() + " draws.");
        System.out.println("---cya (^_^)/---");
    }
}
