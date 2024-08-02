package ex3;
import java.util.ArrayList;
import java.util.List;

/**
*
*/
public class ZoneCarnivore implements Zone {


	private List<Animal> animaux = new ArrayList<>();

	public void addAnimal(Animal animal) {
		if (animal.getType() == TypeAnimal.MAMMIFERE && animal.getComportement() == Comportement.CARNIVORE) {
			animaux.add(animal);
		}
	}

	public void afficherListeAnimaux() {
		animaux.forEach(animal -> System.out.println(animal.getNom()));
	}
}
	
