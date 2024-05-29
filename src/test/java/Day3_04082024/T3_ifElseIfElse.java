package Day3_04082024;

public class T3_ifElseIfElse {
    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        int c = 3;

        if (a+b < c){
            System.out.println("a and b is less than c");
        } else if(a+b>c){
            System.out.println("a and b is greater than c");
        } else if(a+c<b){
            System.out.println("this statement is false");
        } else{
            System.out.println("print whatever is in this");
        }

    }//end of main
}//end of class
