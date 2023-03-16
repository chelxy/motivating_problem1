package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	
	private  List<T> list = new ArrayList<T>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	//operação first() quue me devolve o primeiro elemento que está no printService
	public T first() {
		//Programação defensiva
		if(list.isEmpty()) {
			//isEmpty, Verificar se a lista está vazia.
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);//pegar o primeiro da lista
	}
	
	//método imprima
	public void print() {
		System.out.print("[");
		if(!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for(int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
		
	}

}
