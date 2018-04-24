package homeAutomationSystem;

public class telivision {

	private String button;
	private String channelup;
	private String channeldown;
	private String volumeup;
	private String volumedown;

	public telivision(String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated constructor stub
		this.button=string;
		this.channelup=string2;
		this.channeldown=string3;
		this.volumeup=string4;
		this.volumedown=string5;
	}

	public String getButton() {
		return button;
	}

	public void setButton(String button) {
		this.button = button;
	}

	public String getChannelup() {
		return channelup;
	}

	public void setChannelup(String channelup) {
		this.channelup = channelup;
	}

	public String getChanneldown() {
		return channeldown;
	}

	public void setChanneldown(String channeldown) {
		this.channeldown = channeldown;
	}

	public String getVolumeup() {
		return volumeup;
	}

	public void setVolumeup(String volumeup) {
		this.volumeup = volumeup;
	}

	public String getVolumedown() {
		return volumedown;
	}

	public void setVolumedown(String volumedown) {
		this.volumedown = volumedown;
	}

}
