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
        // for (String c : students) // variable c stores the content of array students
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
        // System.out.println(students[1][3]); // the above bracket acts like a matrix , and the answer is printed from 2nd
                                            // row's 4th column's element

//  for(String s :students[1]) // gives 2nd row's values to variable 's'
//  {System.out.println( s);}


int i, j  ;

 for(i=0;i< students.length; i++)// i denotes the row and j denotes the column
 {
for(j=0; j<students[i].length;j++){
System.out.println(students[i][j]);
}
 }

    }
}
