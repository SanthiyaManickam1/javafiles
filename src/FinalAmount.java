import java.util.Scanner;
public class FinalAmount {
    public static void main(String[]args) {
        System.out.println("Enter the paid amount");
        Scanner ob1 = new Scanner(System.in);
        int  quantity = ob1.nextInt();
        int item_price = ob1.nextInt();
        double amount = quantity*item_price;

        if(quantity>=10){
            double discount = amount*0.10;
            amount -= discount;
            System.out.println("Total amount is" + amount);
        }
        else{
            System.out.println("Total amount is" + amount);
        }






    }

}
