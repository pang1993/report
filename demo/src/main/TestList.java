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
	 * list�ڱ��������в�����ʹ��remove����
	 * �����ڱ���������ɾ��list��ĳ�����ʹ��iterator
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
		//�������ַ�ʽ���׳��쳣
     /*for(String out : list) {
			if("c".equals(out)) {
				list.remove(out);
			}
		}*/
		//�������ַ�������
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
