package my_java;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String dhType="다현이";
//		int dhAge = 24;
//		String msType="민석이";
//		int msAge = 22;
//		
//		System.out.println(dhType+"의 나이는 "+dhAge+"살 입니다.");
//		System.out.println(msType+"의 나이는 "+msAge+"살 입니다.");
		
		Animal dog = new Animal("타입이강아지","강아지이름",2); //생성자 갯수만큼 매개변수
		Animal cat = new Animal("타입이고양이","고양이이름",3); 
		dog.sayAge();
		cat.sayAge();
	}

}

class Animal{ //필드와 함수 등을 클래스에 넣어서 양식적으로 짤 수 있음
	//(멤버변수)필드 
	String type;
	String name;
	int age; //필요시 여기 먼저 추가 (1)
	
	//메소드(함수)
	void sayAge() {
		System.out.println(name+"의 나이는 "+age);
	}
	
	//2. 생성자
	Animal(String type,String name, int age){ //필요시 여기 먼저 추가 (2)
		//필드 = 지칭어;
		this.type=type; 
		this.name=name;
		this.age=age; //필요시 여기 다음 추가 (3)
	}
}