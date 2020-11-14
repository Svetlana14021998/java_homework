package homework6;
import java.util.Random;
public class Main {
    public static void main (String[] args)
    {
        Random random = new Random();
        Cat catOne = new Cat(200,0,2);//максимальные возможности кошки(run 200,swim 0, jump 2)
        System.out.println("catOne: ");
        catOne.swim(2);
        catOne.run(100);
        catOne.run(300);
        catOne.jump(1);
        catOne.jump(4);
        Dog dogOne = new Dog(500,10,0.5);//максимальные возможности собаки(run 500, swim 10, jump 0.5)
        System.out.println("dogOne: ");
        dogOne.run(450);
        dogOne.run(1000);
        dogOne.swim(2);
        dogOne.swim(15);
        dogOne.jump(0.1);
        dogOne.jump(0.9);
        Dog dogTwo = new Dog(Math.random()*11,Math.random()*2,Math.random()*1000);
        System.out.println("DodTwo: ");
        dogTwo.run(550);
        dogTwo.run(1000);
        dogTwo.swim(2);
        dogTwo.swim(15);
        dogTwo.jump(0.1);
        dogTwo.jump(0.9);
        Dog dogThree = new Dog(Math.random()*100, Math.random()*500,Math.random()*5);
        System.out.println("DodThree: ");
        dogThree.run(450);
        dogThree.run(10);
        dogThree.swim(2);
        dogThree.swim(15);
        dogThree.jump(0.1);
        dogThree.jump(0.9);
    }
}
