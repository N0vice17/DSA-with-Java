import java.util.*;
import java.math.*;
public class Practice1 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        String[][]arr=new String[8][8];
        int testcases=input.nextInt();
        while(testcases-->0){
            int b=0;
            int r=0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                arr[i][j]=input.next();
                if(arr[i][j].equals("B")){
                    b++;
                }
                else if(arr[i][j].equals("R")){
                    r++;
                }
            }
        }
        if(b>r){
            System.out.println("B");
        }
        else if(r>b){
            System.out.println("R");
        }
        else{
            System.out.println("B");
        }
        }
    
    }
}
