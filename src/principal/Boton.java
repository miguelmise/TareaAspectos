package principal;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Boton.this.click();
                }
            });
        ventana.addToFrame(this);
    }

    public void click() {
    	consola();
    }
    
    public void consola() {
    	System.out.println("Cambio color de fondo a "+this.getLabel());
    }
    
}