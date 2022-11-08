public class Main{
    public static void main(String[] args) {
        double weight=80;
        double height=1.82;
        double bmi=weight/(height*height);
        System.out.println(String.format("%.2f", bmi));
    }
}