package day07;

public class Combination extends Pizza {
	
	Combination(){
		//생성자 체이닝. super은 명시적으로 호출하지 않으면 컴파일러가 자동으로 생성함. 
		super();
	}
	Combination(String s){
		super();
	}
	public static void main(String ar[]){
		Combination c=new Combination();
		c.setDow("thin");
		c.setPrice(1000);
		System.out.println("dow="+c.getDow());
		System.out.println("price="+c.getPrice());
		
	}
}
