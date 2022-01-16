interface QuestionRequirements {
  public String getQuestion();
  public String getAnswer();
  public int getDifficulty();
  
  public void setQuestion(String q);
  public void setAnswer(String a);
  public void setDifficulty(int d);
}

public class Question implements QuestionRequirements {
  private String question, answer;
  private int difficulty;

  public String getQuestion() {
    return this.question;
  }

  public String getAnswer() {
    return this.answer;
  }

  public int getDifficulty() {
    return this.difficulty;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public void setDifficulty(int difficulty) {
    if (difficulty < 1 || difficulty > 3) {
      if (difficulty < 1) {
        this.difficulty = 1;
      } else {
        this.difficulty = 3;
      }
      return;
    }

    this.difficulty = difficulty;
  }
}