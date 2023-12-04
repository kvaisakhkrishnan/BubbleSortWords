import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Words {
    ArrayList<String> words;
    Words(){
        words = new ArrayList<>();
    }
    public void addWord(String word){
        this.words.add(word);
        System.out.println("Word " + word + " added");
    }
    void bubbleSort() {
        int n = words.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (words.get(j).compareTo(words.get(j + 1)) > 0) {
                    // Swap words[j] and words[j + 1]
                    String temp = words.get(j);
                    words.set(j, words.get(j + 1));
                    words.set(j + 1, temp);
                }
            }
        }

        System.out.println("Array After Bubble Sort: ");
        for (String word : words) {
            System.out.println(word);
        }
    }


}