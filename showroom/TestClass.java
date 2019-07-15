public class TestClass
{
	public static void main(String args[])
	{
		Bike b1 = new Bike("ABC1234","SUZUKI", "HAYATE", "125CC", "DISK", 58000);
		System.out.println(b1.toString());
		
		Bike b2 = new Bike();
		//b2.setVIN("DEF5678");
		b2.setVIN("ABC1234");
		b2.setBrand("SUZUKI");
		b2.setModel("GIXXER");
		b2.setEngineDisplacement("200CC");
		b2.setBrakeSystem("DISC");
		b2.setCost(110000);
		
		System.out.println(b2.toString());
		
		System.out.println(b1.equals(b2));
	}
}