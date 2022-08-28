package CopyObject;

public class CarCopy {
    private String make;
    private String model;
    private int year;


    CarCopy(String make, String model, int year){
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    CarCopy(CarCopy x){
        this.copy(x);
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }

    public void copy(CarCopy x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
}
