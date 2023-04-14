

public class Rectangle {

    private float Lenght;
    private float Width;
    public double Area;
    public double Primeter;

    public Rectangle(){
        Lenght=1.0f;
        Width=1.0f;
        Area=0;
        Primeter=0;



    }
    public Rectangle( float Lenght, float Width ){

        this.Lenght = Lenght;
        this.Width= Width;

        
    }

    public float getLenght(){
        return Lenght;  
    }

    public void setLength(Float Lenght){
         this.Lenght = Lenght;
    
    }

    public float getWidth(){
         return Width;  
         
    }
  
    public void setWidth(Float Width){
        this.Width = Width;
    }


    public double getArea(){
        return  Area = Lenght*Width;
  }

  public double getPerimeter(){
       return Primeter =  2*(Lenght + Width) ;
  }
}

