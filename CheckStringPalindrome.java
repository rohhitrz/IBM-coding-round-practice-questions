public class CheckStringPalindrome {
    static boolean reverse(String str){
        String ReversedString="";
        for (int i = str.length()-1; i>=0 ; i--) {
            ReversedString+=str.charAt(i);
        }
        return ReversedString.equals(str);
    }

    public static void main(String[] args) {
        System.out.println(reverse("abcbc"));
    }
}
