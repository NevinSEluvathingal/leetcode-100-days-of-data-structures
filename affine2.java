public class affine2 {
    public static String convert(String input,int row) {
            char[][] matrix=new char[row+1][50];
            int i=0;
            int j=0;
            int charcount=0;
            String str="";
            boolean down=true; 
            if(row==1){
                    return input;
            } 
            while(charcount<input.length()) {
                    matrix[i][j]=input.charAt(charcount++);
                    if(down) {
                        if (i==(row-1)) {
                            down=false;
                            i--;
                            j++;                            
                        }
                        else
                            i++;
                    }
                    else {
                        i--;
                        j++;
                        if(j%(row-1)==0){
                            down=true;
                        }
                    }
            }
            for(i=0;i<row;i++) {
                for(j=0;j<20;j++) {
                    if(matrix[i][j]!='\u0000'){
                      str=str+matrix[i][j]; 
                    }                  
                }
            }
            return str; 
    }
    public static void main(String[] args){
        String str="abc";
        int row=2;
        String result=convert(str,row);
        System.out.println(result);
    }
}
