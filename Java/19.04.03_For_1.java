import java.util.Scanner;

class Exam
{
	public static void main(String [] args){

		int grade;
		String name, subject;
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하십시오:");
		name=sc.next();
		System.out.println("시험 종류를 입력하십시오(시험/재시험) :");
		subject=sc.next();   //nextInt가 아니다 정수값이 아니라 문자입력이라는 것을 생각해야한다.
		System.out.println("점수를 입력하십시오 :");
		grade=sc.nextInt(); //int로 입력했고 정수를 입력하기 때문에 공통적으로 적용한다.

		switch (subject)
		{
		case "시험":
			if (grade>=70)
			{
			 System.out.printf("%s님은 합격입니다.\n",name);  //printf(문장을 완성하고 문장에 값을 삽일할 때) 
			}else{
			 System.out.printf("%s님은 불합격입니다.\n",name); //f는 formated를 의미한다.
			}
			break;
		case "재시험":
			if (grade>=75)
			{
			 System.out.printf("%s님은 합격입니다\n",name);
			}else{
			 System.out.printf("%s님은 불합격입니다.\n",name); //위에서 설정한 문자열을 삽입한다.
			}
			break;
		}
	}
}

public static void main(String [] args){

		int subject,total=0;
		double avg;
		Scanner sc = new Scanner(System.in);

		System.out.println("몇 과목의 점수를 입력하시겠습니까");
		subject=sc.nextInt();

		//과목의 입력 숫자만큼 점수를 계속 입력해줘야한다 ( 계속 입력 : 반복, 과목의 입력 숫자  : 회수의 제한 => for 문이라는 것을 알 수 있음)

		for (int i=1 ; i<=subject ; i++)
		{
			System.out.printf("%d 점수를 입력하십시오 \n",i); //i 번째 점수를 입력해야한다.
			total+=sc.nextInt(); // 총점수를 계산해서 평균을 내야하는데 총 과목 수는 i다 
			                     // total=i라고 정의 할 수 없다. 입력값이 들어가야하니 
								 // total+=을 사용해 입력값의 합을 구한다.
		}
		 System.out.printf("평균값 : %.2f\n",(total/(double)subject)); //

	}
}

