public class Main {
    public static void main(String[] args) {
        Form[] forms = {
                new Kreis(5),
                new Kreis(10),

                new Quadrat(4),
                new Quadrat(8),

                new GIDreieck(3),
                new GIDreieck(6)
        };

        for (Form form : forms){
            form.info();

            System.out.println("Fläche: " + form.flaeche());
            System.out.println("Umfang: " + form.umfang());

            System.out.println();
        }
    }
}