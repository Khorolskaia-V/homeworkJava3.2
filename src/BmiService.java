public class BmiService {
    public int calculate(int weightInKg, double heightInMeters) {
        double index = weightInKg / heightInMeters / heightInMeters;
        return (int) index;

    }
}
