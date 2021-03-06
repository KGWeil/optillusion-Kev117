//$PKGLINE
import processing.core.PApplet;

/**
 * Klasse ProcessingTmpl.
 * Beschreibung: Template einer Processing Klasse. Kopieren und "ProcessingTmpl" durch eigenen Namen erstezen.
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ProcessingTmpl extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(1000,1000);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {

    }

    public void zeichneQuadrate()
      { 
            for(int i=0; i<10; i++) {
                rect(50+i*50, 50, 50, 50);

            }

        }

        public void zeichneKreise()
        {for (int i=0; i<20; i++) {
            ellipse(300, 500, 400-20*i, 400-20*i);
        }}
        
        /**
         * Die draw() Methode wird nach der setup() Methode aufgerufen
         * und führt den Code innerhalb ihres Blocks fortlaufend aus,
         * bis das Programm gestoppt oder noLoop() aufgerufen wird.
         */
        @Override
        public void draw()
        {zeichneQuadrate();
         zeichneKreise(); 

        }

        /**
         * Mit der main()-Methode wird das Programm gestartet.
         *
         */	
        public static void main(String _args[]){ 
        PApplet.main(new String[] {ProcessingTmpl.class.getName() });
    }

}
