public class password {
    public static int checker(String password) {
        int digit=0;
        int minchar=0;
        for(int i=0;i<password.length();i++) {
            char ch=password.charAt(i);
            
                if(i==0&&Character.isDigit(ch)) {
                    return 0;
                }
                else if(i!=0&&Character.isDigit(ch)){
                    digit++;
                }
                else if(ch==' '){
                    return 0;
                }
                else if(Character.isAlphabetic(ch)){
                    minchar++;
                }

        }
        if(minchar>=4&&digit>=1){
            return 1;
        }
        else
            return 0;
    }

    public static void main(String[] args) {
        String password="ev9i";
        int result=checker(password);
        System.out.println(result);
    }
}
