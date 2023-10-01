package EnigmaOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static EnigmaOne.enigmaRotator.getInputWheel;
import static EnigmaOne.enigmaRotator.getReflector;
import static EnigmaOne.enigmaUserInput.*;

public class enigmaProcessor
{
    public static void processor() throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String InputLine = in.readLine().toUpperCase();

        for (int i = 0; i < InputLine.length(); i++)
        {
            String alpha = String.valueOf(InputLine.charAt(i));

            //Input Wheel
            Integer two = getInputWheel().get(getPlugLetter(alpha));

            //Rotor 1
            Integer three = getChoice(getRotatorNumberOneOption()).get(two);
            Integer four = getRotatorOne().get(three);
            Integer five = getChoice(getRotatorNumberOneOption()).get(four);

            //Rotor 2
            Integer six = getChoice(getRotatorNumberTwoOption()).get(five);
            Integer seven = getRotatorTwo().get(six);
            Integer eight = getChoice(getRotatorNumberTwoOption()).get(seven);

            //Rotor 3
            Integer nine = getChoice(getRotatorNumberThreeOption()).get(eight);
            Integer ten = getRotatorThree().get(nine);
            Integer eleven = getChoice(getRotatorNumberThreeOption()).get(ten);

            //Reflector
            Integer twelve = getReflector().get(eleven);

            //Rotor 3
            Integer thirteen = getKeyN(getChoice(getRotatorNumberThreeOption()), twelve);
            Integer fourteen = getKeyN(getRotatorThree(), thirteen);
            Integer fifteen = getKeyN(getChoice(getRotatorNumberThreeOption()), fourteen);

            //Rotor 2
            Integer sixteen = getKeyN(getChoice(getRotatorNumberTwoOption()), fifteen);
            Integer seventeen = getKeyN(getRotatorTwo(), sixteen);
            Integer eighteen = getKeyN(getChoice(getRotatorNumberTwoOption()), seventeen);

            //Rotor 1
            Integer nineteen = getKeyN(getChoice(getRotatorNumberOneOption()), eighteen);
            Integer twenty = getKeyN(getRotatorOne(), nineteen);
            Integer twentyOne = getKeyN(getChoice(getRotatorNumberOneOption()), twenty);

            //Input Wheel
            String twentyTwo = getKeyA(getInputWheel(), twentyOne);

            //Plug Box
            String outPut = getPlugLetter(twentyTwo);
            System.out.println(outPut);
        }
    }

    public static Integer getKeyN(HashMap<Integer, Integer> map, Integer value)
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

    public static String getKeyA(HashMap<String, Integer> map, Integer value)
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

    static HashMap<Integer,Integer> rotateMotor = new HashMap<>();

    public static HashMap<Integer, Integer> getChoice(Integer Choice)
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
}
