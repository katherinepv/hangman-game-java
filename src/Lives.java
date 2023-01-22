public class Lives {
    private int livesLeft = 7;
    private int correctGuesses = 0;

    public int getLivesLeft() {
        return livesLeft;
    }

    public int getCorrectGuesses() {
        return correctGuesses;
    }

    public void removeLife() {
        livesLeft--;
    }

    public void incrementCorrectGuesses() {
        correctGuesses++;
    }
}
