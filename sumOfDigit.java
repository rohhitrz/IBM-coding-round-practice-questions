public class sumOfDigit {

    static int cal(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            num=num/10;

        }
        return sum;
    }

    public static void main(String[] args) {
        //int num=10;
        System.out.println(cal(268));
    }
}
