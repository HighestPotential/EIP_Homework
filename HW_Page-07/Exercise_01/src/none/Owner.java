package none;

public class Owner {
	private String ownerName;
	private Pet [] animalsArray;
	
	public Pet[] getAnimalsArray() {
		return animalsArray;
	}

	public Owner(String ownerName) {
		this.ownerName=ownerName;
		this.animalsArray= new Pet [0];
	}
	
	public void addPet(Pet newPet) {
		Pet tempAnimalsArray [] = new Pet [this.animalsArray.length + 1];
		
//		for(int i=0; i< this.animalsArray.length; i++) {
//			tempAnimalsArray[i] = this.animalsArray[i];
//		}
		
		 System.arraycopy(this.animalsArray,
				 0, tempAnimalsArray, 0, this.animalsArray.length);
		tempAnimalsArray[this.animalsArray.length]=newPet;
		if(newPet instanceof Sheep) {
			((Sheep)newPet).setOwner(this);
		}else {
			((Cat)newPet).setOwner(this);
		}
		this.animalsArray=tempAnimalsArray;
		
		
		
	}
	
	public void removePet(Pet pet) {
		if(getIndexIfOwnerExists(pet)!=-1) {
			
			int toRemoveIndex= getIndexIfOwnerExists(pet);
			Pet tempArray[]= new Pet[this.animalsArray.length-1];
			int j=0;
			
			for(int i=0; i<this.animalsArray.length; i++) {
				if(i != toRemoveIndex)
					tempArray[j++] = this.animalsArray[i];
			}
			
			this.animalsArray=tempArray;
			
		}else
			System.out.println("You can not remove a pet that you do not own !!!");
	}
	
	private int getIndexIfOwnerExists(Pet pet) {
		
		if(pet instanceof Cat)
			for(int i=0; i < this.animalsArray.length; i++) {
				
				
				if( animalsArray[i] instanceof Cat 
						&& ((Cat)animalsArray[i]).getOwner()
						.getOwnerName().equals( ((Cat)pet).getOwner().getOwnerName())) 
					
					return i;
				
			}
		
		else
			for(int i=0; i < this.animalsArray.length; i++) {
				
				if( animalsArray[i] instanceof Sheep 
						&& ((Sheep)animalsArray[i]).getOwner()
						.getOwnerName().equals( ((Sheep)pet).getOwner().getOwnerName()) )
					
					return i;
				
			}
			
		
		return -1;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
}
