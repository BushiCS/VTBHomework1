package org.example;

public class Tiger extends Animal {
    static int count;

    public Tiger(String name, int maxSwimLength, int maxRunLength) {
        super(name, maxSwimLength, maxRunLength);
        count++;
    }

    @Override
    public void swim(int swimLength) {
        super.swim(swimLength);

    }


    @Override
    public void run(int runLength) {
        super.run(runLength);
    }
}
