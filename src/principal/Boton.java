package principal;
import java.awt.Color;

class Boton extends java.awt.Button {

	private static final long serialVersionUID = -002L;
	static final Color  defaultBackgroundColor = Color.lightGray;
    static final Color  defaultForegroundColor = Color.BLACK;
    static final String defaultText = "Aceptar";
    
    Boton(Ventana ventana) {
    	
        super();
        setLabel(defaultText);
        setBackground(defaultBackgroundColor);
        setForeground(defaultForegroundColor);
        ventana.addToFrame(this);
    }
}