package homework7;

public class Plate {
    private int food;


    public Plate(int food)
    {

        this.food = food;
    }


    public void info()//вывод информации о количестве еды
    {
        System.out.println("plate: "+ food);
    }




    public void decrementFood (int appetite)//ест или не ест
    {
        if(!hasFoodReasonably(appetite))
        {
             System.out.println("not enough food");//не хватает еды
        }
        else
        {
            food -= appetite;//ням-ням
        }
    }


    public void fullPlate(Plate plate,int counter)//добавление еды в тарелку  counter - сколько добавили
    {
         this.food += counter;

    }
    public boolean hasFoodReasonably(int appetite)//сравнение аппетита и количества еды
    {
        return appetite <= food;

    }


}
