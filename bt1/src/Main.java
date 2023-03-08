import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        quadratic();
    }
    public static void quadratic(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số a");
        double a = input.nextDouble();
        System.out.println("Nhập vào số b");
        double b = input.nextDouble();
        System.out.println("Nhập vào số c");
        double c = input.nextDouble();
        double dt = b*b - 4*a*c;
        if(a==0){
            if(b==0){
               if(c==0){
                   System.out.println("Pt vô số nghiệm");
               } else {
                   System.out.println("Pt vô nghiệm");
               }
            } else {
                System.out.println("pt có nghiệm x= " + (-c/b));
            }
        } else{
            if(dt <0) {
                System.out.println("Pt vô nghiệm");
            }
            else if(dt == 0) {
                System.out.println("pt có nghiệm x= " + (-b/(2*a)));
            }
            else {
                System.out.println("pt có 2 nghiệm");
                System.out.println("x1 = " + (-b + sqrt(dt))/(2*a));
                System.out.println("x2 = " + (-b - sqrt(dt))/(2*a));
            }
        }
    }
}