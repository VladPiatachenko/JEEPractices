public class Employee {
    protected int id;
    protected static int nextid=0;
    protected String name;

    public Employee(String name) throws FieldLengthLimitException {
        this.id=nextid++;
        if(name.length()>15){throw new FieldLengthLimitException("Name must be less then 15 sumbols");}
       else{this.name = name;}
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    void PrintEmpoyee(){
        System.out.println("ID:"+id+" Name: "+name);
    }
}
