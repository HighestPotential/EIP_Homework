package none;

public class Modelling {

    public static void main(String[] args) {
        
    	// Create the owners
        Owner huberbauer = new Owner("Huberbauer");
        Owner schmidtbauer = new Owner("Schmidtbauer");

        // Create the animals
        Sheep shaina = new Sheep("Shaina");
        Wolf alpha = new Wolf("Alpha");
        Mouse susi = new Mouse("Susi");
        Cat mia = new Cat("Mia");

        // Shaina belongs to Huberbauer
        huberbauer.addPet(shaina);
        
        // Print the details of each owner's pets
        System.out.println("Huberbauer's pets:");
        for (Pet p : huberbauer.getAnimalsArray()) {
            System.out.println(((Animal) p).getName());
        }

        System.out.println("\nSchmidtbauer's pets:");
        for (Pet p : schmidtbauer.getAnimalsArray()) {
            System.out.println(((Animal) p).getName());
        }
        
        // Huberbauer sells Shaina to Schmidtbauer
        huberbauer.removePet(shaina);
        schmidtbauer.addPet(shaina);

        // Mia is the cat of Schmidtbauer
        schmidtbauer.addPet(mia);

        // Print the details of each owner's pets
        System.out.println("\nHuberbauer's pets:");
        for (Pet p : huberbauer.getAnimalsArray()) {
            System.out.println(((Animal) p).getName());
        }

        System.out.println("\nSchmidtbauer's pets:");
        for (Pet p : schmidtbauer.getAnimalsArray()) {
            System.out.println(((Animal) p).getName());
        }
        
        // Print some specific behaviors
        System.out.println("\nAnimal sounds:");
        System.out.println(shaina.makeSoundPet() + "\n");  // Sheep sound
        System.out.println(alpha.makeSoundPredator()+ "\n"); // Wolf sound
        System.out.println(susi.makeSoundAnimal()+ "\n");  // Mouse sound
        System.out.println(mia.makeSoundPredatorAndPet()+ "\n"); // Cat sound (both predator and pet)
    	
    	
     
//        Owner owner1 = new Owner("John");
//        Owner owner2 = new Owner("Alice");
//        
//        
//        Cat cat = new Cat("Mittens");
//        Sheep sheep = new Sheep("Dolly");
//        Mouse mouse = new Mouse("Jerry");
//        Wolf wolf = new Wolf("Grey");
//
//       
//        owner1.addPet(cat);
//        owner1.addPet(sheep); 
//        
//        
//
//   
//        System.out.println(cat.makeSoundPredatorAndPet());
//        System.out.println(sheep.makeSoundPet());
//        System.out.println(mouse.makeSoundAnimal());
//        System.out.println(wolf.makeSoundPredator());
//
//        
//        owner1.removePet(cat);
//        
//      
//        System.out.println("After removing the cat from John's ownership:");
//        System.out.println("John's pets:");
//        for (Pet p : owner1.getAnimalsArray()) {
//            
//            if (p instanceof Animal) { //You might comment it out (All classes of Pet are Animals, false will never occur)
//                System.out.println(((Animal) p).getName());
//            }
//        }
//        
//        owner1.removePet(sheep);
//        
//        owner1.removePet(sheep); // John doesn't own sheep, so it should give a warning message
    }
}
