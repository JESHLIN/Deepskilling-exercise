public class Main {
    public static void main(String[] args) {
        EmployeeManagement system = new EmployeeManagement(5);

        system.addEmployee(new Employee(1, "Lisa", "Manager", 80000));
        system.addEmployee(new Employee(2, "Rose", "Developer", 60000));
        system.addEmployee(new Employee(3, "Laila", "Tester", 50000));

        System.out.println("All Employees:");
        system.displayEmployees();

        System.out.println("\nSearching for Employee with ID 2:");
        Employee found = system.searchEmployee(2);
        System.out.println(found != null ? found : "Not Found");

        System.out.println("\nDeleting Employee with ID 1:");
        system.deleteEmployee(1);
        system.displayEmployees();
    }
}
