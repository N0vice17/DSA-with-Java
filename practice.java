public class practice {
  static int binarysearch(int[]arr,int start,int end,int element){
    while(start<=end){
      int mid=(start+end)/2;
      if(element==arr[mid]){
        return mid;
      }
      else if(element>arr[mid]){
        start=mid+1;
      }
      else if(element<arr[mid]){
        end=mid-1;
      }
    }
    return -1;
  }
  static int search(int[]arr,int element){
    int pivot=rotated(arr);
    int start=0;
    int end=arr.length-1;
    if(pivot==-1){
      return binarysearch(arr, start, end, element);
    }
    while(start<=end){
    if(arr[pivot]==element){
      return pivot;
    }
    else if(element>arr[start]){
      return binarysearch(arr, start, pivot-1, element);
    }
    else if(element<arr[start]){
      return binarysearch(arr, pivot+1, end, element);
    }
  }
    return -1;
  }
  static int  rotated(int[]arr){
   int start=0;
   int end=arr.length-1;
   while(start<=end){
    int mid=(start+end)/2;
    if(mid<end && arr[mid]>arr[mid+1]){
      return mid;
    }
    else if(mid>start && arr[mid]<arr[mid-1]){
      return mid-1;
    }
    else if(arr[start]>=arr[mid]){
      end=mid-1;
    }
    else if(arr[start]<=arr[mid]){
      start=mid+1;
    }
   }
   return -1;
  }
    public static void main(String[]args){
      int[]arr={4,5,6,3,2,1,0};
      int element=4;
      System.out.println(rotated(arr));
      System.out.println(search(arr,element));
  }

}

