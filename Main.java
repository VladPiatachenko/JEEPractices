public class Main {
    public static void main(String[] args) {
        Employee emp = null;
        try {
            emp = new Employee("Harry James Potter");
            emp.PrintEmpoyee();

        } catch (FieldLengthLimitException e) {
            System.out.println(e.getMessage());

        }
        Employee emp2 = null;
        try {
            emp2 = new Employee("James Potter");
            emp2.PrintEmpoyee();

        } catch (FieldLengthLimitException e) {
            System.out.println(e.getMessage());
        }
    }
}
