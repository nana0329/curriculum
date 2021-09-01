package check;

import constants.Constants;

public class Check {
	String firstName = "清水";
	String lastName = "伶";

	private void printName() {
		System.out.println("printNameメソッド→ " + firstName + lastName);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Check name = new Check();
		name.printName();

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet rpet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		rpet.introduce();
	}
}
