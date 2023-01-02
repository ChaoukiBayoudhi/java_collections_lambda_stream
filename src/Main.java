import Classes.Person;
import Classes.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //difference entre List, Set et Map
        List<Integer> lst = new ArrayList<>();
        lst.add(1);lst.add(2);lst.add(3);lst.add(4);lst.add(5);lst.add(6);lst.add(7);lst.add(8);lst.add(9);lst.add(10);
        lst.add(5);//une liste accepte les doublons
        System.out.println(lst);
        //afficher l'elemnt d'indice 5 de la liste;
        System.out.println(lst.get(5));

        //exemple ensemble des entiers
        Set<Integer> set = new HashSet<>();
        set.add(1);set.add(2);set.add(3);set.add(4);set.add(5);set.add(6);set.add(7);set.add(8);set.add(9);set.add(10);
        System.out.println(set);
        //afficher l'element d'indice 5 de l'ensemble
        System.out.println(set.toArray()[5]);

        //affiche les doublons
        set.add(5);//un ensemble n'accepte pas les doublons=> par consequent, "5" n'est pas ajouté au set.
        System.out.println(set);

        //exemple d'une map
        Map<Integer, Double> map = new HashMap<>();//clé : la valeur de l'id et la valeur : la note
        map.put(1, 10.0);map.put(2, 12.0);map.put(3, 14.0);map.put(4, 16.0);map.put(5, 16.0);map.put(6, 20.0);
        System.out.println(map);
        //pour acceder à la moyenne de l'etudiant d'id 4
        System.out.println(map.get(4));
        map.put(1, 15.0);//la clé 1 est déjà présente dans la map, donc la valeur associée à la clé 1 est modifiée
        System.out.println(map);
        //afficher les clés de la map
        System.out.println(map.keySet());
        //afficher les valeurs de la map
        System.out.println(map.values());
        //utiliser une boucle for each pour afficher les clés et les valeurs de la map
        for(int i = 0; i < map.size(); i++) //parcours via les indices
        {
            System.out.println("Clé : "+map.keySet().toArray()[i]+" Valeur : "+map.values().toArray()[i]);
        }
        for (Integer key : map.keySet()) {
            System.out.println("key : "+key+" value : "+map.get(key));
        }






        //instanciation de la classe Person
        Person p = new Person(1, "Mohamed", "Ben Ahmed", new Date(), "Tunisian");
        Person p1 = new Person(1, "Mohamed", "Ben Ahmed", new Date(), "Tunisian");
        System.out.println(p);//appel implicite de la methode toString()

        System.out.println(p.equals(p1));
        //l'appel d'une méthode d'instance se fait sur une instance de classe(un objet) : nomObjet.nomMethode()
        //p est l'objet avec lequel on a appelé la methode equals
        //p est appelé l'objet courant
        //à l'interieur de la classe l'objet courant est representé par le mot clé "this"

        //afficher le resultat de l'appel de la methode hashCode()
        System.out.println(p.hashCode());
        System.out.println(p1.hashCode());


        Student st1=new Student(5);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student's id : ");
        long id=sc.nextLong();
        st1.setId(id);
        System.out.println("Enter the student's name : ");
        String name=sc.nextLine();
        st1.setName(name);
        System.out.println("Enter the student's family name : ");
        String familyName=sc.nextLine();
        st1.setFamilyName(familyName);
        System.out.println("Enter the student's birth date : ");
        String ch=sc.next();
        Date birthDate=new Date(ch);
        st1.setBirthDate(birthDate);
        System.out.println("Enter the student's nationality : ");
        String nationality=sc.next();
        st1.setNationality(nationality);

        //polynomorphisme : une variable de type Person peut contenir une instance de la classe Person ou de la classe Student
        //on ne peut pas parler duu polymorphisme sans avoir de l'héritage
        Person p2=new Person();
        p2=new Student(5);
    }
}