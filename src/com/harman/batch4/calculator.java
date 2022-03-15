package com.harman.batch4;
import java.util.Scanner;
public class calculator extends ParentCalculator {

    public static void main(String[] args){
        calculator ob=new calculator();

        Scanner input=new Scanner(System.in);
        int n1,n2,result1,result2;
        int result3,result4;
        System.out.println("Enter num1");
        n1=input.nextInt();
        System.out.println("Enter num2");
        n2=input.nextInt();
        result1=ob.AddOperation(n1,n2);
        result2=ob.SubOperation(n1,n2);
        result3=ob.MultiplyOperation(n1,n2);
        result4=ob.DivideOperation(n1,n2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }}
