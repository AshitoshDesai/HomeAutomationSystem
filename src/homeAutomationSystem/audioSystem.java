package homeAutomationSystem;

public class audioSystem {

	private String button;
	private String next;
	private String previous;
	private String volumeup;
	private String volumedown;

	public audioSystem(String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated constructor stub
		this.button=string;
		this.next=string2;
		this.previous=string3;
		this.volumeup=string4;
		this.volumedown=string5;

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

	public String getPrevious() {
		return previous;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
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
