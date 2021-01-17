public class BmiService {
    public float calculate(float weight, float height) {
        // получаем коэффициент роста
        float coefficient = height / 100;
        float bmi = (weight / (coefficient * coefficient));

        return bmi;// возвращаем рассчитанный bonus

    }
}
