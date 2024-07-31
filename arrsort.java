import java.util.*;

public class arrsort {
    public static double middled(int[] arr1, int[] arr2) {
        int j = 0, k = 0;
        int total = arr1.length + arr2.length;
        int half = total / 2;
        int[] merged = new int[half + 1]; // Create an array to store only up to the middle element(s)
        
        for (int i = 0; i <= half; i++) {
            if(j<arr1.length&&(arr1[j]<arr2[k]||k>=arr2.length)) {
                merged[i]=arr1[j++];
            }
            else 
                merged[i]=arr2[k++];
        }
        
        // Calculate the median
        if (total % 2 == 0) {
            // Even total length: average of the two middle elements
            return (merged[half - 1] + merged[half]) / 2.0;
        } else {
            // Odd total length: middle element
            return merged[half];
        }
    }
    
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements for arr1");
        int n1=sc.nextInt();
        int[] arr1=new int[n1];
        System.out.println("Enter the numbers for arr1");
        for(int i=0;i<n1;i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the number of elements for arr2");
        int n2=sc.nextInt();
        int[] arr2=new int[n2];
        System.out.println("Enter the numbers for arr1");
        for(int i=0;i<n2;i++) {
            arr2[i]=sc.nextInt();
        }
        double result=middled(arr1,arr2);
        System.out.println("the result is :\n"+result);
        
    }
}