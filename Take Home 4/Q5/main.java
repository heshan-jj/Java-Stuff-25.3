package Q5;

class Employee{
    int empID;
    double salary;
    String empName, department;

    Employee(int empID, String empName, String department, double salary){
        this.empID = empID;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
    }

    double calculateNetSalary(double bonuspercentage){
        return salary + (salary * bonuspercentage / 100);
    }

    String getEmployeeSummary(){
        return empID + " "+ empName + " " + department;
    }

    void promote (String newDepartment){
        this.department = newDepartment;
        System.out.println(empName + " has been promoted to the " + department + " department ");
    }
}

public class main {
 public static void main(String[] args){
    Employee e1 = new Employee(100, "Heshan", "Computing", 6700.00);
    Employee e2 = new Employee(101, "Denuri", "Science", 8700.67);

    System.out.println(e1.getEmployeeSummary());
    System.out.println(e2.getEmployeeSummary());

    System.out.println(e1.calculateNetSalary(20));
    System.out.println(e2.calculateNetSalary(20));

    e2.promote("Data Science");
 }   
}
