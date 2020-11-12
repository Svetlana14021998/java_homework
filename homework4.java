import java.util.Scanner;
import java.util.Random;
public class homework4 {
    static char[][] map;
    static final int size=3;
    static final char dot_empty = '.';
    static final char dot_x = 'X';
    static final char dot_o = 'O';
    public static void main (String[] args){
//Инициализация
        inputMap();
// Вывод поля на экран
        printMap();
        //цикл
        while (true) {
            //ход человека
            humanTurn();
            //ввывод куда сходил
            printMap();
            //проверка победы
            if (checkWin(dot_x)) {
                System.out.println("Победил человек");
                break;
            }
            //проверка ничьи
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            //ход ии
            computerTurn();
            //ввывод куда сходил
            printMap();
            //проверка победы
            if (checkWin(dot_o ))
            {
                System.out.println("Победил компьютер");
                break;
            }
            // проверка ничьи
            if(isMapFull())
            {
                System.out.println("Ничья");
                break;
            }
        }

    }
    static void inputMap()
    {
        map = new char[size][size];
        for (int row = 0; row < size; row++)
        {
           for (int column = 0; column < size; column++)
           {
               map[row][column] = dot_empty;
           }
        }
    }

    static void printMap()
    {
        for (int i =0; i<=size; i++)
        {
            System.out.print( i + " ");
        }
        System.out.println();
        for (int row = 0; row < size; row++)
        {
            System.out.print((row+1)+" ");
            for(int column = 0; column < size; column++)
            {
                System.out.print(map[row][column]+ " ");
            }
            System.out.println();
        }
    }

    static void humanTurn()
    {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do
            {
                System.out.println("Введите координаты Х У");
                x = scanner.nextInt() - 1;
                y = scanner.nextInt() - 1;
            }
            while(!isCellValid(x,y));
            map[y][x] = dot_x;
            System.out.println("Человек походил в клетку "+(x+1)+" "+(y+1));
        }


        static boolean isCellValid(int x, int y)
        {
            if (x < 0 || x>= size || y < 0 || y>= size)
            {
                return false;
            }
            if (map[y][x] == dot_empty)
            {
                return true;
            }
            return false;
        }

         static void computerTurn()
         {
             Random random = new Random();
             int x;
             int y;
             do
             {
                 x = random.nextInt(size);
                 y = random.nextInt(size);
             }
             while(!isCellValid(x,y));
             map[y][x] = dot_o;
             System.out.println("Компьютер походил в клетку "+(x+1)+" "+(y+1));
         }

         static boolean checkWin (char symb)
         {
             int counter = 0;
             for (int i = 0; i < size; i++)
             {
                 for (int j= 0; j < size; j++)
                 {
                     if (map[i][j] == symb)
                     {
                        counter++;
                     }
                     if (counter==size)
                     {
                         return true;
                     }
                     else
                     {
                         counter=0;
                     }
                 }

             }
             counter=0;

             for (int j = 0; j < size; j++)
             {
                 for (int i= 0; i < size; i++)
                 {
                     if (map[i][j]==symb)
                     {
                         counter++;
                     }
                 }
                 if (counter ==size)
                 {
                     return true;
                 }

             }
             counter=0;
             for (int i = 0; i < size; i++)//проверка главной диагонали
             {
                 for (int j = 0; j < size; j++)
                 {
                     if (i == j)
                     {
                         if (map[i][j] == symb)
                         {
                             counter++;
                         }
                     }
                 }
                     if (counter ==size)
                     {
                         return true;
                     }
             }
             counter=0;
             for (int i = 0; i < size; i++)//проверка побочной диагонали
             {
                 for (int j = 0; j < size; j++)
                 {
                     if ( j == (size - 1-i))
                     {
                         if (map[i][j] == symb)
                         {
                             counter++;
                         }
                     }
                 }
                 if (counter == size) {
                     return true;
                 }
             }
                 return false;
         }

         static boolean isMapFull()
         {
             for (int row = 0; row<size; row++)
             {
                 for (int column = 0; column<size; column++)
                 {
                     if (map[row][column]==dot_empty)
                     {
                         return false;
                     }
                 }
             }
             return true;
         }
}
