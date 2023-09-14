package Winner;
class Sol3 {
    public boolean isAnagram(String s, String t) {
        StringBuilder str=new StringBuilder(s);
        if(s.length()!=t.length())
            return false;
        for (int i=0;i<t.length();i++)
        {
            for (int j=0;j<str.length();j++)
            {
                if(t.charAt(i)== str.charAt(j))
                {
                    str.deleteCharAt(j);
                    break;
                }
            }
        }
        if(str.length()==0)
            return true;
        else
            return false;
    }
}
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "a", t = "aaa";
        Sol3 obj=new Sol3();
        System.out.println(obj.isAnagram(s,t));
    }
}
