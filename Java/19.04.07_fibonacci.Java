import java.util.Scanner;

class Test4 
{
	public static void main(String[] args) 
	{
		int a=1;
		int b=1;
		int c;

		System.out.println(a);
		System.out.println(b);

		for (int i=3;i<=10 ;i++)
		{
			c=a+b;
			System.out.println(c);

			a=b; //반복수행의 핵심 키워드, 그냥 암기해버리기로 
			b=c;
		}
			System.out.println();
	}
}
