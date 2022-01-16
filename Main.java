import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Quiz quiz = new Quiz();
    int choice = 0;
    String menu = "What would you like to do?\n1. Add a question to the quiz\n2. Remove a question from the quiz\n3. Modify a question in the quiz\n4. Take the quiz\n5. Quit";

    do {
      System.out.println(menu);
      choice = Integer.parseInt(br.readLine());

      switch (choice) {
        case 1: 
          quiz.add_question();
          break;
        case 2:
          quiz.remove_question();
          break;
        case 3:
          quiz.modify_question();
          break;
        case 4:
          quiz.give_quiz();
          break;
        case 5:
          break;
        default:
          System.out.println("That choice is invalid.");
          break;
      }
    } while (choice != 5);
  }
}