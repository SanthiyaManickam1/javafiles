import java.util.Scanner;

public class VotingAge {

    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner ob1 = new Scanner(System.in);
        int age = ob1.nextInt();
        if (age < 18) {
            System.out.println("he/she eligible for vote");
        }
        else if(age>60){
            System.out.println("he/she is intermediate");
        }
        else{
            System.out.println("not eligible for vote");
        }
    }

}
