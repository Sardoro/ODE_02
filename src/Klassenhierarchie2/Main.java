package Klassenhierarchie2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Form> forms = new ArrayList<>();

        forms.add(new Kreis());
        forms.add(new Kreis(10));
        forms.add(new Quadrat());
        forms.add(new Quadrat(8));
        forms.add(new GIDreieck());
        forms.add(new GIDreieck(6));

        //Reihenfolge der Fläche (von klein nach groß) aus.
        forms.sort((form1, form2) ->
                Double.compare(form1.flaeche(), form2.flaeche())
        );

        //direkt aus der Colleektions ausgeben
        forms.get(forms.size() - 1).info();

    }
}