package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestList test = new TestList();
		test.testIterator();
	}
	
	/**
	 * list在遍历过程中不允许使用remove操作
	 * 若想在遍历过程中删除list中某项，可以使用iterator
	 * */
	public void testIterator() {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		for(String out : list) {
			System.out.println(out);
		}
		//下面这种方式会抛出异常
     /*for(String out : list) {
			if("c".equals(out)) {
				list.remove(out);
			}
		}*/
		//下面这种方法正常
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			if("c".equals(iter.next())) {
				iter.remove();
			}
		}
		for(String out : list) {
			System.out.println(out);
		}
	}
}
