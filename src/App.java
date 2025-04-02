import controller.Manage;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
       Person person = new Person("Juan",25);
       System.out.println(person.getName());
        Manage manage = new Manage();
        manage.shortPeopoplebyage();
        manage.sortbyname();
    }
}
