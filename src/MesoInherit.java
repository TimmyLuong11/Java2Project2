//TODO
/**
 * This is the inherit class the inherit the methods from the abstract class.
 *
 */
public class MesoInherit extends MesoAbstract
{
	/**
	 * Variables
	 */
	private String StID;
	int[] letterVal = new int[4];
	
	/**
	 * 
	 * @param mesoStation
	 */
	public MesoInherit(MesoStation mesoStation)
	{
		super(mesoStation.getStID());
		this.StID = mesoStation.getStID();
	}
	/**
	 * Get the string the calcualte the average and add it to the array.
	 */
	public int[] calAverage() 
	{
		double sum = 0, average = 0, fraction = 0;
		 
		for(int index = 0; index < StID.length(); ++index)
		{
			letterVal[index] = (int)StID.charAt(index);
			sum += letterVal[index];
		}
		
		average = sum / StID.length();
		fraction = average - Math.floor(average);
		
		letterVal[0] = (int)Math.ceil(average);
		letterVal[1] = (int)Math.floor(average);
		
		if(fraction < 0.5)
		{
			letterVal[2] = (int)Math.floor(average);
		}
		else
		{
			letterVal[2] = (int)Math.ceil(average);
		}
		
		return letterVal;
	}
	/**
	 * Get the letter from the value
	 */
	public char letterAverage()
	{
		return (char)letterVal[2];
	}
}