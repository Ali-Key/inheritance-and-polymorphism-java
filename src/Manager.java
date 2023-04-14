import java.util.Scanner;

public class Manager  extends  Employee{



    private  int id;
    private  String department ;

    Manager(){

    }
    Manager(int id ,  String department){

        this.id=id;
        this.department=department;

    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }


    public String getdepartment() {
        return department;
    }

    public void  setdepartment( String department) {
        this.department=department;
    }


    public  void  InputData(){

        super.InputData();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your id:");
        int id = input.nextInt();
        this.id=id;

        System.out.println("Enter Your phone department:");
        String department = input.next();





    }
    @Override
    public void  PrintData(){

        super.PrintData();


        System.out.println("Your id is:"+id);
        System.out.println("Your department is:"+department);

    }
}
