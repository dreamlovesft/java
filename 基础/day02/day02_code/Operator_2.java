/*
    ��ֵ�����
	=
	+= -= *= /= %=
*/
public class Operator_2{
	public static void main(String[] args){
		//= ��ֵ����,�������ֵ,��ֵ����ߵı���
		int i = 3;
		i = i + 3;
		System.out.println(i); // 6
		
		// += ��ֵ�����  i+=3 i=i+3
		int j = 5;
		j+=6; // j=j+6
		System.out.println(j); // 11
		
		byte b = 1;
		b = (byte)(b + 1);
		System.out.println(b); // 2
		
		byte b1=1;
		b1+=1; // ��ͬ(byte)(b1 + 1);
	    System.out.println(b1); // 2
	}
}