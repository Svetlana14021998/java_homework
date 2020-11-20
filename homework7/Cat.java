package homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat(String name,int appetite)
    {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }
    public void eat(Plate p)//ням-ням
    {
        if (p.hasFoodReasonably(appetite)&&!satiety) {
            p.decrementFood(appetite);
            satiety = true;
            System.out.println(name + " eat");
        }
        else if (satiety)
        {
            System.out.println(name + " do not want eat");//кот сыт
        }
        else
        {
            System.out.println("not enough food in the plate for " + name );//не хватает еды в тарелке
        }
    }


    {

    }
}
