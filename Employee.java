public class Employee {
    private int id;
    private static int nextid=0;
    private String name;

    public Employee(String name) throws FieldLengthLimitException {
        this.id=nextid++;
        if(name.length()>15){throw new FieldLengthLimitException("Too much sumbols in name!");}
        else{this.name = name;}
    }
    void PrintEmpoyee(){
        System.out.println("ID:"+id+" Name"+name);
    }
}
