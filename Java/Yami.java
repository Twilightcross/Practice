//���� 2 �Է� �޴��� ���� ���� ���� ������

import java.util.Scanner;

class Yami
{
	public static void main(String [] args){
		int one,two,three;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("ù ��° ���� �Է� :");
		one=sc.nextInt();
	
		System.out.println("�� ��° ���� �Է� :");
		two=sc.nextInt();

		System.out.println("���ÿ�");
		System.out.println("1�� ����");
		System.out.println("2�� ������");
		System.out.println("3�� ����");
		System.out.println("4�� ����");
		three=sc.nextInt();
		
		switch(three){
			case 1: 
				System.out.print("������� "+one*two+"");
			break;
			case 2: 
				System.out.print("���������"+one/two+"������ "+one%two+"");
			break;
			case 3:
				System.out.print("�������"+one+two+"");
			break;
			case 4: 
				System.out.print(one-two);
			default :
				System.out.print("�޴��� �߸� ���õǾ����ϴ�.");
		}
	}
}