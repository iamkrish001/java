public class arrays {
    public static void main(String[] args) {

        // String cars[] = { "amg", "lambo", "fer", "mclaren" }; // declaring an array
        // of cars and printing the 2nd name
        // System.out.println(cars[1].length());

        // String students[] = { "Ram", "Sam", " Hari ", "Sita" };
        // System.out.println(students.length);

        // // Using a for loop
        // int i;
        // for (i = 0; i <= students.length; i++) {
        // System.out.println(i);
        // }

        // // using for-each loop
        // for (String c : students) // variable c stores the content of array named
        // students
        // and prints in the next line
        // {
        // System.out.println(c);
        // }

        // // for-each loop is easy to use

        // for (String d : students) {
        // System.out.println(d); }

        String[][] students = { { "Ram", "Sam", " Hari ", "Sita" },
                { "pass", " fail", "pass", " fail" }
        };
        // System.out.println(students[1][3]); // the above bracket acts like a matrix ,
        // and the answer is printed from 2nd
        // row's 4th column's element

        // for(String s :students[1]) // gives 2nd row's values to variable 's'
        // {System.out.println( s);}

        // another example of multi dimensional array
        // int num[][] = { { 1, 2, 3 },
        // { 4, 5, 6 } }; // variable declaration of 2 set of numbers

        // System.out.println(num[0][2]); // prints 3

        // WAP to print decrement star pattern starting from 5 stars
        // for(int i=1; i<=5; i++){
        // for(int j=5;j>=i;j--)
        // {
        // System.out.println("*");
        // }
        // System.out.println("");
        // }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }
            System.out.println("");// gives a new line for spacing
        }
        for (int i = 0; i < 5; i++) {
            for (int j =5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}
