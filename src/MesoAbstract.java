/**
 * This class is an abstract class with abstract methods and consturctors.
 *
 */
public abstract class MesoAbstract 
{
	//TODO
	/**
	 * Abstract variable
	 */
	private String stID;
	/**
	 * Abstract consturctor
	 * @param stID
	 */
	public MesoAbstract(String stID) 
	{
		this.stID = stID;
	}
	/**
	 * Abstract methods
	 */
	public abstract int[] calAverage();
	
	public abstract char letterAverage();
}
