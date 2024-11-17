package none;

public class Wolf extends Animal implements Predator {
	
	public Wolf(String name) {
		super(name);
	}
	

	@Override
	public String makeSoundPredator() {	
		return super.makeSoundAnimal() +"\n" 
		+ "Achtung, ich bin ein Raubtier!";
	}

}
