package oefen;

public class Main {
    public static void main(String[] args){
        Rekening r1 = new Rekening( 12345678);
        Rekening r2 = new Rekening(131243523);
        Rekening r3 = new Rekening(121312324);

        r1.neemOp(4554);
        r2.stort(234);
        r3.stort(43342);


        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
