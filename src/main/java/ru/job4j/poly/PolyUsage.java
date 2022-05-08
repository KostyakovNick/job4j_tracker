package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle air1 = new Airplane();
        Vehicle air2 = new Airplane();
        Vehicle air3 = new Airplane();
        Vehicle bus1 = new BusNew();
        Vehicle bus2 = new BusNew();
        Vehicle bus3 = new BusNew();
        Vehicle train1 = new Train();
        Vehicle train2 = new Train();
        Vehicle train3 = new Train();
        Vehicle[] vehicles = new Vehicle[] {air1, air2, air3, bus1, bus2, bus3, train1, train2, train3};
        for (Vehicle a: vehicles) {
            a.move();
            a.fuel();
        }
    }
}
