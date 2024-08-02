package ex3;

public class Animal {
    private String nom;
    private TypeAnimal type;
    private Comportement comportement;

    public Animal(String nom, TypeAnimal type, Comportement comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public TypeAnimal getType() {
        return type;
    }

    public void setType(TypeAnimal type) {
        this.type = type;
    }

    public Comportement getComportement() {
        return comportement;
    }

    public void setComportement(Comportement comportement) {
        this.comportement = comportement;
    }
}