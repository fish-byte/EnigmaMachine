package EnigmaThree;

public class EnigmaMain
{
    public static void main(String[] args)
    {
        EnigmaUsrInptAndErrChck usrInptAndErrChck = new EnigmaUsrInptAndErrChck();

        System.out.println("Please choose 3 motors between 1 - 5");

        System.out.println("Please choose first motor: ");
        usrInptAndErrChck.motorChoice(usrInptAndErrChck.getInInt(),1);

        System.out.println("Please choose second motor: ");
        usrInptAndErrChck.motorChoice(usrInptAndErrChck.getInInt(), 1);

        System.out.println("Please choose third motor: ");
        usrInptAndErrChck.motorChoice(usrInptAndErrChck.getInInt(),1);

        System.out.println("Please enter the number on the first motor: ");
        usrInptAndErrChck.rotatorOption(usrInptAndErrChck.getInInt(),1);

        System.out.println("Please enter the number on the second motor: ");
        usrInptAndErrChck.rotatorOption(usrInptAndErrChck.getInInt(),1);

        System.out.println("Please enter the number on the third motor: ");
        usrInptAndErrChck.rotatorOption(usrInptAndErrChck.getInInt(),1);

        System.out.println("Please enter the amount of cables:");
        usrInptAndErrChck.plugAmt(usrInptAndErrChck.getInInt(),1);

        usrInptAndErrChck.plugInput();

        System.out.println("Please type the message which you want to encrypt or decrypt: ");
        usrInptAndErrChck.encryptDecrypt(usrInptAndErrChck.getInMsg());
    }

}
