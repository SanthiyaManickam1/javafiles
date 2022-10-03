import java.util.Scanner;
public class BonusCalculation {
    public static double bonus(){
        System.out.println("Enter the salary: ");
        Scanner ob1 = new Scanner(System.in);
        int basic_salary = ob1.nextInt();

        double TA = basic_salary * 0.10;
        double DA = basic_salary * 0.15;
        double HRA = basic_salary * 0.20;
        double PF = basic_salary * 0.12;
       double bonus=0;
       if(basic_salary>=20000){
           bonus = basic_salary*0.10;
           double gross_salary = basic_salary + TA + DA + HRA - PF;
           return gross_salary;
       }
       else{
           bonus = basic_salary*0.20;
           double gross_salary = basic_salary + TA + DA + HRA -PF;
           return gross_salary;
       }

    }
    public static void main(String[] args) {
         double gross_salary = bonus();
        System.out.println(gross_salary);


    }
}
