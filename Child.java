package day07;

public class Child extends Parent {
	public String speak(){
		return " i am a child";
	}
	
	public static void main(String ag[]){
		System.out.println(new Child().toString()); //toString()�� ���� �׷��� ?? --> Object�� �ֻ��� ( extends Object�� �����Ǿ��ֱ⶧��);
		System.out.println(new Child().speak());
	}
}
