import java.util.*;

class Play{
	public static Map<Character,int[]> map=new HashMap<>();
    public static char[][] cipher(String key){
	char arr[]={'a','b','c','d','e','f','g','h','i','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	char matrix[][]=new char[5][5];
	int count=0;
	int alphastart=0;
	for( int i=0;i<5;i++) {
	        for(int j=0;j<5;j++) {
	                if(count<key.length()){
	                        if(map.containsKey(key.charAt(count))){
	                                count++;
									j--;
	                        }
	                        else {	                        
	                                map.put(key.charAt(count),new int[]{i,j});
	                                matrix[i][j]=key.charAt(count);
	                                count++;
	                        }
	                }
	                else {
	                        if(map.containsKey(arr[alphastart])) {
									j--;
	                        }
	                        else {
	                                matrix[i][j]=arr[alphastart];
									map.put(arr[alphastart],new int[]{i,j});
	                        }
	                        alphastart++;
	                }
			}
	}
	return matrix;
	/*for(int i=0;i<5;i++) {
	        for(int j=0;j<5;j++) {
	                System.out.print(matrix[i][j]+"\t\t");
	        }
	        System.out.println();
	        }
*/}

	public static String process(char matrix[][],String message) {
		String line="";
		char nextchar='m';
		String result="";
		for(int i=0;i<message.length();i++) {
				char currentchar=message.charAt(i);
				line=line+currentchar;
				if(i+1<message.length()){
				nextchar=message.charAt(i+1);
				}
				else
					break;
				if(currentchar==nextchar) {
					line=line+'x';
				}
		}
		if(line.length()%2!=0) {
				line = line +'x';
		}
		for(int i=0;i<line.length();i=i+2) {
			String substr=line.substring(i, i+2);
			if(map.containsKey(substr.charAt(0))&&map.containsKey(substr.charAt(1))){
				int value1[]=map.get(substr.charAt(0));
				int value2[]=map.get(substr.charAt(1));
				if(value1[0]==value2[0]||value1[1]==value2[1]) {
					if(value1[0]==value2[0]) {
						result=result+matrix[value1[0]][(value1[1]+1)%5];
						result=result+matrix[value2[0]][(value2[1]+1)%5];
					}
					else {
						result=result+matrix[(value1[0]+1)%5][value1[1]];
						result=result+matrix[(value2[0]+1)%5][value2[1]];
					}
				}
				else {
					result=result+matrix[value1[0]][value2[1]];
					result=result+matrix[value2[0]][value1[1]];
				}
			}
		}
		return result;
	}
        public static void main(String[] args) {
                String key="fire";
				String message="hello";
                char matrix[][]=cipher(key);
				String result=process(matrix,message);
				System.out.println(result);
        }
}
	                                 
	
