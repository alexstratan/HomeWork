package com.step.comparator;

public class NumbersComparator {

    public static double Min(double v1,double v2){
        if(v1>v2)return v2;
        else if(v2>v1) return v1;
        else return 0;
    };

    public static double Max(double v1,double v2){
        if(v1>v2)return v1;
        else if(v2>v1) return v2;
        else return 0;
    };
}
