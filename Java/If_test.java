/*3.체중과 키를 입력 받아 다음 공식의 10kg 미만은 저체중, 정상체중 -10~ 정상체중 +10 은 정상 체중, 정상체중 +10 초과의 값은 과체중으로 출력 하시오
(키-100)X0.9    +- 10kg 는 정상 */

import java.util.Scanner;

class Tropic
{
	public static void main(String [] args){

		double weight,height,bmi;
		
		Scanner sc = new Scanner(System.in);

		
		System.out.println("몸무게를 입력하시오");
		weight=sc.nextInt();
		System.out.println("키를 입력하시오");
		height=sc.nextInt();

		bmi=(height-100)*0.9;

		if (weight>bmi+10)
		{
			System.out.println("과체중입니다");
			
		}else if (weight>=bmi+10)
		{
			System.out.println("정상 체중입니다.");
		}else if (weight>=bmi-10)
		{
			System.out.println("정상 체중입니다.");
		}else if (weight<bmi-10)
		{
			System.out.println("저체중입니다.");
		}
	}
}
