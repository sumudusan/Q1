public class contractEmployee extends Employee
{
    private int days;
    private double salary_per_day;

    public contractEmployee(String name,String deparatmernt, int days,double salary_per_day)
    {
        super(name,deparatmernt);
        this.days=days;
        this.salary_per_day=salary_per_day;
    }

    public void calculatesalary()
    {
        salary=days*salary_per_day;
    }

    public static void main(String argsp[])
    {
        contractEmployee c=new contractEmployee("jack","IT",10,1000);
        c.calculatesalary();
        System.out.println("Salary="+c.salary);
    }
}