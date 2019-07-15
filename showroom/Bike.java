
public class Bike
{
	private String VIN;
	private String brand;
	private String model;
	private String engineDisplacement;
	private String brakeSystem;
	private double cost;
	
	Bike()
	{
		this.VIN = "";
		this.brand = "";
		this.model = "";
		this.engineDisplacement = "";
		this.brakeSystem = "";
		this.cost = 0;
	}
	
	Bike(String VIN, String brand, String model,String engineDisplacement, String brakeSystem, double cost)
	{
		this.VIN = VIN;
		this.brand = brand;
		this.model = model;
		this.engineDisplacement = engineDisplacement;
		this.brakeSystem = brakeSystem;
		this.cost = cost;
	}
	
	//Getter and Setter for VIN
	public void setVIN(String vin)
	{
		this.VIN = vin;
	}
	
	public String getVIN()
	{
		return this.VIN;
	}
	
	//Getter and Setter for brand
	public void setBrand(String br)
	{
		this.brand = br;
	}
	
	public String getBrand()
	{
		return this.brand;
	}
	
	//Getter and Setter for model
	public void setModel(String mod)
	{
		this.model = mod;
	}
	
	public String getModel()
	{
		return this.model;
	}
	
	//Getter and Setter for engineDisplacement
	public void setEngineDisplacement(String ed)
	{
		this.engineDisplacement = ed;
	}
	
	public String getEngineDisplacement()
	{
		return this.engineDisplacement;
	}
	
	//Getter and Setter for brakeSystem
	public void setBrakeSystem(String bs)
	{
		this.brakeSystem = bs;
	}
	
	public String getBrakeSystem()
	{
		return this.brakeSystem;
	}
	
	//Getter and Setter for cost
	public void setCost(double c)
	{
		this.cost = c;
	}
	
	public double getCost()
	{
		return this.cost;
	}
	
	public String toString()
	{
		String s = new String();
		s = "VIN:" + this.VIN + "\n";
		s += "Brand:" + this.brand + "\n";
		s += "Model:" + this.model + "\n";
		s += "Engine Displacement:" + this.engineDisplacement + "\n";
		s += "Brake System:" + this.brakeSystem + "\n";
		s += "Cost:" + Double.toString(this.cost) + "";
		return s;
	}
	
	public boolean equals(Bike b2)
	{
		if(this.VIN.equalsIgnoreCase(b2.VIN) && this.brand.equalsIgnoreCase(b2.brand))
			return true;
		return false;
	}
}