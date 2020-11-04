package homework1;

public class Main {
    public static void main (String[] args ){

        byte per1=120;
        short per2=320;
        int per3=1;
        long per4=234;
        char letter='a';
        boolean flag=false;
        float parameter1=1.32f;
        double parameter2=123.99;
        computation(1,1,10,3);
        check(2,15);
        check(17,8);
        check_number(-5);
        check_number(10);
        negative_number(-5);
        negative_number(5);
        hello("Аня");
        leap_year(4);
        leap_year(125);
        leap_year(2000);
    }
    static double computation(double a,double b,double c,double d){ //Задание 3
        double t=a*(b+c/d);
        System.out.println(t);
        return t;
    }
static void check(double a, double b){//Задание 4
         String answer= ((a+b)>=10&&(a+b)<=20)? "true" : "false";
         System.out.println(answer);
}
static void check_number(int a){// Задание 5
   String answer = (a>=0)? "positive":"negative";
   System.out.println(answer);
}
static void negative_number(int a){//Задание 6
if (a<0){
    System.out.println("true");
}
}
static void hello(String name){//Задание 7
        System.out.println("Привет, " + name + "!");
}
static void leap_year(int year){//Задание 8
     boolean fl=false;
    if(year%4==0){
      fl=true; }
    if (year%100==0){
        fl=false;
}
if (year%400==0){
      fl=true;
}
if (fl==true){
      System.out.println("Год високосный");
        }
else{
    System.out.println("Год не високосный");
}
}
}
