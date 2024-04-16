import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{
  private JLabel etiqueta1, etiqueta2;
  private JCheckBox caja1;
  private JScrollPane deslizador1;
  private JTextArea campo1;
  private JButton boton1, boton2;

 public Licencia(){
  setLayout(null);
  setTitle("Licencia de uso");
  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
  
  etiqueta1 = new JLabel("TÉRMINOS Y CONDICIONES");
  etiqueta1.setBounds(215,5,200,30);
  etiqueta1.setFont(new Font("Andale Mono",1, 14));
  etiqueta1.setForeground(new Color(0,0,0));
  add(etiqueta1);

  campo1 = new JTextArea();
  campo1.setEditable(false);
  campo1.setFont(new Font("Andale Mono", 0,9));
  campo1.setText("\n\n          TÉRMINOS Y CONDICIONES"+
		"\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCI�N SIN AUTORIZACI�N DE LA GEEKIPEDIA DE ERNESTO." +
                  "\n            B.  PROHIBIDA LA ALTERACI�N DEL C�DIGO FUENTE O DISE�O DE LAS INTERFACES GR�FICAS." +
                  "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACI�N RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                  "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
                  "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                  "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                "\n\n          PARA MAYOR INFORMACI�N SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
                  "\n          http://www.youtube.com/ernestoperezm");


  deslizador1 = new JScrollPane(campo1);
  deslizador1.setBounds(10,40,575,200);
  add(deslizador1);

  caja1 = new JCheckBox("Yo Acepto");
  caja1.setBounds(10,250,300,30);
  caja1.addChangeListener(this);
  add(caja1);

  boton1 = new JButton("Continuar");
  boton1.setBounds(10,290,100,30);
  boton1.addActionListener(this);
  boton1.setEnabled(false);
  add(boton1);
  

  boton2 = new JButton("No Acepto");
  boton2.setBounds(120,290,100,30);
  boton2.addActionListener(this);
  boton2.setEnabled(true);
  add(boton2);

  ImageIcon imagen = new ImageIcon("images/coca-cola.png");
  etiqueta2 = new JLabel(imagen);
  etiqueta2.setBounds(315, 135, 300,300); 
  add(etiqueta2);  
  }

  public void stateChanged(ChangeEvent che){

  }

  public void actionPerformed(ActionEvent btn){

  }
  public static void main(String args[]){
    Licencia formulario2 = new Licencia();
    formulario2.setBounds(0,0,600,360);
    formulario2.setVisible(true);
    formulario2.setResizable(false);
    formulario2.setLocationRelativeTo(null);    
  }
}
    