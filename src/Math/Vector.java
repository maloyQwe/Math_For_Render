package Math;

public interface Vector {
    Vector sum(Vector other);

    Vector subtract(Vector other);

    Vector multiplyOnScalar( double scalar);

    Vector divisionOnScalar( double scalar);

    double length(Vector v1);

    Vector normalize(Vector v1);

    //скалярное произведение
    double scalarProduct( Vector other);

    double getX();

    double getY();

    double getZ();

    double getW();


}
