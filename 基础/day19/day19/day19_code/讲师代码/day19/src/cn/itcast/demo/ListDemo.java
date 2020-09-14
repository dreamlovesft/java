package cn.itcast.demo;

import java.util.ArrayList;
import java.util.List;

/*
 *  List�ӿ���ϵ, �̳�Collection�ӿ�
 *    �����кܶ�ʵ����
 *  List�ӿ��ص�: ����,����,�����ظ�Ԫ��
 *    ʵ����, ArrayList, LinkedList
 *    
 *  List�ӿ��еĳ��󷽷�,��һ���ַ��������ĸ��ӿ�Collection��һ��
 *  List�ӿڵ��Լ����еķ���, ���������Ĺ���
 */
public class ListDemo {
	public static void main(String[] args) {
		function();
	}
	/*
	 *  E set(int index, E)
	 *  �޸�ָ�������ϵ�Ԫ��
	 *  ���ر��޸�֮ǰ��Ԫ��
	 */
	public static void function_2(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Integer i = list.set(0, 5);
		System.out.println(i); // 1
		System.out.println(list); // [5, 2, 3, 4]
	}
	
	/*
	 *  E remove(int index)
	 *  �Ƴ�ָ�������ϵ�Ԫ��
	 *  ���ر�ɾ��֮ǰ��Ԫ��
	 */
	public static void function_1(){
		List<Double> list = new ArrayList<Double>();
		list.add(1.1);
		list.add(1.2);
		list.add(1.3);
		list.add(1.4);
		
		Double d = list.remove(0);
		System.out.println(d); // 1.1
		System.out.println(list); // [1.2, 1.3, 1.4]
	}
	
	/*
	 *  add(int index, E)
	 *  ��Ԫ�ز��뵽�б��ָ��������
	 *  ���������Ĳ���,��ֹԽ������
	 *  java.lang.IndexOutOfBoundsException
	 *     ArrayIndexOutOfBoundsException
	 *     StringIndexOutOfBoundsException
	 */
	public static void function(){
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		System.out.println(list); // [abc1, abc2, abc3, abc4]
		
		list.add(1, "itcast");
		System.out.println(list); // [abc1, itcast, abc2, abc3, abc4]
	}
}
