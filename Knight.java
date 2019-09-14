// Henry Vy

/**
 * This Knight class implements Observer and creates an observer called "Knight"
 * @author henryvy
 *
 */
public class Knight implements Observer
{
	private Subject watchman;
	
	public Knight(Subject watchman) // Constructor
	{
		this.watchman = watchman;
		watchman.registerObserver(this); // Adds new observer to the array in WatchMan Class
	}
	
	public void update(int warning) // This is called in the WatchMan class in the notifyObservers() method
	{
		if(warning == 1)
			System.out.println("Knight: Helps everyone get home safe");
		
		else if(warning == 2)
			System.out.println("Knight: Prepares for battle");
	}
}
