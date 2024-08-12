package myapplication;

public class InstanceVariables {

        int  sid;
        String sname;
        boolean  isValid;


        public static void main(String[] args) {
            

              InstanceVariables   v1 =      new  InstanceVariables();


                    v1.sid = 101;
                    v1.sname = "satish";

                System.out.println(v1.sid  +"  "+ v1.sname);

                System.out.println(v1.isValid);

        }






}
