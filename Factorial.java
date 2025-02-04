public class Factorial {

    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i<=n ; i++){
            f = f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));

    }
}


// so basically n for the number range
// i for loop untill n
// f for factorial where start from 1 to range n
// just print in main function
// Commit timestamp: 2025-02-04 10:02:00