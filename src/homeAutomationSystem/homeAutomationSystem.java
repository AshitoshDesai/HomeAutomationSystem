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
	if(lights.getButton()=="ON"){
		System.out.println("=================================");
		System.out.println("light is on");
	}
	else{
		lights.setButton("ON");
	}
	
	if(ac.getButton()!="ON"){
		ac.setButton("ON");
	}else{
		System.out.println("=================================");
		ac.setSpeed(30);
		System.out.println("its very cold");
		System.out.println("change the speed");
	}
	
	if(washingmachine.getButton()!="ON"){
		washingmachine.setButton("ON");
	}else{
		System.out.println("=================================");
		System.out.println("washing machine ON");
		washingmachine.setSpeed(30);
		System.out.println("increase the speed of machine");
	}
	if(telivision.getButton()!="ON"){
		telivision.setButton("ON");
	}else{
		System.out.println("=================================");
		System.out.println("TV is on");
		
		System.out.println("channel:"+telivision.getChannel());
		System.out.println(" volume:"+telivision.getVolume());
		telivision.setChange("zee tv");
		System.out.println("-------------------------");
		System.out.println("change channel:"+telivision.getChannel());

		telivision.setVolume(22);
		System.out.println("change volume:"+telivision.getVolume());
	}
	
	if(audiosystem.getButton()!="ON"){
		audiosystem.setButton("ON");
	}else{
		System.out.println("=================================");
		System.out.println("Song Playing:"+audiosystem.getCurrent());
		System.out.println("-------------------------");
		audiosystem.setNext("dil se");
		audiosystem.setVolume(22);
		System.out.println("Song next:"+audiosystem.getCurrent());
		System.out.println("change volume:"+telivision.getVolume());
		
	}
	
}
}
