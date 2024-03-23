package Assignment_5.Assignment_5_Part_2;

public class Main
{
    public static void main(String[] args)
    {

        NormalEmployee n = new NormalEmployee();
        SpecialEmployee s = new SpecialEmployee();
        n.getEmployeeDetails();
        n.salaryCalculation();
        s.getEmployeeDetails();
        s.salaryCalculation();
    }
}
