import java.util.*;
public class longestpal {
    public static boolean check(int k,int j,String str) {
        for(int i=0;i<=(j-k)/2;i++) {
            if(str.charAt(k)!=str.charAt(j)){
                return false;
            }
            k++;
            j--;
        }
        return true;

    }
    public static void palindrome(String s) {
        int length=0;
        int[] highest=new int[2];
        highest[0]=0;
        highest[1]=1;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++) {
                if(check(i, j, s)){
                    length=j-i;
                    if(length>(highest[1]-highest[0])) {
                        highest[0]=i;
                        highest[1]=j;
                    }
                }
            }
        }
        System.out.println("the highest substring that is palindrome is:"+s.substring(highest[0],highest[1]+1));

    }
    public static void main(String[] args) {
        String str="baabhugidpooooop";
        palindrome(str);
    }
    
}
