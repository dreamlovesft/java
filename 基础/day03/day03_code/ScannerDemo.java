/*
  ������������, ����һ����  Scanner
  java�Ѿ�������,��Sun��˾Ϊ�������õ���,ʹ����
  ���������������ͱ���,�ͻ������ͱ�������
    int a = 1;
	��ʽ:
	  ����  ������ = new ����();
	����: ������Scanner��ı���
	
	  Scanner sc = new Scanner();
	  int a = 1;
	ÿ����������,�����Լ��Ĺ���,���ʹ�ù���
	��ʽ:
	  ����.��������()
	  
	Scanner��,����,��������������,���ܼ��̵�����
	ʹ��Scanner�ಽ��:
	  1. �����,ָ�������ڵ��ļ���, �ؼ��� import
	     java�ļ���-util�ļ���
	  2. ��ʽ,������Scanner���ͱ���
	  3. ����.ʹ��Scanner���еĹ���,��ɼ������� 
*/
import java.util.Scanner;
public class ScannerDemo{
	public static void main(String[] args){
		// ����  ������ = new ����();
		// ������Scanner,�����
		Scanner sc = new Scanner(System.in);
		//����.��������() ���ܼ�������
		// ����: nextInt() ���ܼ�������,��֤�����������
		// ���ܽ��ܵ����ݾ�������,�������к�Ľ��������������
		int i = sc.nextInt();
		System.out.println(i);
		
		//Scanner�����һ������    next() ���ܼ���������ַ���
		
		String s = sc.next();
		System.out.println(s);
	}
}

// ��ӡ

// ��������
// 12
// 12
// 13
// 13

// ���� a
// a
// Exception in thread "main" java.util.InputMismatchException
//         at java.util.Scanner.throwFor(Unknown Source)
//         at java.util.Scanner.next(Unknown Source)
//         at java.util.Scanner.nextInt(Unknown Source)
//         at java.util.Scanner.nextInt(Unknown Source)
//         at ScannerDemo.main(ScannerDemo.java:32)





