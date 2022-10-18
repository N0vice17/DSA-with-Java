import java.util.*;
import java.math.*;
public class Practice1 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Ener A Number:");
        int num=input.nextInt();
        Boolean prime=true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                prime=false;
                break;
            }
            else{
                prime=true;
            }
        }
        if(prime==true){
            System.out.println(num +" "+"is a prime number");
        }
        else{
            System.out.println(num +" "+"is not a prime number");
        }
    }
}
