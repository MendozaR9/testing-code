package Java.OOPExamples;

public class main {
    public static void main(String[] args) {
//Enemy is the parent class
        Enemy enemy = new Enemy();
        enemy.talk();
// vampire is a child of enemy
        Vampire v = new Vampire();
        v.talk();
//werewolf is a child of enemy
        WereWolf wereWolf = new WereWolf();
        wereWolf.talk();
//this Enemy is a pointer to vampire and will print out vampire.talk()
        Enemy e = v;
                e.talk();
//example of polymorphism which determines what type of function to run when running the program
         Enemy [] enemies =   {v, wereWolf};
         //this will call the talk method Vampire or v , which is the first in the array
         enemies[0].talk();
         //this will call the talk method WareWolf or werewolf , which is the second in the array
         enemies[1].talk();
//example of exculpation which hides the data by making the variable private instead of public
         v.setHealth(25);
         v.getHealth();
    }
}
