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
} //피라미드 모양 별 찍기 // 아직 이해 어려움 



