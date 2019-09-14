// Henry Vy

/**
 * This ShopOwner class implements Observer and creates an observer called "ShopOwner"
 * @author henryvy
 *
 */
public class ShopOwner implements Observer
{
	private Subject watchman;
	
	public ShopOwner(Subject watchman) // Constructor
	{
		this.watchman = watchman; 
		watchman.registerObserver(this); // Adds new observer to the array in WatchMan Class
	}
	
	@Override
	public void update(int warning) // This is called in the WatchMan class in the notifyObservers() method
	{
		if(warning == 1)
			System.out.println("Shop Owner: Close down shop and head home");
		
		else if(warning == 2)
			System.out.println("Shop Owner: Drops everything and find nearest hideout");
	}
}
