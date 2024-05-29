package Day4_04152024;

import java.util.HashMap;

public class T1_HashMap {

    public static void main(String[] args) {
       // create a hashmap consisting of name and age of Triage Students
        // you can only recall the data using key which is the first data type in the hashmap
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Noyon", 76);
        students.put("Shaimin", 56);
        students.put("Novel", 87);
        students.put("Oyon", 99);

        System.out.println("The size of the hasmap is " + students.size());
        // print out the content of hashmap
        System.out.println(students);
        //print out Oyons age
        int oyonsAge = students.get("Oyon");
        System.out.println("Oyons age is " + oyonsAge);

        //another way of printing oyons age
        System.out.println("Oyons age is " + students.get("Oyon"));

        //print out name Students age only if it exists in the data set
        if (students.containsKey("Noyon")){
            System.out.println("Noyon's age is " + students.get("Noyon"));
        }// end of loop
        else {
            System.out.println("The student does not exist");
        }// end of else loop


    }// end of main

}// end of class
