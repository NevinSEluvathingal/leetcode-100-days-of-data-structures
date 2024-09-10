import java.util.*;

public class bus {
    public static int bus(char[] arr,int unit) {
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='T'){
                for(int k=0;k<arr.length;k++){
                    if(arr[k]=='P'&&(k-i)<=unit){
                        map.put(k,i);
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        char[] array={'P','P','P','T'};
        int result=bus(array,1);
        System.out.println(result);
    }
}
