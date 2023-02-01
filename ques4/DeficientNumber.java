package ques4;
import java.util.*;

public class DeficientNumber {
    static int divsum(int n)
    {
        int sum = 0;
        for (int i = 1; i <= (Math.sqrt(n)); i++) {
            if (n % i == 0) {

                if (n / i == i) {
                    sum = sum + i;
                }
                else
                {
                    sum = sum + i;
                    sum = sum + (n / i);
                }
            }
        }

        return sum;
    }

    static boolean isDeficient(int n)
    {
        return (divsum(n) < (2 * n));
    }

    public static void main(String args[])
    {
        System.out.println("Enter the number = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isDeficient(n))
            System.out.println(n+ " is deficient.");
        else
            System.out.println(n+" is not deficient");
    }
}
