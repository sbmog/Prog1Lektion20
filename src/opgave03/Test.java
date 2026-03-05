package opgave03;

public class Test {
    public static void main(String[] args) {
        Car tesla = new Car("0000","2020",3_000);
        Car volvo = new Car("1111","2018",1_500);
        Car nisan = new Car("2222","2010",500);

        Rental rental1=new Rental("1/11",01,20,tesla);
        Rental rental2 =new Rental("1/11",02,10,volvo);
        Rental rental3=new Rental("1/11",03,5,nisan);

        System.out.println("pris for at leje tesla i 20 dage: "+rental1.getPrice());
        System.out.println("pris for at leje Volvo i 10 dage: "+rental2.getPrice());
        System.out.println("pris for at leje nisan i 5 dage: "+ rental3.getPrice());
    }
}
