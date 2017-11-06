package contest50;

import java.util.Scanner;

public class Threescore {
    public static void main(String[] args) {
        new Threescore().run();
    }
    public void run(){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        System.out.println(validPalindrome(s));
        }
        public boolean validPalindrome(String s) {
            boolean result=false;
            StringBuilder sb=new StringBuilder(s);
            for (int i = 0; i <sb.length(); i++) {
                char c=s.charAt(i);
                sb.deleteCharAt(i);
                result=palindrome(s);
                sb.insert(i,c);
            }
            return result;
        }
        public boolean palindrome(CharSequence s){
            for (int i = 0; i < s.length()/2; i++) {
                if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                    return false;
                }
            }
            return true;
        }
}

