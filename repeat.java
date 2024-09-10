import java.util.*;

public class repeat {
    public static int repeat(String str){
        Map<Character,Integer> map=new HashMap<>();
        int answer=0;
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }
            else{
                int num=map.get(ch);
                map.put(ch,++num);
            }
        }
        for(int i=0;i<str.length();i++){
            char nf=str.charAt(i);
            int count=map.get(nf);
            if(count==1){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        String str="namasthe";
        int count=repeat(str);
        System.out.println(count);
    }
}
