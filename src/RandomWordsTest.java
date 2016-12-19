import java.io.IOException;

/**
 * Created by chris on 18/12/2016.
 */
public class RandomWordsTest {
    public static void main(String[] args) throws IOException {
        new RandomWordsTest().launch();
    }

    private void launch() throws IOException {
        RandomWords words = new RandomWords();
        System.out.println("size of word list" + words.allWords().size());
        System.out.println(words.createList(100));
    }
}
