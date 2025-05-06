package my_java;

public class Main2 {
	
	static int addTwoNumbers(int num1, int num2, boolean check) { //함수 선언 + 매개변수
		//매개변수는 함수 안 로직과 관련없어도 넣어도되고 매개변수끼리 자료형 달라도됨
		int sum = num1+num2;
		return sum;//로직 맨뒤에 특정값 리턴할 수 있음, 리턴값 마음대로 가능
	}
	static void add10_20() { //함수 선언
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		add10_20(); //함수 호출
		addTwoNumbers(20,30,false); //매개변수 선언했으면 인자 넣어서 호출해야함
		int score = addTwoNumbers(200,300,true); 
		//System.out.println(score);
		
		//조건문
		//if문은 위에서 해당되면 아래안보고 전체 if문 탈출함
		//물어보고싶은 주제가 여러개면 if문 여러번 가능
		if(score==500) { //()안에 boolean
			System.out.println("500입니다.");
		}else if(score==200){ //else if는 여러번 가능
			System.out.println("200입니다.");
		}else {
			System.out.println("100이 아닙니다");
		}
		
		//반복문
		String[] members = {"a","b","c"};
		for(int i=0; i<3; i++) { //0부터 시작, 해당되도 재도전됨
			String member = members[i];
			System.out.println(member);
		}
		
	}

}
