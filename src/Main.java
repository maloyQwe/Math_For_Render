import Math.Vector2;
import Math.Vector3;

public class Main {
    public static void main(String[] args) {


        final float[] m1 = {1, 2, 3};
       final  float[] m2 = {4, 5, 6};

        Vector2 v1 = new Vector2(m1);
        Vector3 v2 = new Vector3(m2);


        v1.sum(v2);


    }
}