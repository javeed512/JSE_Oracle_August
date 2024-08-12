package myapplication;

public class Employee {

   static int eid;
   static String ename;
    static double salary;


        public static void main(String[] args) {
            

                        Employee e1  = new Employee();

                            e1.eid = 201;
                            e1.ename = "tom";
                            e1.salary = 3000;
                    System.out.println("e1 object data ");
                        System.out.println(e1.eid);
                        System.out.println(e1.ename);
                        System.out.println(e1.salary);


                    Employee e2 = new Employee();

                            e2.eid = 202;
                            e2.ename = "kapil";
                            e2.salary = 45000;

                            System.out.println("e2 object data ");
                    System.out.println(e2.eid);
                    System.out.println(e2.ename);
                    System.out.println(e2.salary);


                    System.out.println("e1 object data ");

                    System.out.println(e1.eid);
                    System.out.println(e1.ename);
                    System.out.println(e1.salary);



                        // System.out.println("Using Employee Class name");

                        // System.out.println(Employee.eid);
                        // System.out.println(Employee.ename);
                        // System.out.println(Employee.salary);

                       




        }




}
