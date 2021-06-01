package aselenium;
 
public class PracticeChild extends practice{
	
	public void add() {
		super.add();
		System.out.println("child class");
	}
	
	public static void main(String[] args) {
		practice obj = new practice();
		PracticeChild objj = new PracticeChild();
		practice ob = new PracticeChild();
		ob.add();
		
		
		//objj.add();
		//obj.add();
	}	
}
