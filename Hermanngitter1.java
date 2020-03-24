
import processing.core.PApplet;

/**
 * Klasse Hermanngitter1.
 * Beschreibung: Code lesen und verstehen.
 *
 * @author Simon Gebert 
 * @version Feb2020
 */
public class Hermanngitter1 extends PApplet
{       
    int s=50;
    int a=10; 
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500,500);
    }        

    // Überlege dir, was die Anweisungen in der Methode "wasZeichneIch" auslösen könnten
    // Verändere die Werte, die den Methoden übergeben werden. Was passiert?
    public void quadrate() {
       fill(0); 
       for (int q=0; q<7; q++) {
       for (int i=0; i<7; i++){
       
           rect(40+a*i+s*i, 30+a*q+s*q, s, s);
           
         
        }
    } }

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(255);
        quadrate();
       
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Hermanngitter1.class.getName() });
    }

}
