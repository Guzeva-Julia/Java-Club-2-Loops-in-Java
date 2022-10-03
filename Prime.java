public class Prime {
    public static void main(String[] args) {

            int x = 31;
            boolean y = false;
            for (int i = 2; i <= x / 2; ++i) {
                if (x % i == 0) {
                    y = true;
                    break;
                }
            }

            if (!y)
                System.out.println(x + " просте число.");
            else
                System.out.println(x + " не просте число.");
        }
}