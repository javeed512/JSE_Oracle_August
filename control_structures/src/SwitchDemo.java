
import java.lang.*;
import java.util.*;

public class SwitchDemo {


        public static void main(String[] args) {
            

                Scanner  sc  = new Scanner(System.in);


               // int  choice  = 1;

                System.out.println("Enter your choice");
           String choice =    sc.next();

              

            switch (choice) {
                    case "one":
                     System.out.println("Case One Executed..");
                   
                    break;
                    case "two":
                    System.out.println("Case Two Executed..");
                 
                    break;

                   case "three":
                   System.out.println("Case Three Executed..");
                  break;
          

                default:

                    System.out.println("Invalid OPtion");

                    break;
            }






        }



}
