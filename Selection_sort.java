import java.util.Arrays;

public class Selection_sort {
    static void Selection(int[]arr){
        for(int i=0;i<arr.length;i++){
            int start=0;
            int last=arr.length-i-1;
            int max=maximum(arr,start,last);
            swap(arr,max,last);
        }
    }
    static void swap(int[]arr,int index1,int index2){
        int temp=arr[index2];
        arr[index2]=arr[index1];
        arr[index1]=temp;
    }
    static int maximum(int[]arr,int start,int last){
        int max=0;
        for(int i=start;i<=last;i++){
        if(arr[i]>arr[max]){
            max=i;
        }
    }
    return max;
    }
    public static void main(String[]args){
        int[]arr={3,5,6,1,2};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
