import java.util.Date;
public class GeometricObject {

    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;



    GeometricObject() {
        dateCreated = new java.util.Date();
    }

    GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();

        this.color = color;
        this.filled = filled;


    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(boolean filled) {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String ToString() {

        return "Create On = " + dateCreated + " \n Color = " + color +
                " isfilled = " + filled;
    }


}

