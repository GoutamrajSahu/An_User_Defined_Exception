package com.company;
import java.util.*;

class UserDefinedException extends Exception{
    UserDefinedException(String str){
        super(str);
    }
}
class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter First String: ");
        String str1 = Sc.nextLine();
        System.out.println("Enter Second String: ");
        String str2 = Sc.nextLine();
        try{
            if(str1.equals(str2)){
                System.out.println("Both are same.");
            }else{
                throw new UserDefinedException("Both are not same.");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}