public class checkPrime {

    static boolean prime(int num){
        for (int i = 2; i <num; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean ans= prime(12);
        System.out.println(ans);
    }
}
