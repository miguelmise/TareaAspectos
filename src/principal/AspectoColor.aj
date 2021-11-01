package principal;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public aspect AspectoColor {
	File file = new File("logColorBackground.txt");
	pointcut colorN(): call(* colorNaranja(..)); 
    pointcut colorV(): call(* colorVerde(..)); 
    pointcut colorR(): call(* colorRosa(..)); 
    
    after():colorN() {
    	logColor("Naranja");
    }
    after(): colorV() {
    	logColor("Verde");
    }
    after():colorR(){
    	logColor("Rosado");
    }
    
    public void logColor(String color) {
    	try
        {
        	BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
            Calendar cal = Calendar.getInstance();
        	if(!file.exists()){
         	   file.createNewFile();
         	}
        	Date fecha = cal.getTime();
        	SimpleDateFormat DateFor = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        	String stringDate= DateFor.format(fecha);
        	stringDate = DateFor.format(fecha);
            bw.write("Detectado cambio color fondo a"+ color + "| Actualizado:" + stringDate + "\n");
            bw.close();
            System.out.println("Detectado cambio color fondo a "+ color + "| Actualizado:" + stringDate + "\n");
            
        } catch (Exception e) {
        	System.out.println("Error contacte al administrador.");
        }
    }

}
