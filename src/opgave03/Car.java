package opgave03;

public class Car {
    String registrationNumber;
    String yearOfFirstRegistration;
    int pricePerDay = 0;

    public Car(String registrationNumber, String yearOfFirstRegistration,int pricePerDay) {
        this.registrationNumber = registrationNumber;
        this.yearOfFirstRegistration = yearOfFirstRegistration;
        this.pricePerDay=pricePerDay;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getYearOfFirstRegistration() {
        return yearOfFirstRegistration;
    }
}
