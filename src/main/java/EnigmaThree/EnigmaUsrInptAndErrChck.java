package EnigmaThree;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EnigmaUsrInptAndErrChck
{
    EnigmaProcessor processor =new EnigmaProcessor();
    EnigmaPlugBox plugBox = new EnigmaPlugBox();
    EnigmaInputBridge inputBridge = new EnigmaInputBridge();
    private String ErrorMessage;

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
            setErrorMessage("Didn't enter an Integer");
        }
        return options;
    }

    public String getInString()
    {
        String input = "Error";

        try
        {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            input = in.readLine().toUpperCase();

            if (!input.matches("^[A-Z]$"))
            {
                input = "Error";
            }
        }

        catch (Exception e)
        {
            System.out.println("Error: you didn't enter a valid option");
            setErrorMessage("Didn't enter a String");
        }
        return input;
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
            System.out.println("Error: you didn't enter a valid option");
            setErrorMessage("Didn't enter all letters");
        }
        return input;
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

        else if (SpindleChoice.equals(inputBridge.getRotatorNumberOne()) || SpindleChoice.equals(inputBridge.getRotatorNumberTwo()))
        {
            System.out.println("Rotator number " + inputBridge.getRotatorNumberOne() + " is already in use");
            System.out.println("Please enter the rotator you want to use: ");
            motorChoice(getInInt(), i+1);

        }

        else if (inputBridge.getRotatorOne() == null)
        {
            inputBridge.setRotatorNumberOne(SpindleChoice);
            inputBridge.setRotatorOne(SpindleChoice);
        }

        else if (inputBridge.getRotatorTwo() == null)
        {
            inputBridge.setRotatorNumberTwo(SpindleChoice);
            inputBridge.setRotatorTwo(SpindleChoice);
        }

        else if (inputBridge.getRotatorThree() == null)
        {
            inputBridge.setRotatorThree(SpindleChoice);
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

        else if (inputBridge.getRotatorOneOption() == null)
        {
            inputBridge.setRotatorOneOption(option);
        }

        else if (inputBridge.getRotatorTwoOption() == null)
        {
            inputBridge.setRotatorTwoOption(option);
        }

        else if (inputBridge.getRotatorThreeOption() == null)
        {
            inputBridge.setRotatorThreeOption(option);
        }
    }

    public void plugAmt(Integer plugAmt, int i)
    {
        if (i > 20)
        {
            System.out.println("You have entered too many wrong choices program will exit!!");
            setErrorMessage("Plug amount was entered wrong too many times");
        }

        else if (plugAmt == 0 || plugAmt > 13)
        {
            System.out.println("You can only have 13 cables and they must be a number: ");
            plugAmt(getInInt(), i+1);
        }

        else
        {
            plugBox.setPlugAmt(plugAmt);
        }
    }

    public String plug1(String plug, int i)
    {
        if (i > 20)
        {
            System.out.println("You have entered too many wrong choices program will exit!!");
            setErrorMessage("Too many tries to enter the plug letter");
        }

        else if (plug.contains("Error"))
        {
            System.out.println("The character entered was not a letter or you didn't enter one letter only");
            System.out.println("Please re-enter letter: ");
            return plug1(getInString(), i+1);
        }

        else if (plugBox.getPlugs().containsValue(plug))
        {
            System.out.println("Plug already in port: " + plug);
            System.out.println("Please re-enter letter: ");
            return plug1(getInString(), i+1);
        }

        plugBox.setPlug(plug);
        return plug;
    }

    public String plug2(String plug, int i)
    {
        if (i > 20)
        {
            System.out.println("You have entered too many wrong choices program will exit!!");
            setErrorMessage("Too many tries to enter the plug letter");
        }

        else if (plug.equals("Error"))
        {
            System.out.println("The character entered was not a letter or you didn't enter one letter only");
            System.out.println("Please re-enter letter: ");
            return plug2(getInString(), i+1);
        }

        else if (plugBox.getPlugs().containsValue(plug) || plugBox.getPlug().equals(plug))
        {
            System.out.println("Plug already in port: " + plug);
            System.out.println("Please re-enter letter: ");
            return plug2(getInString(), i+1);
        }

        plugBox.setPlug(plug);
        return plug;
    }

    public void plugInput()
    {
        for (int i = 0; i < plugBox.getPlugAmt(); i++)
        {
            System.out.println("Please enter Port 1 Cable" + "(" + (i + 1) + ")" + " :");
            String plug1 = plug1(getInString(), 1);

            System.out.println("Please enter Port 2 Cable" + "(" + (i + 1) + ")" + " :");
            String plug2 = plug2(getInString(), 1);

            plugBox.setPlugs(plug1, plug2);
        }
    }


    public void encryptDecrypt(String msg)
    {
        if (msg.contains("Error"))
        {
            System.out.println("The input was not valid, it needs to be only letters");
            System.out.println("Please type the message which you want to encrypt or decrypt: ");
            encryptDecrypt(getInMsg());
        }

        else
        {
            processor.processor(msg);
        }
    }
}
