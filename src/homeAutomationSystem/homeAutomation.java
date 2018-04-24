package homeAutomationSystem;

public class homeAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lights l=new lights("ON");
		airConditioner a=new airConditioner("ON",20);
		washingMachine w=new washingMachine("ON",20);
		telivision t=new telivision("ON","up","down","Vup","Vdown");
		audioSystem as=new audioSystem("ON","next","back","Vup","Vdown");
		
		homeAutomationSystem has=new homeAutomationSystem(l,a,w,t,as);
		
		homeOwner owner=new homeOwner(1,has);
		
		

	}

}
