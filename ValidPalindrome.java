package Winner;
class Sol{
    Boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder str=new StringBuilder();
        for (int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i))||Character.isLetter(s.charAt(i)))
            {
                str.append(s.charAt(i));
            }
        }
        System.out.println(str);
        for(int j=0;j<str.length()/2;j++)
        {
            if (str.charAt(j)!=str.charAt(str.length()-1-j))
                return false;
        }
        return true;
   }
}
public class ValidPalindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        Sol obj=new Sol();
        System.out.println(obj.isPalindrome(s));
        }
}
