import java.util.*;
public class OTPProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int otp = rand.nextInt(900000) + 100000; 
        System.out.println("Generated OTP: " + otp);
        System.out.println("Please enter the OTP:");
        int userOTP = sc.nextInt();
        if(userOTP == otp){
            System.out.println("OTP verified successfully!");
        } else {
            System.out.println("Invalid OTP");
        }
        sc.close();
        
    }
}