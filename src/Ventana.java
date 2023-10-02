import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel TOPANEL;
    private JLabel Lbdtentero;
    private JTextField txtnumero;
    private JButton btninsertar;
    private JButton btnlistar;
    private JButton btnsacar;
    private JButton btnconsultar;
    private JTextArea txtlistarelementos;

    private Pila coleccion= new Pila();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().TOPANEL);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Ventana() {
        btninsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                coleccion.insertar(Integer.parseInt(txtnumero.getText()));
                JOptionPane.showMessageDialog(null,"Insertado Correctamente");
            }

        });


        btnsacar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JOptionPane.showMessageDialog(null,"Eliminado"
                            +coleccion.eliminar()); }catch( Exception ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
                }



        });

        btnconsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               try{
                   JOptionPane.showMessageDialog(null,"cima:"
                           +coleccion.consultarTope());
               } catch (Exception ex){
                   JOptionPane.showMessageDialog(null,ex.getMessage());
               }
            }
        });

        btnlistar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtlistarelementos.setText(coleccion.toString());
            }
        });

    }
}
