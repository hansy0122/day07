package day07;

public class Combination extends Pizza {
	
	Combination(){
		//������ ü�̴�. super�� ��������� ȣ������ ������ �����Ϸ��� �ڵ����� ������. 
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
