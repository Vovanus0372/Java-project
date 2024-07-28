package Menu;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static String name, _name;
    static String _health,_money,_hunger,_lvl;
    static  int h=100, m=0, hun=100, lv=0;

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свое имя: ");
        name = scanner.nextLine();
        System.out.println("Здраствуйте " + name);

        wait( 2000);
        clear();

        System.out.println("1.Новая игра\n2.Продолжить\n3.Выход");
        number =scanner.nextInt();
        switch (number) {
            case (1):
                clear();
                newGame.mainWindow();
                break;
            case (2):
                    try {

                        BufferedReader reader = new BufferedReader(new FileReader(name));
                        _name = reader.readLine();
                        _health= reader.readLine();
                        _money= reader.readLine();
                        _hunger= reader.readLine();
                        _lvl= reader.readLine();
                        h =Integer.parseInt(_health);
                        m =Integer.parseInt(_money);
                        hun =Integer.parseInt(_hunger);
                        lv =Integer.parseInt(_lvl);

                        reader.close();

                            newGame.health= h;
                            newGame.money=m;
                            newGame.hunger=hun;
                            newGame.lvl=lv;
                            newGame.mainWindow();





                    } catch (IOException e) {
                        System.out.println("Сохранений с вашим именем не нашлось.Попробуйте поменять имя.");
                    }



        }
    }

    public static void clear()  {
        for(int x=0;x<50;x++)System.out.println("\b");//System.cls не работает Найдо найти замену
    }
    public static void wait( int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}