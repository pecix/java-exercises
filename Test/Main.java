package Test;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jan", "Testowy");
        Employee employee = new Employee(person, Departament.SALES);

        System.out.println(employee.getDepartament().getName());
    }
}
