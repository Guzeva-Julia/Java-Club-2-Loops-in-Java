import java.util.Scanner;
public class Unpaired {
    public static void main(String[] args) {
        int i = 0;
        int n = 0;
        int sum=0;

        System.out.print("N членів непарного натурального числа: ");
        {
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            System.out.println ("Непарні числа: ");
            for(i=1;i<=n;i++)

            {
                System.out.println (2*i-1);
                sum+=2*i-1;
            }
            System.out.println ("Сумма чисел непарного числа " +n+" рівняється: " +sum);
        }
    }
}