package java;

import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try{
            int N=input.nextInt();
            if (N%2==1) {
                System.out.println("Number is Odd");
            } else {
                System.out.println("Number is Even");
            }
        } finally{
            input.close();
        }
    }
}
