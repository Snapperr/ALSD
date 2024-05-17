package Quiz1.C;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Joko Sasongko", 34, new int[]{300, 320, 310}, 150, 100),
            new Employee("Siti Nurbiyah", 44, new int[]{350, 340, 360}, 250, 100),
            new Employee("Samsul Hidayatullah", 23, new int[]{280, 290, 275}, 200, 150),
            new Employee("Samsul Hidayati", 44, new int[]{260, 230, 215}, 250, 150),
        };  
double totalSalary = 0;
        int count = 0;
        for (Employee emp : employees) {
            if (emp.getAge() > 35) {
                totalSalary += emp.totalSalary();
                count++;
            }
}
double averageSalary = count > 0 ? totalSalary / count : 0;
        System.out.println("Average salary of employees older than 35 \t : " + averageSalary);
        Employee highestAllowanceEmployee = null;
        int highestAllowance = 0;
        for (Employee emp : employees) {
            if (emp.getAge() >= 35 && emp.getAge() <= 50) {
                int totalAllowance = emp.getTotalAllowance();
                if (totalAllowance > highestAllowance) {
                    highestAllowance = totalAllowance;
                    highestAllowanceEmployee = emp;
                }
            }
        }
        if (highestAllowanceEmployee != null) {
            System.out.println("Employee with the highest allowance (35-50 years old) \t : " + highestAllowanceEmployee.getName() + ", Allowance: " + highestAllowance);
            highestAllowanceEmployee.printdata();
        } else {
            System.out.println("No employee found in the specified age range.");
        }
    }
}