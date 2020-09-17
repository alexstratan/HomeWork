package com.step;

import com.step.calculator.Calculator;
import com.step.converter.TempConverter;
import com.step.comparator.NumbersComparator;

import java.util.Scanner;

public class App {

    public static void main(String[] args){
        TempConverter tempConverter=new TempConverter();
        Scanner scanner=new Scanner(System.in);

        System.out.print("100°F → °C = ");
        tempConverter.convertToCelsius(100);
        System.out.print("100°C → °F = ");
        tempConverter.convertToFahr(100);

        System.out.print("Celsius value:  ");
        double localCelsius=scanner.nextDouble();
        System.out.print("Fahrenheit value:  ");
        double localFahrenheit=scanner.nextDouble();

        System.out.print(localCelsius+"°C → °F = ");
        tempConverter.convertToFahr(localCelsius); //de ce nu putem scrie denumirea atributului aici?
        System.out.print(localFahrenheit+"°F → °C = ");
        tempConverter.convertToFahr(localFahrenheit);

        System.out.print("First value (calculations) : ");
        double v1=scanner.nextDouble();
        System.out.print("Second value (calculations) : ");
        double v2=scanner.nextDouble();

        System.out.println(v1+"+"+v2+"="+Calculator.Sum(v1,v2));
        System.out.println(v1+"-"+v2+"="+Calculator.Reduction(v1,v2));
        System.out.println(v1+"*"+v2+"="+Calculator.Multiplying(v1,v2));
        System.out.println(v1+"/"+v2+"="+Calculator.Division(v1,v2));


        System.out.print("First value (comparison) : ");
        v1=scanner.nextDouble();
        System.out.print("Second value (comparison) : ");
        v2=scanner.nextDouble();

        System.out.println("From the two values, "+v1+" and "+v2+" ,the bigger one is "+ NumbersComparator.Max(v1,v2));
        System.out.println("From the two values, "+v1+" and "+v2+" ,the smaller one is "+ NumbersComparator.Min(v1,v2));

    }
}
