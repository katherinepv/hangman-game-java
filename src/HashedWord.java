public class HashedWord {
    String randomWord = RandomWord.generateRandomWord();

    public void hashRandomWord() {
        String underScore = "_";
        String hiddenWord = underScore.repeat(randomWord.length());

        System.out.println(hiddenWord);
    }
}
