public class Patient extends User {

    private String birthDay;
    private double weight;
    private double height;
    private String blood;



    Patient(String name, String email){
        super(name, email);
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

//    @Override
//    public String toString() {
//        return "birthDay " +birthDay +" weight "+ weight;
//    }
}
