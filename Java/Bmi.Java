import java.util.Scanner;

class 체중입력
{
	public static void main(String[] args) 
	{
		//체중,나이,신장을 빈 칸으로 분리하여 순서대로 입력하세요 
		int a=0;
		double b=0, c=0;
		Scanner sc= new Scanner(System.in);

		System.out.println("나이 체중 신장을 빈칸으로 분리하여 순서대로 입력하세요");
		System.out.println("입력나이 : "+a+"");
		a= sc.nextInt();
		System.out.println("입력체중 "+b+"");
		b= sc.nextDouble();
		System.out.println("입력신장 "+c+"");
		c= sc.nextDouble();
}
} // 간단한 체중입력에 관한 코드이다.
