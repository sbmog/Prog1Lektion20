package opgave03;

public class Rental {
    int no =0;
    String date;
    int daysOfRental;
    Car car;

    public Rental(String date, int no, int daysOfRental,Car car) {
        this.date = date;
        this.no = no;
        this.daysOfRental = daysOfRental;
        this.car=car;
    }

    public int getNo() {
        return no;
    }

    public String getDate() {
        return date;
    }

    public int getDaysOfRental() {
        return daysOfRental;
    }

    public void setDaysOfRental(int daysOfRental) {
        this.daysOfRental = daysOfRental;
    }

    public int getPrice(){
        return car.getPricePerDay()*daysOfRental;
    }
}
