public class Primerange {
     
    public static boolean isPrime(int n){

        if (n==2) {
            return true;
        }
        boolean isPrime = true;
        for(int i =2; i<=n ; i++){
            if (n % i == 0) {
                isPrime = false;
                break;
            }
    }
    return isPrime;
    }

    public static void primesInRange(int n ){
        for(int i= 2; i<=n; i++){
            if (isPrime(i)) {
                System.out.println(i+"");
                
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
            primesInRange(100);
    }
}

// Commit timestamp: 2025-05-26 08:50:00