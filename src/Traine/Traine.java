package Traine;

import java.util.*;
import Traine.MethodsList;

/**
 * Основная сущность в которой происходит магия
 * @author Volodya
 *
 */
public class Traine{
    public static void main(String[] args) {
        ArrayList<String> ArrayList = new ArrayList<>();
        MethodsList.MyArrayList<String> Car = new MethodsList.MyArrayList<>();
        Car.add("Volvo");
        Car.add("BMW");
        Car.set(1, "Opel");
        Car.add("Porshe");

        System.out.println(Car.get(1));
        System.out.println(Car.size());

        MethodsList.MyArrayList<String> Car2 = Car.subList(0, 1);
        System.out.print("Вывод значение по индексу от 0-1: \n");
        for(int i = 0; i< Car2.size(); i++) {
            System.out.println(Car2.get(i));
        }

        Car.remove(0);
        System.out.print("Вывод всех значений: \n");
        for(int i = 0; i< Car.size(); i++) {
            System.out.println(Car.get(i));
        }


        System.out.print("\nРеализация LinkedList \n");
        MethodsList.MyLinkedList<String> CarLinked = new MethodsList.MyLinkedList<>();
        CarLinked.add("Mitshubishi");
        CarLinked.add("Audi");
        CarLinked.add("Nissan");
        CarLinked.set(1, "Fiat");
        CarLinked.add("Mercedes");

        System.out.println(CarLinked.get(1));
        System.out.println(CarLinked.size());

        MethodsList.MyLinkedList<String> CarLinked2 = CarLinked.subList(1, 3);
        System.out.print("Вывод значение по индексу от 1-3: \n");
        for(int i = 0; i< CarLinked2.size(); i++) {
            System.out.println(CarLinked2.get(i));
        }

        CarLinked.remove(2);
        System.out.print("Вывод всех значений: \n");
        for(int i = 0; i< CarLinked.size(); i++) {
            System.out.println(CarLinked.get(i));
        }






    }
}
