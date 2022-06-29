package practicum6a;

import practicum5.Leerling;
import practicum8.Computer;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijngames = new ArrayList<Game>();

    public Persoon(String nm, double bud) {
        this.naam = nm;
        this.budget = bud;
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {
        if (budget <= g.huidigewaarde() || mijngames.contains(g)) {
            return false;
        } else {
            mijngames.add(g);
            return true;
        }

    }

    public boolean equals(Object obj){
        boolean gelijkeObjecten = false;

        if(obj instanceof Persoon ){
            Persoon anderePersoon = (Persoon) obj;

            if(this.naam.equals(anderePersoon.naam) ){
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    public Game zoekGameOpNaam(String game){

        for(Game g:mijngames){
            if(g.getNaam().equals(game))
                return g;

        }
        return null;
    }

    public boolean verkoop(Game g, Persoon koper) {
        if (koper.budget <= g.huidigewaarde() || koper.mijngames.contains(g) || !mijngames.contains(g)) {
            return false;

        } else {
            koper.mijngames.add(g);
            return true;
        }
    }

    public String toString() {
        String s = naam + " heeft een budget van " + String.format("%.2f", budget) + " en bezit de volgende games:" + "\n";
        for (Game game : mijngames) {
            s += game+"\n";
        }
        return s;
    }


}

