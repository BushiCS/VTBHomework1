package org.example;

public class PetCat extends Animal {
    static int count;

    public PetCat(String name, int maxSwimLength, int maxRunLength) {
        super(name, maxSwimLength, maxRunLength);
        count++;
    }

    @Override
    public void swim(int swimLength) {
        System.out.println("Pet cat can't swim");
    }

    @Override
    public void run(int runLength) {
        super.run(runLength);
    }
}
