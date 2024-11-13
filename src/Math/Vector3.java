package Math;

public class Vector3 implements Vector {
    private final double x,y,z;

    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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
        throw new UnsupportedOperationException("Vector3 не имеет координаты W");
    }

    @Override
    public String toString() {
        return "Vector3{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public Vector3 sum( Vector other) {
        final double newX = getX() + other.getX();
        final double newY = getY() + other.getY();
        final double newZ = getZ() + other.getZ();
        return new Vector3(newX, newY, newZ);
    }


    @Override
    public Vector3 subtract( Vector other) {
        final double newX = getX() - other.getX();
        final double newY = getY() - other.getY();
        final double newZ = getZ() - other.getZ();
        return new Vector3(newX, newY, newZ);
    }

    @Override
    public Vector3 multiplyOnScalar( double scalar) {
        final double newX = getX() * scalar;
        final double newY = getY() * scalar;
        final double newZ = getZ() * scalar;

        return new Vector3(newX, newY, newZ);
    }

    @Override
    public Vector3 divisionOnScalar( double scalar) {
        final double newX = getX() / scalar;
        final double newY = getY() / scalar;
        final double newZ = getZ() / scalar;

        return new Vector3(newX, newY, newZ);
    }

    @Override
    public double length(Vector v1) {

        return Math.sqrt(Math.pow(v1.getX(), 2) + Math.pow(v1.getY(), 2) + Math.pow(v1.getZ(), 2));
    }

    @Override
    public Vector3 normalize(Vector v1) {
        double length = length(v1);
        if (length == 0) {
            throw new IllegalArgumentException("Нельзя нормализовать вектор с нулевой длиной");
        }
        final double newX = v1.getX() / length;
        final double newY = v1.getY() / length;
        final double newZ = v1.getZ() / length;
        return new Vector3(newX, newY, newZ);
    }

    @Override
    public double scalarProduct( Vector other) {

        return getX() * other.getX() +getY() * other.getY() + getZ() * other.getZ();
    }
        //векторное произведение
    public Vector3 vectorProduct(Vector v1, Vector v2) {
        double newX = v1.getY() * v2.getZ() - v2.getY() * v1.getZ();
        double newY = v1.getX() * v2.getZ() - v2.getX() * v1.getZ();
        double newZ = v1.getX() * v2.getY() - v2.getX() * v1.getY();

        return new Vector3(newX, -newY, newZ);
    }


}
