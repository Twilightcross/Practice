//hii today Java practice 

import java.util.Scanner;

class For 
{
   public static void main(String [] args){
   
    int num=0; 
    
    for( int a=1, a<=10, a++)
    {
      num+=a;
    } 
    System.out.println(num); //1에서 10까지 정수의 합을 돌렸을 때
    } 
}
 
 2)
    
public static void main(String [] args){

		 int result=0;
		 int num;
		 Scanner sc= new Scanner(System.in);
		 System.out.println("정수를 입력하시오 : ");
		 num=sc.nextInt();

		   //사용자가 입력한 정수까지 1부터 더한 값을 출력 , 1을 살짝 응용

		 for (int a=1 ; a<=num; a++)
		 {
			 result+=a;
		 }
		 System.out.println("더한 값 "+result+"");
	 }
}

 3)
 
 import java.util.Scanner;

class Practice3
{
	 // 사용자가 입력한 정수에서 약수를 출력 
	 public static void main(String [] args){

		 int num;
		 Scanner sc = new Scanner(System.in);

		 System.out.println("정수 입력 :");
		 num=sc.nextInt();

		 for (int a=1;a<num ;a++ )
		 {
			if (num%a==0)  // 나누어 0으로 떨어진다는 것이 중요하다.
			{
				System.out.println(a);
			}
		 }
	 }
}

4)
	 public static void main(String [] args){

		 int num;
		 Scanner sc = new Scanner(System.in);

		 System.out.println("정수 입력 :");
		 num=sc.nextInt();

		 for (int a=1;a<=num ;a++)
		 {
			if (a%2==0) //지정 된 숫자 내에서 짝수(2로 나누어 떨어지는) 수를 나열		
			{
				System.out.println(a);
			}
		 }
	 }
}

5) //지정된 연도를 입력받아, 1년부터 당해년도까지의 모든 돼지해를 출력하시오 
 public static void main(String [] args){

		 int year;
		 Scanner sc = new Scanner(System.in);

		 System.out.println("년도 입력 :");
		 year=sc.nextInt();

		 for (int a=1;a<=year ;a++)
		 {
			if (a%12==3) //지정 된 숫자 내에서 짝수(2로 나누어 떨어지는) 수를 나열
				     //사실 말이 돼지해지 실제로는 위의 짝수 구하는 문제와 다르지 않다. 
				     //문제를 구하는 공식은 같다 문제가 가지고 있는 의미파악이 제일 중요하다.
			{
				System.out.println(a);
			}
		 }
	 }
}


public static void main(String [] args){

		for (int i=1; i<5; i++ )
		{ // i가 1일 때 반복문이 실행된다
			for (int j=1; j<5-i ;j++ )
			{ //i가 1일때 j가 작다.참이다. 반복문이 실행된다.
              //i가 3일때 j가 작다.참이다
			  //i가 2일때 j가 크다.false다 반복문을 나온다.
			  //i가 3일때 j가 크다.false다 반복문을 나온다.

				System.out.print(" ");
			}
			for (int j=1; j<=2*i-1 ;j++ )
			{ // i가 1일때 1이다j=1이다 반복문이 실행된다.
			  // i가 2일때 3이다j<3이다 반복문이 실행된다 
			  // i가 3일때 5이다j<5이다 반복문이 실행된다.
				System.out.print("*");
			}
			System.out.println();
		}
}
}
