package Java.Abstract;

public  class Cat extends animal implements AnimalStuff {
    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void poop() {
        System.out.println("poop");
    }
}
