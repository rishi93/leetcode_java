package validParentheses;

import java.util.Stack;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Solution {
    public boolean isValid(String s) {
        Set<Character> openBraces = new HashSet<Character>();
        openBraces.add('(');
        openBraces.add('{');
        openBraces.add('[');

        HashMap<Character, Character> closeBraces = new HashMap<Character, Character>();
        closeBraces.put(')', '(');
        closeBraces.put('}', '{');
        closeBraces.put(']', '[');

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If open brace, then push to stack
            if (openBraces.contains(c)) {
                stack.push(c);
            }
            // If close brace, check if last encountered open brace is matching
            else {
                // If stack is already empty, then obviously false
                if (stack.isEmpty()) {
                    return false;
                }
                // If last encountered open brace doesn't match
                if (stack.pop() != closeBraces.get(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }    
}
