import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 class Solution {
    public int longest(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int start=0;
        int maxlen=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(map.containsKey(ch)) {
                start=Math.max(start,map.get(ch)+1);
            }
            map.put(ch,i);
            maxlen=Math.max(maxlen,i-start+1);
        }
        return maxlen;
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        
        System.out.println("Enter the string");
        String s = scanner.nextLine();
        


        int m=solution.longest(s);
        System.out.println("The result is :"+m);     
        scanner.close();
    }
}
