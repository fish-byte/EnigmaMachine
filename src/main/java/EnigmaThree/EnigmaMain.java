package EnigmaThree;


public class EnigmaMain
{
    public static void main(String[] args)
    {
        EnigmaProcessor processor = new EnigmaProcessor();
        EnigmaPlugBox plugBox = new EnigmaPlugBox();

        System.out.println("Please choose 3 motors between 1 - 5");

        System.out.println("Please choose first motor: ");
        processor.motorChoice(processor.getInInt(),1);

        System.out.println("Please choose second motor: ");
        processor.motorChoice(processor.getInInt(), 1);

        System.out.println("Please choose third motor: ");
        processor.motorChoice(processor.getInInt(),1);

        System.out.println("Please enter the number on the first motor: ");
        processor.rotatorOption(processor.getInInt(),1);

        System.out.println("Please enter the number on the second motor: ");
        processor.rotatorOption(processor.getInInt(),1);

        System.out.println("Please enter the number on the third motor: ");
        processor.rotatorOption(processor.getInInt(),1);

        System.out.println("Please enter the amount of cables:");
        plugBox.plugAmt(processor.getInInt(),1);

        plugBox.plugInput();

        System.out.println("Please type the message which you want to encrypt or decrypt: ");
        processor.encryptDecrypt(processor.getInMsg());
        System.out.println(processor.getOutput());
    }

}
