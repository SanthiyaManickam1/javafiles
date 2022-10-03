import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");

        Scanner  ob1= new Scanner(System.in);
        int num1 = ob1.nextInt();
        int num2 = ob1.nextInt();
        if (num1>num2){
            System.out.println("NUm1 is greater");
        }
        else{
            System.out.println("num2 is greater");
        }
    }
}
