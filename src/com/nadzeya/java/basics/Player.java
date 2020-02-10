package com.nadzeya.java.basics;

/*

2. Создать класс Игрок. Игрок имеет координаты x и y. Игрок должен уметь (через методы):
а) переместиться в новые координаты (то есть изменить свои текущие координаты на новые, переданные ему),
б) вывести на консоль значение текущего положения,

 */
public class Player {
    double x;
    double y;
    double distance;

    public Player() {
        x = 0;
        y = 0;
        PrintPosition(false);
    }

    void Move(double coordX, double coordY) {
        getWalkDistance(coordX, coordY);

        x = coordX;
        y = coordY;

        PrintPosition();
    }

    void getWalkDistance(double x2, double y2) {
        //Math.sqrt(); - квадратный корень
        //Math.pow(); - возведение в степень
        //distance = ((x2 - x1) ^ 2 + (y2 - y1) ^ 2) ^ (1/2);

        distance = Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
        System.out.println("Пройденная дистанция: " + distance);
    }

    void PrintPosition() {
        PrintPosition(true);
    }

    private void PrintPosition(boolean isNew) {
        String answer;

        if(isNew) {
            answer = "Новые координаты игрока: x: " + x + ", y: " + y;
        } else {
            answer = "Начальные координаты игрока: x: " + x + ", y: " + y;
        }

        System.out.println(answer);
    }
}
