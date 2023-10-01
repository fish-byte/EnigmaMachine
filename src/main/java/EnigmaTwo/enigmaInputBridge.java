package EnigmaTwo;

import java.util.HashMap;

import static EnigmaTwo.enigmaRotator.*;

public abstract class enigmaInputBridge {
    private static HashMap<Integer,Integer> rotatorOne;
    private static HashMap<Integer,Integer> rotatorTwo;
    private static HashMap<Integer,Integer> rotatorThree;
    private static Integer RotatorNumOne;
    private static Integer RotatorNumTwo;
    private static Integer RotatorNumThree;
    private static Integer rotatorNumberOneOption;
    private static Integer rotatorNumberTwoOption;
    private static Integer rotatorNumberThreeOption;


    private static HashMap<Integer, Integer> getSpindle(Integer spindleNum)
    {
        switch (spindleNum) {
            case 1 -> {
                return getSpindleOne();
            }
            case 2 -> {
                return getSpindleTwo();
            }
            case 3 -> {
                return getSpindleThree();
            }
            case 4 -> {
                return getSpindleFour();
            }
            case 5 -> {
                return getSpindleFive();
            }
            default -> {
                return null;
            }
        }
    }

    public static void setRotatorOne(Integer RotatorNumbOne)
    {
        rotatorOne = getSpindle(RotatorNumbOne);
    }

    public static void setRotatorTwo(Integer RotatorNumbTwo)
    {
        rotatorTwo = getSpindle(RotatorNumbTwo);
    }

    public static void setRotatorThree(Integer RotatorNumbThree)
    {
        rotatorThree = getSpindle(RotatorNumbThree);
    }

    public static void setRotatorNumberOne(Integer RotatorNumberOne)
    {
        RotatorNumOne = RotatorNumberOne;
    }

    public static void setRotatorNumberTwo(Integer RotatorNumberTwo)
    {
        RotatorNumTwo = RotatorNumberTwo;
    }

    public static void setRotatorNumberThree(Integer RotatorNumberThree)
    {
        RotatorNumThree = RotatorNumberThree;
    }

    public static Integer getRotatorNumberOne()
    {
        return RotatorNumOne;
    }

    public static Integer getRotatorNumberTwo()
    {
        return RotatorNumTwo;
    }

    public static Integer getRotatorNumberThree()
    {
        return RotatorNumThree;
    }

    public static HashMap<Integer, Integer> getRotatorOne()
    {
        return rotatorOne;
    }

    public static HashMap<Integer, Integer> getRotatorTwo()
    {
        return rotatorTwo;
    }

    public static HashMap<Integer, Integer> getRotatorThree()
    {
        return rotatorThree;
    }

    public static void setRotatorOneOption(Integer rotatorNumOneOpt)
    {
        rotatorNumberOneOption = rotatorNumOneOpt;
    }

    public static Integer getRotatorOneOption()
    {
        return rotatorNumberOneOption;
    }

    public static void setRotatorTwoOption(Integer rotatorNumTwoOpt)
    {
        rotatorNumberTwoOption = rotatorNumTwoOpt;
    }

    public static Integer getRotatorTwoOption()
    {
        return rotatorNumberTwoOption;
    }

    public static void setRotatorThreeOption(Integer rotatorNumThreeOpt)
    {
        rotatorNumberThreeOption = rotatorNumThreeOpt;
    }

    public static Integer getRotatorThreeOption()
    {
        return rotatorNumberThreeOption;
    }

}
