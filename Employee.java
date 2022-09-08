public class Employee {
    private int id;
    private static int nextid=0;
    private String name;

    public Employee(String name) throws FieldLengthLimitException {
        this.id=nextid++;
        if(name.length()>15){throw new FieldLengthLimitException("Name must be less then 15 sumbols");}
       else{this.name = name;}
    }
    void PrintEmpoyee(){
        System.out.println("ID:"+id+" Name"+name);
    }
}
