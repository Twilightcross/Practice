/*키보드로 정수를 입력받아 1) 4와 5로 나누어지는지 2)4 또는 5로 나누어 지는지 3)나누어진다면 어떤 수로 나누어지는지 3가지를 알 수 있도록 출력하시오*/

import java.util.Scanner;

class Division
{
	public static void main(String [] args){
		int number;
		Scanner sc= new Scanner(System.in);
		boolean four,five,onlyone;
		String and,or,result;

		System.out.println("정수를 입력하시오");
		number=sc.nextInt();

		four=number%4==0;
		five=number%5==0;
		onlyone=(four&&!five)||(!four&&five)?true:false;

		and=four&&five? "4와 5로 나누어집니다" : "4와 5로 나누어지지않습니다.";
		or=four||five? "4또는 5로 나누어집니다" : "4또는 5로 나누어지지않습니다.";
		result=onlyone&&four? "4로 나누어집니다." : "";
		result+=onlyone&&five? "\n5로 나누어집니다." : "";

		System.out.println(and);
		System.out.println(or);
		System.out.println(result);
		
	}
}
