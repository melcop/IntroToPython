package fifavm_russia;
import java.util.Scanner;
/**
 *
 * @author Charlie
 */
public class PowerUp {

     private static String name;
     
     public static void showMe(){
         Scanner user_input = new Scanner( System.in );
         System.out.print("Enter your first name: ");
         name = user_input.next( );
         System.out.println("You are :"+name);
     }
     
     public static void main(String [] args){
         showMe();
     }
}
