package cn.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HomeWork {
	/*1.�����������󣬲��ô���ʵ�֣�
	(1)ͨ������¼�������ַ�������ʽ(2015-10-20)
	(2)��������������ڼ�����һ��ĵڼ���
	(3)�����룺2015-10-20�����"2015��-10��-20�� �� ���ڶ�����  2015��ĵ� 293 ��"*/
	// 1������(����֪�� )   2����������ʹ���������˼����д����    3�� �������Ǵ���ĸ�����
    public static void main(String[] args) throws Exception {
    //�����Ĺ��̣�
		// ���ܲ�����һ�������� ֱ�ӽ�һ����ʽ���ַ�����ʽ���������һ���ַ�����ʽ
    	//,����û�������ķ������������ڵĸ�ʽ��������ֻѧ���������ַ�ʽ
    	//1�� String str =  sdf.format(Date date)
    	//2��Date date = sdf.parse(String str);   ͨ����������������һ�¾��ܵõ���
    	// ����ֻ��������  --�� ������ת���������
    	//  set����        setTime(date) --����������Ѿ�����ʱ����
    	// �������get()����   -->���ڼ����õ��Ƕ�����Ķ�����
    	
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("�������ʽ(2015-10-20)");
    	String dateStr = sc.nextLine();
    	// ��ȡһ�������� ������ַ���ת����������Ҫ�ĸ�ʽ���������
    	printDateForStr(dateStr);
	}
	private static void printDateForStr(String dateStr) throws Exception {
		// String str =  sdf.format(Date date)
    	// Date date = sdf.parse(String str);
    	// ����ֻ��������  --�� ������ת���������
    	//  set����        setTime(date) --����������Ѿ�����ʱ����
    	// �������get()����   -->���ڼ����õ��Ƕ�����Ķ�����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(dateStr);
		//2015��-10��-20��
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy��-MM��-dd��");
		String format = sdf2.format(date);
		//�����룺2015-10-20�����"2015��-10��-20�� �� ���ڶ�����  2015��ĵ� 293 ��
		Calendar c = Calendar.getInstance();
		c.setTime(date);// 1 - 7    0 - 6 
		int week = c.get(Calendar.DAY_OF_WEEK);// ע�⣺��ǰ�õ���������˵����ڣ��й��˵�����Ҫ��1��
		int day = c.get(Calendar.DAY_OF_YEAR);
		// getWeek(week) -->дһ����������ϣ�����õ������ڣ����뷽���У��÷������ҷ���һ��׼ȷ�����ڼ�
		System.out.println(format  + "��"+getWeek(week)+",��"+c.get(Calendar.YEAR)+"��ĵ�"+day +"��");
	}
	private static String getWeek(int week) {
		// ����    ��week ��Ϊ������ĽǱ�  -->ͨ���Ǳ굽������ȥȡ����Ӧ��Ԫ��
		String [] strArr =  {"","������","����һ","���ڶ�","������","������","������","������"};
		return strArr[week];
	}	
}
