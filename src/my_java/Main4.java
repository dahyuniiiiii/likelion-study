package my_java;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person("오다현",24);
		person.getInfo();
	}

}

class Korea{ //한국데이터
	String nationName="대한민국";
	String city = "서울";
	int population = 51740000;
	String name="오민석";
	//+1000개 필드...
}

class Person extends Korea{ //한국데이터 상속받음, 여러개상속은 안됨 부모가 누군진 알아야하니까
	String name;
	int age;
	
	void getInfo() {
		System.out.println(super.name); //super은 부모를 가르키는 지시어
		System.out.println(city); 
	}

	Person(String name, int age){
		this.name = name;
		this.age=age;
	}
}