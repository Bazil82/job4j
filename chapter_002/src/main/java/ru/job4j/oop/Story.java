package ru.job4j.oop;

public class Story {

    public static void main(String[] args) {

        Ball colobok = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        hare.tryEat(colobok);
        wolf.tryEat(colobok);
        fox.tryEat(colobok);

    }

}
