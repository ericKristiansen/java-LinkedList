/**
 * This is a basic Data class hold data for the Node object
 *
 * @author Eric Kristiansen
 * @version 7/15/2016
 */
public class Data
{
    private String value;
    private int number;

    /**
     * This is a constructor setting value.
     * @param passValue
     */
    public Data(String passValue)
    {
        value = passValue;
    }

    /**
     *  This is a simple getter for value.
     * @return String value
     */
    public String getValue()
    {
        return value;
    }

    /**
     * This is a simple getter for number.
     * @return int number
     */
    public int getNumber()
    {
        return number;
    }

    /**
     * This is a simple setter for number.
     * @param passNumber
     */
    public void setNumber(int passNumber)
    {
        number = passNumber;
    }

    /**
     * This is a toString override.
     * @return
     */
    public String toString()
    {
        return value;
    }

}
