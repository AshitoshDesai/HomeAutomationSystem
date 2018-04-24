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

	public void startRemote() {
		// TODO Auto-generated method stub
	if(lights.getButton()=="on"){
		System.out.println("light is on");
	}
	else{
		lights.setButton("oN");
	}
	
	if(ac.getButton()!="on"){
		ac.setButton("on");
	}else{
		ac.setSpeed(30);
		System.out.println("its very cold");
	}
	
	if(washingmachine.getButton()!="on"){
		washingmachine.setButton("on");
	}else{
		washingmachine.setSpeed(30);
		System.out.println("more dust is there");
	}
	if(telivision.getButton()!="on"){
		telivision.setButton("on");
	}else{
		telivision.setChange("zee tv");
		telivision.setVolume(22);
	}
	
	if(audiosystem.getButton()!="on"){
		audiosystem.setButton("on");
	}else{
		audiosystem.setNext("dil se");
		audiosystem.setVolume(22);
	}
	
}
}
