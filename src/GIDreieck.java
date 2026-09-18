public class GIDreieck implements Form{
    int seite;

    public GIDreieck(int seite){
        this.seite = seite;
    }
    public GIDreieck(){}

    @Override
    public double flaeche() {
        return Math.sqrt(3) / 4 * seite * seite;
    }

    @Override
    public double umfang() {
        return 3 * seite;
    }

    @Override
    public void info() {
        System.out.println("Gleichseitiges Dreieck mit Seite " + seite);
    }
}
