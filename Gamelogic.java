public class Gamelogic {

// 0 = draw, 1 = win for human & 2 = win for bot
    public int analysisMove(String humanInput, String botInput) {
        if (humanInput == "Scissor" && botInput == "Paper") {
            return 1;
        }
        else if (humanInput == "Scissor" && botInput == "Stone") {
            return 2;
        }
        else if (humanInput == "Scissor" && botInput == "Spock") {
            return 2;
        }
        else if (humanInput == "Scissor" && botInput == "Lizzard") {
            return 1;
        }
        else if (humanInput == "Paper" && botInput == "Scissor") {
            return 2;
        }
        else if (humanInput == "Paper" && botInput == "Stone") {
            return 1;
        }
        else if (humanInput == "Paper" && botInput == "Spock") {
            return 1;
        }
        else if (humanInput == "Paper" && botInput == "Lizard") {
            return 2;
        }
        else if (humanInput == "Stone" && botInput == "Paper") {
            return 2;
        }
        else if (humanInput == "Stone" && botInput == "Scissor") {
            return 1;
        }
        else if (humanInput == "Stone" && botInput == "Spock") {
            return 2;
        }
        else if (humanInput == "Stone" && botInput == "Lizard") {
            return 1;
        }
        else if (humanInput == "Spock" && botInput == "Scissor") {
            return 1;
        }
        else if (humanInput == "Spock" && botInput == "Stone") {
            return 1;
        }
        else if (humanInput == "Spock" && botInput == "Lizard") {
            return 2;
        }
        else if (humanInput == "Spock" && botInput == "Paper") {
            return 2;
        }
        else if (humanInput == "Lizard" && botInput == "Spock") {
            return 1;
        }
        else if (humanInput == "Lizard" && botInput == "Paper") {
            return 1;
        }
        else if (humanInput == "Lizard" && botInput == "Stone") {
            return 2;
        }
        else if (humanInput == "Lizard" && botInput == "Scissor") {
            return 2;
        }
        else return 0;
    }
}

