public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 85; // вес
        double height = 1.70; // рост
        double bmi = service.calculate(weight,height);
        System.out.println("Ваш индекс массы тела = " + Math.round(bmi * 10.0) / 10.0 + " кг/м2");
    }
}