package com.example.ankitatiwari.calculatorsession3;

public class SimpleInterest {
    int num1;
    int num2;
    int num3;
    public int calc;
    public int simpleInterest(int num1,int num2,int num3){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
        calc=(num1+num2+num3)/100;
        return calc;
    }
}
