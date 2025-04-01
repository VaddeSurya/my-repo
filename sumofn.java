package Recursion;

public class sumofn {

    public static int sum(int n) {
        if (n==1){
            return 1;
        }

        int sum1 = sum(n-1);
        int fn = n + sum1;
        return fn;
        
    }
    public static void main(String[] args) {
        System.out.println(sum(2));
    }
}

// Commit timestamp: 2025-04-01 10:37:00