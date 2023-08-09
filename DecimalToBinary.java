import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        long Binary=0;int pow=1;
        while(n>0){
            int lastBit= n%2;
            Binary+=lastBit*pow;
            pow*=10;
            n=n/2;
        }
        System.out.println(Binary);

    }

}
