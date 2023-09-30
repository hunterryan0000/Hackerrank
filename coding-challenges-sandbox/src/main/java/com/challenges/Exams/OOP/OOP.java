package com.challenges.Exams.OOP;

public class OOP {
    public static void main(String[] args) {
        int x = 14 - 4 / 2;

        System.out.println(x);

        Dog fido = new Dog("Fido", 2);
        Dog myDog = fido;
        myDog.setAge(3);
        System.out.println(fido.getAge());


    }

     static class Dog {
        private String name;
        private int age;

        // getter & setter for name...

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

}
