public class CricDashboard
{
	public static void main(String args[])
	{
		//String s = "WWW...23O11..46";
		String s = ".24W6.12OW.44.2OW3416WO12";
		
		int ball=0;
		int[] players = new int[12];
		int strike=1, nonstrike=2,nextPlayer = 3;
		int totalRuns=0, extraRuns=0, wickets=0,over=0;
		int i,trun,stemp;
		
		for(i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i) + " at " + i + " ");
			System.out.print("Strike = " + strike);
			System.out.println(" Non-strike = " + nonstrike);
			if(s.charAt(i) == 'W')
			{
				extraRuns += 1;
			}
			else if(s.charAt(i) == 'O')
			{
				wickets += 1;
				strike = nextPlayer;
				nextPlayer += 1;
				ball += 1;
			}
			else if(s.charAt(i) == '.')
			{
				ball += 1;
			}
			else
			{
				ball += 1;
				trun = s.charAt(i) - 48;
				players[strike] += trun;
				if(trun % 2 >= 1)
				{
					stemp = strike;
					strike = nonstrike;
					nonstrike = stemp;
				}
			}
			
			if(ball == 6)
			{
				ball = 0;
				over += 1;
				stemp = strike;
				strike = nonstrike;
				nonstrike = stemp;
			}
		}
		
		System.out.println("-----------------------");
		totalRuns = 0;
		for(int j=1;j<nextPlayer;j++)
		{
			System.out.println("P"+ j +" = " + players[j]);
			totalRuns += players[j];
		}
		System.out.println("Strike = P" + strike);
		System.out.println("Non-strike = P" + nonstrike);
		System.out.println("Total Runs = " + (totalRuns+extraRuns));
		System.out.println("Extras = " + extraRuns);
		System.out.println("Wickets = " + wickets);
		System.out.println("Balls = " + (over * 6 + ball));
		System.out.println("Overs = " + (over));
		System.out.println("Remaining Wickets = " + (10 - wickets));
		System.out.println("-----------------------");
	}
}