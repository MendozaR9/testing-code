package Java.Abstract;

public class AbstractClasses {
    public static void main(String[] args) {
        //With Abstract classes you can not create objects like this
        Cat cat = new Cat();
        //Abstract classes cannot  create objects, but it can have subclasses that can create abjects
        //Example is animals is abstract and has a subclass or child called Cat. Cat can be created as an object
        cat.makeNoise();

        //difference between Abstract and interfaces is that there can be many interfaces, but you only extend one class
        //If there is a field in a interface then it will be static and final.
        //This means that in an abstract class the fields can be defined in the subclasses, but in a interface it is already defined and cannot be changed
    }
}
