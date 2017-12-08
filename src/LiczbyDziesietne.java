
public class LiczbyDziesietne {

    public static void main(String[] args) {

        float x = 0;

        System.out.println("Wersja z while");
        while (x < 3) {
            System.out.printf("%.1f ", x);
            x += 0.1;
        }

        System.out.println("\n\nWersja z do while");
        x = 0;
        do {
            System.out.printf("%.1f ", x);
            x += 0.1;
        } while (x < 3);

    }
}
