package Stack;
import java.util.Stack;

// Q: Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// An input string is valid if:
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
// Example 1:

// Input: s = "()"
// Output: true

// Example 2:
// Input: s = "()[]{}"
// Output: true

// Example 3:
// Input: s = "(]"
// Output: false
 
// Constraints:
// 1 <= s.length <= 104
// s consists of parentheses only '()[]{}'.

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i = 0 ; i < s.length() ;i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c=='{'){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else{
                    char t = st.pop();
                    if(c==')' && t == '('){
                        continue;
                    }
                    else if(c==']' && t == '['){
                        continue;
                    }
                    else if(c=='}' && t == '{'){
                        continue;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
        
        
    }

    public static void main(String[] args) {
        ValidParentheses v = new ValidParentheses();
        if(v.isValid("()[]{}")){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
