import java.util.ArrayList;
import java.util.List;

public class Employee {
    protected int id;
    protected static int nextid=0;
    protected String name;
    protected String dept;
    int manid;
    protected List<Employee> subordinates;


    public Employee(String name,String dept) throws FieldLengthLimitException {
        this.id=nextid++;
        if(name.length()>15){throw new FieldLengthLimitException("Name must be less then 15 sumbols");}
       else{this.name = name;}
        this.dept=dept;
        subordinates = new ArrayList<Employee>();
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }
    public void add(Employee e) {
      subordinates.add(e);
    }

   public void remove(Employee e) {
      subordinates.remove(e);
   }

   public List<Employee> getSubordinates(){
     return subordinates;
   }

   public void PrintEmpoyee(){
      System.out.println("Employee :[ Name : " + name + ", dept : " + dept + "]: managerID:"+manid);
   }   
}


