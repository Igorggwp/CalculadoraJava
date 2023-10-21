import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Divisao {
    private JPanel Divisao;
    private JTextField txtNum;
    private JLabel lblNum;
    private JLabel lblDen;
    private JTextField txtDen;
    private JButton btnDiv;
    private JLabel lblTxtDiv;
    private JLabel lblTxtRes;
    private JLabel lblTxtResDiv;
    private JLabel lblTxtResRes;

    public Divisao() {
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num = Integer.parseInt(txtNum.getText());
                int den = Integer.parseInt(txtDen.getText());
                if (den == 0) {
                    lblTxtResDiv.setText("O DEN nao pode ser 0");
                    lblTxtResRes.setText("Tome mais cuidado!");
                } else if (num > den) {
                    float div = num / den;
                    float res = num % den;
                    lblTxtResDiv.setText(Float.toString(div));
                    lblTxtResRes.setText(Float.toString(res));
                }else {
                    lblTxtResDiv.setText("NUM deve ser > que DEN");
                    lblTxtResRes.setText("Tome mais cuidado!");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Divisao");
        frame.setContentPane(new Divisao().Divisao);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
