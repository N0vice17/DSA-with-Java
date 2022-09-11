import java.util.Arrays;

public class Bubble_sort {
  static void bubble_sort(int[]arr){
    boolean swapped;
    for(int i=0;i<arr.length;i++){
      swapped=false;
      for(int j=1;j<arr.length-i;j++){
        if(arr[j]<arr[j-1]){
        int temp=arr[j-1];
        arr[j-1]=arr[j];
        arr[j]=temp;
        swapped=true;
        }
        if(swapped==false){
          break;
        }
      }
    }
  }
  public static void main(String[]args){
    int[] arr={9,8,7,6,5,4,3,2,1};
    bubble_sort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
