package cn.itcast.demo;

import java.util.ArrayList;
import java.util.List;

public class HomeWork01 {

	public static void main(String[] args) {
		/*1.�����������󣬲��ô���ʵ�֣�
		(1)�����´��룺
		(2)���巽��ͳ�Ƽ�����ָ��Ԫ�س��ֵĴ�������"a" 3,"b" 2,"c" 1*/
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("d");
		list.add("d");
		list.add("d");
		list.add("d");
		System.out.println(frequency(list, "a"));	// 3
		System.out.println(frequency(list, "b"));	// 2
		System.out.println(frequency(list, "c"));	// 1
		System.out.println(frequency(list, "d"));	// 5
		System.out.println(frequency(list, "xxx"));	// 0
	}

	private static String frequency(List<String> list, String str) {
	// ˼·�������������ַ����ĺʹ�����ַ���ȣ����ü�����+1
		
	    //������
		int count = 0;
		for (String thisStr : list) {
			// �����ǰ����������Ԫ�غʹ���Ԫ�����ʱ��������Ҫ��¼
			if(thisStr.equals(str)){
				 count++;
			}
		}
		
		String resultStr =str+","+count;  //a,3  -->ƴ����������
		return resultStr;//����
	}
}
