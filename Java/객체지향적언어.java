import java.util.Scanner;

class DriveService
{
	public static void main(String [] args){

		Customer [] h=new Customer[10000];
		int choice,counter=0;
		String name,phone,carnum,place;
		Scanner sc=new Scanner(System.in);

		while (true)
		{
			System.out.println("===앞뒤가 똑같은 전화번호 1577-1577===");
			System.out.println("1.예약하시겠?");
			System.out.println("2.조회하겠습?(전화번호로 조회가능)");
			System.out.println("3.전체 출력");
			System.out.println("===대리운전은 역시 1577-1577===");
			choice=sc.nextInt();


			switch (choice)
			{
			case 1:
				System.out.println("이름을 입력하세요");
			    name=sc.next();
			    System.out.println("전화번호를 입력하세요");
				phone=sc.next(); 
				System.out.println("차번호를 입력하세요");
				carnum=sc.next();
				System.out.println("장소를 입력하세요");
				place=sc.next();

				Customer result=new Customer();
				result.name=name;
				result.phone=phone;
				result.carnum=carnum;
				result.place=place;

				h[counter++]=result;

				break;
			case 2:
				System.out.println("조회하실 전화번호를 입력하세요");
			    phone=sc.next();

				for (int i=0;i<counter;i++)
				{
					if (h[i].phone.equals(phone))
					{
					
				System.out.println("결과"+h[i].name+","+h[i].carnum+","+h[i].place+"");
					}
				}

				break;
			case 3: 
				for (int i=0;i<counter;i++)
				{
				System.out.println("결과"+h[i].name+","+h[i].phone+","+h[i].carnum+","+h[i].place+"");
				}
				break;
			}
		}
	}
}
