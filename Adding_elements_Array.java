import java.util.Arrays;
import java.lang.String;

public class Adding_elements_Array {
	static void add(int[] arr, int element, int index, int size) {
		for (int i = size - 1; i >= index; i--) {
			arr[i + 1] = arr[i];
		}
		arr[index] = element;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int size = arr.length - 1;
		int element = 7, index = 2;
		add(arr, element, index, size);
		size += 1;
		System.out.println(Arrays.toString(arr));
	}
}