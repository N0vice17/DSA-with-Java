import java.util.*;
public class Sieve_of_Eratosthenes{
    /*  This is one of the efficient way to find the number of prime numbers between 1 and n(as given by the user)
    */
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]arr=new int[n+1];
        arr[1]=1;
        for(int i=2;i<=arr.length-1;i++){
            if(arr[i]==0){
                for(int j=2*i;j<=arr.length-1;j+=i){
                    arr[j]=1;
                }
            }
        else{
            continue;
        }
        }
        int prime=0;
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]==0){
                prime++;
            }
        }
        System.out.println(prime);
    }
}