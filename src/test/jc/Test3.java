package test.jc;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static void  main(String[] args) {
		Test2 test = new Test2();
		test.setValue(1);
		Test2 test2 = test;
		test.setValue(2);
		System.out.println(test.getValue());
		System.out.println(test2.getValue());
		Test2 test3 = test2;
		System.out.println(test.getValue());
		System.out.println(test2.getValue());
		System.out.println(test3.getValue());
		
		int[] array = {6,9,8};
		List<Integer> list = new ArrayList<>();
		list.add(array[0]);
		list.add(array[2]);
		list.set(1, array[1]);
		list.remove(0);
		
		
		
		
		
	}
}
