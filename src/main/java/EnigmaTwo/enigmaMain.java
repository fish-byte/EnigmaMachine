package EnigmaTwo;

import static EnigmaTwo.enigmaUsrInptAndErrChck.*;

public class enigmaMain
{
    public static void main(String[] args)
    {
        System.out.println("Please choose 3 motors between 1 - 5");

        System.out.println("Please choose first motor: ");
        motorChoice(getInInt(),1);

        System.out.println("Please choose second motor: ");
        motorChoice(getInInt(), 1);

        System.out.println("Please choose third motor: ");
        motorChoice(getInInt(),1);

        System.out.println("Please enter the number on the first motor: ");
        rotatorOption(getInInt());

        System.out.println("Please enter the number on the second motor: ");
        rotatorOption(getInInt());

        System.out.println("Please enter the number on the third motor: ");
        rotatorOption(getInInt());

        System.out.println("Please enter the amount of cables:");
        plugAmt(getInInt());

        plugInput();

        System.out.println("Please type the message which you want to encrypt or decrypt: ");
        encryptDecrypt(getInMsg());
    }

}
