
import processing.core.PApplet;

/**
 * Klasse Wellen1.

 */
public class Wellen1 extends PApplet
{   int s=70; //Seitenlänge der Quadrate 
    int r=s-15; //Position der Kreise wenn rechts
    int l=15; //Position der Kreise wenn links 
    int h=20; //abstand zu den achsen

    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(600,330);
    }        

    // Überlege dir, was die Anweisungen in der Methode "wasZeichneIch" auslösen könnten
    // Verändere die Werte, die den Methoden übergeben werden. Was passiert?
    public void zeichneQuadrate(int x, int y, int farbe, boolean links) { 
        fill (farbe); 
        rect (x, y, s, s); 
        int d=s/4; 
        int a=s/5;
        int b=s-2*a;

        if (farbe==255) { fill(0);} 

        else {fill(255);}    

        if (links==true) {for (int n=0; n<2; n++) 
            { ellipse (x+l, y+a+b*n, d, d); 
            } }
        else  
        { for (int n=0; n<2; n++)
            {
                ellipse (x+r, y+a+b*n, d, d); 
            }
        }

    }

    public void alleQuadrate() {
        noStroke();
        int aktuellefarbe=255;
        boolean pos = true; 
        for (int i=0; i<4; i++) {
            for (int q=0; q<8; q++) {

                zeichneQuadrate(h+s*q,h+s*i,aktuellefarbe,pos); 

                if (aktuellefarbe==255) {aktuellefarbe=0;} else {aktuellefarbe=255;} 

            }

            if (aktuellefarbe==255) {aktuellefarbe=0;} else {aktuellefarbe=255;} 
            if (pos==true) {pos=false;} else {pos=true;}
        }}

    public void linien() {
        for (int w=0; w<3; w++) {
            stroke (050,205,050);
            strokeWeight(3); 
            line(h,h+s+s*w , h+8*s, h+s+s*w); 
            
            
            
        }

    } 

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        
        background (255, 165, 000); 
        alleQuadrate(); 
        linien();
        
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Wellen1.class.getName() });
    }

}
