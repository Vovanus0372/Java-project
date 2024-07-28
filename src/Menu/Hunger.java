package Menu;

import java.util.Scanner;

public class Hunger extends newGame{
    static void hunger() {
        clear();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("----------------------------------------------------------%s-----------------------------------------------------------\n", name);
        System.out.printf("------Здоровье:%s------Деньги:%s--------Голод:%s----------\n---------Уровень:%s---------\n\n", health,money,hunger,lvl);
        System.out.println("1.Забирать еду у голубей.+(5 голода)-(1 здоровье)\n2.Сходить в кафе+(30 голода)-(20$)\n\n3.Назад\n");
        int number = scanner.nextInt();
        switch (number) {
            case (1):
                clear();
                System.out.println("Вы украли еду у голубей.+(5 голода)-(1 здоровье)");
                hunger = hunger + 5;
                health = health - 1;
                lvl+=1;
                wait(1500);
                clear();
                mainWindow();
            case (2):
                if (money>20) {
                    clear();
                    System.out.println("Вы покушали в кафе.+(30 голода)-(20$)");
                    hunger += 30;
                    money -= 20;
                    lvl+=1;
                    wait(2000);
                    mainWindow();
                } else {
                    clear();
                    System.out.println("У вас нехватает денег.");
                    wait(2000);
                    clear();

                    hunger();
                }
            case (3):
                mainWindow();
        }
    }
}
