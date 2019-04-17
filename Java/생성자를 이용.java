import java.util.Scanner;

//foodno 주문번호
//fooname 음식이름
//price 가격

class Market
{
	public static void main(String [] args){
		int foodno,price,counter=0,choice,total;
		String foodname;
		Scanner sc=new Scanner(System.in);
		Food [] dk = new Food [10000];

 //사용자가 가장 먼저 봐야하는 화면이 무엇일지 고민해본다.
 //메뉴를 만든다.
		while (true){
		
			System.out.println("===이랏샤이마세 쇼쿠도우데스 .");
			System.out.println("음식을 주문하시겠습니까 = 1");
			System.out.println("주문을 출력하시겠습니까 = 2");
			System.out.println("현재까지의 매출을 출력하시겠습니까 = 3");
			System.out.println("주문을 초기화 합니다 = 4");
			choice=sc.nextInt();

			switch (choice)
			{
			case 1 :
				 System.out.println("주문번호입력?");
			     foodno=sc.nextInt();
				 System.out.println("음식이름입력?");
				 foodname=sc.next();
				 System.out.println("음식의 가격은?");
				 price=sc.nextInt();

				 dk[counter++]= new Food(foodno,foodname,price); //값을 파라미터로 넘겨줄 수 있다. 
				                                                 //값은 무조건 순서대로 넣어야한다.
				                                                  
				break;
			case 2 :

				for (int i=0;i<counter;i++)
				{
					dk[i].print(); //푸드라는 객체를 프린트한다는 메서드 , 괄호가 없다면 속성에 접근하는것이다. 메서드는 반드시 괄호를 열고 닫아야한다.
				}

				break;
			case 3 :
				total=0; //누적연산에는 초기화가 필요하다.

				for (int i=0;i<counter;i++)
				{
					total+=dk[i].getPrice();
				}
				System.out.println("현재까지의 매출은 "+total+"입니다");

				break;
			
			case 4 :
				for (int i=0;i<counter;i++ )
				{
					dk[i]=null;
				}
				counter=0;

				break;
			default : 
				System.out.println("메뉴를 보고 제대로 입력하세요");
				
				break;


		     }
		}
		}
}



class Food
{
	private int foodno;
	private String foodname;
	private int price;

	public Food(){}

	public Food(int foodno, String foodname, int price){
		this.foodno=foodno;
        this.foodname=foodname;
		this.price=price;
	}

	public int getFoodno(){
		return foodno;
	}
	public String getFoodname(){
		return foodname;
	}
	public int getPrice(){
		return price;
	}

	//--------------------------

	public void setFoodno(int foodno){
		this.foodno=foodno;
	}
	public void setFoodname(String foodname){
		this.foodname=foodname;
	}
	public void setPrice(int price){
		this.price=price;
	}
	
		
    //==============================

	public void print(){
		System.out.println("테이블"+foodno+",음식명"+foodname+",가격"+price+"");
	}
}	
