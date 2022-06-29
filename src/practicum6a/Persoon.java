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
        if (budget < g.huidigeWaarde() || mijngames.contains(g)) {
            return false;
        } else {
            this.budget -= g.huidigeWaarde();
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
        if (koper.budget < g.huidigeWaarde() || koper.mijngames.contains(g) || !mijngames.contains(g)) {
            return false;

        } else {
            this.budget+=g.huidigeWaarde();
            koper.budget-=g.huidigeWaarde();
            mijngames.remove(g);
            koper.mijngames.add(g);
            return true;
        }
    }

    public String toString() {
        String s = naam + " heeft een budget van €" + String.format("%.2f", budget) + " en bezit de volgende games:";
        s.replaceAll("\\.",",");
        for (Game game : mijngames) {
            s = s + "\n" + game;
        }
        return s;
    }


}

