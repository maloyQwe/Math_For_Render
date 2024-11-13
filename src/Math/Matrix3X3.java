package Math;

import java.util.Arrays;

public class Matrix3X3 implements Matrix {

    private double[][] matrix;

    public Matrix3X3(double[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Данная матрица не 3x3");
        }
        this.matrix = matrix;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Matrix3X3{\n");
        for (int i = 0; i < 3; i++) {
            sb.append("  ");
            sb.append(Arrays.toString(matrix[i]));
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }


    @Override
    public double[][] getMatrix() {
        return matrix;
    }


    @Override
    public Matrix sum(Matrix other) {
        double[][] nevM = new double[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                nevM[i][j] = matrix[i][j] + other.getMatrix()[i][j];
            }
        }
        return new Matrix3X3(nevM);
    }

    @Override
    public Matrix subtract(Matrix other) {
        double[][] nevM = new double[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                nevM[i][j] = matrix[i][j] - other.getMatrix()[i][j];
            }
        }
        return new Matrix3X3(nevM);
    }

    @Override
    public Vector multiplyOnVector(Vector vector) {
        if (vector == null) {
            throw new IllegalArgumentException("Вектор не может быть null");
        }
        if (!(vector instanceof Vector3)) {
            throw new IllegalArgumentException("Переданный вектор не подходит по размеру");
        }


        double newX = this.matrix[0][0] * vector.getX() + this.matrix[0][1] * vector.getY() + this.matrix[0][2] * vector.getZ();
        double newY = this.matrix[1][0] * vector.getX() + this.matrix[1][1] * vector.getY() + this.matrix[1][2] * vector.getZ();
        double newZ = this.matrix[2][0] * vector.getX() + this.matrix[2][1] * vector.getY() + this.matrix[2][2] * vector.getZ();

        return new Vector3(newX, newY, newZ);
    }

    @Override
    public Matrix multiplyOnMatrix(Matrix other) {
        double[][] nevM = new double[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                nevM[i][j] = matrix[i][0] * other.getMatrix()[0][j] + matrix[i][1] * other.getMatrix()[1][j] + matrix[i][2] * other.getMatrix()[2][j];
            }
        }
        return new Matrix3X3(nevM);


    }

    @Override
    public Matrix transpose() {
        double[][] nevM = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                nevM[i][j] = matrix[j][i];
            }
        }
        return new Matrix3X3(nevM);
    }

    @Override
    public Matrix single() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        return new Matrix3X3(matrix);
    }

    @Override
    public Matrix zero() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = 0;
            }
        }
        return new Matrix3X3(matrix);
    }
}
