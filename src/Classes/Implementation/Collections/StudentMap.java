package Classes.Implementation.Collections;

import Classes.Student;
import Interfaces.IStudent;

import java.util.Map;

public class StudentMap implements IStudent {
    private Map<Student, Double> mapStudents;

    @Override
    public void printStudent() { //afficher les etudiants <=> afficher les cles
        for (Student x : mapStudents.keySet()) {
            System.out.println(x);
        }
        //afficher les etudiants et leurs moyennes <=> afficher les cles et les valeurs
        for (Student x : mapStudents.keySet()) { //parcourir les cles
            System.out.println(x+ " " + mapStudents.get(x));//afficher la cle et la valeur correspondante obtenua e par appel de la methode get
        }
        //ou bien
//        for (Map.Entry<Student, Double> entry : mapStudents.entrySet()) { //parcourir les cles et les valeurs
//            System.out.println(entry.getKey() + " " + entry.getValue());//afficher la cle et la valeur correspondante obtenua e par appel de la methode get
//        }
    }

    @Override
    public double calculateAverage(long id) {
        return 0;
    }

    @Override
    public int findStudent(long id) {
        return 0;
    }
}
