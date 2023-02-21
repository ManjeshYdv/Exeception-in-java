package com.Exception;
class THrow{
    public void mDisplay() throws ArithmeticException{
        System.out.println("error can occured");
        int div =5/0;
    }
}
public class ThrowDemo2 {
    public static void main(String[] args) {
        THrow t= new THrow();
       /*try{
            t.mDisplay();
        }catch(ArithmeticException e){
            System.out.println("a number can not divided by zero");
        }*/
        System.out.println("out of error");
    }
}
