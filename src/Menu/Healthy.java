package Menu;

import java.util.Scanner;

public class Healthy extends newGame {
    public static void healthy(){
        clear();

        Scanner scanner= new Scanner(System.in);
        System.out.printf("----------------------------------------------------------%s-----------------------------------------------------------\n",name);
        System.out.printf("------Здоровье:%s------Деньги:%s--------Голод:%s---------\n---------Уровень:%s---------\n\n", health,money,hunger,lvl);
        System.out.println("1.Поспать(0$)\n2.Купить таблетки(10$)\n\n3.Назад\n");
        int number = scanner.nextInt();
        switch (number){
            case(1):
                clear();
                System.out.println("Вы спите....................(Здоровье+10)");
                newGame.health=newGame.health+10;
                lvl+=1;
                wait(5000);
                clear();
                mainWindow();
            case (2):
                if(money>10){
                    clear();
                    System.out.println("Вы успешно купили таблетки.(Здоровье+30)");
                    health+=30;
                    newGame.money=money-10;
                    lvl+=1;
                    wait(1500);
                    mainWindow();
                }
                else{
                    clear();
                    System.out.println("У вас недостаточно денег.");
                    clear();
                    wait(1500);
                    healthy();
                }
            case (3):mainWindow();
        }
    }
}
