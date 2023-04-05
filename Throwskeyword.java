public class Throwskeyword {
   
        static{
           System.out.println("static block");
    
        }
        public static void main(String arg[]) throws ClassNotFoundException
        {
            A obj=new A();
            obj.show();
        }
    }
    class A{
        /**
         * @throws ClassNotFoundException
         */
        public void show() throws ClassNotFoundException
        {
            class.forName("A");
        
            
        }
    }
    
    

