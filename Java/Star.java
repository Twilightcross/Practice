import java.util.Scanner;

class Star
{
	public static void main(String[] args) 
	{	

		for (int i=1; i<11 ; i++)
			{ 
			for (int j=10; j>i ; j-- ){
				System.out.print("*");
			}
			System.out.println();
		}
	}
} // 내림차순 삼각형 (왼쪽)


		for (int i=1; i<10 ; i++)
			{ 
			for (int j=0; j<i ; j++ ){
				System.out.print("*");
			}
			System.out.println();
		}
	}
} // 오름차순 삼각형(왼쪽)

for (int a=0; a<10 ; a++)
	{
		for (int b=0; b<=10; b++)
		{
			System.out.print(b<(10-a)? " " : "*");
		}
		System.out.println();
	}
	}
} //내림차순 삼각형 (오른쪽)

for (int a=0; a<10 ;a++ )
		{
			for (int b=0; b<10; b++)
			{
				System.out.print(b<a? " " : "*");
			}
			System.out.println();
		}
	}
} //내림차순 삼각형 (오른쪽)

for (int a=0; a<4 ;a++ )
		{
			for (int b=0; b<3-a; b++)
			{
				System.out.print(" "); //띄어쓰기 꼭!
			}
			for (int b=0;b<2*a+1 ;b++ )
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
} //정삼각 모양 별 찍기 // 아직 이해 어려움 

for (int i=0; i<5 ; i++ )
	 {
		 int x=4;
		 for (int j=0; j<x-i ; j++ ) //별 앞에 공백을 찍는 for문
		 {
			 System.out.print(" ");
		 }
		 for (int k=0;k<=i ; k++ ) // 별을 찍는 for 문
		 {
			 if (k==0) // *별을 홀수개 찍게 하기 위해 하나와
			 {
				 System.out.print("*");
			 }else //두개를 나눠서 찍는다.
			 {System.out.print("**"); 
		 }
		 }
		 System.out.println("");
	 }
	}
} //정삼각 별 찍기 2

for(int i =1; i<5; i++)
{
		for(int j=1;j<5-i;j++)

		{
			System.out.print(" ");
		}
		for(int j=1;j<=2*i-1;j++)
			{
			System.out.print("*");
			}
			System.out.println("");
}
}

} //정삼각 별 찍기 3 (가장 경제적이라고 여겨짐 ) 


