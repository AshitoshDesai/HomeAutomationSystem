package homeAutomationSystem;

public class audioSystem {

	private String button;
	private String changeSong;
	private String current;
	private int volume;


	public audioSystem(String string, String string2, String string3, int i) {
		// TODO Auto-generated constructor stub
		this.button=string;
		this.changeSong=string2;
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
		return changeSong;
	}

	public void setNext(String next) {
		this.changeSong = next;
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

	void audiosystemON(homeAutomationSystem homeAutomationSystem) {
		if(getButton()!="ON"){
			setButton("ON");
		}else{
			System.out.println("=================================");
			System.out.println("Song Playing:"+getCurrent());
			System.out.println("-------------------------");
			setNext("dil se");
			setVolume(22);
			System.out.println("Song next:"+getCurrent());
			System.out.println("change volume:"+homeAutomationSystem.telivision.getVolume());
			
		}
	}

	void audiosystemOFF() {
		setButton("OFF");
		System.out.println("audiosystem are:"+getButton());
	}

	
	
}
