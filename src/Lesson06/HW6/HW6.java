package Lesson06.HW6;

public class HW6 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murka", 4, 200);
        Cat cat2 = new Cat( "Pushok", 5, 200);

        System.out.println(cat2.swim(3));
        System.out.println(cat1.run(250));

        Dog dog1 = new Dog("Bobik", 6, 500);

        System.out.println(dog1.swim(34));
        System.out.println(dog1.run(450));

        System.out.println("*************");
        System.out.println("Created:" + Cat.countCat + " cats and " +
                            Dog.countDog + " dogs. " +
                            "Total animals: " + Animal.countAnimals);
    }
}
