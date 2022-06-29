package practicum7;

public class NextLineProces implements OpmaakProces{

    public NextLineProces(){}

    public String MaakOp(String input) {
        return input.replace(" ","\n");
    }
}
