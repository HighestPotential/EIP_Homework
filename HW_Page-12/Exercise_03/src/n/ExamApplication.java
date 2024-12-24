package n;


public class ExamApplication {

    public static void main(String[] args) {
        Exam exam = new Exam("Final Exam", 2024);

        

        exam.addQuestions("What is Java?", 5);
        exam.addQuestions("What is VM?", 10);
        
        
        exam.save();
        exam.load();
    }
}
