import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Soma {

    private JPanel Soma;
    private JTextField txtN1;
    private JTextField txtN2;
    private JButton btnSoma;
    private JLabel lblResultado;

    public Soma() {
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int n1 = Integer.parseInt(txtN1.getText());
                int n2 = Integer.parseInt(txtN2.getText());
                int soma = n1 + n2;
                lblResultado.setText(Integer.toString(soma));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Soma");
        frame.setContentPane(new Soma().Soma);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
