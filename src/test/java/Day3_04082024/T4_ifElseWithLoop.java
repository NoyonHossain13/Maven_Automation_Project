package Day3_04082024;

public class T4_ifElseWithLoop {
    public static void main(String[] args) {
        String[] fruits;
        fruits = new String[]{"Apple", "Orange", "Grape", "Strawberry", "Mango"};

        for (int i =0; i<fruits.length;i++){
            if(fruits[i].equals("cherry")){
                System.out.println("The fruit is: " + fruits[i]);
            } // end of apple loop
            else if (fruits[i].equals("Grape")){
                System.out.println("The fruit is: " + fruits[i]);
            } // end of mango loop
        } // end of for loop



    }//end of method
}//end of class