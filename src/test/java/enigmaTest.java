import static EnigmaTwo.enigmaInputBridge.*;

public class enigmaTest
{
    public static void clear()
    {
        clearRotatorSet();
        clearRotatorOption();

    }

    public static void clearRotatorSet()
    {
        if(!(getRotatorOne().isEmpty()))
        {
            getRotatorOne().clear();
        }

        else if(!(getRotatorTwo().isEmpty()))
        {
            getRotatorTwo().clear();
        }

        else if(!(getRotatorThree().isEmpty()))
        {
            getRotatorThree().clear();
        }
    }

    public static void clearRotatorOption()
    {
        if (getRotatorOneOption() != null && getRotatorNumberOne() != null)
        {
            setRotatorOneOption(null);
            setRotatorNumberOne(null);
        }

        else if (getRotatorTwoOption() != null && getRotatorNumberTwo() != null)
        {
            setRotatorTwoOption(null);
            setRotatorNumberTwo(null);
        }

        else if (getRotatorThreeOption() != null && getRotatorNumberThree() != null)
        {
            setRotatorThreeOption(null);
            setRotatorNumberThree(null);
        }
    }

}
