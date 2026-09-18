import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Form> forms = new ArrayList<>();

        forms.add(new Kreis(5));
        forms.add(new Kreis(10));
        forms.add(new Quadrat(4));
        forms.add(new Quadrat(8));
        forms.add(new GIDreieck(3));
        forms.add(new GIDreieck(6));

        for (Form form : forms){
            form.info();
            System.out.println("Fläche: " + form.flaeche());
            System.out.println("Umfang: " + form.umfang());
            System.out.println();
        }
    }
}