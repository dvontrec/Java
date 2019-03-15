import java.util.Scanner;

// Practice with switch statements instead of ifs
public class Switch {
  public static void main(String[] args) {
    int value = 1;
    // If conditionals
    if (value == 1) {
      System.out.println("value is 1");
    } else if (value == 2) {
      System.out.println("value is 2");
    } else {
      System.out.println("value is not 1 or");
    }

    // Switch statments
    int switchValue = 8;
    // switch based on the switch value
    switch (switchValue) {
    // If the value is 1
    case 1:
      System.out.println("value is 1 on switch");
      // break out of the switch statement
      break;
    case 2:
      System.out.println("value is 2 on switch");
      break;
    // multiple cases
    case 3:
    case 4:
    case 5:
      System.out.println("value is 3, or 4, or 5");
      System.out.println("Value is " + switchValue);
      break;

    // Any case not covered
    default:
      System.out.println("value is not 1,2,3,4 or 5 on switch");
      break;
    }

    // calls function for days of week game
    daysOfWeek();
  }

  public static void daysOfWeek() {
    // Creates a scanner object to get user input
    Scanner uInput = new Scanner(System.in);
    // prompts the user for the day
    System.out.println("What day is it");
    String day = uInput.nextLine();
    // switch statement to print days till weekend
    switch (day) {
    case "monday":
      System.out.println("5 Days...");
      break;
    case "tuesday":
      System.out.println("4 Days..");
      break;
    case "wednesday":
      System.out.println("3 Days.");
      break;
    case "thursday":
      System.out.println("2 Days");
      break;
    case "friday":
      System.out.println("1 Day!");
      break;
    case "saturday":
    case "sunday":
      System.out.println("Its The Weekend!!");
      break;
    default:
      System.out.println("Please enter a lowercase day");
    }
    // closes the scanner
    uInput.close();
  }
}