package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man man = new Man("Tom Smith", 33, "Metrostr. 12");
        Woman woman = new Woman("Mandy Soyer", 30 , "Parolstr. 4");

        //выведи их на экран тут

        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(woman.name + " " + woman.age + " " + woman.address);
    }

    //добавьте тут ваши классы
    public static class Man{
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }

    public static class Woman{
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

}
