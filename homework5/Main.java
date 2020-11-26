package homework5;

import homework5.Employees;

public class Main {
public static void main (String[] args)
{
    Employees[] employee = new Employees[5];
    employee[0]= new Employees(
            "Иванов Иван Иванович",
            "грузчик",
            "ivanov@mail",
    "7999111",
            44,
            15000);
    employee[1]= new Employees(
            "Петров Николай Васильевич",
            "продавец",
            "petrovnv@mail",
            "7999144",
            35,
            21000);
    employee[2]= new Employees(
            "Козлов Виталий Федорович",
            "уборщик",
            "kozlov123@mail",
            "7999431",
            29,
            12000);
    employee[3]= new Employees(
            "Медведев Михаил Игоревич",
            "электромантер",
            "mishkaa@mail",
            "7999876",
            55,
            27000);
    employee[4]= new Employees(
            "Сидоров Александр Константинович",
            "програмист",
            "sidorov89@mail",
            "7999666",
            39,
            35000);
    for (int i = 0; i < employee.length; i++)
        {
        if (employee[i].getAge() > 40)
            {
                employee[i].printInfo();
                System.out.println();
            }
        }
    }
}

