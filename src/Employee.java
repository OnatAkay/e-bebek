public class Employee {
		
	
	
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public int bonus() {
        if (workHours > 40)
            return (workHours - 40) * 30;
        else
            return 0;
    }

    public double netSalary() {
        return salary + bonus() - tax();
    }

    public double raiseSalary() {
        int totalWorkingYear = 2021 - hireYear;
        double netSalary = netSalary();

        if (totalWorkingYear < 10)
            return netSalary * 1.05;
        else if (totalWorkingYear < 20)
            return netSalary * 1.1;
        else
            return netSalary * 1.15;
    }

    public double tax() {
        if (salary < 1000)
            return 0;
        else
            return salary * 0.03;
    }

    public String toString()
    {
        return ("Name: " + name +
                "\nSalary: " + salary +
                "\nWork Hours: " + workHours +
                "\nHire Year: " + hireYear +
                "\nTax: " + tax() +
                "\nBonus: " + bonus() +
                "\nSalary Raise: " + raiseSalary() +
                "\nNet Salary: " + netSalary() +
                "\nTotal Salary: " + (salary + raiseSalary()));
    }
}
