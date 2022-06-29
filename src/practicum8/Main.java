package practicum8;

public class Main {
    public static void main(String[] args) {
        BedrijfsInventaris b1 = new BedrijfsInventaris("bandolero",200);

        Computer c1 = new Computer("lenovo","333-aaa",800,2016);
        Computer c2 = new Computer("lenovo","333-aaa",800,2016);
        Computer c3 = new Computer("asus","aaa-333",1200,2010);


        Auto a1 = new Auto("ford",3000,2010,"fff-gd23");
        Auto a2 = new Auto("ford",3000,2010,"fff-gd23");
        Auto a3 = new Auto("ferrari",10000,2013,"ggg-dg32");


        Fiets f1 = new Fiets("meeuw",500,2015,12345);
        Fiets f2 = new Fiets("meeuw",500,2015,12345);
        Fiets f3 = new Fiets("lol",100,2010,54321);

        b1.schafAan(c1);
        b1.schafAan(c2);
        b1.schafAan(c3);
        b1.schafAan(a1);
        b1.schafAan(a2);
        b1.schafAan(a3);
        b1.schafAan(f1);
        b1.schafAan(f2);
        b1.schafAan(f3);

        System.out.println(b1);
        System.out.println(Utils.euroBedrag(f1.huidigeWaarde()));



    }
}
