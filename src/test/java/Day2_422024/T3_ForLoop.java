package Day2_422024;

import java.util.ArrayList;

public class T3_ForLoop {
    public static void main(String[] args) {
        //declare an arrayList variable
        ArrayList<String> countries = new ArrayList<>();

        //add some values to the countries array list
        countries.add("USA");
        countries.add("India");
        countries.add("Pakistan");
        countries.add("Bangladesh");
        countries.add("Canada");
        countries.add("Uk");


        //loop for the whole size of arrayList
        for (int i=0; i<countries.size();i++){
            System.out.println(i);
            System.out.println(countries.get(i));

        }//end of for loop


    } //end of main
}// end of class
