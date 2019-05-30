package com.hargun;

public class ExampleException {

        public static void main(String[] args)
        {


            int a = 100;
            int b = 0;
            int c;
            int x[]={1,2,3,4,5};
            float salary=1000.0f;

            System.out.println("START");
            try {
               // c=div(a=)
                if(b==0)
                {
                    throw new ArithmeticException("divisble by 0 occus");
                }
                else{
                    c=a/b;
                    System.out.println("C" + c);
                }

                //System.out.println(c);

                System.out.println(x[5]);

                if(salary<2000.0f)
                {
                    throw new InvalidSalaryException(" Salary must be >=2000 ");
                }
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("array index");
            }


            catch(ArithmeticException e)
            {
                //System.out.println("cant divide by 0");
                System.out.println(e.getMessage());
            }
            catch(java.lang.Exception e)
            {
                System.out.printf(e.getMessage());
            }
            finally {
                System.out.println("final block");
            }
//private static int div(int a,int b) throws ArithmeticException,ArrayIndexOutOfBoundsException
//            {
//                return a/b;
//            }





    }
}
