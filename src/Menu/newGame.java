package Menu;

import java.io.*;
import java.util.Scanner;

public class newGame extends Main {
   public static int health=100;
    static int money=0;
    static int hunger=100;
    static int number;
    static int lvl = 0;

    public static void mainWindow(){
        clear();
        if(health>100)health=100;
        else if (hunger>100) {
            hunger=100;
        } else if (hunger<=0) {
            System.out.println("ВЫ УМЕРЛИ ОТ ГОЛОДА!!");
            System.exit(0);
        } else if (health<0) {
            System.out.println("ВЫ ЗАБОЛЕЛИ И УМЕРЛИ!!");
            System.exit(0);
        }
        Scanner scanner= new Scanner(System.in);
        System.out.printf("----------------------------------------------------------%s-----------------------------------------------------------\n",name);
        System.out.printf("------Здоровье:%s------Деньги:%s--------Голод:%s---------\n---------Уровень:%s----------\n\n", health,money,hunger,lvl);
        System.out.println("1.Еда\n2.Работа\n3.Здоровье\n\n4. Сохранить прогресс\n5.Выход\n");
        number=scanner.nextInt();
        switch (number){
            case(1):
                clear();
                wait(1000);
                Hunger.hunger();
            case(2):
                clear();
                wait(1000);
                Money.money();
            case(3):
                clear();
                wait(1000);
                Healthy.healthy();
            case (4):
                String _health, _money, _hunger, _lvl;
                _hunger = String.valueOf(hunger);
                _money = String.valueOf(money);
                _lvl = String.valueOf(lvl);
                _health= String.valueOf(health);

                try(FileWriter writer = new FileWriter(name, false))
                {
                    writer.append(name);
                    writer.append("\n");
                    writer.append(_health);
                    writer.append("\n");
                    writer.append(_money);
                    writer.append("\n");
                    writer.append(_hunger);
                    writer.append("\n");
                    writer.append(_lvl);

                    writer.flush();
                    System.out.println("Вы успешно сохранили игру!");
                }
                catch(IOException ex){

                    System.out.println(ex.getMessage());
                }
            case(5):
                System.exit(0);

        }
    }
}
