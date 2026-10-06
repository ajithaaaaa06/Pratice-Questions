import java.util.*;
public class AcceptUserName{
       public static void main(String[] args){
        Random rand = new Random();
        int randomNumber = rand.nextInt(90)+10;
        System.out.println("Enter your FirstName: ");
        Scanner sc = new Scanner(System.in);
        String firstName= sc.nextLine();
        System.out.println("Enter your LastName: ");
        String lastName= sc.nextLine();
        System.out.println("Enter your Birth Year: ");
        int DOB= sc.nextInt();
        int year = DOB%100;
        firstName = firstName.replace(" ", "");
        lastName = lastName.replace(" ", "");
        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();
        String birthYear = String.valueOf(year);
        String username= firstName + lastName + birthYear + randomNumber;
        System.out.println("Your user name is "+ username);
        // System.out.println("Username" + firstName +lastName+birthYear+randomNumber);
    }
}