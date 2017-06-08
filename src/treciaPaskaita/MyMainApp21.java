package treciaPaskaita;

/**
 * Created by andriusbaltrunas on 6/8/2017.
 */
public class MyMainApp21 {

    public static void main(String[] args) {
        String[] word = {"KOL EINU ŠUNIE LOK"
                , "ARGI TEN NE TIGRA", "S?D?K UŽU K?D?S",
                "S?D?K UŽU K?DUT?S"};

        checkPalindromes(word);
    }

    private static void checkPalindromes(String[] palindromes){
        for(String p : palindromes){
            checkIsPalindrome(p);
        }
    }

    private static void checkIsPalindrome(String word){
        String word1 = word.replaceAll(" ", "");
        boolean isPalindrome = true;
        for (int i = 0; i < word1.length(); i++){
            if(word1.charAt(i) != word1.charAt(word1.length() - 1 - i)){
                isPalindrome = false;
            }
        }
        System.out.println(word + "Is palindrome ? ->" + isPalindrome);
    }
}
