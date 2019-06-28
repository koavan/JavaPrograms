import java.util.Scanner;
import java.util.LinkedList;
public class WaterWorld
{	

	public static LinkedList<LinkedList<Cluster>> paths;
	public static int numberOfPaths;
	
	public WaterWorld()
	{
		paths = new LinkedList<LinkedList<Cluster>>();
		numberOfPaths = 0;
	}

	public static void main(String args[])
	{
		LinkedList<Cluster> ll = new LinkedList<Cluster>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no of days : ");
		int days = sc.nextInt();
		int i;
		System.out.print("Enter no of clusters : ");
		int clusters = sc.nextInt();
		sc.nextLine();
		for(i=1; i<=clusters; i++)
		{
			System.out.print("Cluster : #" + i);
			String in = sc.nextLine();
			ll.add(Cluster.parseCluster(in));
		}
		
		System.out.print("Enter no of connections : ");
		int connections = sc.nextInt();
		
		for(i=0; i<connections; i++)
		{
			String in = sc.nextLine();
			String[] temp = in.split("_");
			
			if(temp[0].equals("F"))
			{
				paths.add(new LinkedList<Cluster>());
				paths.get(numberOfPaths).add(Cluster.findCluster(temp[1],ll));
				numberOfPaths++;
			}
			else
			{
				for(int j=0; j<numberOfPaths; j++)
				{
					if(Cluster.findCluster(temp[0],paths[j])!=null)
					{
						paths.get(j).add(Cluster.findCluster(temp[1],ll));
					}
				}
			}
		}
		
		for(Cluster c : ll)
		{
			System.out.println(c.name + " " + c.capacityOfTank);
		}
		
		for(i=0; i<numberOfPaths; i++)
		{
			System.out.println("Path #" + i);
			for(Cluster c : paths.get(i))
			{
				System.out.println(c.name + " " + c.capacityOfTank);
			}
		}
	}
	
	public static Cluster findCluster(String c, LinkedList<Cluster> ll)
	{
		for(Cluster c : ll)
		{
			if(c.name.equals(c))
			{
				return c;
			}
		}
		return null;
	}
}

class Cluster
{
	public String name;
	public int usagePerDay;
	public int capacityOfTank;
	
	public Cluster(String n, int u, int cap)
	{
		this.name = n;
		this.usagePerDay = u;
		this.capacityOfTank = cap;
	}
	
	public static Cluster parseCluster(String s)
	{
		String[] temp = s.split(" ");
		Cluster c = new Cluster(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
		return c;
	}
}



