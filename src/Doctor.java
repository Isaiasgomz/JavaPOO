import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    String specility;

    Doctor(String name, String email ){
     super(name, email);
    }

    public String getSpecility() {
        return specility;
    }

    public void setSpecility(String specility) {
        this.specility = specility;
    }

    ArrayList<AvailableApointment> availableApointments = new ArrayList<>();

    public void  addAvailableApointment(Date date, String time){
        availableApointments.add(new Doctor.AvailableApointment(date,time));
    }

    public ArrayList<AvailableApointment> getAvailableApointments(){
        return availableApointments;
    }

    @Override
    public String toString() {
        return super.toString() + "speciality"+ specility + availableApointments.toString();
    }

    public static class AvailableApointment {
         private int id;
       private Date date;
         private String time;

        AvailableApointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "date " +date + " time "+ time;
        }
    }

}
