/* IF문의 사용 예시 (둘 중 하나 또는 조건식의 참으로 만족하는 몸체안의 연산을 하게 됩니다.)*/

import java.util.Scanner;

class Iftest
{
 public static void main(String [] args)
 {
   Scanner sc= new Scanner(System.in);
   int Score;
   
   System.out.println("점수 입력 :");
   score=sc.nextInt();
   
   if(score>=70){//점수가 70점 이상인가? 이것이 참일 경우
   
        System.out.println("합격"); // 합격을 출력한다.
        
   }else{//거짓일 경우
   
        System.out.println("불합격");//불합격을 출력 한다.
   }
   
}  

 //if 문 사용시 주의사항 : if 문 안에서 선언되거나 대입된 값은 밖에서 사용할 수 없습니다.
//if 문 밖에서 사용한 후 연산하여 출력합니다.
        



