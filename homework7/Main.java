package homework7;

public class Main {
    public static void main(String[] args)
    {
         Cat cat = new Cat("Barsik",5);
         Plate plate = new Plate(100);
         plate.info();
         cat.eat(plate);
         plate.info();



    //Создать массив котиков
        Cat[] kitty = new Cat[5];
        kitty[0] = new Cat("Murzik",6);
        kitty[1] = new Cat("Dusia",3);
        kitty[2] = new Cat("Markiza",14);
        kitty[3] = new Cat("Wiscaz",8);
        kitty[4] = new Cat("Pushistic",5);
        Plate plate1 = new Plate(30);
       //кормим котов
        for (int counter = 0; counter < kitty.length; counter++)
        {
            kitty[counter].eat(plate1);
        }

        plate1.info();//информация о тарелке
        plate1.fullPlate(plate1,20);//добавляем еду
        plate1.info();//информация о тарелке
        //кормим котов
        for (int counter = 0; counter < kitty.length; counter++)
        {
            kitty[counter].eat(plate1);
        }




    }
}
