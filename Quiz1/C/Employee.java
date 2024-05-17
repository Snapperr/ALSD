package Quiz1.C;

public class Employee {
   public String name;
   public int[] salary; // Array to store 3 salary values
   public int age;
   public int livingAllowance;
   public int transportationAllowance;

//contructor
public Employee (String name, int age, int[] salary, int livingAllowance, int transportationAllowance){
    this.name = name;
    this.age = age;
    this.salary = salary;
    this.livingAllowance = livingAllowance;
    this.transportationAllowance = transportationAllowance;
}

//Calculate average salary
public double averageSalary() {
    double sum = 0;
    for (int s : salary) {
        sum += s;
    }
    return sum / 3.0;
}
// Calculate total salary including allowance
public double totalSalary() {
    return averageSalary() * 3 + livingAllowance + transportationAllowance;
}

// Print employee data
public void printdata(){
    System.out.println("Name : " + name + ", Age : " + age + ", Average Salary : " + averageSalary() + ", Total Salary : " + totalSalary() + ", Living Allowance : " + livingAllowance + ", Transportation Allowance : " + transportationAllowance );
}
public int getAge() {
    return age;
}
public int getTotalAllowance(){
    return livingAllowance + transportationAllowance;
}
public String getName() {
    return name;
}
}