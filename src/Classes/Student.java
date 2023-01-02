package Classes;

import java.util.Date;

//la classe Student hérite de la classe Person
//la classe Student est une classe fille ou sous-classe ou classe dérivée
//la classe Person est une classe mère ou clasee de base ou classe parente ou classe supérieure
public class Student extends Person {
    private Note[] notes;//composition
    private String level;

    //constructeur par defaut
    public Student(int nbNotes) {
        super();//appel du constructeur par defaut de la classe mère
        this.notes = new Note[nbNotes];
    }
    public Student(long id, String name, String familyName, Date birthDate, String Nationality, Note[] notes, String level) {
        super(id, name, familyName, birthDate, Nationality);//appel du constructeur de la classe mère
        this.notes = notes;
        this.level = level;
    }
    //getters and setters
    public Note[] getNotes() {
        return this.notes;
    }
    public void setNotes(Note[] notes) {
        this.notes = notes;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }

    //redefinition de la methode toString()
    @Override
    public String toString() {
        return super.toString()+"Student [notes=" + notes + ", level=" + level + "]";
    }


    }
}
