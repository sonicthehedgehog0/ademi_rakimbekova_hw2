public class Main {
    public static void main(String[] args) {
        System.out.println(takeWalk(30, 15));
        System.out.println(takeWalk(10, 27));
        System.out.println(takeWalk(16, -5));
        System.out.println(takeWalk(56, 40));
        System.out.println(takeWalk(generateRandomAge(), 13));
    }

    public static String takeWalk(int age, int temperature) {
        if (age > 20 && age < 45 && temperature < -20 && temperature > 30) {
            return "Можно идти гулять";
        } else if (age > 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома.";
        }
    }

    public static int generateRandomAge() {
        int a = (int) (Math.random() * (1 + 99));
        return a;
    }

}
