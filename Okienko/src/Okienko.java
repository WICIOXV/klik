import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Date;

public class Okienko extends JFrame implements ActionListener {
    JButton guzik;
    JLabel ekran;

    public Okienko() {

        setSize(300, 200);
        setTitle("Moje pierwsze okienko");
        setLayout(null);
        JButton guzik = new JButton("Kliknij");
        guzik.setBounds(100, 50, 100, 20);
        add(guzik);
        guzik.addActionListener(this);
        ekran = new JLabel("Liczba kliknięć :");
        ekran.setBounds(75, 75, 100, 20);
        add(ekran);

    }

    public static void main(String[] args) {
        Okienko okno = new Okienko();
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object x = e.getSource();
        int klik =0;int w;
        do {
            w = klik + 1;
            ekran.setText("Liczba kliknięć: " + w);
        } while
            (x == guzik);

    }
}














