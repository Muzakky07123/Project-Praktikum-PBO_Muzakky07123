package View;

import java.awt.*;
import javax.swing.*;

public class Muzakky07123_ViewPemasukanGUI {
    JFrame ViewPemasukan = new JFrame();
    JLabel top;
    
    public Muzakky07123_ViewPemasukanGUI() {
        ViewPemasukan.setSize(720, 600);
        ViewPemasukan.setLayout(null);
        ViewPemasukan.getContentPane().setBackground(Color.GREEN);
        
        top = new JLabel("Hasil Data Pemasukan");
        top.setBounds(10, 10, 350, 50);
        top.setFont(new Font("Matura MT Script Capitals",Font.TRUETYPE_FONT,30));
        ViewPemasukan.add(top);
        
        ViewPemasukan.setVisible(true);
        ViewPemasukan.setLocationRelativeTo(null);
        ViewPemasukan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
