import java.util.Scanner;

public class BInaryToDecimal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        int num=s.nextInt();
        int decimal=0;
        int  pow=1;

        for(;num>0;){
           int last =num%10;
           decimal+=last*pow;
           pow*=2;
           num=num/10;
        }

        System.out.println(decimal);


    }


}
