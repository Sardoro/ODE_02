package Klassenhierarchie2;

public class Kreis implements Form {

    int radius;

    public Kreis(int radius) {
        this.radius = radius;
    }
    public Kreis(){}

    public double flaeche(){
        return Math.PI * radius * radius;
    }

    public double umfang(){
        return 2 * Math.PI * radius;
    }

    public void info(){
        System.out.println("Kreis mit Radius " + radius);
    }
}