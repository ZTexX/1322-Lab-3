import java.util.ArrayList;
import java.io.*;

interface QuizRequirements {
  public void add_question() throws IOException;
  public void remove_question() throws IOException;
  public void modify_question() throws IOException;
  public void give_quiz() throws IOException;
}

public class Quiz implements QuizRequirements {
  private ArrayList<Question> questions = new ArrayList<Question>();
  private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public void add_question() throws IOException {
    Question question = new Question();
    
    System.out.println("What is the question Text?");
    question.setQuestion(br.readLine());

    System.out.println("What is the answer?");
    question.setAnswer(br.readLine());

    System.out.println("How Difficult (1-3)?");
    question.setDifficulty(Integer.parseInt(br.readLine()));

    questions.add(question);
  }

  public void remove_question() throws IOException {
    System.out.println("Choose the question to remove?");
    list_questions();
    questions.remove(Integer.parseInt(br.readLine()));
  }

  public void modify_question() throws IOException {
    System.out.println("Choose the question to modify?");
    list_questions();
    Question question = questions.get(Integer.parseInt(br.readLine()));

    System.out.println("What is the question Text?");
    question.setQuestion(br.readLine());

    System.out.println("What is the answer?");
    question.setAnswer(br.readLine());

    System.out.println("How Difficult (1-3)?");
    question.setDifficulty(Integer.parseInt(br.readLine()));
  }

  public void give_quiz() throws IOException {
    int score = 0;

    for (Question question : questions) {
      System.out.println(question.getQuestion());

      String answer = br.readLine().trim();

      if (question.getAnswer().equalsIgnoreCase(answer)) {
        score++;
        System.out.println("Correct");
      } else {
        System.out.println("Incorrect");
      }
    }

    System.out.println("You got " + score + " out of " + questions.size());
  }

  private void list_questions() {
    for (int i = 0; i < questions.size(); i++) {
      System.out.println(i + ". " + questions.get(i).getQuestion());
    }
  }
}