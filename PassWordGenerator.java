import java.security.SecureRandom;
public class PassWordGenerator{
    public static void main(String[] args){
        SecureRandom random = new SecureRandom();
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String symbols = "!@#$%^&*()_+-=[]{}|;':,.<>?/";
        String all = upper + lower + digits + symbols;
        StringBuilder password = new StringBuilder();
        password.append(upper.charAt(random.nextInt(upper.length())));
        password.append(lower.charAt(random.nextInt(lower.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(symbols.charAt(random.nextInt(symbols.length())));
        for(int i = 0; i < 4; i++){
            password.append(all.charAt(random.nextInt(all.length())));
        }
        for(int i = password.length() - 1; i > 0 ; i--){
           int j = random.nextInt(i+1);
           char temp = password.charAt(i);
            password.setCharAt(i, password.charAt(j));
            password.setCharAt(j, temp);
        }
        System.out.println("Generated Password: "+ password);
    }

}