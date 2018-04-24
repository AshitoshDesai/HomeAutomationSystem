package homeAutomationSystem;

public class telivision {

	private String button;
	private String channel;
	private String change;
	private int volume;
	

	public telivision(String string, String string2, String string3, int i) {
		// TODO Auto-generated constructor stub
		this.button=string;
		this.channel=string2;
		this.change=string3;
	
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
		return change;
	}

	public void setChange(String change) {
		this.change = change;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	
}
