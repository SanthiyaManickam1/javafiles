import java.util.Scanner;
public class AngleOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1:");
        int a = sc.nextInt();
        System.out.print("Enter side2:");
        int b = sc.nextInt();
        System.out.print("Enter side3:");
        int c = sc.nextInt();
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("No it cannot form a triangle");
        } else {
            System.out.println("Yes it forms a triangle");
        }


    }
}


