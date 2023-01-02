package Classes.Implementation.Collections;

import Classes.Note;
import Classes.Student;
import Interfaces.IStudent;

import java.util.ArrayList;
import java.util.List;

public  class StudentList implements IStudent {
    private List<Student> lstStudents; //une ArrayList est l'equivalent d'un tableau dynamique
    //List est une interface qui est une collection qui accepte les doublons
    //exemple : list des entiers 1,2,3,4,5,6,7,8,9,10
    //List<Integer> lst = new ArrayList<>();
    //lst.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);list.add(7);list.add(8);list.add(9);list.add(10);
    public StudentList(){
        //initialisation de la liste
        lstStudents = new ArrayList<>();
    }

    @Override
    public void printStudent() {
        for(int i = 0; i < lstStudents.size(); i++){
            System.out.println(lstStudents.get(i));
        }
    }
    //deuxieme version avec une boucle for each

//    @Override
//    public void printStudent() {
//        for (Student x : lstStudents) {
//            System.out.println(x);
//        }
//    }

    @Override
    public double calculateAverage(long id) {
        int index = findStudent(id);
        if(index == -1)
            return 0;

        //avg= somme des note*coeficient / somme des coeficients
        double sumNotes = 0, sumCoef = 0;


        for(int i = 0; i < lstStudents.get(index).getNotes().length; i++){
            Note note= lstStudents.get(index).getNotes()[i];

            sumNotes+=note.getValue()*note.getCoefficient();
            sumCoef+=note.getCoefficient();
                    }
        return sumNotes/sumCoef;
    }
 //version 1
//    @Override
//    public int findStudent(long id) {
////        if(lstStudents.isEmpty()){
////            return -1;
////        }
//        //indexOf retourne l'index de l'element dans la liste s'il exsite ou -1 s'il n'existe pas
//        Student st1=new Student(0);
//        st1.setId(id);
//        return lstStudents.indexOf(st1);
//    }

    //version 2
    @Override
    public int findStudent(long id) {
        int i = 0;
        while(i < lstStudents.size() && lstStudents.get(i).getId() != id)
            i++;
        if(i == lstStudents.size())
            return -1;
        return i;
    }
}
