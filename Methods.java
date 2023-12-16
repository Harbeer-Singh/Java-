public class Methods {

    public static void ABS(boolean gotabs) {
        if (gotabs) {
            System.out.println("------Howdy!! Lets learn how to get ABS------\n" +
                    "step 1: GO to target\n" +
                    "step 2: buy some veggies\n");
            ;
            System.out.println(gotabs);
        }

    } 

    public static void challange(boolean a, int score, int age, String name) {
        if (a) {
            int output = score + age;
            System.out.println(output);
            System.out.println(name);
        }

    }

    public static void main(String[] args) {
        ABS(false);
        challange(true, 10, 10, "boii");
        challange(false, 100, 50, "thisisastring");

    }

}
