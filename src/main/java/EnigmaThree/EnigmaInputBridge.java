package EnigmaThree;

import java.util.HashMap;

public class EnigmaInputBridge {
    EnigmaRotator rotator = new EnigmaRotator();
    private HashMap<Integer,Integer> rotatorOne;
    private HashMap<Integer,Integer> rotatorTwo;
    private HashMap<Integer,Integer> rotatorThree;
    private Integer RotatorNumOne;
    private Integer RotatorNumTwo;
    private Integer RotatorNumThree;
    private Integer rotatorNumberOneOption;
    private Integer rotatorNumberTwoOption;
    private Integer rotatorNumberThreeOption;


    public HashMap<Integer, Integer> getSpindle(Integer spindleNum)
    {
        switch (spindleNum) {
            case 1 -> {
                return rotator.getSpindleOne();
            }
            case 2 -> {
                return rotator.getSpindleTwo();
            }
            case 3 -> {
                return rotator.getSpindleThree();
            }
            case 4 -> {
                return rotator.getSpindleFour();
            }
            case 5 -> {
                return rotator.getSpindleFive();
            }
            default -> {
                return null;
            }
        }
    }

    public void setRotatorOne(Integer RotatorNumbOne)
    {
        rotatorOne = getSpindle(RotatorNumbOne);
    }

    public void setRotatorTwo(Integer RotatorNumbTwo)
    {
        rotatorTwo = getSpindle(RotatorNumbTwo);
    }

    public void setRotatorThree(Integer RotatorNumbThree)
    {
        rotatorThree = getSpindle(RotatorNumbThree);
    }

    public void setRotatorNumberOne(Integer RotatorNumberOne)
    {
        RotatorNumOne = RotatorNumberOne;
    }

    public void setRotatorNumberTwo(Integer RotatorNumberTwo)
    {
        RotatorNumTwo = RotatorNumberTwo;
    }

    public void setRotatorNumberThree(Integer RotatorNumberThree)
    {
        RotatorNumThree = RotatorNumberThree;
    }

    public Integer getRotatorNumberOne()
    {
        return RotatorNumOne;
    }

    public Integer getRotatorNumberTwo()
    {
        return RotatorNumTwo;
    }

    public Integer getRotatorNumberThree()
    {
        return RotatorNumThree;
    }

    public HashMap<Integer, Integer> getRotatorOne()
    {
        return rotatorOne;
    }

    public HashMap<Integer, Integer> getRotatorTwo()
    {
        return rotatorTwo;
    }

    public HashMap<Integer, Integer> getRotatorThree()
    {
        return rotatorThree;
    }

    public void setRotatorOneOption(Integer rotatorNumberOneOption)
    {
        this.rotatorNumberOneOption = rotatorNumberOneOption;
    }

    public Integer getRotatorOneOption()
    {
        return rotatorNumberOneOption;
    }

    public void setRotatorTwoOption(Integer rotatorNumberTwoOption)
    {
        this.rotatorNumberTwoOption = rotatorNumberTwoOption;
    }

    public Integer getRotatorTwoOption()
    {
        return rotatorNumberTwoOption;
    }

    public void setRotatorThreeOption(Integer rotatorNumberThreeOption)
    {
        this.rotatorNumberThreeOption = rotatorNumberThreeOption;
    }

    public Integer getRotatorThreeOption()
    {
        return rotatorNumberThreeOption;
    }

}
