import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
            System.err.println(num + " is Even");
        }else{
            System.out.println(num + " is Odd");
        }
    }
}
