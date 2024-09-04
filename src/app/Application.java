package app;

import java.util.ArrayList;
import models.Personne;
public class Application {

    public static void main(String[] args) {
        ArrayList<Personne> listPersonne= new ArrayList<>();
        listPersonne.add(new Personne("bob", "marcel", "rue du pont", "villars", 1578));
        listPersonne.add(new Personne("bob2", "marcel", "rue du pont", "villars", 1578));
        listPersonne.add(new Personne("bob3", "marcel", "rue du pont", "villars", 1578));

        for (Personne personne : listPersonne) {
            System.out.println(personne.getNom());
        }

    }

}
