package Recursion;
import java.util.*;

public class fibonnaci {
    public static int printFibonnaci(int n){

        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        return printFibonnaci(n-1)+printFibonnaci(n-2);
    }
    public static void main(String args[]){
        System.out.println(printFibonnaci(10));
        System.out.println(printFibonnaci(11));
        System.out.println(printFibonnaci(12));

    }
}
