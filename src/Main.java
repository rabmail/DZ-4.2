public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 100;
        // рост в сантиметрах
        float height = 160;
        float bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}
