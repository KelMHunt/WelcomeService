package jm.edu.utech.ap.wk5;

public class Driver implements Driveable{
	
	public void drive(float numberOfMiles){
		System.out.println(
				String.format("Anderson has driven "+ "%.2f miles.",numberOfMiles)
				);
	}

}
