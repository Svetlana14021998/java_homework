package homework6;

public class Animal {
    double maxRun;    //максимальная длина бега
    double maxSwim;   //максимальная длина плавания
    double maxJump;   //максимальная длина прыжка
    Animal(double maxRun, double maxSwim, double maxJump){
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;
    }
   public void run(double lengthRun ){    //бег
        if (isLengthInclude(maxRun,lengthRun)){
          printDO("run",lengthRun);
        }
        else
        {
           printCanNot(" run ", lengthRun);
        }
    }
    public void swim(int lengthSwim )  //плавание
        {
            if (isLengthInclude(maxSwim,lengthSwim))
        {
             printDO("swim",lengthSwim);
        }
        else
        {
             printCanNot(" swim ", lengthSwim);
        }

    }
     public void jump(double lengthJump ){  //прыжок
        if (isLengthInclude(maxJump,lengthJump)){
            printDO("jump", lengthJump);
        }
        else
        {
            printCanNot(" jump ",lengthJump);
        }
    }

    public boolean isLengthInclude(double maxLength, double Length) //проверка длины действия
    {
        if (Length<=maxLength)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
   public void printDO (String move, double Length)  //вывод о выполнении действия
   {
      System.out.println(move +" " + " " + Length +" meter");
   }
   public void printCanNot(String move, double length)  //вывод о невыполнении действия
   {
       System.out.println("Can not " + move +" "+ length +" meter");
   }
}
