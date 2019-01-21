
public class alternativeggt {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        if (args.length <= 1)
            return;
            int zahl1 = Integer.parseInt(args[0]);
            int zahl2 = Integer.parseInt(args[1]);
            // Mit der kleinsten uebergebenen Zahl als Teiler starten.
            int ggt = zahl1 <= zahl2 ? zahl1 : zahl2;
            // Solange ggt nicht beide Zahlen z1 und z2 teilt,
            // verringere ggt um eins.
            // Die Schleife bricht spaetestens bei ggt == 1 ab.
            while ((zahl1 % ggt) != 0 || (zahl2 % ggt) != 0) {
            ggt = ggt - 1;
            }
            switch (ggt) {
            case 1:
            System.out.println("Der GGT ist 1.");
            break;
            case 2:
            System.out.println("Der GGT ist 2.");
            break;
            case 3:
            System.out.println("Der GGT ist 3.");
            break;
            case 4:
            System.out.println("Der GGT ist 4.");
            break;
            default:
            System.out.println("Der GGT ist groesser als 4.");
            }
            }
            
    }


