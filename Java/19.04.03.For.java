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
