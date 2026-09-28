import java.util.Scanner;
public class T9Keyboard{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine().toLowerCase();
        String result="";
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch >= 'a' && ch<='c'){
                result +="2";
            }
            else if(ch >='d' && ch<= 'f'){
                result +="3";
            }
            else if(ch >='g' && ch<='i'){
                result +="4";
            }
            else if(ch >='j' && ch<='l'){
                result +="5";
            }
            else if(ch >='m' && ch<='o'){
                result +="6";
            }
            else if(ch >='p' && ch<='s'){
                result +="7";
            }
            else if(ch >='t' && ch<='v'){
                result +="8";
            }
            else if(ch >='w' && ch<='z'){
                result +="9";
            }
        }
        System.out.println("The T9 representation of the word is: "+result);
    }
}