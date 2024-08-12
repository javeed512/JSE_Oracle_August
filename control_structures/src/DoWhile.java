public class DoWhile {


public static  boolean   isValidUser(String username,String password){

  if(username.equals("javeed")  && password.equals("tiger")){

        System.out.println("Welcome to Facebook");

        return true;
  }
                System.out.println("Invalid User");

            return false;

        }



    public static void main(String[] args) {
        
            boolean flag = false;


        do {

            System.out.println("Facebook Login Page");


       flag =   isValidUser("javeed", "tiger");


            break;

        } while (flag);



    }


}
