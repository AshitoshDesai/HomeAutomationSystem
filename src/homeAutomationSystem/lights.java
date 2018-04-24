package homeAutomationSystem;

public class lights {

	private String button;

	public lights(String string) { 
		// TODO Auto-generated constructor stub
		this.button=string;
	}

	public void setButton(String button) {
		this.button = button;
	}

	public String getButton() {
		return button;
	}

	void lightOn() {
		if(getButton()=="ON"){
			System.out.println("=================================");
			System.out.println("light is on");
		}
		else{
			setButton("ON");
		}
	}

	void lightsOFF() {
		setButton("OFF");
		System.out.println("lights are:"+getButton());
	}

}
