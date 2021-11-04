public class Walking {
    public static void main(String[] args) {
        boolean night = false;
        boolean weather = false;
        if (night) {
            System.out.println("Спать");
        }
        if (!night && weather) {
            System.out.println("Гулять");
        }
        if (!night && !weather) {
            System.out.println("Читать книгу");
        }
    }
}
