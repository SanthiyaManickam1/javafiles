import java.util.Scanner;
public class Days {
    public static void main(String[]args){
        System.out.println("Enter the days");
        Scanner ob1 = new Scanner(System.in);
        int total_days = ob1.nextInt();
        int month=0;
        int days=0;
         int week_days=0;
         int weeks=0;
        for(int i=0;i<total_days;i++)
        {  days++;
            week_days++;
            if(days==30) {
                month += 1;
                days = 0;
            }
            else if(week_days==7){
                weeks+=1;
                week_days = 0;
            }

        }
        System.out.println("months = " + "" + month +  "weeks= " + weeks + "" +"days=  " + days );

        }
    }

