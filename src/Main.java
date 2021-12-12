//Вычислить значение выражения по формуле (все переменные принимают действиетльные значения)

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Enter a: ");
        Scanner temp_a = new Scanner(System.in);
        double a = temp_a.nextDouble();

        System.out.println("Enter b: ");
        Scanner temp_b = new Scanner(System.in);
        double b = temp_b.nextDouble();

        System.out.println("Enter c: ");
        Scanner temp_c = new Scanner(System.in);
        double c = temp_c.nextDouble();

        double F;
        F = ((b + Math.sqrt(Math.pow(b, 2) + 4 * c))/(2 * a)) - Math.pow(a, 3) + Math.pow(b, -2);
        System.out.println(F);

    }
}
