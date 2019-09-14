// Henry Vy

/**
 * This Teacher class implements Observer and creates an observer called "Teacher"
 * @author henryvy
 *
 */
public class Teacher implements Observer
{
	private Subject watchman;
	
	public Teacher(Subject watchman) // Constructor
	{
		this.watchman = watchman;
		watchman.registerObserver(this); // Adds new observer to the array in WatchMan Class
	}
	
	public void update(int warning) // This is called in the WatchMan class in the notifyObservers() method
	{
		if(warning == 1)
			System.out.println("Teacher: Helps get every kid home safe");
		
		else if(warning == 2)
			System.out.println("Teacher: Brings all students to the underground shelter");
	}
}
