package Day4_04152024;

public class T2_Split {
    public static void main(String[] args) {
        //declare a string variable with a single message
        String message = "My name is John";
        //declare an array to store the split message
        String[] splitMessage = message.split(" ");
        //print out only John from the string
        System.out.println("The name is " + splitMessage[3]);

        //declare another message
        String triageMessage = "Automation_02";
        String[] triageMessageArray = triageMessage.split("_");
        System.out.println("The number is " + triageMessageArray[1]);







    }// end of main method
}// end of class
