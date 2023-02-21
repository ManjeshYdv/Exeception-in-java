package com.Exception;

public class Throw {
    static void age(int age){
        if(age<18)
            throw new ArithmeticException("not eligibale");
        else
            System.out.println("chal ni kal");
    }

    public static void main(String[] args) {
        age(10);
        System.out.println("rest of the code");
    }
}
