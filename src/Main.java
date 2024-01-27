import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() ->{
            calculadora calculator = new calculadora();
            calculator.iniciar();
            calculator.operaciones();

        });

    }
}