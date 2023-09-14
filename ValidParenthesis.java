package Winner;
import java.util.Stack;
class Sol2 {
    boolean isValid(String s) {
        Stack<Character> stk=new Stack<Character>();
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
            {
                stk.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']')
            {
                if (s.charAt(i)==')')
                {
                    if (stk.empty())
                        return false;
                    else if (stk.peek()=='(')
                        stk.pop();
                    else
                        return false;
                }
                else if (s.charAt(i)=='}')
                {
                    if (stk.empty())
                        return false;
                    else if (stk.peek()=='{')
                        stk.pop();
                    else
                        return false;
                }
                else if(s.charAt(i)==']')
                {
                    if (stk.empty())
                        return false;
                    else if (stk.peek()=='[')
                        stk.pop();
                    else
                        return false;
                }
            }
        }
        if(stk.empty())
            return true;
        else
            return false;
    }
}
public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "(])";
        Sol2 obj=new Sol2();
        System.out.println(obj.isValid(s));
    }
}
