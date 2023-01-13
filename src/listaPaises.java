import java.util.Scanner;

public class listaPaises {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String BRASIL = "Brasil(BRA)";
        String ARGENTINA = "Argentina(ARG)";
        String COLOMBIA = "Colombia(COL)";
        String VENEZUELA = "Venezuela(VEN)";
        String PARAGUAY = "Paraguay(PRY)";
        String PERU = "Peru(PER)";
        String URUGUAY = "Uruguay(URY)";
        String CHILE = "Chile(CHL)";
        String BOLIVIA = "Bolivia(BOL)";
        String ECUADOR = "Ecuador(ECU)";

        String r;
        System.out.print("digite o nome ou sigla do País:");
        r = read.next();

        if (r.equals("BRASIL")) {
            System.out.println("seu pais de origem é BRASIL(BRA) 214,3M HABITANTES" + "CAPITAL BRASILIA");
        }
        if (r.equals("ARGENTINA")) {
            System.out.println("seu pais de origem é ARGENTINA(ARG) 13M HABITANTES" + "CAPITAL BUENOS AIRES");
        }

    }
}