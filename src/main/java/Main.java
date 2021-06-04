import java.util.Scanner;

public class Main {
    public static double log2(double l){
        return Math.log(l)/Math.log(2);
    }
    public static double qrt5(double q){
        return Math.pow(q, (1.0/5));
    }
    public static double asqrt(double a){
        return Math.sqrt(Math.abs(a));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число x:");
        double x = sc.nextDouble();
        sc.close();

        /* 1 */
        double frst = Math.asin(Math.pow((asqrt(x)/(asqrt(x)+1)), 5));
        double scnd = qrt5(x*x+1);
        double thrd = log2( Math.pow(2, Math.sin(x)) + Math.pow(Math.abs(x), Math.cos(x)) );
        double z = frst+scnd+thrd;
        /* 2 */
        double y = (Math.asin(Math.pow((Math.sqrt(Math.abs(x))/((Math.sqrt(Math.abs(x))+1))), 5))) + (Math.pow((x*x+1), (1.0/5))) + (Math.log(Math.pow(2,(Math.sin(x)))+Math.pow((Math.abs(x)),(Math.cos(x))))/Math.log(2));

        /* z == y */

        System.out.println("Координаты точки: "+x+"; "+y);
        double h = Math.sqrt(x*x + y*y);

        if (y<0) {
            System.out.println("False");
        } else if (h<=5) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
