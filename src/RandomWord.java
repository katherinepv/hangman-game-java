import java.util.Random;

public class RandomWord {

    String[] wordsArr={"lasagne", "pizza", "burrito", "nachos", "pho", "falafel", "soup", "cake", "profiteroles","crepe", "waffles", "pancakes", "orange","banana", "matcha", "tofu", "lobster"};
    public String generateRandomWord () {
        Random rand = new Random();
        String randomWord = wordsArr[rand.nextInt(wordsArr.length)];
        System.out.println(randomWord);
        return randomWord;
    }
}
