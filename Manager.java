public class Manager extends Employee{
    double bonus;
    Manager(String name,double bonus){
        this.id=nextid++;
        this.name=name;
        this.bonus=bonus;
    }

    void PrintEmpoyee(){
        System.out.println("ID:"+id+" Name: "+name+" Bonus:"+bonus);
    }
}
