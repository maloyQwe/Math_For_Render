package Math;

public class Vector4 implements Vector {
    private final double x,y,z,w;


    public Vector4(double x, double y, double z, double w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }


    @Override
    public double getX() {
        return x;
    }
    @Override
    public double getY() {
        return y;
    }

    @Override
    public double getZ() {
        return z;
    }

    @Override
    public double getW() {
       return w;
    }


    @Override
    public Vector4 sum(Vector other) {
        final double newX = getX() + other.getX();
        final double newY = getY() + other.getY();
        final double newZ = getZ() + other.getZ();
        final double newW = getW() + other.getW();
        return new Vector4(newX, newY,newZ,newW);
    }



    @Override
    public Vector4 subtract( Vector other) {
        final double newX = getX() - other.getX();
        final double newY = getY() - other.getY();
        final double newZ = getZ() - other.getZ();
        final double newW = getW() - other.getW();
        return new Vector4(newX, newY,newZ,newW);
    }

    @Override
    public Vector4 multiplyOnScalar( double scalar) {
        final double newX = getX() * scalar;
        final double newY = getY() * scalar;
        final double newZ = getZ() * scalar;
        final double newW = getW() * scalar;

        return new Vector4(newX, newY,newZ,newW);
    }

    @Override
    public Vector4 divisionOnScalar( double scalar) {
        final double newX = getX() / scalar;
        final double newY = getY() / scalar;
        final double newZ = getZ() / scalar;
        final double newW = getW() / scalar;

        return new Vector4(newX, newY,newZ,newW);
    }

    @Override
    public double length(Vector v1) {

        return Math.sqrt(Math.pow(v1.getX(), 2) + Math.pow(v1.getY(), 2)+Math.pow(v1.getZ(), 2)+Math.pow(v1.getW(), 2));
    }

    @Override
    public Vector4 normalize(Vector v1) {
        double length = length(v1);
        if (length == 0) {
            throw new IllegalArgumentException("Нельзя нормализовать вектор с нулевой длиной");
        }
        final double newX = v1.getX() / length;
        final double newY = v1.getY() / length;
        final double newZ = v1.getZ() / length;
        final double newW = v1.getW() / length;
        return new Vector4(newX, newY,newZ,newW);
    }

    @Override
    public double scalarProduct( Vector other) {

        return getX() * other.getX() + getY() * other.getY()+getZ() * other.getZ()+getW() * other.getW();
    }


}
