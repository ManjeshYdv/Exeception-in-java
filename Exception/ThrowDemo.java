package com.Exception;
class ThrowExample{
    public void getPercent(double d){
        if(d<35.5){
            throw new ArithmeticException("percent less than 35");
        }else
            System.out.println("promote to new semster");
    }
}
public class ThrowDemo {
    public static void main(String[] args) {
        ThrowExample t= new ThrowExample();
        t.getPercent(25.5);
        System.out.println("out of error");
    }
}
