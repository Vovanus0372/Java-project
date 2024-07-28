package Menu;

import java.util.Scanner;

public class Money extends newGame{
    static void money(){
        clear();
        Scanner scanner= new Scanner(System.in);
        System.out.printf("----------------------------------------------------------%s-----------------------------------------------------------\n",name);
        System.out.printf("------Здоровье:%s------Деньги:%s--------Голод:%s---------\n---------Уровень:%s--------\n\n", health,money,hunger,lvl);
        System.out.printf("1.Поискать деньги в фонтане.+(1-10$)-(5 голода)\n2.Украсть деньги у бабушки(-15 голода, -10 здоровья)\n3.Сдавать пластик.+(20$-40$)-(40 голода) \n\n4.Назад\n");
        int number = scanner.nextInt();
        switch (number){
            case(1):
                clear();
                double mon = Math.random()*10;
                int mon1= (int)mon;
                System.out.printf("Вы нашли %s$.(-5 голода)",mon1);
                money=money+mon1;
                lvl+=1;
                hunger=hunger-5;
                wait(1500);
                clear();
                mainWindow();
            case (2):
                if(hunger>15 || health>10){
                    clear();
                    double m = 10+Math.random()+10;
                    int m1= (int)m;
                    System.out.printf("Вы украли у бабушки %s$.-(15 голода и 10 здоровья)",m1);
                    health-=10;
                    money=money+m1;
                    hunger-=15;
                    lvl+=1;
                    wait(2500);
                    mainWindow();
                }
                else{
                    clear();
                    System.out.println("У вас нехватает голода или здоровья.");
                    wait(2000);
                    clear();

                    money();
                }
            case (3):
                if(lvl>50) {
                    if (hunger > 40) {
                        clear();
                        double p = Math.random() * 10;
                        int p1 = (int) p;
                        System.out.printf("Вы нашли %s$.(-40 голода)", p1);
                        money = money + p1;
                        lvl += 1;
                        wait(1500);
                        clear();
                        mainWindow();
                    } else {
                        clear();
                        System.out.println("У вас нехватает голода.");
                        wait(2000);
                        clear();

                        money();
                    }
                }
                else{
                    clear();
                    System.out.println("Данный пункт будет открыт с 50 уровня!!!");
                    wait(2000);
                    clear();
                    money();
                }
            case (4):mainWindow();
    }
}}
