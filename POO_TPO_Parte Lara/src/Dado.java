import java.util.Random;

public class Dado {
    private static final Random random = new Random();

    public static int lanzar(){  //El dado será utilizado tanto por enemigos como por el jugador para simbolizar las chances
        return random.nextInt(20)+1;
    }
}