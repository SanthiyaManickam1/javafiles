import java.sql.SQLOutput;
import java.util.Scanner;

public class Arithmetic {
    public void add(){
        Scanner ob1=new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a = ob1.nextInt();
        int b = ob1.nextInt();
        int result = a+b;
        System.out.println("addition of two Number is: " +result);
    }
    public void sub(){
        Scanner ob2= new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a = ob2.nextInt();
        int b = ob2.nextInt();
        int result = a-b;
        System.out.println("subtraction of two number is:");

    }

    public static void main(String[] args) {


     }
}


