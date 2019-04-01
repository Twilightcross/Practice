While 문
-------
반복문은 어떤 동일한 알고리즘을 반복하는것 

+프로그램 흐름이 반복되어야 하는 이유 => "생산성"
 +반복이란 = 생산성을 늘리기 위한 것 

while로 만들 수 있는 것은 for로도 만들 수 있다.(반대도 가능)

두 가지의 용도는 다름

while문은 반복해야하는 횟수는 모르지만 목표는 정해져 있음.
for문은 반복횟수가 정해져 있음

while의 조건식은 참 혹의 거짓의 값을 가지며 
조건식이 참이면 그 작업을 항상 반복하고 거짓이면 빠져나온다.
무한 반복문이라도 컴파일, 실행이 가능하다. 

 (숫자 +1씩 무한히 반복한다던지..)
 -------------------------------

<pre>import java.util.Scanner;

class While
{
  public static void main(String [] args)
  { 
    int a=0;
    
    while(true){  //트루인경우
    System.out.println(a++);
    }
  }
} </pre>
> 무한반복의 좋은 예


import java.util.Scanner;

class While
{
  public static void main(String [] args)
  { 
    boolean flag= true >> flag라는 boolean의 이름은 맘대로 정하는 것이 가능, 
    Scanner sc= new Scanner(System.in);
    
    While(flag){
      System.out.println("메뉴입력 :");
      int choice=sc.nextInt();
      if(choic==4);
    
    ###flag=false; or break;
    
    }
  }
} 
  
