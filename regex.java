import java.util.*;

class check {
    public static boolean Check(String s,String p,int i,int j) {
        if(j>=p.length()&&i<s.length()) {
            return false;
        }
        else if(i>=s.length()&&j>=p.length()){
            return true;
        }
        boolean match=i<s.length()&&s.charAt(i)==p.charAt(j)||p.charAt(j)=='.';
            if((j+1)<p.length()&&p.charAt(j+1)=='*') {
                return (match&&Check(s, p, i+1, j))||Check(s, p, i, j+2);
            }
            else if(match)  
                return Check(s, p, i+1, j+1);
            else
                return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string s:\n");
        String s=sc.nextLine();
        System.out.println("enter the string p:\n");
        String p=sc.nextLine();
        if(Check(s,p,0,0)){
            System.out.println("it is valid\n");
        }
        else
        System.out.println("it is not valid\n");
    }
}