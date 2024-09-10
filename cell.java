public class cell {
    public static int[] cellCompete(int[] arr,int day) {
        int[] array=new int[arr.length];
        while(day>0){            
            for(int i=0;i<arr.length;i++) {
                if(i==0){
                    array[i]=0^arr[i+1];
                }
                else if(i==arr.length-1){
                    array[i]=arr[i-1]^0;
                }
                else {
                    array[i]=arr[i-1]^arr[i+1];
                }
            }
            for(int i=0;i<arr.length;i++){
                arr[i]=array[i];
            }
            day--;
        }
        return  array;
    }
    public static void main(String[] args){
        int[] arr={1,0,0,0,0,1,0,0};
        int day=2;
        int[] result=cellCompete(arr, day);
        for(int i=0;i<arr.length;i++){
            System.out.println(result[i]);
        }
    }
}
