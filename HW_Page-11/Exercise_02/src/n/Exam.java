package n;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
	
	public void save() {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("config.txt"));
			
			String output = "";
			output+=this.name + "\n" + this.year + "\n";
			writer.write(output);
			
			for(Question question :this.questions) {
				writer.write(question.getPoints()+ "\n" +question.getText());
				writer.newLine();
			}
		}catch(IOException e) {
			System.err.println("Could not create the file");
		} finally{
			if(writer!= null) {
				try {writer.close();} catch (IOException e) {}
			}
		}
	}
	
	public void load() {
		
		BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("config.txt"));
            String s;
            while ((s = reader.readLine()) != null) {
                System.out.println(s); // Use println for line breaks
            }
        } catch (FileNotFoundException e) {
            System.err.println("Datei nicht gefunden.");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Fehler beim Lesen der Datei.");
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    
                }
            }
        }
        
	}
	
}
