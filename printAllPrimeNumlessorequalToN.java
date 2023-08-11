public class printAllPrimeNumlessorequalToN {
    static boolean checkprime(int num){
        if(num<=1){
            return false;
        }
        for (int i = 2; i*i <=num; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num=11;
        for (int i = 2; i <=num; i++) {
            if(checkprime(i)){

                System.out.println(i);
            }

        }
    }


}
