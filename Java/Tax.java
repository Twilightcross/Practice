import java.util.Scanner;

class Tax
{
	public static void main(String [] args){
		int yourpay;
		double tax;
		Scanner sc= new Scanner(System.in);

		System.out.println("연봉을 입력하시오 :");
		yourpay=sc.nextInt();

		if (yourpay>500000000)
		{ 
			tax=yourpay*0.42-35400000;
		}else if (yourpay>300000000)
		{
			tax=yourpay*0.4-25400000;

		}else if (yourpay>150000000)
		{
			tax=yourpay*0.38-19400000;

		}else if (yourpay>88000000)
		{
			tax=yourpay*0.35-14900000;

		}else if (yourpay>46000000)
		{
			tax=yourpay*0.24-5220000;

		}else if (yourpay>12000000);
		{
			tax=yourpay*0.15-1080000;

		}
		System.out.println("종합소득세 : "+(int)tax+" 원+");
	}
}
