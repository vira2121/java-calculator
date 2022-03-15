package com.harman.batch4;
import java.util.Scanner;
public class calculator {

    public static void main(String[] args){

        Addition adcalc=new Addition();
        Subtraction subcalc=new Subtraction();
        Multiplication mulcalc=new Multiplication();
        Divide divcalc=new Divide();
        Scanner input=new Scanner(System.in);
        int n1,n2,result1,result2;
        int result3,result4;
        System.out.println("Enter num1");
        n1=input.nextInt();
        System.out.println("Enter num2");
        n2=input.nextInt();
        result1=adcalc.AdditionOperation(n1,n2);
        result2=subcalc.Suboperation(n1,n2);
        result3=mulcalc.MultiplyOperation(n1,n2);
        result4=divcalc.DivideOperation(n1,n2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }}
