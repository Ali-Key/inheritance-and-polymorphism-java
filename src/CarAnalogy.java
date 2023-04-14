

public   class CarAnalogy {

      int number_of_seats = 5;
     CarAnalogy() {

    }

    void driver() {

        System.out.println("Wheels turned on");
    }

     class ElectricCar  extends CarAnalogy{
        int batterylevel =100;
        public ElectricCar(){

        }
    }

    void rechange(){
        int batterylevel =100;
        System.out.println("The battery status:%d%%/n " + batterylevel);
    }



    
}
