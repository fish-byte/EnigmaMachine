package EnigmaThree;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class EnigmaProcessor
{
    EnigmaRotator rotator = new EnigmaRotator();
    EnigmaPlugBox plugBox = new EnigmaPlugBox();
    EnigmaInputBridge inputBridge = new EnigmaInputBridge();
    private HashMap<Integer,Integer> rotateMotor = new HashMap<>();

    public void processor(String InputLine)
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
            Integer two = rotator.getInputWheel().get(plugBox.getPlugLetter(alpha));

            //Rotor 1
            Integer three = getRotatorBuffer(inputBridge.getRotatorOneOption()).get(two);
            Integer four = inputBridge.getRotatorOne().get(three);
            Integer five = getRotatorBuffer(inputBridge.getRotatorOneOption()).get(four);

            //Rotor 2
            Integer six = getRotatorBuffer(inputBridge.getRotatorTwoOption()).get(five);
            Integer seven = inputBridge.getRotatorTwo().get(six);
            Integer eight = getRotatorBuffer(inputBridge.getRotatorTwoOption()).get(seven);

            //Rotor 3
            Integer nine = getRotatorBuffer(inputBridge.getRotatorThreeOption()).get(eight);
            Integer ten = inputBridge.getRotatorThree().get(nine);
            Integer eleven = getRotatorBuffer(inputBridge.getRotatorThreeOption()).get(ten);

            //Reflector
            Integer twelve = rotator.getReflector().get(eleven);

            //Rotor 3
            Integer thirteen = getKeyN(getRotatorBuffer(inputBridge.getRotatorThreeOption()), twelve);
            Integer fourteen = getKeyN(inputBridge.getRotatorThree(), thirteen);
            Integer fifteen = getKeyN(getRotatorBuffer(inputBridge.getRotatorThreeOption()), fourteen);

            //Rotor 2
            Integer sixteen = getKeyN(getRotatorBuffer(inputBridge.getRotatorTwoOption()), fifteen);
            Integer seventeen = getKeyN(inputBridge.getRotatorTwo(), sixteen);
            Integer eighteen = getKeyN(getRotatorBuffer(inputBridge.getRotatorTwoOption()), seventeen);

            //Rotor 1
            Integer nineteen = getKeyN(getRotatorBuffer(inputBridge.getRotatorOneOption()), eighteen);
            Integer twenty = getKeyN(inputBridge.getRotatorOne(), nineteen);
            Integer twentyOne = getKeyN(getRotatorBuffer(inputBridge.getRotatorOneOption()), twenty);

            //Input Wheel
            String twentyTwo = getKeyA(rotator.getInputWheel(), twentyOne);

            //Plug Box
            System.out.print(plugBox.getPlugLetter(twentyTwo));
        }
    }

    private Integer getKeyN(HashMap<Integer, Integer> map, Integer value)
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

    private String getKeyA(HashMap<String, Integer> map, Integer value)
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

    public HashMap<Integer, Integer> getRotatorBuffer(Integer Choice)
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

    private void checkNotches()
    {
        if (inputBridge.getRotatorOneOption() > 26)
        {
            inputBridge.setRotatorOneOption(0);
        }

        else if (inputBridge.getRotatorTwoOption() > 26)
        {
            inputBridge.setRotatorTwoOption(0);
        }

        else if (inputBridge.getRotatorThreeOption() > 26)
        {
            inputBridge.setRotatorThreeOption(0);
        }

    }

    private void notchOneSpin()
    {
        inputBridge.setRotatorOneOption(inputBridge.getRotatorOneOption() + 1);
    }

    private void notchTwoSpin()
    {
        if (inputBridge.getRotatorTwo() == rotator.getSpindleOne() & inputBridge.getRotatorOneOption() == 8)
        {
            inputBridge.setRotatorTwoOption(inputBridge.getRotatorTwoOption() + 1);
        }

        else if (inputBridge.getRotatorTwo() == rotator.getSpindleTwo() & inputBridge.getRotatorOneOption() == 5)
        {
            inputBridge.setRotatorTwoOption(inputBridge.getRotatorTwoOption() + 1);
        }

        else if (inputBridge.getRotatorTwo() == rotator.getSpindleThree() & inputBridge.getRotatorOneOption() == 12)
        {
            inputBridge.setRotatorTwoOption(inputBridge.getRotatorTwoOption() + 1);
        }

        else if (inputBridge.getRotatorTwo() == rotator.getSpindleFour() & inputBridge.getRotatorOneOption() == 18)
        {
            inputBridge.setRotatorTwoOption(inputBridge.getRotatorTwoOption() + 1);
        }

        else if (inputBridge.getRotatorTwo() == rotator.getSpindleFive() & inputBridge.getRotatorOneOption() == 21)
        {
            inputBridge.setRotatorTwoOption(inputBridge.getRotatorTwoOption() + 1);
        }
    }

    private void notchThreeSpin()
    {
        if (inputBridge.getRotatorThree() == rotator.getSpindleOne() & inputBridge.getRotatorTwoOption() == 20)
        {
            inputBridge.setRotatorThreeOption(inputBridge.getRotatorThreeOption() + 1);
        }

        else if (inputBridge.getRotatorThree() == rotator.getSpindleTwo() & inputBridge.getRotatorTwoOption() == 15)
        {
            inputBridge.setRotatorThreeOption(inputBridge.getRotatorThreeOption() + 1);
        }

        else if (inputBridge.getRotatorThree() == rotator.getSpindleThree() & inputBridge.getRotatorTwoOption() == 18)
        {
            inputBridge.setRotatorThreeOption(inputBridge.getRotatorThreeOption() + 1);
        }

        else if (inputBridge.getRotatorThree() == rotator.getSpindleFour() & inputBridge.getRotatorTwoOption() == 10)
        {
            inputBridge.setRotatorThreeOption(inputBridge.getRotatorThreeOption() + 1);
        }

        else if (inputBridge.getRotatorTwo() == rotator.getSpindleFive() & inputBridge.getRotatorTwoOption() == 6)
        {
            inputBridge.setRotatorThreeOption(inputBridge.getRotatorThreeOption() + 1);
        }
    }
}
