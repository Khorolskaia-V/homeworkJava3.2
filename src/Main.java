public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 98;
        double heightInMeters = 1.87;
        double index = service.calculate(weightInKg, heightInMeters);
        System.out.println(index);
    }
}