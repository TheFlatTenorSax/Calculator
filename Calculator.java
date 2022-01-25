import java.util.*;

public class Calculator {
  public static void main(String[] args) {
      Scanner calc = new Scanner(System.in);
    while(true) {
      System.out.println("Input a number:");
      int first = calc.nextInt();
      System.out.println("Input an operation (You could say +, -, *, /)");
      char input = calc.next().charAt(0);
      System.out.println("Input another number:");
      int second = calc.nextInt();

      if(input == '+') {
          int addanswer = first + second;
          System.out.println("Your answer is " + addanswer);

      } else if(input == '-') {
          int subanswer = first - second;
          System.out.println("Your answer is " + subanswer);

      } else if(input == '*') {
          int mulanswer = first * second;
          System.out.println("Your answer is " + mulanswer);

      } else if(input == '/') {
          int divanswer = first / second;
          System.out.println("Your answer is " + divanswer);
        }else {
          System.out.println("Hm....there was an error. Try again.");
        }
        System.out.println("Run another operation? (Say Yes or No, Case Sensitive)");
        String gh = calc.next();
        if(gh.equals("No")){
          System.out.println("Goodbye");
            break;
        }
      }
      calc.close();
  }  
  
}
//ask user for operation, user inputs first and second operation, should give result