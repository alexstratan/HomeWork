package com.step.converter;

public class TempConverter {
   	public void convertToFahr(double celsius){
   	    System.out.println(( celsius* 9/5) + 32);
    }
	public void convertToCelsius(double fahr){
   	    System.out.println((fahr - 32) * 5/9);
    }

}
