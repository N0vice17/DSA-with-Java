import java.util.Arrays;
import java.lang.String;
public class Deleting_elements_Array{
	static void delete(int[]arr,int index,int size){
		for(int i=index;i<=size-1;i++){
			arr[i]=arr[i+1];
		}
	}
	public static void main(String[]args){
		int [] arr={1,2,3,4,5,6,7,8,9};
		int size=9;
		int index=4;
		delete(arr,index,size);
		size-=1;
		System.out.println(Arrays.toString(arr));
	}
}