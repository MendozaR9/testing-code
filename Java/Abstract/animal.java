package Java.Abstract;

public abstract class animal {
    int age;
    String name;
    // A method can also be abstract but this means any classes that extend  this class must also have this method
    //it enforces this method to all subclass but not all methods in an abstract class also need to be abstract
    public abstract  void  makeNoise();

    public void printName(){
        System.out.println("My name is "+ name);
    }
}
