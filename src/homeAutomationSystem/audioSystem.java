package homeAutomationSystem;

public class audioSystem {

	private String button;
	private String next;
	private String current;
	private int volume;


	public audioSystem(String string, String string2, String string3, int i) {
		// TODO Auto-generated constructor stub
		this.button=string;
		this.next=string2;
		this.current=string3;
		 
		this.volume=i;

	}

	public String getButton() {
		return button;
	}

	public void setButton(String button) {
		this.button = button;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public String getCurrent() {
		return current;
	}

	public void setCurrent(String current) {
		this.current = current;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	
	
}
