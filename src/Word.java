import java.util.ArrayList;

/**
 * Created by kunalkukreja on 27/01/17.
 */
public class Word {
    private String word;
    private String meaning;
    private ArrayList<String> sentences;
    // how to model synonyms and antonyms
    private ArrayList<Word> synonyms;
    private ArrayList<Word> antonyms;

    public Word(String word, String meaning, ArrayList<String> sentences) {
        this.word = word;
        this.meaning = meaning;
        this.sentences = sentences;
    }

    public Word(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public String getMeaning() {
        return meaning;
    }

    public ArrayList<String> getSentences() {
        return sentences;
    }

    public ArrayList<Word> getSynonyms() {
        return synonyms;
    }

    public ArrayList<Word> getAntonyms() {
        return antonyms;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public void setSentences(ArrayList<String> sentences) {
        this.sentences = sentences;
    }

    public void setSynonyms(ArrayList<Word> synonyms) {
        this.synonyms = synonyms;
    }

    public void setAntonyms(ArrayList<Word> antonyms) {
        this.antonyms = antonyms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word word1 = (Word) o;

        return word.equals(word1.word);

    }

    @Override
    public int hashCode() {
        return word.hashCode();
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", meaning='" + meaning + '\'' +
                ", sentences=" + sentences +
                ", synonyms=" + synonyms +
                ", antonyms=" + antonyms +
                '}';
    }
}
