import java.util.Scanner;

class Ascending
{
 pulbic static void main(String [] args)
 {
   int a,b,c,d;
   Scanner sc =new Scanner(System.in);
   
   System.out.println("1번째 정수를 입력 : ");
   a = sc.nextInt();
   System.out.println("2번째 정수를 입력 : ");
   b = sc.nextInt();
   System.out.println("3번째 정수를 입력 : ");
   c = sc.nextInt();
   
   if(b<a) 
   {
    d = a; //임의로 설정한 d라는 int에 a를 적용한다. 가장 큰 수니까 
    a = b; //b<a라는 상황에서 b값을 a에 적용한다.
    b = d; //b에는 a값을 적용한다. 이러면 a는b b는d d는a가 된다. 
    
    }
    if(c<a)
    {
     d = a; //위와 같다.
     a = c;
     c = d;
    }
    if(c<b) // 마지막 남은 int값을 위와 똑같이 적용한다.
    {
     d = b;
     b = c;
     c = d;
     }
     System.out.print(a + " "+y + " " +z);
     }
     }
    
   
    
