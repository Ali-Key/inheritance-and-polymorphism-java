import java.util.Scanner;

public class Employee {

    private String name;
    private  String address;
    private  int PhoneNumber;
    private  String gender ;

    Employee(){

    }
    Employee(String name, String address  , int PhoneNumber ,  String gender){

        this.name=name;
        this.address=address;
        this.PhoneNumber=PhoneNumber;
        this.gender=gender;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int gePhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void  setAddress( String address) {
        this.address=address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public  void  InputData(){
        System.out.println("Informatiom...................:");
        System.out.println("***********************:");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String name = input.next();
        this.name=name;

        System.out.print("Enter Your Address:");
        String address = input.next();
        this.address=address;

        System.out.print("Enter Your number:");
        int PhoneNumber = input.nextInt();
        this.PhoneNumber=PhoneNumber;


        System.out.println("Enter Your phone gender:");
        String gender = input.next();
        this.gender=gender;




    }

    public void  PrintData(){


        System.out.println("Your name is :"+name);
        System.out.println("Your address is :"+address);
        System.out.println("Your phone number  is :" + PhoneNumber);
        System.out.print("Your gender is :" +gender);

    }



}
