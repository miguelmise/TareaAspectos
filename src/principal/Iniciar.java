package principal;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Iniciar {
	static Ventana ventana = new Ventana();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boton boton1 = new Boton(ventana);
        Boton boton2 = new Boton(ventana);
        Boton boton3 = new Boton(ventana);
        boton1.setBackground(Color.orange);
        boton1.setLabel("Naranja");
        boton2.setBackground(Color.green);
        boton2.setLabel("Verde");
        boton3.setBackground(Color.pink);
        boton3.setLabel("Rosado");
        
        boton1.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        		colorNaranja();
		}  
		});
        boton2.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        		colorVerde();
		}  
		});
        boton3.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        	colorRosa();
		}  
		});
    	}    
	    public static void colorNaranja(){
			ventana.setBackground(Color.orange);
	    }
	    public static void colorRosa(){
			ventana.setBackground(Color.pink);
	    }
	    public static void colorVerde(){
			ventana.setBackground(Color.green);
	    }

}
