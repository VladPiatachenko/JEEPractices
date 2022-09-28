public class Main {
    public static void main(String[] args) throws FieldLengthLimitException {
      HRlist hr=HRlist.getInstance();
      Manager CEO = new Manager("John","CEO");
      hr.addWorker(CEO);
      Employee headSales = new Employee("Robert","Head Sales");
      hr.addWorker(headSales);
      headSales.manid=CEO.id;
      Employee headMarketing = new Employee("Michel","Head Marketing");
      hr.addWorker(headSales);
      headMarketing.manid=CEO.id;

      Employee clerk1 = new Employee("Laura","Marketing");
      hr.addWorker(clerk1);
      Employee clerk2 = new Employee("Bob","Marketing");
      hr.addWorker(clerk2);
      clerk1.manid=headMarketing.id;
      clerk2.manid=headMarketing.id;
      Employee salesExecutive1 = new Employee("Richard","Sales");
      hr.addWorker(salesExecutive1);
      Employee salesExecutive2 = new Employee("Rob","Sales");
      hr.addWorker(salesExecutive2);
      salesExecutive1.manid=headSales.id;
      salesExecutive2.manid=headSales.id;
      hr.toStringList();
      
      
      CEO.add(headSales);
      CEO.add(headMarketing);

      headSales.add(salesExecutive1);
      headSales.add(salesExecutive2);

      headMarketing.add(clerk1);
      headMarketing.add(clerk2);

      //print all employees of the organization
      CEO.PrintEmpoyee(); 
      
      for (Employee headEmployee : CEO.getSubordinates()) {
         headEmployee.PrintEmpoyee();
         
         for (Employee employee : headEmployee.getSubordinates()) {
            employee.PrintEmpoyee();
         }
      }		

      
}
}


