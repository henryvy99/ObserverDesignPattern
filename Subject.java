// Henry Vy

/**
 * This Subject interface that will be implemented into another class
 * @author henryvy
 *
 */
public interface Subject 
{
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
