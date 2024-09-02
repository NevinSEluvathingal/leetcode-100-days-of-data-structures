public class binary {
    static int binary(String str) {
        int i=1;
        char start=str.charAt(0);
        char ch=str.charAt(i);
        char next=str.charAt(i+1);
        int result=0;
        switch(ch) {
            case 'A':
                    if(start=='1'&&next=='1') {
                        result=1;
                    }
                    else
                        result=0;
                     break;
            case 'B':
                    if(start=='0'&&next=='1'||start=='1'&&next=='0'||start=='1'&&next=='1'){
                        result=1;
                    }
                    else
                        result=0;
                        break;        
            case 'C':
                    if(start=='0'&&next=='1'||start=='1'&&next=='0'){
                        result=1;
                    }
                    else
                        result=0;
                        break;
        }
        i=i+2;
        while(i<str.length()) {
            ch=str.charAt(i);
            next=str.charAt(i+1);
            switch(ch) {
                case 'A':
                if(result==1&&next=='1') {
                    result=1;
                }
                else
                    result=0;
                break;
                case 'B':
                if(result==1&&next=='1'||result==1&&next=='0'||result==1&&next=='1'){
                    result=1;
                }
                else
                    result=0;
                break;
                case 'C':
                if(result==0&&next=='1'||result==1&&next=='0'){
                    result=1;
                }
                else
                    result=0;
                break;
            }
            i=i+2;
        }
        return result;
    }
    public static void main(String[] args) {
        String str="1A0B1C0C1";
        int result=binary(str);
        System.out.println(result+"\n");
    }
}
