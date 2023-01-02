package Classes;

import java.util.Date;

//Object : Classe mère de toutes les classes
//cette classe contient les methodes suivantes :
//String toString() : permet d'afficher les attributs de l'objet (par defaut retourne l'adresse de l'objet)
//boolean equals(Object obj) : permet de comparer deux objets et retourne true si les deux objets sont identiques
//int hashCode() : permet de retourner un entier qui represente l'objet (un code de hashage)
//Class<?> getClass() : permet de retourner la classe de l'objet

public class Person {

    //Attributes
    private long id;
    private String name;
    private String familyName;
    private Date birthDate;
    private String Nationality;

    //Constructors
    public Person() {
    }
    public Person(long id, String name, String familyName, Date birthDate, String Nationality)
    {
        this.id = id;
        this.name = name;
        this.familyName = familyName;
        this.birthDate = birthDate;
        this.Nationality = Nationality;
    }

    //redefinition de la methode toString()
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", familyName=" + familyName + ", birthDate=" + birthDate + ", Nationality=" + Nationality + "]";
    }

    //redefinition de la methode equals()
    //deux personnes sont identiques si elles ont le meme id
    @Override
    public boolean equals(Object obj) {
        //on compare les deux objets "obj" et "this"
        //transtypage ou casting : conversion d'un type de variable vers un autre
        /*float x=3.5f;
        int y;
        y=(int)x;*/
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        return this.id==((Person)obj).id;
        //return this.name==((Person)obj).name && this.familyName==((Person)obj).familyName;
    }
    //redefinition de la methode hashCode()
    @Override
    public int hashCode() {
        return super.hashCode()+(int)id;
    }

    //gztters and setters
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFamilyName() {
        return this.familyName;
    }
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
    public Date getBirthDate() {
        return this.birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public String getNationality() {
        return this.Nationality;
    }
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

}
