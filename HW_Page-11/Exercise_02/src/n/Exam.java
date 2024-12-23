

import java.util.ArrayList;

public class Exam {
	private String name;
	private int year ;
	private ArrayList<Question> questions;
	
	public Exam(String name, int year){
		this.name=name;
		this.year=year;
		questions = new ArrayList<>();
		
	}
	
	public void addQuestions(String text, int points) {
		questions.add(new Question(text, points));
	}
	
	public ArrayList<Question> getQuestions(){
		return this.questions;
	}

	public int getYear() {
		return year;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumberOfQuestions() {
		return this.questions.size();
	}
	
	public int getSumOfPoints() {
		int count=0;
		
		for (Question question : questions) {
		    count += question.getPoints();
		}
		
		return count;
	}
	
	public void orderQuestionsByLength() {
		this.questions.sort((q1, q2) -> q1.getText().length() - q2.getText().length());
	}
	
	public void orderQuestionByPoints() {
		this.questions.sort((q1, q2) -> q1.getPoints() - q2.getPoints());
	}
	
	@Override
	public String toString() {
		String output = "";
		output+=this.name + " (" +this.year+ ")" + "\n";
		
		for(Question q: questions) {
			output+=q+"\n";
		}
		
		return output;
	}
	
}
