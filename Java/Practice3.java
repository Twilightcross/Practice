import java.util.Scanner;

class Practice3
{
	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);
		int p1,p2,p3;
		
		boolean result;
		double avg;

		System.out.println("��� : ");
		p1=sc.nextInt();
		System.out.println("it : ");
		p2=sc.nextInt();
		System.out.println("�Ϻ��� : " );
		p3=sc.nextInt();

		avg=(p1*40)+(p2*30)+(p3*30);
		result=avg>=70;

		System.out.println("you are not alone "+result+"");
	}
}