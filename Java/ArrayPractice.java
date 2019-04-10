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
