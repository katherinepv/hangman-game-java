import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PlayerGuesses {
    Scanner input = new Scanner(System.in);
    // make constructor here

    private String word = RandomWord.generateRandomWord(); // then make constructor then getter.
    ArrayList<Character> playerGuesses = new ArrayList<>();

    public void getPlayerGuess() {
        System.out.println("Enter a letter: ");
        String letterGuess = input.nextLine();
        playerGuesses.add(letterGuess.charAt(0));
    }

    public void checkPlayerGuess() {
        for (int i = 0; i < word.length(); i++) {
            if (playerGuesses.contains(word.charAt(i))) {
                System.out.print(word.charAt(i));
            } else {
                System.out.print("_");
            }
        }
    }
}
