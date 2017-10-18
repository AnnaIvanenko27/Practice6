package ua.nure.ivanenko.Practice6.part3;

import java.util.ArrayList;
import java.util.List;

class Car {
	private int number = numbers++;
	private static int numbers = 1;

	public String toString() {
		return "Car" + number;
	}

	public boolean equals(Object o) {
		if (o instanceof Car) {
			return number == ((Car)o).number;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return number * 47;
	}
}

public class Parking {
	private int size = 0;

	public Parking(int size) {
		this.size = size;

		for (int i = 0; i < size; i++) {
			parking.add(null);
		}
	}

	private List<Object> parking = new ArrayList<>(size);

	public void park(Object car, int n) {
		if (car != null && !parking.contains(car)) {	
			for (int i = n; i < parking.size(); i++) {
				if (parking.get(i) == null) {
					parking.set(i, car);
					break;
				}
			}
		}
	}

	public void parkOff(Object car) {
		if (parking.contains(car)) {
			parking.set(parking.indexOf(car), null);
		}
	}

	public void print() {
		for (int i = 0; i < parking.size(); i++) {
			System.out.print(i + " : " + (Car) parking.get(i) + " ");
		}
		System.out.println();
	}
	
	
}
