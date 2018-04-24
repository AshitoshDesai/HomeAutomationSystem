package homeAutomationSystem;

public class homeAutomationSystem {

	private lights lights;
	private airConditioner ac;
	private washingMachine washingmachine;
	private telivision telivision;
	private audioSystem audiosystem;

	public homeAutomationSystem(lights l, airConditioner a, washingMachine w, telivision t, audioSystem as) {
		// TODO Auto-generated constructor stub
		this.lights=l;
		this.ac=a;
		this.washingmachine=w;
		this.telivision=t;
		this.audiosystem=as;
	}

	public lights getLights() {
		return lights;
	}

	public void setLights(lights lights) {
		this.lights = lights;
	}

	public airConditioner getAc() {
		return ac;
	}

	public void setAc(airConditioner ac) {
		this.ac = ac;
	}

	public washingMachine getWashingmachine() {
		return washingmachine;
	}

	public void setWashingmachine(washingMachine washingmachine) {
		this.washingmachine = washingmachine;
	}

	public telivision getTelivision() {
		return telivision;
	}

	public void setTelivision(telivision telivision) {
		this.telivision = telivision;
	}

	public audioSystem getAudiosystem() {
		return audiosystem;
	}

	public void setAudiosystem(audioSystem audiosystem) {
		this.audiosystem = audiosystem;
	}

}
