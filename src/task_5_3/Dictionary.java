package task_5_3;

import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> word = new HashMap<>();

    public void addWord(String eng, String rus) {
        word.put(eng, rus);
    }

    public void getTranslate(String s) {
        System.out.println(word.get(s));
    }

    public String getWords() {
        return this.toString();
    }

    public void removeWord(String s) {
        word.remove(s);
    }

    @Override
    public String toString() {
        return "Dictionary{" + "word=" + word + '}';
    }
}
