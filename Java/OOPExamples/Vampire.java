package Java.OOPExamples;

public class Vampire extends Enemy{
    //This extends off enemy meaning that it has the property's of enemy
   //this reduces the amount of code I need to rewrite,
    //and we can override the methods

    @Override
    public void talk() {
        System.out.println("I am a Vampire");
    }
}
