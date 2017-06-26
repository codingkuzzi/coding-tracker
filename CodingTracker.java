import java.io.Console;

public class CodingTracker {
  public static void main(String[] args) {
    Console myConsole = System.console();
    //System.out.println("How much time did you spent coding yesterday ?");
    askWhatTimeYouProgramming("yesterday");
    //String answer1 = myConsole.readLine();
    //System.out.println("How much time did you spent coding two days ago ?");
    askWhatTimeYouProgramming("two days ago");

    //String answer2 = myConsole.readLine();
    //System.out.println("How much time did you spent coding today ?");
    askWhatTimeYouProgramming("today");

  //  System.out.println("Your total amount of coding hours is " + stringFinalTotal + ".");
    //String answer3 = myConsole.readLine();
    //Integer intAnswer1 = Integer.parseInt(answer1);
    //Integer intAnswer2 = Integer.parseInt(answer2);
    //Integer intAnswer3 = Integer.parseInt(answer3);
    //Integer total = intAnswer1 + intAnswer2 + intAnswer3;

    //String stringTotal = Integer.toString(total);

    //askWhatTimeYouProgramming("yesterday");

    //askWhatTimeYouProgramming("two days ago");

    //askWhatTimeYouProgramming("today");
    //System.out.println("Your total amount of coding hours is " + stringTotal + ".");
  }
  public static void askWhatTimeYouProgramming(String day) {
    Console myConsole = System.console();
    System.out.println("How much time did you spent coding " + day + "?");
    String answer = myConsole.readLine();
    Integer intAnswer = Integer.parseInt(answer);
    Integer total = 0;
    Integer finalTotal = total + intAnswer;
    String stringFinalTotal = Integer.toString(finalTotal);
    //Integer yourAnswer = Integer.parseInt(myConsole.readLine());
    //Integer total = 0
    //Integer total += yourAnswer;
  //  String stringTotal = Integer.toString(total);
  System.out.println("Your total amount of coding hours is " + stringFinalTotal + ".");

  }

  }
