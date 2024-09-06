public class affine {
    public static String convert(String input,int row) {
            char[][] matrix=new char[row+1][50];
            int i=0;
            int j=0;
            int charcount=0;
            String str=""; 
            if(row==1){
                    return input;
            } 
            while(charcount<input.length()) {
                if(j%(row-1)==0){
                    if(i<(row-1)){
                        matrix[i][j]=input.charAt(charcount++);
                        i++;
                    }
                    else{
                        j++;
                        i--;
                    }
                }
                else {
                    matrix[i--][j++]=input.charAt(charcount++);
                }
            }
            if(row!=1){
               for(i=0;i<row;i++) {
                for(j=0;j<20;j++) {
                    if(matrix[i][j]!='\u0000'){
                      str=str+matrix[i][j]; 
                    }                  
                }
               } 
            }
            else
                return input;
            
            return str;
        
    }
    public static void main(String[] args){
        String str="abc";
        int row=2;
        String result=convert(str,row);
        System.out.println(result);
    }
}
