public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int n = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[n + 1];

        for (int i = 2; i < arr.length; i++) {
            arr[i] = true;
        }
        int p = 2;
        while (p * p <= n) {
            for (int i = p * p; i < arr.length; i += p) {
                arr[i] = false;
            }
            for (int i = p + 1; i < arr.length; i++) {
                if (arr[i]) {
                    p = i;
                    break;
                }
            }
        }
        int c = 0;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]) {
                System.out.println(i);
                c++;
            }
        }
    
        double percents = (double) c / n * 100;
        int percentsFinal = (int) percents;
        System.out.printf("There are "+c+" primes between 2 and "+n+" ("+percentsFinal+"% are primes)");
    }
    }
