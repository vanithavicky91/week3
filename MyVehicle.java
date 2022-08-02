package week3.day;

public class MyVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suzuki myBike=new Suzuki();
		myBike.sideDoor();
		Ashoklayland mySuzuki=new Ashoklayland();
		mySuzuki.applyBrake();
		//override
		Truck featur=new Truck();
		featur.applyBrake();

	}

}
