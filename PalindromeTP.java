
import java.util.*;
public class PalindromeTP{
    public static boolean isPalindrome(String str){
       int lp=0;
       int rp=str.length()-1;
       while(lp<rp){
           if(str.charAt(lp)!=str.charAt(rp)){
               return false;
           }
           lp++;
           rp--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        System.out.println(isPalindrome(str)); 
        sc.close();     
    }
}