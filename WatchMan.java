// Henry Vy

import java.util.ArrayList;

/**
 * This is the WatchMan class that will be used in the Driver class to issue warning
 * @author henryvy
 *
 */
public class WatchMan implements Subject
{
	int warning = 0; // Warning is set to 0 by default
	ArrayList<Observer> observers; // An array of observers
	
	/**
	 * This is the constructor and it sets observers as an array list
	 */
	public WatchMan()
	{
		observers = new ArrayList<Observer>();
	}
	
	/**
	 * This method will add observers and will override the Subject class
	 */
	public void registerObserver(Observer observer)
	{
		observers.add(observer);
	}
	
	/**
	 * This method will remove observers and will override the Subject class
	 */
	public void removeObserver(Observer observer)
	{
		observers.remove(observer);
	}
	
	/**
	 * This method will notify all observers and update them when this is called in the issueWarning method
	 */
	public void notifyObservers()
	{
		for(Observer observer : observers) // For each i in observers, pass in the warning(int) to update each observer
		{
			observer.update(warning);
		}
	}
	
	/**
	 * This method will be called in the tester class to warn all observers
	 * @param warning
	 */
	public void issueWarning(int warning)
	{
		// I just used 2 if statements just for grammar purposes
		if(warning == 1)
			System.out.println("WARNING: " + warning + " trumpet was played!");
		else if (warning > 1)
			System.out.println("WARNING: " + warning + " trumpets was played!");
		
		this.warning = warning; // equal to 1 or 2
		notifyObservers(); // the warning is now either 1 or 2, before this is called
	}
	
	
}
