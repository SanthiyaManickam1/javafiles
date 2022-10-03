import java.util.Scanner;
public class InsurancePolicy {
    public static void main(String[] args) {
        System.out.println("Enter the Gender");
        Scanner ob1 = new Scanner(System.in);
        String gender = ob1.nextLine().toLowerCase();
        System.out.println("Enter your age");
        Scanner ob2= new Scanner(System.in);
        int  age = ob2.nextInt();
        System.out.println("Enter your  marrital status");
        Scanner ob3 = new Scanner(System.in);
        String status= ob3.nextLine().toLowerCase();
        if(status=="married"){
            System.out.println("You are eligible for Insurance");
        }
        else if(status=="unmarried" && gender=="male" && age>30){
            System.out.println("You are eligible for Insurance");
        }
        else if(status=="unmarried" && gender=="female" && age>25){
            System.out.println("You are eligible for Insurance");
        }
        else {
            System.out.println("You are not eligible");
        }
    }
}
