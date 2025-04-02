package controller;

import models.Person;
import view.consele;

public class Manage {
    private consele view;
    private Bubble sorting;
    private Person[] people;
   public Manage(){
     this.view = new consele();
        this.sorting = new Bubble();
        this.view = new consele();
        //instancia de variables 
        this.people = new Person[5];
        //asignacion de valores
        this.people[0] = new Person("Juan", 30);
        this.people[1] = new Person("Maria", 10);
        this.people[2] = new Person("Pedro", 28);
        this.people[3] = new Person("Ana", 27);
        this.people[4] = new Person("Luis", 1);
        view.shormessage("Personas creadas");
        view.printPeople(people);
   }
   public void shortPeopoplebyage(){
        view.shormessage("Personas ordenadas por edad");
        sorting.bubbleSortMejorado(people);
        view.printPeople(people);
   }
   public void sortbyname(){
        view.shormessage("Personas ordenadas por nombre");
        sorting.sortbyname(people);
        view.printPeople(people);
   }

}
