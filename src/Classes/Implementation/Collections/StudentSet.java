package Classes.Implementation.Collections;

import Classes.Note;
import Classes.Student;
import Interfaces.IStudent;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentSet implements IStudent {
    private Set<Student> setStudents;

    public StudentSet() {
        this.setStudents = new HashSet<>();
    }
    //Set est une interface qui est une collection qui n'accepte pas les doublons


    //version 1
//    @Override
//    public void printStudent() {
//        for (Student x : setStudents) {
//            System.out.println(x);
//        }
//
//    }

    //version 2
//    @Override
//    public void printStudent() {
//        Student[] students = (Student[]) setStudents.toArray();
//        for(int i = 0; i < students.length; i++){
//            System.out.println(students[i]);
//        }
//    }

    //version 3
    @Override
    public void printStudent() {
        Iterator<Student> it = setStudents.iterator();//iterator est une interface qui permet de parcourir une collection
        while (it.hasNext()) { //hasNext retourne true s'il y a un element suivant et false s'il n'y a plus d'element suivant
            System.out.println(it.next());//next retourne à chaque fois un nouveau element
        }
    }

    @Override
    public double calculateAverage(long id) {
        int index = findStudent(id);
        if(index == -1)
            return 0;

        //avg= somme des note*coeficient / somme des coeficients
        double sumNotes = 0, sumCoef = 0;


        for(int i = 0; i < setStudents.get(index).getNotes().length; i++){
            Note note= lstStudents.get(index).getNotes()[i];

            sumNotes+=note.getValue()*note.getCoefficient();
            sumCoef+=note.getCoefficient();
        }
        return sumNotes/sumCoef;
    }

    @Override
    public int findStudent(long id) {
        Iterator<Student>  it= setStudents.iterator();
        int index = 0;
        while(it.hasNext()&& it.next().getId() != id){
            index++;
        }
        if(index == setStudents.size())
            return -1;
        return index;
    }

    //version 2
//    @Override
//    public int findStudent(long id) {
//        Student[] students = (Student[]) setStudents.toArray();
//        for(int i = 0; i < students.length; i++){
//            if(students[i].getId() == id)
//                return i;
//        }
//        return -1;
//    }

    //version 3
//    @Override
//    public int findStudent(long id) {
//        int index = 0;
//
//
//        for (Student student : setStudents) {
//            if (student.getId() == id)
//                return index;
//            index++;
//        }
//        return -1;
//    }
}