package com.javarush.test.level05.lesson05.task01;

/* Создать класс Cat
Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
*/

public class Cat
{
    public String name;
    int age, weight, strength;

    public static void main(String[] args)
    {
        Cat cat = new Cat();
        cat.name = "Vaska";
        cat.age = 4;
        cat.weight = 9;
        cat.strength = 100;

    }


}
