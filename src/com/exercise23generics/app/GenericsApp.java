package com.exercise23generics.app;

import com.exercise23generics.model.Resta;
import com.exercise23generics.model.Suma;

public class GenericsApp {

	public static void main(String[] args) 
	{
		Suma<Integer,Integer,String> gen = new Suma<Integer,Integer,String>(5);
		Suma<String,Integer,String> gen2 = new Suma<String,Integer,String>("Hola desde clase generica");
		Resta<String,Double> gen3Resta = new Resta<String,Double>();

		System.out.println(gen.getT());
		System.out.println(gen2.getT());
		gen3Resta.setK("Hola desde resta valor k");
		gen3Resta.setV(3.89);
		System.out.println(gen3Resta.toString());
		
		
		
	}

}
