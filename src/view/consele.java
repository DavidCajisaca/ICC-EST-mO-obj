package view;

import models.Person;

public class consele {
    public void shormessage (String message){
        System.out.println(message);
    }
    public void printPeople(Person[] people){
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
