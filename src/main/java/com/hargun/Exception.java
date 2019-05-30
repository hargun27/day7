package com.hargun;

public class Exception {

        public static void main(String[] args)
        {


            int a = 100;
            int b = 0;
            int c;
            int x[]={1,2,3,4,5};
            System.out.println("START");
            try {
                c = a / b;

                System.out.println(c);
                System.out.println(x[5]);
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("array index");
            }


            catch(ArithmeticException e)
            {
                System.out.println("cant divide by 0");
            }
            catch(java.lang.Exception e)
            {
                System.out.printf(e.getMessage());
            }
            finally {
                System.out.println("final block");
            }






    }
}
