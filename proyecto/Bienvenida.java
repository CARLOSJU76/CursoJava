import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{
  private JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4;
  private JTextField campo1;
  private JButton boton1;

  public Bienvenida(){
    setLayout(null);
    setTitle("Bienvenidos");
    getContentPane().setBackground(new Color(255,0, 0));//Poner fondo de la interfaz rojo.
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    
   ImageIcon imagen = new ImageIcon("images/logo-coca.png");
   etiqueta1= new JLabel(imagen);
   etiqueta1.setBounds(25,15,300,150);
   add(etiqueta1);

   etiqueta2 = new JLabel("Sistema de Control Vacacional");
   etiqueta2.setBounds(35,135,300,30);
   etiqueta2.setFont(new Font("Andale Mono", 3, 18));
   etiqueta2.setForeground(new Color(255,255,255));
   add(etiqueta2);

   etiqueta3 = new JLabel("Ingrese su nombre");
   etiqueta3.setBounds(45,212,200,30);
   etiqueta3.setFont(new Font("Andale Mono", 1, 12));
   etiqueta3.setForeground(new Color(255,255,255));
   add(etiqueta3);

   etiqueta4 = new JLabel("2017 the Coca-Cola Company");
   etiqueta4.setBounds(85,375,300,30);
   etiqueta4.setFont(new Font("Andale Mono", 1, 12));
   etiqueta4.setForeground(new Color(255,255,255));
   add(etiqueta4);

   campo1 = new JTextField();
   campo1.setBounds(45,240,255,25);
   campo1.setBackground(new Color(224,224,224));
   campo1.setFont(new Font("Andale Mono", 1,14));
   campo1.setForeground(new Color(255,0,0));
   add(campo1);

   boton1= new JButton("Ingresar");
   boton1.setBounds(125,280,100,30);
   boton1.setBackground(new Color(255,255,255));
   boton1.setFont(new Font("Andale Mono", 1, 14));
   boton1.setForeground(new Color(255,0,0));
   boton1.addActionListener(this);
   add(boton1);      
    
  }
  public void actionPerformed(ActionEvent btn){
    if(btn.getSource() == boton1){
    }
  }
  public static void main(String args[]){
    Bienvenida formulario1 = new Bienvenida();
    formulario1.setBounds(0,0,350,450);
    formulario1.setVisible(true);
    formulario1.setResizable(false);
    formulario1.setLocationRelativeTo(null);
    
  }
}