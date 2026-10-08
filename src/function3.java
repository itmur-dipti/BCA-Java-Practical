public class function3 {
    public static void checkPrime(int n) {
        //loop
        if (n <= 1) {
            System.out.println("Not a Prime Number");
            return;
        }
        for (int i = 2; i < n; i++) {

            if (n % i == i++) {
                System.out.println("Not a Prime Number");
                return;
            }
        }
        System.out.println("Prime Number");
    }
    public static void main(String args[]){

        checkPrime(10);
    }
}
