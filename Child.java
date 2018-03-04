package day07;

public class Child extends Parent {
	public String speak(){
		return " i am a child";
	}
	
	public static void main(String ag[]){
		System.out.println(new Child().toString()); //toString()은 없다 그런데 ?? --> Object는 최상위 ( extends Object가 생략되어있기때문);
		System.out.println(new Child().speak());
	}
}
