import java.util.*;
import java.io.*;
public class KMP_algorithm{
    public static int[] Array(String str){
        int index=0;
        int[]arr=new int[str.length()];
        for(int i=1;i<=str.length()-1;i++){
            if(str.charAt(i)==str.charAt(index)){
                arr[i]=index+1;
                index++;
            }
            else{
                if(index!=0){
                    index=arr[index-1];
                    arr[i]=index+1;
                }
                else{
                    arr[i]=0;
                }
            }
        }
        return arr;
    }
    public static void main(String[]args){
        System.out.println(Arrays.toString(Array("abcdabca")));
    }
    
}
