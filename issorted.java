public  class issorted {


   public static boolean issort(int num[]){
    for(int i=1; i<num.length; i++){
        if(num[i] < num[i-1]){
            return false;
        }
    }
    return true;
   }

    public static void main(String[] args) {
        int num[] = {1,5,3,4,5,6};
        System.out.println(issort(num));

    }
}
// Commit timestamp: 2023-11-11 21:56:00