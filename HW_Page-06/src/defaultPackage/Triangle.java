package defaultPackage;

public class Triangle {
    private Point A, B, C;

    public Triangle(Point A, Point B, Point C) {
        this.A = A; 
        this.B = B;
        this.C = C;
    }

    private double distanceSquared(Point A, Point B) {
        return Math.pow(A.distanceTo(B), 2);
    }

    public boolean isEquilateral() {
        return A.distanceTo(B) == A.distanceTo(C) &&
               A.distanceTo(B) == B.distanceTo(C);
    }

    public boolean isIsosceles() {
        return A.distanceTo(B) == A.distanceTo(C) || 
               A.distanceTo(B) == B.distanceTo(C) || 
               A.distanceTo(C) == B.distanceTo(C);
    }

    public boolean isAcute() {
        return distanceSquared(B, C) + distanceSquared(A, C) > distanceSquared(A, B) &&
               distanceSquared(A, B) + distanceSquared(A, C) > distanceSquared(B, C) &&
               distanceSquared(A, B) + distanceSquared(B, C) > distanceSquared(A, C);
    }

    public boolean isRight() {
        return distanceSquared(B, C) + distanceSquared(A, C) == distanceSquared(A, B) ||
               distanceSquared(A, B) + distanceSquared(A, C) == distanceSquared(B, C) ||
               distanceSquared(A, B) + distanceSquared(B, C) == distanceSquared(A, C);
    }

    public boolean isObtuse() {
        return distanceSquared(B, C) + distanceSquared(A, C) < distanceSquared(A, B) ||
               distanceSquared(A, B) + distanceSquared(A, C) < distanceSquared(B, C) ||
               distanceSquared(A, B) + distanceSquared(B, C) < distanceSquared(A, C);
    }
}