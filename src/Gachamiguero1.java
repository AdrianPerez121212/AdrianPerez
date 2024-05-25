package Gachamiguero1.src;

public class Gachamiguero1 {
    public static void catar(int ingrediente) {
        for (int i = 1; i <= ingrediente; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Gachamiga");
            } else if (i % 3 == 0) {
                System.out.println("Gacha");
            } else if (i % 5 == 0) {
                System.out.println("Miga");
            } else {
                System.out.println(i);
            }
        }
    }
}