package cn.itcast.demo;

import java.util.LinkedList;

public class MyStack<E> {
	  
	  private LinkedList<E> linked ;
	  
	  public MyStack(){
		  linked = new LinkedList<E>();
	  }
	  // ѹջ  �� ���Ԫ��   ��ջ �� ȡ������ȥԪ��
	  public void myPush(E e){
		  linked.add(e);
	  }
	  public E myPop(){
		  
		  return linked.removeLast();
	  }
	   
	

}
