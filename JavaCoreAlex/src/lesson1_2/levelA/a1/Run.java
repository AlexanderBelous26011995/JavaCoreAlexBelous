package lesson1_2.levelA.a1;
/*
Объявление и инициализация переменных.  В методе main класса Run создайте 8 переменных каждого примитивного типа
и присвойте им любые произвольные значения.Напишите код, который будет выводить значение каждой переменной в консоль.
 */
public class Run {
    public static void main(String[] args) {
        byte numberByte = 112;
        short numberShort = 10;
        int numberInt = 256;
        long numberLong = 112_253_312L;
        float numberFloat = 1.6F;
        double numberDouble = 1.5;
        char numberChar = 'a';
        boolean varBoolean = true;
        System.out.println(numberByte);
        System.out.println(numberShort);
        System.out.println(numberInt);
        System.out.println(numberLong);
        System.out.println(numberFloat);
        System.out.println(numberDouble);
        System.out.println(numberChar);
        System.out.println(varBoolean);
    }
}
