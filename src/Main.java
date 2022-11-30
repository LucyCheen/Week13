public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        System.out.println(dog1.animalName);
        dog1.sleep();
        System.out.println(cat1.animalName);
        cat1.sleep();

        dog1.makeSound();
        cat1.makeSound();

        Edible food = new Pig();
        System.out.println(food.youMayEat());
        Edible food2 = new Tomato("Tomato");
        System.out.println(food2.youMayEat());

        Animal Dog = new Dog();
        System.out.println(Dog.toString());
        //System.out.println(Dog.);



    }
}
