package EnigmaThree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class EnigmaRotation {
    EnigmaRotators rotator = new EnigmaRotators();
    private HashMap<Integer,Integer> rotatorOne;
    private HashMap<Integer,Integer> rotatorTwo;
    private HashMap<Integer,Integer> rotatorThree;
    private Integer RotatorNumOne;
    private Integer RotatorNumTwo;
    private Integer RotatorNumThree;
    private Integer rotatorNumberOneOption;
    private Integer rotatorNumberTwoOption;
    private Integer rotatorNumberThreeOption;
    private String ErrorMessage;

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

    public Integer getRotatorNumberOne()
    {
        return RotatorNumOne;
    }

    public Integer getRotatorNumberTwo()
    {
        return RotatorNumTwo;
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

    public void setErrorMessage(String ErrorMessage)
    {
        this.ErrorMessage = ErrorMessage;
    }

    public String getErrorMessage()
    {
        return ErrorMessage;
    }

    public Integer getInInt()
    {
        Integer options = 0;
        try
        {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            options = Integer.valueOf(input.readLine());
        }
        catch (Exception e)
        {
            System.out.println("Error: you didn't enter a valid option");
            setErrorMessage("Error: you didn't enter a valid option");
        }
        return options;
    }

    public Integer getRotatorThreeOption()
    {
        return rotatorNumberThreeOption;
    }

    public void motorChoice(Integer SpindleChoice, int i)
    {
        if (i > 20)
        {
            System.out.println("You have entered too many wrong choices program will exit!!");
            setErrorMessage("Motor Choice was entered wrong too many times");
        }

        else if (SpindleChoice == 0 || SpindleChoice > 5)
        {
            System.out.println("You must choose a spindle between 1 and 5: ");
            motorChoice(getInInt(), i+1);
        }

        else if (SpindleChoice.equals(getRotatorNumberOne()) || SpindleChoice.equals(getRotatorNumberTwo()))
        {
            System.out.println("Rotator number " + getRotatorNumberOne() + " is already in use");
            System.out.println("Please enter the rotator you want to use: ");
            motorChoice(getInInt(), i+1);

        }

        else if (getRotatorOne() == null)
        {
            setRotatorNumberOne(SpindleChoice);
            setRotatorOne(SpindleChoice);
        }

        else if (getRotatorTwo() == null)
        {
            setRotatorNumberTwo(SpindleChoice);
            setRotatorTwo(SpindleChoice);
        }

        else if (getRotatorThree() == null)
        {
            setRotatorThree(SpindleChoice);
        }
    }

    public void rotatorOption(Integer option, int i)
    {
        if (i > 20)
        {
            System.out.println("You have entered too many wrong choices program will exit!!");
            setErrorMessage("Rotator Option was entered wrong too many times");
        }
        else if (option == 0 || option > 26)
        {
            System.out.println("You must choose a number between 1 and 26: ");
            rotatorOption(getInInt(),i+1);
        }

        else if (getRotatorOneOption() == null)
        {
            setRotatorOneOption(option);
        }

        else if (getRotatorTwoOption() == null)
        {
            setRotatorTwoOption(option);
        }

        else if (getRotatorThreeOption() == null)
        {
            setRotatorThreeOption(option);
        }
    }

}
