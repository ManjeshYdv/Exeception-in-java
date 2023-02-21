package com.Exception;
class ThrowCatch{
    public void getPercent(double d){
        try{
            if(d<35.5){
                throw new ArithmeticException("percentage is less than 35");
            }else {
                System.out.println("youn are promoted to next senster");
            }
        }catch(ArithmeticException e){
            System.out.println("percentage is less than 35 ");
        }
    }
}
public class ThrowCatchDemo {
    public static void main(String[] args) {
        ThrowCatch t= new ThrowCatch();
        t.getPercent(36);
        System.out.println("out of error");
    }
}
