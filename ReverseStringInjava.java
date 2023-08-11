public class ReverseStringInjava {

    static String reverse(String str){
        String ReversedString="";
        for (int i = str.length()-1; i>=0 ; i--) {
            ReversedString+=str.charAt(i);
        }
        return ReversedString;
    }

    public static void main(String[] args) {
        System.out.println(reverse("palindrome"));
    }
}
