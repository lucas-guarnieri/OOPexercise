public class Exercise {
    private String name;
    private String question;
    private String answer;
    private Subject subject = new Subject();

    public String getName() {
        return this.name;
    }

    public void setName(String name ) {
        this.name = name;
    }
    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String text ) {
        this.question = text;
    }

    public String getAnswer() {
        return this.answer;
    }
    
    public void setAnswer(String text ) {
        this.answer = text;
    }

    public Subject getSubject() {
        return this.subject;
    }

    public void setSubject(Subject subject ) {
        this.subject = subject;
    }
    

}
