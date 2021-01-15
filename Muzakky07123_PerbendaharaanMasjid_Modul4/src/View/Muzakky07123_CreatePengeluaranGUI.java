package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class Muzakky07123_CreatePengeluaranGUI {
    JFrame CreatePengeluaran = new JFrame();
    JLabel top,labelbulanout,labelibadah,labelkitab,labeltpa,labelkaddrah,labelkebersihan,labellistrik,labelair,labelsarana,labelkonsumsi,labeliventaris,labellainlain;
    JTextField textbulanout,textibadah,textkitab,texttpa,textkaddrah,textkebersihan,textlistrik,textair,textsarana,textkonsumsi,textiventaris,textlainlain;
    JButton create,back;
    
    public Muzakky07123_CreatePengeluaranGUI() {
        CreatePengeluaran.setSize(700, 670);
        CreatePengeluaran.setLayout(null);
        CreatePengeluaran.getContentPane().setBackground(Color.GREEN);
        
        top = new JLabel("Rekam Data Pengeluaran");
        top.setBounds(10, 10, 400, 50);
        top.setFont(new Font("Matura MT Script Capitals",Font.TRUETYPE_FONT,30));
        CreatePengeluaran.add(top);
        
        labelbulanout = new JLabel("Bulan");
        labelbulanout.setBounds(490, 50, 50, 20);
        labelbulanout.setFont(new Font("Consolas",Font.BOLD,17));
        CreatePengeluaran.add(labelbulanout);
        
        textbulanout = new JTextField();
        textbulanout.setBounds(540, 50, 100, 20);
        textbulanout.setFont(new Font("Consolas",Font.TRUETYPE_FONT,17));
        CreatePengeluaran.add(textbulanout);
        
        labelibadah = new JLabel("Kegiatan Ibadah       : Rp.");
        labelibadah.setBounds(20, 100, 300, 30);
        labelibadah.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        CreatePengeluaran.add(labelibadah);
        
        textibadah = new JTextField();
        textibadah.setBounds(320, 100, 300, 30);
        textibadah.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        CreatePengeluaran.add(textibadah);
        
        labelkitab = new JLabel("Kegiatan Ngaji Kitab  : Rp.");
        labelkitab.setBounds(20, 140, 300, 30);
        labelkitab.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        CreatePengeluaran.add(labelkitab);
        
        textkitab = new JTextField();
        textkitab.setBounds(320, 140, 300, 30);
        textkitab.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        CreatePengeluaran.add(textkitab);
        
        labeltpa = new JLabel("Kegiatan TPA          : Rp.");
        labeltpa.setBounds(20, 180, 300, 30);
        labeltpa.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        CreatePengeluaran.add(labeltpa);
        
        texttpa = new JTextField();
        texttpa.setBounds(320, 180, 300, 30);
        texttpa.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        CreatePengeluaran.add(texttpa);
        
        labelkaddrah = new JLabel("Kegiatan Kader/Hadrah : Rp.");
        labelkaddrah.setBounds(20, 220, 300, 30);
        labelkaddrah.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        CreatePengeluaran.add(labelkaddrah);
        
        textkaddrah = new JTextField();
        textkaddrah.setBounds(320, 220, 300, 30);
        textkaddrah.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        CreatePengeluaran.add(textkaddrah);
        
        labelkebersihan = new JLabel("Kebersihan            : Rp.");
        labelkebersihan.setBounds(20, 260, 300, 30);
        labelkebersihan.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        CreatePengeluaran.add(labelkebersihan);
        
        textkebersihan = new JTextField();
        textkebersihan.setBounds(320, 260, 300, 30);
        textkebersihan.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        CreatePengeluaran.add(textkebersihan);
        
        labellistrik = new JLabel("Listrik PLN           : Rp.");
        labellistrik.setBounds(20, 300, 300, 30);
        labellistrik.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        CreatePengeluaran.add(labellistrik);
        
        textlistrik = new JTextField();
        textlistrik.setBounds(320, 300, 300, 30);
        textlistrik.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        CreatePengeluaran.add(textlistrik);
        
        labelair = new JLabel("Air PDAM              : Rp.");
        labelair.setBounds(20, 340, 300, 30);
        labelair.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        CreatePengeluaran.add(labelair);
        
        textair = new JTextField();
        textair.setBounds(320, 340, 300, 30);
        textair.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        CreatePengeluaran.add(textair);
        
        labelsarana = new JLabel("Pemeliharaan Sarana   : Rp.");
        labelsarana.setBounds(20, 380, 300, 30);
        labelsarana.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        CreatePengeluaran.add(labelsarana);
        
        textsarana = new JTextField();
        textsarana.setBounds(320, 380, 300, 30);
        textsarana.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        CreatePengeluaran.add(textsarana);
        
        labelkonsumsi = new JLabel("Konsumsi              : Rp.");
        labelkonsumsi.setBounds(20, 420, 300, 30);
        labelkonsumsi.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        CreatePengeluaran.add(labelkonsumsi);
        
        textlistrik = new JTextField();
        textlistrik.setBounds(320, 420, 300, 30);
        textlistrik.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        CreatePengeluaran.add(textlistrik);
        
        labeliventaris = new JLabel("Iventaris             : Rp.");
        labeliventaris.setBounds(20, 460, 300, 30);
        labeliventaris.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        CreatePengeluaran.add(labeliventaris);
        
        textiventaris = new JTextField();
        textiventaris.setBounds(320, 460, 300, 30);
        textiventaris.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        CreatePengeluaran.add(textiventaris);
        
        labellainlain = new JLabel("Lain-Lain             : Rp.");
        labellainlain.setBounds(20, 500, 300, 30);
        labellainlain.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        CreatePengeluaran.add(labellainlain);
        
        textlainlain = new JTextField();
        textlainlain.setBounds(320, 500, 300, 30);
        textlainlain.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        CreatePengeluaran.add(textlainlain);
        
        create = new JButton("Create");
        create.setBounds(550, 570, 100, 30);
        create.setBackground(Color.LIGHT_GRAY);
        CreatePengeluaran.add(create);
        
        back = new JButton("Back");
        back.setBounds(30, 570, 100, 30);
        back.setBackground(Color.RED);
        CreatePengeluaran.add(back);
        
        CreatePengeluaran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CreatePengeluaran.setVisible(true);
        CreatePengeluaran.setLocationRelativeTo(null);
        
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent ae) {
                CreatePengeluaran.dispose();
                Muzakky07123_GUI GUI = new Muzakky07123_GUI();
            }
        });
    }
    
}
