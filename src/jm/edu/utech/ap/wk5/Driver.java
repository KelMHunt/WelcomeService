package jm.edu.utech.ap.wk5;

public class Driver implements Driveable
{
 public void drive(float numOfMiles)
 {
	 System.out.println(String.format("Kelcy has driven" + "%.2f miles", numOfMiles));
 }
}
