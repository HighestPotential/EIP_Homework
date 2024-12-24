package n;


public class ExamApplication {

    public static void main(String[] args) {
    	int x = 100;
        assert x > 10 : "Assertion failed: x is not greater than 10";
        System.out.println("Assertions are enabled!");
        
        Exam exam = new Exam("Final Exam", 2024);

        

        exam.addQuestions("What is Java?", 5);
        exam.addQuestions("What is VM?", 10);
        
        
        exam.save();
        exam.load();
    }
}
