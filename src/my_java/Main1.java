package my_java;
//import는 ctrl shift o 하면 생성
import java.util.HashMap;
import java.util.Map;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("안녕 자바!");
		int a = 10; //정수
		int b;
		b=20; //추후 지정 가능
		
		int c = a+b;
		System.out.println(c);
		
		//String name= "100"; //100은 숫자 "100"은 문자열
		String name="다현";
		String first = "오";
		String full = first+name;
		System.out.println(full);
		
		//불리언 쓰면 로직이 깔끔하게 처리됨
		boolean check = true;
		boolean check2 = false;
		
		//소숫점 씀(리뷰평점같은)
		float pi = 3.14f;
		
		String[] team = {"다현","다연","다양","다향"}; //값 적을땐 {}안에 적음
		String one = team[2];
		System.out.println(one);
		
		Map <String, Object> map = new HashMap <String, Object>(); 
		map.put("name", "다현");
		map.put("addresss", "인천");
		
		String myName = (String) map.get("name"); //get은 모든타입을 다 받는데이터타입, String으로 맞춰줌(캐스팅한다고도 함)
		
	}
	
}
