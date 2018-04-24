package homeAutomationSystem;

public class telivision {

	private String button;
	private String channel;
	private String changeChannel;
	private int volume;
	

	public telivision(String string, String string2, String string3, int i) {
		// TODO Auto-generated constructor stub
		this.button=string;
		this.channel=string2;
		this.changeChannel=string3;
	
		this.volume=i;
	}

	public String getButton() {
		return button;
	}

	public void setButton(String button) {
		this.button = button;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getChange() {
		return changeChannel;
	}

	public void setChange(String change) {
		this.changeChannel = change;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	void telivisionON() {
		if(getButton()!="ON"){
			setButton("ON");
		}else{
			System.out.println("=================================");
			System.out.println("TV is on");
			
			System.out.println("channel:"+getChannel());
			System.out.println(" volume:"+getVolume());
			setChange("zee tv");
			System.out.println("-------------------------");
			System.out.println("change channel:"+getChannel());
	
			setVolume(22);
			System.out.println("change volume:"+getVolume());
		}
	}

	void telivisionOFF() {
		setButton("OFF");
		System.out.println("telivision are:"+getButton());
	}

	
}
