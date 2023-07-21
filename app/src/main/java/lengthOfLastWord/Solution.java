package lengthOfLastWord;

import java.util.ArrayList;

public class Solution {
    ArrayList<String> words = new ArrayList<String>();
    StringBuilder str = new StringBuilder();

    public void addWord() {
        if (!str.isEmpty()) {
            words.add(str.toString());
            str = new StringBuilder();
        }
    }

    public int lengthOfLastWord(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c != ' ') {
                str.append(c);
            }
            else {
                addWord();
            }
        }

        addWord();

        String lastWord = words.get(words.size() - 1);
        // System.out.printf("last word is %s\n", lastWord);

        return lastWord.length();
    }
}
