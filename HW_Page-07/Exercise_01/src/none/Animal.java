package none;

public class Animal {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	private String name;
	
	
	public Animal(){
		this.setName("");
	}
	
	public Animal(String name){
		this.setName(name);
	}
	
	
	public String makeSoundAnimal() {
		return "GERÄUSCH! Mein Name ist " + this.name;
	}
}
