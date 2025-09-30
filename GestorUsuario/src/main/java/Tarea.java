import javax.swing.*;

public class Tarea {
    private JPanel PanelPrincipal;
    private JPanel navpanel;
    private JPanel logopanel;
    private JButton dashboardButton;
    private JButton usuariosButton;
    private JButton informeButton;
    private JButton ajustesButton;
    private JButton ayudaButton;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JCheckBox activoCheckBox;
    private JTextField textField3;
    private JButton cancelarButton;
    private JButton guardarButton;
    private JButton limpiarButton;
    private JTabbedPane tabbedPane1;
    private JTabbedPane tabbedPane2;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tarea");
        frame.setContentPane(new Tarea().PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
