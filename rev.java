public class rev {
    public static boolean check(int k,int j,String str) {
        for(int i=0;i<=(j-k)/2;i++) {
            if(str.charAt(k)!=str.charAt(j)){
                return false;
            }
            j--;
            k++;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="bhugi";
        if(check(0,4,str)){
            System.out.println("it is pal\n");
        }
        else
            System.out.println("not pal\n");
    }
}
