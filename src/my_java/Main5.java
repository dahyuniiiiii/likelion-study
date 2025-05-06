package my_java;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoccerPlayer sp = new SoccerPlayer("오다현");
		GolfPlayer gp = new GolfPlayer("오민석");
		BaseballPlayer bp = new BaseballPlayer("오징어");
		
		sp.run();
		gp.run();
		bp.run();
		
		sp.eat("피자");
		gp.eat("고기");
		bp.eat("햄버거");
	}

}

interface Action{
	//추상메소드 (구현부가 없는 함수)
	void run();
	void eat(String food);
}
//운동선수 프로젝트 협업

class SoccerPlayer implements Action{
	String name;

	SoccerPlayer(String name){
		this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name+" runs...");
		
	}
	@Override
	public void eat(String food) {
		// TODO Auto-generated method stub
		System.out.println(name+" eats "+food);
	}
}


class GolfPlayer implements Action{
	String name;
	

	GolfPlayer(String name){
		this.name=name;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name+" runs...");
		
	}
	public void eat(String food) {
		// TODO Auto-generated method stub
		System.out.println(name+" eats "+food);
	}
}



class BaseballPlayer implements Action{
	String name;
	

	BaseballPlayer(String name){
		this.name=name;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name+" runs...");
		
	}
	public void eat(String food) {
		// TODO Auto-generated method stub
		System.out.println(name+" eats "+food);
	}
}