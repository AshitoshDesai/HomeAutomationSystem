package homeAutomationSystem;

public class airConditioner {

	private String button;
	private int speed;

	public airConditioner(String string, int i) {
		// TODO Auto-generated constructor stub
		this.button=string;
		this.speed=i;
	}

	public String getButton() {
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

}
