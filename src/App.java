import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by kunalkukreja on 27/01/17.
 */
public class App {
    private HashMap<String, Word> words;

    public void addWord(String word, String meaning, ArrayList<String> sentences) {
        words.put(word, new Word(word, meaning, sentences));
    }

    public void addWord(String word, String meaning) {
        words.put(word, new Word(word, meaning));
    }

    public void addWord(String word) {
        words.put(word, new Word(word));
    }

    public void changeMeaning(Word word, String newMeaning) {

    }
}
