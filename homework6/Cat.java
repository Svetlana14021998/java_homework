package homework6;

public class Cat extends Animal {
       Cat(double maxRun, double maxSwim, double maxJump)
       {super(maxRun,0,maxJump);
    }
    @Override
    public void swim(int lengthSwim )  //плавание
    {
        System.out.println("I can not swim");
    }


}
