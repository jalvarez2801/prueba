package test.test;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lista = new LinkedList<Integer>();
		int n = 41;
		for(int i=0; i<n; i++)
		{
			lista.add(i+1);
		}
		System.out.println(lista.listIterator().next());
		lista.remove(lista.listIterator().next());
		System.out.println(lista.listIterator().next());
		System.out.println(lista.get((Integer)lista.listIterator().next()));
	}

}
