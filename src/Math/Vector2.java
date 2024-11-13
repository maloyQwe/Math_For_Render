package Math;

public class Vector2 implements Vector {
    private final double x,y;

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Vector2{" +
                "x=" + x +
                ", y=" + y +
                '}';
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
        throw new UnsupportedOperationException("Vector2 не имеет координаты Z");
    }

    @Override
    public double getW() {
        throw new UnsupportedOperationException("Vector2 не имеет координаты W");
    }

    @Override
    public Vector2 sum(Vector other ) {
        final double newX = getX() + other.getX();
        final double newY = getY() + other.getY();
        return new Vector2(newX, newY);
    }


    @Override
    public Vector2 subtract(Vector other) {
        final double newX = getX() - other.getX();
        final double newY = getY() - other.getY();
        return new Vector2(newX, newY);
    }

    @Override
    public Vector2 multiplyOnScalar( double scalar) {
        final double newX = getX() * scalar;
        final double newY = getY() * scalar;

        return new Vector2(newX, newY);
    }

    @Override
    public Vector2 divisionOnScalar( double scalar) {
        final double newX = getX() / scalar;
        final double newY = getY() / scalar;

        return new Vector2(newX, newY);
    }

    @Override
    public double length(Vector v1) {

        return Math.sqrt(Math.pow(v1.getX(), 2) + Math.pow(v1.getY(), 2));
    }

    @Override
    public Vector2 normalize(Vector v1) {
        double length = length(v1);
        if (length == 0) {
            throw new IllegalArgumentException("Нельзя нормализовать вектор с нулевой длиной");
        }
        final double newX = v1.getX() / length;
        final double newY = v1.getY() / length;
        return new Vector2(newX, newY);
    }

    @Override
    public double scalarProduct( Vector other) {

        return getX() * other.getX() + getY() * other.getY();
    }


}
