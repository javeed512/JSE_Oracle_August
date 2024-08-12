public class App {
    public static void main(String[] args) throws Exception {
      

        


                App   ap = new App();

                System.out.println(ap);
                

                int  a1[] = {10,20,30,40,50};

                System.out.println(a1);


                System.out.println("For Loop");
                
                for(int i=0; i < a1.length; i++ ){

                     

                        if(a1[i] > 35){

                                break;

                        }


                        System.out.println(a1[i]);
                }


                    System.out.println("Enhance For Loop / ForEach Loop");


                    for(int x: a1){  // foreach

                            System.out.println(x);
                    }


    }
}
