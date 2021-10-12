package check;

import constants.Constants;

public class Check {
	
    private String firstName = "Takumi";
    private String lastName = "Kondo";
    
    public static void main(String[] args) { 
    	 Check name = new Check();
    	 name.printName();
    	 Pet namePet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
    	 namePet.introduce();
    	 RobotPet robot = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
    	 robot.introduce();
    }
    private void printName() {
		System.out.println("printNameメソッド →　" + lastName + firstName );
    }
}
