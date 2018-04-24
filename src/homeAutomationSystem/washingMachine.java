package homeAutomationSystem;

public class washingMachine {

	private String button;
	private int speed;

	public washingMachine(String string, int i) {
		// TODO Auto-generated constructor stub
		this.button=string;
		this.speed=i;
	}

	public String getButton()  {
		return button;
	}

	public void setButton(String button) {
		this.button = button;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	void washingmachineON() {
		if(getButton()!="ON"){
			setButton("ON");
		}else{
			System.out.println("=================================");
			System.out.println("washing machine ON");
			setSpeed(30);
			System.out.println("increase the speed of machine");
		}
	}

}
