public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int n = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[n + 1];

        for (int i = 2; i < arr.length; i++) {
            arr[i] = true;
        }
        int p = 2;
        while (p*p <= n) {
            for (int i = p; i < arr.length; i++) {
                if (i % p == 0 && i!=p) {
                    arr[i] = false;
                }

            }
            for (int i = p + 1; i < arr.length; i++) {
                if (arr[i]) {
                    p = i;
                    break;
                }
            }
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == true) {
                System.out.println(i);
            }

        }
    }
}