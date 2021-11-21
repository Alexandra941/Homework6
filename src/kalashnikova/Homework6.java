package kalashnikova;

import java.util.Arrays;
import java.util.Random;

/**
 * Homework 6
 * @author Kalashnikova Aleksandra
 * @version 21.11.2021
 */
public class Homework6 {

    public static void main(String[] args) {
        Animal[] animals = new Animal[]
                {
                        new Cat("Пётр"),
                        new Cat("Антон"),
                        new Cat("Ефросинья"),
                        new Cat("Анфиса"),
                        new Cat("Тихон"),
                        new Dog("Тишка"),
                        new Dog("Малышка"),
                        new Dog("Гром"),
                        new Dog("Рэкс"),
                        new Dog("Гретта"),
                        new Dog("Мухтар")
                };

        Random random = new Random();

        Arrays.stream(animals).forEach(animal -> {
            System.out.println(animal.run(random.nextInt(500)));
            System.out.println(animal.swim(random.nextInt(15)));
        });


        System.out.printf("Котов %d%n", Arrays.stream(animals).filter(a -> a.getClass() == Cat.class).count());
        System.out.printf("Собак %d%n", Arrays.stream(animals).filter(a -> a.getClass() == Dog.class).count());
        System.out.printf("Всего животных %d%n", animals.length);
    }
}
