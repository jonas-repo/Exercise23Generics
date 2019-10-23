package com.exercise23generics.app;

public class Multi 
{
	public static <T> String showDataType(T object)
	{
		
		return "Data type is: " +object.getClass()
		+"\nParameter name is: "+object.getClass().getName()
		+"\nElement value is: "+object;
	}
	
	public static <N1 extends Number,N2 extends Number> String SumaNumeros(N1 Object1, N2 Object2)
	{
		double ob1=0, ob2=0;
		
		//first way
		if(Object1 instanceof Double && Object2 instanceof Double)
		{
			ob1 = ((Double) Object1).doubleValue();
			ob2 = ((Double) Object2).doubleValue();
			return "La suma es:"+(ob1+ob2);
		}
		
		//second way
		 Double sum;
		  sum = Object1.doubleValue() + Object2.doubleValue();
		
		return "The sum of the objects is: "+sum;
	}
	
}
