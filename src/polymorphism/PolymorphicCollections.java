package polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PolymorphicCollections {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        System.out.println("\n-----Cat Object-----\n");
        cat1.eat();
        cat1.sleep();
        cat1.eat("fish");

        System.out.println("\n-----Dog Object-----\n");
        dog1.eat();
        dog1.sleep();
        dog1.eat("meat");

        System.out.println("\n-----Animal Object-----\n");
        Animal animal1 = new Animal();
        animal1.eat(); //Animal eats
        animal1.eat("some foods"); //Animal eats
        animal1.sleep(); //Animal sleeps

        System.out.println("\n-----Cat and Dog Objects in Animal Shape-----\n");
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.eat();
        cat.sleep();
        dog.eat();
        dog.sleep();

        System.out.println("\n-----Array Collection as Animals-----\n");

        Animal[] animals = {cat1, dog1, animal1, cat,dog};
        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
        }
        /*
        Cat
        Dog
        Animal
        Cat
        Dog
         */

        System.out.println("\n-----ArrayList Collection as Animals-----\n");

        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(animals));

        /*
        Collections.addAll(animalArrayList, animals);
        for (Animal animal : animalArrayList) {
            animal.eat();
        }
         */

       // animalArrayList.forEach(animal -> animal.eat());
        animalArrayList.forEach(Animal::eat);
       // new ArrayList<>(Arrays.asList(animals)).forEach(Animal::eat); // Anonymous object with no variable name
    }
}
