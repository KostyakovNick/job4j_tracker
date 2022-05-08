package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Поехали");
    }

    @Override
    public void passengers(int amount) {
        System.out.println("Количество пассажиров: " + amount);
    }

    @Override
    public int refuel(int fuel) {
        return fuel * 50;
    }
}
