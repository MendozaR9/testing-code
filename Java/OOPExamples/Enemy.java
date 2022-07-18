package Java.OOPExamples;

public class Enemy {
 private   int health;

//    example of Abstraction
    //Only show the necessary information
    public void talk(){
        System.out.println("I am a enemy");
    }

    public void getHealth() {
        System.out.println(health);
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
