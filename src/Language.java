public class Language {

//olymorphism using method overriding

    public void desplayInfo(){
        System.out.println("Common lauguage English.");
    }

}
class Java extends Language {
    @Override
    public void desplayInfo(){
        System.out.println("Java is programming lauguage.");

    }
}

 class main {



    public static void main(String[] args) throws Exception {

        Language en = new Language();
        en.desplayInfo();

        Java J = new Java();
        J.desplayInfo();




    }
}

