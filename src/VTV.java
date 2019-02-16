import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class VTV{

    public static int a = 1, b = 100, p = 0, h;
    static Random random = new Random();
    static int r = 0 + random.nextInt(100);
   static JFrame f1 = new JFrame();
    static JPanel p1 = new JPanel();
   static TextField t1 = new TextField();

   static JButton b1 = new JButton("Ввод");
   static JButton b2 = new JButton("Вывод");

    public static void main(String[] args) {


        t1.setText("Введи число");
        // p1.setSize(400,50);
        f1.setSize(400, 300);
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new BorderLayout());

        System.out.println(r);

        p1.add(b1, FlowLayout.LEFT);
        p1.add(b2, FlowLayout.LEFT);

        f1.add(t1, BorderLayout.CENTER);
        f1.add(p1, BorderLayout.PAGE_END);

        f1.setVisible(true);


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = (t1.getText());
                h = Integer.parseInt(a);
                telo();
            }
        });

    }
    public static void telo() {

        for (; p == 0; ) {
            if (h == r) {
                t1.setText("");
                t1.setText("Вы победили!");
                p = 1;
                break;
            } else if (h > r) {
                t1.setText("");
                t1.setText("Меньше");
                break;

            } else if (h < r) {
                t1.setText("");
                t1.setText("Больше");
                break;
            }

        }
    }

}
