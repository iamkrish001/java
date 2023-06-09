

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
        int highest = Math.max(4, 6);
        System.out.println(highest);
        // MaTH.min(x,y), prints the lowest number
        int lowest = Math.min(4, 6);
        System.out.println(lowest);
        // Math.sqrt , prints the square root number
        // Math.random, generates random number between 0 - 1
         int num =(int) Math.random()*99; 
        System.out.println(num);
        // Math.abs(), prints absoulte(positive) value 
        System.out.println(Math.abs(-5));

        // Java booleans
        System.out.println(9>8); // prints true 

        // Java if else statemets
        int myage = 19 ;
        int requiredage = 18 ;
        if(myage >= requiredage)
        {
            System.out.println("The person is eligible to cast vote");
        }
    else
    {
        System.out.println("The person is not eligible to cast vote");
    }

    // Java switch cases
    int age = 8 ; // the given value should be equal to the case number 
    switch (age) {
   case 1 : 
   System.out.println(6);
   break;

   case 2 : 
   System.out.println(7);
   break;
   case 3 : 
   System.out.println(8);
   break;
   case 4: 
   System.out.println(9);
   break;
   default:
   System.out.println("No similar age found");
    }
int day = 4 ; 
 switch(day){
    case 1:
    System.out.println("Sunday"); 
    break ;
    case 2:
    System.out.println("Monday");
    break ;
    case 3:
    System.out.println("Tuesday");
    break ;
    case 4:
    System.out.println("Wednesday");
    break ;
    case 5:
    System.out.println("Thursday");
    default :
    System.out.println("Error") ;
 }

    }
}
