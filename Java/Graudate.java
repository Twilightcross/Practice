/*대학을 졸업하려면 최소 140학점을 이수해야 한다. 이수한 학점 중 전공은 70학점 이상이어야 하며, 교양과 일반은 각각 30학점이거나 총점이 80학점 이상이어야 한다. 이수한 학점을 각각 입력받아 졸업여부를 출력하라 */

import java.util.Scanner;

class Graduate
{
	public static void main(String [] args){
	int major,minner,basic,total; //전공,교양,일반,합계
	boolean gradue;//졸업 가능 여부
	String result; //결과값
	Scanner sc= new Scanner(System.in);
	

	System.out.println("전공 이수 학점 : ");
	major=sc.nextInt();
	System.out.println("교양 이수 학점 : ");
	minner=sc.nextInt();
	System.out.println("일반 이수 학점 : ");
	basic=sc.nextInt();

	total=major+minner+basic;
	gradue=total>=140&&major>=70&&((minner+basic)>=80)||basic>=30&&minner>=30;
	result=gradue? "졸업가능" : "졸업불가능";

	System.out.println(result);
	}
}
