public class Cat extends Animal {

    String favouriteFood;

    public Cat(String name, int age, String favouriteFood) {
        super(name, age);
        this.favouriteFood = favouriteFood;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    public void eat() {
        System.out.println("I am eating");
        makeSound();
        super.makeSound();
    }

}
