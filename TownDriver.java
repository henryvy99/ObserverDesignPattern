// Henry Vy

/**
 * This is the main class that will run the complete program.
 * @author henryvy
 *
 */
public class TownDriver 
{
	public static void main(String[] args) 
	{
		System.out.println("A Happy Little City");
		
		WatchMan watchman = new WatchMan();
		Observer fredrick = new ShopOwner(watchman);
		Observer lillian = new Teacher(watchman);
		Observer monte = new Knight(watchman);
		
		System.out.println("\n-----------------------\n");
		
		watchman.issueWarning(1);
		
		System.out.println("\n-----------------------\n");
		
		watchman.issueWarning(2);
	}
}

