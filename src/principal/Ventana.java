package principal;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Component;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.BorderLayout;

public class Ventana extends Panel {
	private static final long serialVersionUID = -001L;
	protected Frame frame = new Frame("Pantalla Colores AOP");
	
	Ventana() {
        frame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {System.exit(0);}
            });
        frame.setVisible(true);

        frame.add(this, BorderLayout.CENTER);
        frame.pack();
        frame.setSize(480,480);
    }

    void addToFrame(Component c) {
        add(c);
    }

}
