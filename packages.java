import java.util.Scanner; 

class packages{
    public static void main(String[] args) {

        String username ; 
        Scanner obj = new Scanner(System.in); 
    System.out.print("Enter your name ") ;
  username = obj.nextLine(); // takes the value of the user , stores the value in username
System.out.println("My name is " + username);


// WAP to take input from a employee and display his name, age and salary
String name ; 
int age ;
double salary ; 
 

Scanner input = new Scanner(System.in); // creates a variable 'input ' that stores the value of system.in

System.out.println("Enter your name, age and salary : ");

name = input.nextLine(); // stores the name 
age = input.nextInt();
salary = input.nextDouble() ; 

System.out.println("My name is" + name+ "and my age and salary is "+ age +  salary );
    }
}