package EnigmaTwo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static EnigmaTwo.enigmaInputBridge.*;
import static EnigmaTwo.enigmaPlugBox.getPlugLetter;
import static EnigmaTwo.enigmaRotator.*;

public abstract class enigmaProcessor
{
    private static final HashMap<Integer,Integer> rotateMotor = new HashMap<>();

    public static void processor(String InputLine)
    {
        for (int i = 0; i < InputLine.length(); i++)
        {
            String alpha = String.valueOf(InputLine.charAt(i));

            //Rotator Spin
            checkNotches();
            notchOneSpin();
            notchTwoSpin();
            notchThreeSpin();

            //Input Wheel
            Integer two = getInputWheel().get(getPlugLetter(alpha));

            //Rotor 1
            Integer three = getRotatorBuffer(getRotatorOneOption()).get(two);
            Integer four = getRotatorOne().get(three);
            Integer five = getRotatorBuffer(getRotatorOneOption()).get(four);

            //Rotor 2
            Integer six = getRotatorBuffer(getRotatorTwoOption()).get(five);
            Integer seven = getRotatorTwo().get(six);
            Integer eight = getRotatorBuffer(getRotatorTwoOption()).get(seven);

            //Rotor 3
            Integer nine = getRotatorBuffer(getRotatorThreeOption()).get(eight);
            Integer ten = getRotatorThree().get(nine);
            Integer eleven = getRotatorBuffer(getRotatorThreeOption()).get(ten);

            //Reflector
            Integer twelve = enigmaRotator.getReflector().get(eleven);

            //Rotor 3
            Integer thirteen = getKeyN(getRotatorBuffer(getRotatorThreeOption()), twelve);
            Integer fourteen = getKeyN(getRotatorThree(), thirteen);
            Integer fifteen = getKeyN(getRotatorBuffer(getRotatorThreeOption()), fourteen);

            //Rotor 2
            Integer sixteen = getKeyN(getRotatorBuffer(getRotatorTwoOption()), fifteen);
            Integer seventeen = getKeyN(getRotatorTwo(), sixteen);
            Integer eighteen = getKeyN(getRotatorBuffer(getRotatorTwoOption()), seventeen);

            //Rotor 1
            Integer nineteen = getKeyN(getRotatorBuffer(getRotatorOneOption()), eighteen);
            Integer twenty = getKeyN(getRotatorOne(), nineteen);
            Integer twentyOne = getKeyN(getRotatorBuffer(getRotatorOneOption()), twenty);

            //Input Wheel
            String twentyTwo = getKeyA(getInputWheel(), twentyOne);

            //Plug Box
            System.out.print(getPlugLetter(twentyTwo));
        }
    }

    private static Integer getKeyN(HashMap<Integer, Integer> map, Integer value)
    {
        Integer key = null;
        if (map.containsValue(value))
        {
            for (Map.Entry<Integer, Integer> entry : map.entrySet())
            {
                if(Objects.equals(entry.getValue(), value))
                {
                    key = entry.getKey();
                }
            }
        }
        return key;
    }

    private static String getKeyA(HashMap<String, Integer> map, Integer value)
    {
        String key = null;
        if (map.containsValue(value))
        {
            for (Map.Entry<String, Integer> entry : map.entrySet())
            {
                if(Objects.equals(entry.getValue(), value))
                {
                    key = entry.getKey();
                }
            }
        }
        return key;
    }

    protected static HashMap<Integer, Integer> getRotatorBuffer(Integer Choice)
    {
        rotateMotor.clear();
        for (int i = 1; i <= 26 - (Choice - 1); i++)
        {
            rotateMotor.put(i, i + Choice - 1);
        }

        if (rotateMotor.size() < 26)
        {
            int rotatorSize = rotateMotor.size();
            int rotatorSizeAdd = rotateMotor.size() + 1;

            for (int i = rotatorSizeAdd; i <= 26; i++)
            {
                rotateMotor.put(i, i - rotatorSize);
            }
        }

        return rotateMotor;
    }

    private static void checkNotches()
    {
        if (getRotatorOneOption() > 26)
        {
            setRotatorOneOption(0);
        }

        else if (getRotatorTwoOption() > 26)
        {
            setRotatorTwoOption(0);
        }

        else if (getRotatorThreeOption() > 26)
        {
            setRotatorThreeOption(0);
        }

    }

    private static void notchOneSpin()
    {
        setRotatorOneOption(getRotatorOneOption() + 1);
    }

    private static void notchTwoSpin()
    {
        if (getRotatorTwo() == getSpindleOne() & getRotatorOneOption() == 8)
        {
            setRotatorTwoOption(getRotatorTwoOption() + 1);
        }

        else if (getRotatorTwo() == getSpindleTwo() & getRotatorOneOption() == 5)
        {
            setRotatorTwoOption(getRotatorTwoOption() + 1);
        }

        else if (getRotatorTwo() == getSpindleThree() & getRotatorOneOption() == 12)
        {
            setRotatorTwoOption(getRotatorTwoOption() + 1);
        }

        else if (getRotatorTwo() == getSpindleFour() & getRotatorOneOption() == 18)
        {
            setRotatorTwoOption(getRotatorTwoOption() + 1);
        }

        else if (getRotatorTwo() == getSpindleFive() & getRotatorOneOption() == 21)
        {
            setRotatorTwoOption(getRotatorTwoOption() + 1);
        }
    }

    private static void notchThreeSpin()
    {
        if (getRotatorThree() == getSpindleOne() & getRotatorTwoOption() == 20)
        {
            setRotatorThreeOption(getRotatorThreeOption() + 1);
        }

        else if (getRotatorThree() == getSpindleTwo() & getRotatorTwoOption() == 15)
        {
           setRotatorThreeOption(getRotatorThreeOption() + 1);
        }

        else if (getRotatorThree() == getSpindleThree() & getRotatorTwoOption() == 18)
        {
            setRotatorThreeOption(getRotatorThreeOption() + 1);
        }

        else if (getRotatorThree() == getSpindleFour() & getRotatorTwoOption() == 10)
        {
            setRotatorThreeOption(getRotatorThreeOption() + 1);
        }

        else if (getRotatorTwo() == getSpindleFive() & getRotatorTwoOption() == 6)
        {
            setRotatorThreeOption(getRotatorThreeOption() + 1);
        }
    }
}
