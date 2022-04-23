package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class CastingObjects {
    public static void main(String[] args) {
        Cat cat1 = new Cat(); // no casting

        /*
        Up-casting
        -putting smaller data into bigger - widening
        -it happens implicitly
         */

        Animal animal1 = new Cat(); //up-casting in the shape of an Animal and still have details
        Object object1 = new Cat(); //up-casting in the shape of an Object and lost the details

        List<Animal> animals = new ArrayList<>(); // up-casting ArrayList in the shape of List

        /*
        Down-Casting
        -putting bigger data into smaller
        -happens explicitly
        BUT: There could be data loss with primitives
        There can be Exceptions thrown with objects if done improperly
         */

        /*
        Dog dog1 = (Dog) new Animal(); // Every animal is a dog
        System.out.println(dog1); //location? throw exception not allowed!

        Immediate use of down-casting is not possible, and you will get ClassCastException with that.
        DO NOT TRY IT THIS WAY
         */

        Animal a1 = new Dog(); //this is a Dog in the shape of Animal(up-casted)
        Dog dog1 = (Dog) a1; //Down-casting Dog back to Animal

        a1.eat(); // Dog eats
        dog1.eat(); //Dog eats
    }
}
