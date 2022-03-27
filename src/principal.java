import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class principal extends JFrame {

    public principal(){
        this.setPreferredSize(new Dimension(500,500));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        leerCsv();
    }

    private final String fortnite = "Fortnite";
    private final String minecraft = "Minecraft";
    private final String freeFire = "Free Fire";
    private final String warZone = "WarZone";
    private final String fallGuys = "Fall Guys";
    private final String clashRoyale = "Clash Royale";
    private final String callOfDuty = "Call of Duty";
    private final String LastOfUs = "The last of us";
    private final String godOfWar = "God of War";
    private final String halo = "Halo";
    private final String overwatch = "Overwatch";
    private final String gta = "GTA 5";

    int cFortnite = 0;
    int cMinecraft = 0;
    int cFreeFire = 0;
    int cWarZone = 0;
    int cFallGuys = 0;
    int cClash = 0;
    int cCall = 0;
    int cLastOfUs = 0;
    int cGodWar = 0;
    int cHalo = 0;
    int cOverwatch = 0;
    int cGTA = 0;

    private static String[] datosTemporales;


    private static JFileChooser fileChooser;
    private static File fichero;

    private void leerCsv(){
        fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new java.io.File("/Users/daniel/Desktop"));
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.CSV","csv");

        fileChooser.setFileFilter(filtro);
        int seleccion = fileChooser.showOpenDialog(this);

        //
        String rutaArchivo = "";
        if(seleccion == JFileChooser.APPROVE_OPTION){
            fichero = fileChooser.getSelectedFile();
             rutaArchivo = fichero.getAbsolutePath();
        }

        //
        String linea = "";

        try{
            BufferedReader bf = new BufferedReader(new FileReader(rutaArchivo));
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                linea += bfRead + "\n";
            }

            datosTemporales = linea.trim().split("\n");
            for (String fila :
                    datosTemporales) {
                String[] contenidoTabla;
                contenidoTabla = fila.trim().split(",");
                for (String juego :
                        contenidoTabla) {
                    switch (juego.trim()) {
                        case fortnite:
                            cFortnite++;
                            break;
                        case minecraft:
                            cMinecraft++;
                            break;
                        case freeFire:
                            cFreeFire++;
                            break;
                        case warZone:
                            cWarZone++;
                            break;
                        case fallGuys:
                            cFallGuys++;
                            break;
                        case clashRoyale:
                            cClash++;
                            break;
                        case callOfDuty:
                            cCall++;
                            break;
                        case LastOfUs:
                            cLastOfUs++;
                            break;
                        case godOfWar:
                            cGodWar++;
                            break;
                        case halo:
                            cHalo++;
                            break;
                        case overwatch:
                            cOverwatch++;
                            break;
                        case gta:
                            cGTA++;
                            break;
                        default:
                            System.out.println("No se encontró"+juego);
                            break;
                    }
                }
            }
            System.out.println("Alumnos que jugaron a: "+fortnite+" fue de: "+cFortnite);
            System.out.println("Alumnos que jugaron a: "+minecraft+" fue de: "+cMinecraft);
            System.out.println("Alumnos que jugaron a: "+freeFire+" fue de: "+cFreeFire);
            System.out.println("Alumnos que jugaron a: "+warZone+" fue de: "+cWarZone);
            System.out.println("Alumnos que jugaron a: "+fallGuys+" fue de: "+cFallGuys);
            System.out.println("Alumnos que jugaron a: "+clashRoyale+" fue de: "+cClash);
            System.out.println("Alumnos que jugaron a: "+callOfDuty+" fue de: "+cCall);
            System.out.println("Alumnos que jugaron a: "+gta+"fue de: "+cGTA);
            System.out.println("Alumnos que jugaron a: "+LastOfUs+"fue de: "+cLastOfUs);
            System.out.println("Alumnos que jugaron a: "+godOfWar+" fue de: "+cGodWar);
            System.out.println("Alumnos que jugaron a: "+halo+" fue de: "+cHalo);
            System.out.println("Alumnos que jugaron a: "+overwatch+" fue de: "+cOverwatch);


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {

        new principal().setVisible(true);
    }
}
