package homeAutomationSystem;

public class homeAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lights l=new lights("ON");
		airConditioner a=new airConditioner("ON",20);
		washingMachine w=new washingMachine("ON",20);
		telivision t=new telivision("ON","starGold","next",10);
		audioSystem as=new audioSystem("ON","next","Dil diya galla",20);
		
		homeAutomationSystem has=new homeAutomationSystem(l,a,w,t,as); 
		
		homeOwner owner=new homeOwner(1,has);
		
		if(owner.homeAutomationsysyemON()==true){
			System.out.println("Home Automation Remote start");
		
		}
		

	}

}
