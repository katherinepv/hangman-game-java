import java.util.Random;

public class RandomWord {

    public static String generateRandomWord() {
        String[] wordsArr={"lasagne", "pizza", "burrito", "nachos", "pho", "falafel", "soup", "cake", "profiteroles","crepe", "waffles", "pancakes", "orange","banana", "matcha", "tofu", "lobster"};

        Random rand = new Random();
        String randomWord = wordsArr[rand.nextInt(wordsArr.length)];
        System.out.println(randomWord);
        return randomWord;
    }
}
