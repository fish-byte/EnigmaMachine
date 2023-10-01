package EnigmaOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

import static EnigmaOne.enigmaPlugBox.getPlugs;
import static EnigmaOne.enigmaRotator.*;

public class enigmaUserInput {

    static Integer rotatorNumberOneOption;
    static Integer rotatorNumberTwoOption;
    static Integer rotatorNumberThreeOption;
    static HashMap<Integer,Integer> rotatorOne;
    static HashMap<Integer,Integer> rotatorTwo;
    static HashMap<Integer,Integer> rotatorThree;
    static Integer RotatorNumOne;
    static Integer RotatorNumTwo;
    static Integer RotatorNumThree;



    public static String getPlugLetter(String a)
    {
        return getPlugs().getOrDefault(a, a);
    }


    public static HashMap<Integer, Integer> getSpindle(Integer spindleNum)
    {
        switch (spindleNum) {
            case 1 -> {
                return getSpindleOne();
            }
            case 2 -> {
                return spindleTwo();
            }
            case 3 -> {
                return spindleThree();
            }
            case 4 -> {
                return spindleFour();
            }
            case 5 -> {
                return spindleFive();
            }
            default -> {
                return null;
            }
        }
    }

    public static void setRotatorOne() throws IOException
    {
        BufferedReader spindle = new BufferedReader(new InputStreamReader(System.in));
        RotatorNumOne = Integer.valueOf(spindle.readLine());
        rotatorOne = getSpindle(RotatorNumOne);
    }

    public static void setRotatorTwo() throws IOException
    {
        BufferedReader spindle = new BufferedReader(new InputStreamReader(System.in));
        RotatorNumTwo = Integer.valueOf(spindle.readLine());
        if (getRotatorNumberOneOption().equals(RotatorNumTwo))
        {
            System.out.println("Spindle " + RotatorNumTwo + " is in use, please re-enter second spindle: ");
            setRotatorTwo();
        }
        else
        {
            rotatorTwo = getSpindle(RotatorNumTwo);
        }
    }

    public static void setRotatorThree() throws IOException
    {
        BufferedReader spindle = new BufferedReader(new InputStreamReader(System.in));
        RotatorNumThree = Integer.valueOf(spindle.readLine());

        HashSet<Integer> Spindles = new HashSet<>();
        Spindles.add(getRotatorNumberOneOption());
        Spindles.add(getRotatorNumberTwoOption());

        if ( Spindles.contains(RotatorNumThree))
        {
            System.out.println("Spindle " + RotatorNumThree + " is in use, please re-enter third spindle: ");
            setRotatorThree();
        }
        else
        {
            rotatorThree = getSpindle(RotatorNumThree);
        }
    }

    public static Integer getRotatorNumberOneOption()
    {
        return RotatorNumOne;
    }

    public static Integer getRotatorNumberTwoOption()
    {
        return RotatorNumTwo;
    }

    public static Integer getRotatorNumberThreeOption()
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

    public static void setRotatorOneOption() throws IOException
    {
        BufferedReader choice = new BufferedReader(new InputStreamReader(System.in));
        rotatorNumberOneOption = Integer.valueOf(choice.readLine());
    }

    public static void setRotatorTwoOption() throws IOException
    {
        BufferedReader choice = new BufferedReader(new InputStreamReader(System.in));
        rotatorNumberTwoOption = Integer.valueOf(choice.readLine());
    }

    public static void setRotatorThreeOption() throws IOException
    {
        BufferedReader choice = new BufferedReader(new InputStreamReader(System.in));
        rotatorNumberThreeOption = Integer.valueOf(choice.readLine());
    }

}
