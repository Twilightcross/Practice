import java.util.Scanner; // 영화관 좌석 입력 예제 

class Array1
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String name;
		int seat;
		String [] array=new String [10];

		System.out.println("==================");
		for (int i=0;i<10 ;i++ )
		{
			if (array[i]==null)
			{
			System.out.print("[    ]");
			}else{
			System.out.print("["+array[i]+"]");
			}
		}
		System.out.println(); // 화면에 미리 좌석을 표시하기 위해서 for문을 통해 내용을 표시함

		System.out.println("예약자 이름 입력 ");
		name=sc.next();
		System.out.println("좌석 입력 (1~10)");
		seat=sc.nextInt();

		array[seat-1]=name; //<<배열에 대입한 내용임. <순서상 늦게 나와줘야 위에서 내용만 표시하고 넘어갈 수 있음.>

		System.out.println("===================");
		for(int i=0;i<10 ;i++ )
		{
			if (array[i]==null)
			{
			System.out.print("[  ]");
			}else{
			System.out.print("["+array[i]+"]");
			}
		}
		System.out.println(); // 후위에서 앞선 for문을 반복 하여 입력된 내용이 "순차적"으로 표시될 수 있게 함
	}
}

class Array2
{
	public static void main(String[] args) 
	{
		int [] array = new int [100];

		for (int i=0;i<100 ;i++ )
		{
			array[i]=i+1; //자리세팅
		}

		for (int i=0;i<array.length;i++ )
		{
			System.out.println(array[i]); // 실제 길이만큼 입력 
		}

		}
	}

class Neard
{
	public static void main(String[] args) 
	{
		int [] array = new int [100];

		for (int i=0; i<100; i++)
		{
			if (((i+1)%3==0)&&((i+1)%5==0))
			{
				array[i]=3535; // system.out.print로 값을 출력하는 것이 아니다. 값을 대입하는 것이다.
			}else if ((i+1)%3==0)
			{
				array[i]=3333;
			}else if ((i+1)%5==0)
			{
				array[i]=5555;
			}else{
				array[i]=i+1;
			}
		
		}
		for (int i=0;i<100 ;i++ )
		{
			System.out.println(array[i]); //그리고 마지막에 값을 출력하는 것이다.
		}
		System.out.println();
	}
}

/*좌석번호가 1부터 100번인 콘서트장이 있다, 10개의 좌석이 한행이고, 10개의 열이 있다.
핸드폰번호와 좌석번호(행과 열)를 입력하여 예약받는 프로그램을 만드시오.
-전체 좌석 출력시 예약된 자리는 'ㅇ' 로 표시하고, 이미 예약된 자리를 예약하려고 하면, 
이미 예약한 사람의 휴대폰 번호를 출력하시오. */
import java.util.Scanner;

class Neard
{
	public static void main(String [] args){

		int row, column;
		String phone;
        Scanner sc = new Scanner(System.in);
		String [] seats = new String [100];

		System.out.println("핸드폰번호를 입력하세요 ");
		phone= sc.next();

		System.out.println("좌석번호 (행)을 입력하세요");
		row= sc.nextInt();
		System.out.println("좌석번호 (열)을 입력하세요");
		column=sc.nextInt();

		if (seats[(row-1)*10+(column-1)]==null)
		{
			seats[(row-1)*10+(column-1)]=phone;   
		}else{
			System.out.println("예약된 좌석입니다.");
			System.out.println(seats[(row-1)*10+(column-1)]);
		}

		for (int i=0;i<100;i++)
		{
			if (seats[i]==null)
			{
				System.out.print("[    ]");
			}else{
				System.out.print("[ o  ]");
			}
			if (((i+1)%10)==0)
			{
				System.out.println();
			}

		}
	}
}
