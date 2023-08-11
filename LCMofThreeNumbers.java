public class LCMofThreeNumbers {

    static int gcd(int a,int b){
        if(b==0){
            return a;
        }

        return gcd(b,a%b);

    }

    static int lcm(int a,int b){
        return  (a*b)/gcd(a,b);
    }

    static  int lcmofThree(int a, int b,int c){
        return lcm(lcm(a,b),c);

    }

    public static void main(String[] args) {
        int ans=lcmofThree(5,10,15);

        System.out.println(ans);
    }


}
