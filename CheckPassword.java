import static java.lang.System.*;
import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {
        out.println("What's the password?");

        Scanner keyboard = new Scanner(in);
        String password = keyboard.next();

        out.println("You typed >>" + password + "<<");
        out.println();

        if(password == 'swordfish')
        {
            out.println("The word you typed is stored");
            out.println("in the same place as the real");
            out.println("password. You must be a hacker.");
        } else {
            out.println("The word you typed is not stored in the same place as the real password, but that's no bid deal.");
        }
        out.println();

    }
    
}




