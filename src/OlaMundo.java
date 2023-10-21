import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class OlaMundo {
    private JPanel OlaMundo;
    private JButton btnClick;
    private JLabel lblMensagem;
    private boolean alt = true;

    public OlaMundo() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (alt) {
                    lblMensagem.setText("Ola Mundo!");
                    alt = false;
                } else {
                    lblMensagem.setText("Clique!");
                    alt = true;
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("OlaMundo");
        frame.setContentPane(new OlaMundo().OlaMundo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
