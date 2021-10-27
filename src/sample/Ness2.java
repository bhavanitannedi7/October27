package sample;

public class Ness2 extends  Pronspance implements Intelliswift,Intelliswift1,Intelliswift2 {

	@Override
	public void vendor2() {
	System.out.println("Vendor2");
		this.vendor1();
		this.vendor2();
		this.vendor4();
		
	}

	@Override
	public void vendor1() {
		System.out.println("Vendor1");
		
	}

	@Override
	public void vendor4() {
		System.out.println("Vendor4");
		
	}
public static void main(String[] args) {
	Ness2  ness = new Ness2();
	Ness1 n = new Ness1();
	n.vendor5();
	Ness n1 = new Ness();
	n1.vendor3();
	ness.vendor2();
	

	
}
}
