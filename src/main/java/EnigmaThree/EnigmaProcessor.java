package EnigmaThree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static EnigmaThree.EnigmaPlugBox.getPlugLetter;


public class EnigmaProcessor extends EnigmaRotation
{
    private String ErrorMessage;
    EnigmaRotators rotator = new EnigmaRotators();
    private HashMap<Integer,Integer> rotateMotor = new HashMap<>();

    StringBuffer output = new StringBuffer();

    public void processor(String InputLine)
    {
        for (int i = 0; i < InputLine.length(); i++)
        {
            String alpha = String.valueOf(InputLine.charAt(i));

            //Rotator Spin
            notchOneSpin();
            notchTwoSpin();
            notchThreeSpin();

            //Plug Box
            String one = getPlugLetter(alpha);

            //Input Wheel
            Integer two = rotator.getInputWheel().get(one);

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
            Integer twelve = rotator.getReflector().get(eleven);

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
            String twentyTwo = getKeyA(rotator.getInputWheel(), twentyOne);

            //Plug Box
            String twentyFour = getPlugLetter(twentyTwo);

            output.append(twentyFour);
        }
    }

    public String getOutput()
    {
        return output.toString();
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

    private void notchOneSpin()
    {
        notchSpin(getRotatorOneOption(), 1);
    }

    private void notchTwoSpin()
    {
        if (getRotatorTwo() == rotator.getSpindleOne() & getRotatorOneOption() == 8)
        {
            notchSpin(getRotatorTwoOption(), 2);
        }

        else if (getRotatorTwo() == rotator.getSpindleTwo() & getRotatorOneOption() == 5)
        {
            notchSpin(getRotatorTwoOption(), 2);
        }

        else if (getRotatorTwo() == rotator.getSpindleThree() & getRotatorOneOption() == 12)
        {
            notchSpin(getRotatorTwoOption(), 2);
        }

        else if (getRotatorTwo() == rotator.getSpindleFour() & getRotatorOneOption() == 18)
        {
            notchSpin(getRotatorTwoOption(), 2);
        }

        else if (getRotatorTwo() == rotator.getSpindleFive() & getRotatorOneOption() == 21)
        {
            notchSpin(getRotatorTwoOption(), 2);
        }
    }

    private void notchThreeSpin()
    {
        if (getRotatorThree() == rotator.getSpindleOne() & getRotatorTwoOption() == 20)
        {
            notchSpin(getRotatorThreeOption(), 3);
        }

        else if (getRotatorThree() == rotator.getSpindleTwo() & getRotatorTwoOption() == 15)
        {
            notchSpin(getRotatorThreeOption(), 3);
        }

        else if (getRotatorThree() == rotator.getSpindleThree() & getRotatorTwoOption() == 18)
        {
            notchSpin(getRotatorThreeOption(), 3);
        }

        else if (getRotatorThree() == rotator.getSpindleFour() & getRotatorTwoOption() == 10)
        {
            notchSpin(getRotatorThreeOption(), 3);
        }

        else if (getRotatorTwo() == rotator.getSpindleFive() & getRotatorTwoOption() == 6)
        {
            notchSpin(getRotatorThreeOption(), 3);
        }
    }

    private void notchSpin(int rotatorOption, int rotator)
    {
        int r = (rotatorOption + 1) % 27;

        if (r == 0)
        {
            r = 1;
        }

        if (rotator == 1)
        {
            setRotatorOneOption(r);
        }
        else if (rotator == 2)
        {
            setRotatorTwoOption(r);
        }
        else if (rotator == 3)
        {
            setRotatorThreeOption(r);
        }

    }

    public void setErrorMessage(String ErrorMessage)
    {
        this.ErrorMessage = ErrorMessage;
    }

    public String getErrorMessage()
    {
        return ErrorMessage;
    }

    public String getInMsg()
    {
        String input = "Error";

        try
        {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            input = in.readLine().toUpperCase().replaceAll("\\s+","");

            if (!input.matches("^[A-Z]*$"))
            {
                input = "Error";
            }
        }

        catch (Exception e)
        {
            setErrorMessage("Didn't enter all letters");
            System.out.println(getErrorMessage());
        }
        return input;
    }

    public void encryptDecrypt(String msg)
    {
        if (msg.contains("Error"))
        {
            setErrorMessage("The input was not valid, it needs to be only letters");
            System.out.println(getErrorMessage());
            System.out.println("Please type the message which you want to encrypt or decrypt: ");
            encryptDecrypt(getInMsg());
        }

        else
        {
           processor(msg);
        }
    }
}
