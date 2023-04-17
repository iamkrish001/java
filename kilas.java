public class kilas {
    public static void main(String[] args) {
        System.out.println("Hello World"); // the only difference in using println and print is it adds a new line while
                                           // only print does not add a new line
        System.out.println("Hello World");
        System.out.print("Hi");
        System.out.print("Hi\n");

        // about the variables
        int x = 8;
        x = 9; // now the value of x is 9
        String carname = " Lamborghini";
        System.out.println(x);
        System.out.println(carname); // prints Lamborghini

        boolean isfine = true;

        System.out.println("Hari is fine and it's" + isfine);

        String myname = "krish is my name"; // string types
        System.out.println(myname.toUpperCase());
        System.out.print(myname.indexOf("name"));

        // to concatenate two or more strings , concatenate means introducing a chain or
        // simply continuation
        String first = " Krish";
        String second = "Bhurtel";
        System.out.println(first.concat(second));
        System.out.println(myname.indexOf("i"));
        System.out.println("My name is\"Krish\"Bhurtel");

        // Java math
      // Math.max(x,y), prints the maxiumum number
      int highest =  Math.max(4,6);
       System.out.println(highest);
      // MaTH.min(x,y), prints the lowest number
      int lowest =  Math.min(4,6);
       System.out.println(lowest);
       // Math.sqrt , prints the square root number
       //Math.random, generates random number between 0 - 1
       System.out.println((int)Math.random()*101); // 1 to 100 , int only let's you to print single integer
    }
}
