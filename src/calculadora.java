import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora extends JFrame{
    private JTextField txtval1;
    private JTextField txtval2;
    private JTextField txtval3;
    private JButton plusButton;
    private JButton minusButton;
    private JButton multiplicationButton;
    private JButton divideButton;
    private JButton porcentButton;
    private JButton sinButton;
    private JButton cosButton;
    private JButton tanButton;
    private JButton sqrtButton;
    private JButton expButton;
    private JButton eButton;
    private JButton piButton;
    private JButton arccosButton;
    private JButton arctanButton;
    private JButton arcsenButton;
    private JButton limpiarButton;
    private JPanel panel1;


    public calculadora() {
        super("Calculadora");
        setContentPane(panel1);



    }


    public void iniciar(){
        setLocationRelativeTo(null);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    public void operaciones(){
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtval1.setText("");
                txtval2.setText("");
                txtval3.setText("");

            }
        });
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double val1 = Double.parseDouble(txtval1.getText());
                    double val2 = Double.parseDouble(txtval2.getText());
                    double resultado = val1 + val2;
                    String resultado_string = Double.toString(resultado);
                    txtval3.setText(resultado_string);
                }catch (Exception error){
                    txtval3.setText("Error al ingresar los datos");
                }
            }
        });

        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double val1 = Double.parseDouble(txtval1.getText());
                    double val2 = Double.parseDouble(txtval2.getText());
                    double resultado = val1 - val2;
                    String resultado_string = Double.toString(resultado);
                    txtval3.setText(resultado_string);
                }catch (Exception error){
                    txtval3.setText("Error al ingresar los datos");
                }
            }
        });

        multiplicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double val1 = Double.parseDouble(txtval1.getText());
                    double val2 = Double.parseDouble(txtval2.getText());
                    double resultado = val1 * val2;
                    String resultado_string = Double.toString(resultado);
                    txtval3.setText(resultado_string);
                } catch (Exception error) {
                    txtval3.setText("Error al ingresar los datos");
                }
            }
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double val1 = Double.parseDouble(txtval1.getText());
                    double val2 = Double.parseDouble(txtval2.getText());
                    double resultado = val1 / val2;
                    String resultado_string = Double.toString(resultado);
                    txtval3.setText(resultado_string);
                }catch (Exception error){
                    txtval3.setText("Error al ingresar los datos");
                }
            }
        });


        sqrtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double val1 = Double.parseDouble(txtval1.getText());
                    double resultado = Math.sqrt(val1)  ;
                    String resultado_string = Double.toString(resultado);
                    txtval3.setText(resultado_string);
                }catch (Exception error){
                    txtval3.setText("Error al ingresar los datos");
                }
            }
        });

        expButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double val1 = Double.parseDouble(txtval1.getText());
                    double resultado = Math.pow(val1,2);
                    String resultado_string = Double.toString(resultado);
                    txtval3.setText(resultado_string);
                }catch (Exception error){
                    txtval3.setText("Error al ingresar los datos");
                }
            }
        });

        porcentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double val1 = Double.parseDouble(txtval1.getText());
                    double resultado = val1* 0.01;
                    String resultado_string = Double.toString(resultado);
                    txtval3.setText(resultado_string);
                }catch (Exception error){
                    txtval3.setText("Error al ingresar los datos");
                }
            }
        });

        piButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double val1 = Double.parseDouble(txtval1.getText());
                    txtval1.getText();
                    txtval1.setText(val1+"π");
                    double resultado = val1* 3.14159265359;
                    String resultado_string = Double.toString(resultado);
                    txtval3.setText(resultado_string);

                }catch (Exception error){
                    txtval3.setText("Error al ingresar los datos");
                }
            }
        });

        eButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    double val1 = Double.parseDouble(txtval1.getText());
                    txtval1.getText();
                    txtval1.setText(val1+"e");
                    double resultado = val1*2.71828182846;
                    String resultado_string = Double.toString(resultado);
                    txtval3.setText(resultado_string);

                }catch (Exception error){
                    txtval3.setText("Error al ingresar los datos");
                }
            }
        });


        sinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double val1 = Double.parseDouble(txtval1.getText());
                    txtval1.getText();
                    txtval1.setText("sin("+val1+")");
                    double resultado = Math.sin(val1);
                    String resultado_string = Double.toString(resultado);
                    txtval3.setText(resultado_string+" rad");

                }catch (Exception error){
                    txtval3.setText("Error al ingresar los datos");
                }
            }
        });

        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double val1 = Double.parseDouble(txtval1.getText());
                    txtval1.getText();
                    txtval1.setText("cos("+val1+")");
                    double resultado = Math.cos(val1);
                    String resultado_string = Double.toString(resultado);
                    txtval3.setText(resultado_string+" rad");

                }catch (Exception error){
                    txtval3.setText("Error al ingresar los datos");
                }
            }
        });

        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double val1 = Double.parseDouble(txtval1.getText());
                    txtval1.getText();
                    txtval1.setText("tan("+val1+")");
                    double resultado = Math.tan(val1);
                    String resultado_string = Double.toString(resultado);
                    txtval3.setText(resultado_string+" rad");

                }catch (Exception error){
                    txtval3.setText("Error al ingresar los datos");
                }
            }
        });

        arcsenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double val1 = Double.parseDouble(txtval1.getText());
                    txtval1.getText();
                    txtval1.setText("arcsin("+val1+")");
                    double resultado = Math.asin(val1);
                    String resultado_string = Double.toString(resultado);
                    txtval3.setText(resultado_string+" rad");

                }catch (Exception error){
                    txtval3.setText("Error al ingresar los datos");
                }
            }
        });
        arccosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double val1 = Double.parseDouble(txtval1.getText());
                    txtval1.getText();
                    txtval1.setText("arccos("+val1+")");
                    double resultado = Math.acos(val1);
                    String resultado_string = Double.toString(resultado);
                    txtval3.setText(resultado_string+" rad");

                }catch (Exception error){
                    txtval3.setText("Error al ingresar los datos");
                }
            }
        });
        arctanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double val1 = Double.parseDouble(txtval1.getText());
                    txtval1.getText();
                    txtval1.setText("arctan("+val1+")");
                    double resultado = Math.atan(val1);
                    String resultado_string = Double.toString(resultado);
                    txtval3.setText(resultado_string+" rad");

                }catch (Exception error){
                    txtval3.setText("Error al ingresar los datos");
                }
            }
        });

    }
}
