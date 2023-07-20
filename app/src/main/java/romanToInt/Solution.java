package romanToInt;

import java.util.HashMap;

public class Solution {
    boolean peek(String s, int i, char[] valid) {
        if (i+1 >= s.length()) {
            return false;
        }
    
        char c = s.charAt(i+1);

        return new String(valid).indexOf(c) != -1;
    }

    public int romanToInt(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        int result = 0;

        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        int i = 0;

        while (i < s.length()) {
            char c = s.charAt(i);
            int val = hashMap.get(c);

            if (c == 'I' && peek(s, i, new char[] {'V', 'X'})) {
                i += 1;
                c = s.charAt(i);
                val = hashMap.get(c);
                result += val - hashMap.get('I');
                i += 1;
            }
            else if (c == 'X' && peek(s, i, new char[] {'L', 'C'})) {
                i += 1;
                c = s.charAt(i);
                val = hashMap.get(c);
                result += val - hashMap.get('X');
                i += 1;
            }
            else if (c == 'C' && peek(s, i, new char[] {'D', 'M'})) {
                i += 1;
                c = s.charAt(i);
                val = hashMap.get(c);
                result += val - hashMap.get('C');
                i += 1;
            }
            else {
                result += val;
                i += 1;
            }
        }

        return result;
    } 
}
