package all_oops;

interface Driving{
		public static final String economyLimit = "60kmph";
		public void driving();
}

class CarOwner {
	//class to demonstrate Encapsulation
	private String ownerKey="khaleel";
	private String passKey="56GH";
	
	String ownerInput;
	String passInput;

	public void setOwnerInput(String ownerInput) {
		this.ownerInput = ownerInput;
	}

	public void setPassInput(String passInput) {
		this.passInput = passInput;
	}
		
	public boolean check() {
		
		if(ownerInput.equals(ownerKey) && passInput.equals(passKey)) {
			System.out.println("Car Unlocked");
			return true;
		}
		
		else {
			System.out.println("Car Unlock failed");
			return false;
		}
	}

}

abstract class BudgetCars {
	
	public void budgetAmount() {
		System.out.println("Swift is a Budget car, the money required is <1000000");
	}
}


abstract class LuxuryCars {
	
		public void LuxuryAmount() {
		System.out.println("Mercedes is a Luxury car, the money required is >2000000");
	}
}


class Swift extends BudgetCars implements Driving{
	
	//Function overriding
	@Override
	public void driving() {
		// TODO Auto-generated method stub
		System.out.println("The car being driven is Swift, Drive within economy speed limit "+economyLimit);
	}

}

class Mercedes extends LuxuryCars implements Driving{
	
	String keyLess;
	String voiceControl;
	boolean polish;
	int budget;
	
	//Overloading of method features [polymorphism]
	public void luxuryFeatures(String keyLess,String voiceControl) {
		this.keyLess=keyLess;
		this.voiceControl=voiceControl;
		System.out.println("It is keyless: "+this.keyLess+" \nVoice Control "+this.voiceControl);
	}
	
	public void luxuryFeatures(String keyLess,String voiceControl,boolean polish) {
		this.keyLess=keyLess;
		this.voiceControl=voiceControl;
		this.polish = polish;
		System.out.println("It is keyless: "+this.keyLess+" Voice Control "+this.voiceControl+"Polished "+this.polish);
	}

	@Override
	public void driving() {
		// TODO Auto-generated method stub
		System.out.println("The car being driven is Mercedes, Drive within economy speed limit "+economyLimit);
	}

}

public class CarMain {	
	public static void main(String args[]) {
			
			String choice = "Swift";
			
			CarOwner owner = new CarOwner();
			owner.setOwnerInput("khaleel");
			owner.setPassInput("56GH");
			
			if(owner.check()) {
			
			if(choice.equals("Swift")){
				Swift swift=new Swift();
				swift.driving();
				swift.budgetAmount();
			}
			
			else if(choice.equals("Mercedes")) {
			Mercedes mercedes=new Mercedes();
			mercedes.driving();
			mercedes.luxuryFeatures("yes", "yes");
			mercedes.LuxuryAmount();
			}			
		}

	}
}
