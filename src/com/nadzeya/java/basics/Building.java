package com.nadzeya.java.basics;

//Здание можно охарактеризовать назначением, адресом, количеством этажей,
//наличием(или отсутствием) лифта, материалом, из которого оно построено, годом постройки. Адрес состоит из улицы и номера дома.

public class Building {

    String Type;
    String AddressStreet;
    int AddressNumber;
    int FloorsNumber;
    boolean HasElevator;
    String Material;
    int Year;

    public Building() {

    }

    public Building(String type, String addressStreet, int addressNumber, int floorsNumber, boolean hasElevator, String material, int year) {
        Type = type;
        AddressStreet = addressStreet;
        AddressNumber = addressNumber;
        FloorsNumber = floorsNumber;
        HasElevator = hasElevator;
        Material = material;
        Year = year;

        System.out.println("Вы создали дом " + Type + ", по адресу " + AddressNumber + ", " + AddressStreet + ", с количеством этажей " + FloorsNumber + ", из материала " + Material + ", " + Year + " года постройки.\n");
    }
}
