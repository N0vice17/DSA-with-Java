import java.util.*;
import java.math.*;
public class Practice1 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Ener A Number:");
        int num=input.nextInt();
        int num1=num;
        int sum=0;
        while(num>0){
            int temp=num%10;
            sum=(sum*10)+temp;
            num=num/10;
        }
        if(sum==num1){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }
    }
}
