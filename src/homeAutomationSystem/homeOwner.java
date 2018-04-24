package homeAutomationSystem;

public class homeOwner {

	private int status;
	private homeAutomationSystem remote;

	public homeOwner(int i, homeAutomationSystem has) {
		// TODO Auto-generated constructor stub
		this.status=i;
		this.remote=has;
	}

	public boolean homeAutomationsysyemON() {
		// TODO Auto-generated method stub
		return checkHouse();
			
	}

	private boolean checkHouse() {
		if(this.status >=1 ){
			System.out.println(status+"persons  enter in House."); 
			remote.startRemote();
			return true;
		}else{
			remote.closeAppliancse();
			
		System.out.println("No one in the house");
		return false;
		}
	}

}
