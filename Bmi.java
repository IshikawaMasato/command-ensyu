public class Main{
    public static void main(String[] args) {
        double weight1=80;
        double height1=1.82;
        double bmi1=weight1/(height1*height1);
        System.out.println(String.format("%.2f", bmi1));
        double weight2=62;
        double height2=1.69;
        double bmi2=weight2/(height2*height2);
        System.out.println(String.format("%.2f", bmi2));
    }
}
