import java.security.PrivateKey;

public class ExerciseOne {

    public static void main(String[] args)
    {
        Primitiv prim1 = new Primitiv();
        Primitiv.increment();
        System.out.println("F: " + prim1.i);
        prim1.increment();
        System.out.println("Two: " + prim1.i);
    }
}
