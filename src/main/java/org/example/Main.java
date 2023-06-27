package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Animal dog = new Dog("Шарик", 10, 500);
    Animal petCat = new PetCat("Барсик", 0, 200);
    Animal tiger = new Tiger("Тигр", 20, 150);
    Animal dog2 = new Dog("Бобик", 15, 800);
    List<Animal> list = new ArrayList<>();
    list.add(dog);
    list.add(petCat);
    list.add(tiger);
    list.add(dog2); // добавили всех в один список
    List<Dog>dogList= new ArrayList<>();
    List<PetCat>catList= new ArrayList<>();
        for (Animal animal : list) {
            if (animal.getClass().equals(Dog.class)){
                dogList.add((Dog) animal); // добавляем dog в свой список
            }
            if (animal.getClass().equals(PetCat.class)){
                catList.add((PetCat) animal); // добавляем котов в свой список
            }
        }
        System.out.println("Собак: " +  dogList.size());
        System.out.println("Кошек: " + catList.size());
        System.out.println("Всего животных: " + Animal.count); // статический счетчик всех животных
        System.out.println("Количество собак: " + Dog.count); // и каждый вид по отдельности
        System.out.println("Количество домашних кошек: " + PetCat.count);
        System.out.println("Количество тигров: " + Tiger.count);

        Animal[] animals = {dog, petCat, tiger, dog2};
        for (Animal animal : animals) {
            animal.run(50);
            animal.swim(10);
        }

    }
}