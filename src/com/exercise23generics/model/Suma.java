package com.exercise23generics.model;

public class Suma<T,K,V> 
{  //generic parameters that can be placed
private T t;
private K k;
private V v;
	
	public Suma(T miObjet)
	{
		this.t = miObjet;
	}
	
	public Suma()
	{
		
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "Suma [t=" + t + ", k=" + k + ", v=" + v + "]";
	}
	
	
	
	
}
