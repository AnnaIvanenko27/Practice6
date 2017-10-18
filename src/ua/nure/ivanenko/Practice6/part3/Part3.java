package ua.nure.ivanenko.Practice6.part3;

/* Create a class that simulates the work of a local parking lot. 
 * The car drives up to a certain n-th place and rides to the right, 
 * until there is an empty seat. 
 * The class should support methods: 
 * servicing the arrival,
 * departure of the car. 
 * Define a method that outputs the current parking status.
 */

public class Part3 {
	public static void main(String[] args) {
		Parking parking = new Parking(10);
		parking.print();
		parking.park(new Car(), 1);
		Car car1 = new Car();
		parking.park(car1, 1);
		parking.print();
		parking.park(car1, 1);
		parking.print();
		parking.parkOff(car1);
		parking.print();
		parking.park(car1, 0);
		parking.print();
	}

}
