package Day2_422024;

import java.util.ArrayList;

public class T2_ArrayList {
    public static void main(String[] args) {
        //declare an arrayList variable
        ArrayList<String> countries = new ArrayList<>();
        //add some values to the countries array list
        countries.add("USA");
        countries.add("India");
        countries.add("Pakistan");
        countries.add("Bangladesh");
        countries.add("Canada");
        countries.add("Afria");

        //print out USA
        System.out.println("the first country is " + countries.get(3));
        //print out the total size of countries arraylist
        System.out.println("the total size of countries arrayList is " + countries.size());
        //remove india
        countries.remove(1);
        //print new size of countires
        System.out.println(countries.size());
    } //end of main
}//end of class
