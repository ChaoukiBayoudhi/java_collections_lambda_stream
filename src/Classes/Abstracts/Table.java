package Classes.Abstracts;

import java.util.Objects;

public abstract class Table { //une classe abstraite est une classe qui contient au moins une methode abstraite
    //une classe abstraite ne peut pas etre instanciée
    //une classe abstaite est utilisée pour définir des classes filles (heritage)
    private int id;
    private String color;
    private int nbLegs;

    public Table() {
    }
    public Table(int id, String color, int nbLegs) {
        this.id = id;
        this.color = color;
        this.nbLegs = nbLegs;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getNbLegs() {
        return nbLegs;
    }
    public void setNbLegs(int nbLegs) {
        this.nbLegs = nbLegs;
    }
    @Override
    public String toString() {
        return "Table [id=" + id + ", color=" + color + ", nbLegs=" + nbLegs + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return id == table.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public abstract double getArea(); //puisque on ne peut pas decider de la manière avec laquelle on calcule l'aire d'une table
    //,on ne peut pas la définir ici
    //une méthode abstraite est une méthode qui n'a pas de corps
}
