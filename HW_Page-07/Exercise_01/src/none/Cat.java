package none;

public class Cat extends Animal implements Predator, Pet {
	
	private Owner owner;

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	public Cat(String name) {
		super(name);
	}

	@Override
	public String makeSoundPet() {
		return "Ich gehöre " + owner.getOwnerName();
	}

	@Override
	public String makeSoundPredator() {
		return super.makeSoundAnimal() +"\n" 
				+ "Achtung, ich bin ein Raubtier!";
	}
	
	public String makeSoundPredatorAndPet() {
		return makeSoundPredator()+"\n" 
				 + makeSoundPet();
	}

}
