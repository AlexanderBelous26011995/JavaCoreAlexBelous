package lesson1_2.levelA.a2;

/*
В методе main класса Run создайте переменную varByte типа byte и присвойте этой переменной число 10.
Создайте переменную varShort типа short и присвойте этой переменной значение переменной varByte.
Напишите код, который будет выводить значение переменных varByte и varShort в консоль.
 */
public class Run {
    public static void main(String[] args) {
        byte varByte = 10;
        short varShort = (short) varByte;
        System.out.println("Значение переменной varByte: " + varByte);
        System.out.println("Значение переменной varShort: " + varShort);
    }
}
