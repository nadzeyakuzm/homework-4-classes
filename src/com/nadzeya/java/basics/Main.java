package com.nadzeya.java.basics;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Building house = new Building("Многоэтажка", "Лучшая улица", 5, 9, true, "Блоки", 2012);

        Player player = new Player();

        player.Move(4.5,5.4);
        player.Move(8,12);
        player.Move(3,2);
    }
}