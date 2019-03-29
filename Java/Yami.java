//¼ýÀÚ 2 ÀÔ·Â ¸Þ´º´Â µ¡¼À »¬¼À °ö¼À ³ª´°¼À

import java.util.Scanner;

class Yami
{
	public static void main(String [] args){
		int one,two,three;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Ã¹ ¹øÂ° ¼ýÀÚ ÀÔ·Â :");
		one=sc.nextInt();
	
		System.out.println("µÎ ¹øÂ° ¼ýÀÚ ÀÔ·Â :");
		two=sc.nextInt();

		System.out.println("°í¸£½Ã¿À");
		System.out.println("1¹ø °ö¼À");
		System.out.println("2¹ø ³ª´°¼À");
		System.out.println("3¹ø µ¡¼À");
		System.out.println("4¹ø »¬¼À");
		three=sc.nextInt();
		
		switch(three){
			case 1: 
				System.out.print("°ö¼À°á°ú "+one*two+"");
			break;
			case 2: 
				System.out.print("³ª´°¼À°á°ú"+one/two+"³ª¸ÓÁö "+one%two+"");
			break;
			case 3:
				System.out.print("µ¡¼À°á°ú"+one+two+"");
			break;
			case 4: 
				System.out.print(one-two);
			default :
				System.out.print("¸Þ´º°¡ Àß¸ø ¼±ÅÃµÇ¾ú½À´Ï´Ù.");
		}
	}
}