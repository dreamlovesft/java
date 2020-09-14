/*
   ����ArrayList�����Ĳ���
   
     add(int ����,�洢��Ԫ��) ��Ԫ����ӵ�ָ����������
	 set(int ����,�޸ĺ��Ԫ��) ��ָ��������Ԫ��,�����޸�
	 remove(int ����) ɾ��ָ�������ϵ�Ԫ��
	 clear() ��ռ����е�����Ԫ��
*/
import java.util.ArrayList;
public class ArrayListDemo_3{
	public static void main(String[] args){
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		
		//������2��,���Ԫ��7
		array.add(2,7);
		System.out.println("add(2,7)");
		System.out.println(array);
		
		//��0�����ϵ�Ԫ��,�޸ĳ�10
		array.set(0,10);
		System.out.println("set(0,10)");
		System.out.println(array);
		
		//��4�����ϵ�Ԫ��,ɾ��
		array.remove(4);
		System.out.println("remove(4)");
		System.out.println(array);
		
		array.clear();
		System.out.println("clear()");
		System.out.println(array);
		
		//ʹ�÷��� size+get��Ͻ��б���
		for(int i = 0 ; i < array.size(); i++){
			System.out.println( array.get(i) );
		}
	}
}

//��ӡ
//		add(2,7)
//		[1, 2, 7, 3, 4]
//		set(0,10)
//		[10, 2, 7, 3, 4]
//		remove(4)
//		[10, 2, 7, 3]
//		clear()
//		[]