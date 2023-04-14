import java.util.Scanner;

public class Project extends Employee {



    private  int cost;


    Project(){

    }
    Project( int cost ){
        this.cost=cost;



    }

    public int getCost() {
        return cost;
    }

    public void getCost(int id) {
        this.cost = cost;
    }


//    public String getdepartment() {
//        return department;
//    }
//
//    public void  setdepartment( String department) {
//        this.department=department;
//    }


    public  void  InputData(){

        super.InputData();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your cost:");
        int cost = input.nextInt();
        this.cost=cost;

//        System.out.println("Enter Your phone department:");
//        String department = input.next();





    }
    @Override
    public void  PrintData(){

       super.PrintData();
        System.out.println("Your cost is:"+cost);
//        System.out.println("Your department is:"+department);

    }
}

