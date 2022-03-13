public class Temperature {
    private double weather = 90.3;

    public void calculateCelcius(){
        System.out.println("The temperature in celcius is " + ((weather / 32) * 10) );
    }
}



class TemperatureTest {
    public static void main(String[] args) {
        Temperature today = new Temperature();
        today.calculateCelcius();
    }
}
