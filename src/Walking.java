public class Walking {
    public static void main(String[] args) {
        boolean nite = false;
        boolean weather = false;
        if (nite) {
            System.out.println("Спать");
        }
        if (!nite && weather) {
            System.out.println("Гулять");
        }
        if (!nite && !weather) {
            System.out.println("Читать книгу");
        }
    }
}
