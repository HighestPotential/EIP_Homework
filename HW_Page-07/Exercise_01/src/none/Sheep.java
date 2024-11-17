package none;

public class Sheep extends Animal implements Pet {
	private Owner owner;
	
	public Sheep(String name) {
		super(name);
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public String makeSoundPet() {
		return super.makeSoundAnimal() +"\n"+ "Ich gehöre " + owner.getOwnerName();
	}
	
}
