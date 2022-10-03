public class Fibonacci {
    //private static int[] numbers;

    public static void main(String[] args) {
        System.out.println("The first 20 Fibonacci numbers are:");
        int fib1 = 1;
        int fib2 = 1;
        int fib3 = 0;
        System.out.print(fib1 + " " + fib2 + " ");

        for(int a = 3; a <= 20; a++) {
            fib3 = fib1 + fib2;
            System.out.print(" " + fib3 + " ");
            fib1 = fib2;
            fib2 = fib3;


        }
        double sum = 0;
        sum += fib3/20;
        System.out.println ("The average is " + sum);



        //System.out.println("The average is "+i);
        /*int n=20;
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.println(""+i);*/
        }
        //int n=20;
   /* public static double average (int[] numbers){
        Fibonacci.numbers = numbers;
        var length = numbers.length;
    var sum=0;
    for (double num : numbers) {
        sum += num;
    }
    return sum/length;
}*/
    }
//}