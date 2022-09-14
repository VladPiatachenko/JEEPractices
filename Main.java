public class Main {
    public static void main(String[] args) throws FieldLengthLimitException {
        Employee emp = null;
        emp = new Employee("Harry Potter");
        emp.PrintEmpoyee();
        HRlist hr = HRlist.getInstance();
        System.out.println("hr1=" + hr.hashCode());
        hr.addWorker(emp);
        hr.toStringList();
/*
        HRlist hr2=HRlist.getInstance();
        System.out.println("hr2="+hr2.hashCode());

        HRlist hr3=HRlist.getInstance();
        System.out.println("hr3="+hr3.hashCode());*/

        System.out.println("-----------------");
        Manager emp2 = null;
        emp2 = new Manager("James Potter", 1100);
        emp2.PrintEmpoyee();
        hr.addWorker(emp2);
        hr.toStringList();
        System.out.println("-----------------");
        Employee emp3 = null;
        emp3 = new Employee("Jon Snow");
        emp3.PrintEmpoyee();
        hr.addWorker(emp3);
        hr.toStringList();


        System.out.println("-----------------");
        Employee emp4 = null;
        emp4 = new Employee("Jon Snow");
        emp4.PrintEmpoyee();
        hr.addWorker(emp4);
        hr.toStringList();

    }
}
