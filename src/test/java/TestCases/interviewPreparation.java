package TestCases;

class Emp{
    int empid;
    int salary;

    public Emp(){
        empid=1;
        salary=3000;

    }

    public void show(){
        System.out.println(empid +":" +salary);
    }

}

public class interviewPreparation {

    public static void main(String[] args) {

        Emp e = new Emp();
        e.show();

        e.empid=2;
        e.salary=1000;

        e.show();

    }

}
