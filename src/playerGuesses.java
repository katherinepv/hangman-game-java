import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class playerGuesses {
    Scanner input = new Scanner(System.in);
    String newWord = RandomWord.generateRandomWord();
    ArrayList<Character> playerGuesses = new ArrayList<>();

    public void getPlayerGuess(Scanner input, List<Character> playerGuesses) {
        System.out.println("Enter a letter: ");
        String letterGuess = input.nextLine();
        playerGuesses.add(letterGuess.charAt(0));
    }

    public void checkPlayerGuess() {
        for (int i = 0; i < newWord.length(); i++) {
            if (playerGuesses.contains(newWord.charAt(i))) {
                System.out.println(newWord.charAt(i));
            } else {
                System.out.println("_");
            }
        }
    }
}
