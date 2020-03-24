
import processing.core.PApplet;

/**
 * Klasse Hermanngitter2.
 * Beschreibung: Code lesen und verstehen.
 *
 * @author Simon Gebert 
 * @version Feb2020
 */
public class Hermanngitter2 extends PApplet
{       
    int s=50; //Seitenlänge der Quadrate
    int a=10; //Abstand der Quadrate
    int x=50; //x-Achsenwert 
    int y=40; //y-Achsenwert 
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500,500);
    }        


    public void quadrate() {
       fill(0); 
       for (int q=0; q<7; q++) {
       for (int i=0; i<7; i++){
       
           rect(x+a*i+s*i, y+a*q+s*q, s, s);
           
         
        }
    } }

    public void kreise() { 
        fill(255); 
        stroke (255); 
        for (int p=0; p<6; p++) {
        for (int k=0; k<6; k++) {
            
            ellipse(x+s+a/2+k*s+k*a, y+s+a/2+s*p+a*p, a, a); 
        }
        
        
    }}
    
    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(000,191,255);
        quadrate();
        kreise(); 
       
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Hermanngitter2.class.getName() });
    }

}
