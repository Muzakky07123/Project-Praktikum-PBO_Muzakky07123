package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class Muzakky07123_GUI {

    JFrame MRA = new JFrame("MRA System");
    JSeparator batas;
    JLabel judul, subjudul;
    JButton createpmskn,createpnglrn,viewpmskn,viewpnglrn,saldo,update,delete;

    public Muzakky07123_GUI() {
        MRA.setSize(700, 570);
        MRA.setLayout(null);
        MRA.getContentPane().setBackground(Color.GREEN);
        
        batas = new JSeparator();
        batas.setBounds(0, 100, 700, 70);
        batas.setBackground(Color.DARK_GRAY);
        MRA.add(batas);

        judul = new JLabel("SISTEM PERBENDAHARAAN");
        judul.setBounds(60, 10, 600, 50);
        judul.setFont(new Font("Times New Roman", Font.BOLD, 40));
        MRA.add(judul);

        subjudul = new JLabel("MASJID ROCHMAN ARIEF");
        subjudul.setBounds(150, 40, 500, 50);
        subjudul.setFont(new Font("Times New Roman", Font.BOLD, 30));
        MRA.add(subjudul);
        
        createpmskn = new JButton("REKAM DATA PEMASUKAN");
        createpmskn.setBounds(250, 150, 200, 30);
        createpmskn.setBackground(Color.MAGENTA);
        MRA.add(createpmskn);
        
        createpnglrn = new JButton("REKAM DATA PENGELUARAN");
        createpnglrn.setBounds(250, 200, 200, 30);
        createpnglrn.setBackground(Color.MAGENTA);
        MRA.add(createpnglrn);
        
        viewpmskn = new JButton("LIHAT DATA PEMASUKAN");
        viewpmskn.setBounds(250, 250, 200, 30);
        viewpmskn.setBackground(Color.MAGENTA);
        MRA.add(viewpmskn);
        
        viewpnglrn = new JButton("LIHAT DATA PENGELUARAN");
        viewpnglrn.setBounds(250, 300, 200, 30);
        viewpnglrn.setBackground(Color.MAGENTA);
        MRA.add(viewpnglrn);
        
        saldo = new JButton("SALDO");
        saldo.setBounds(250, 350, 200, 30);
        saldo.setBackground(Color.MAGENTA);
        MRA.add(saldo);
        
        update = new JButton("UPDATE");
        update.setBounds(250, 400, 200, 30);
        update.setBackground(Color.MAGENTA);
        MRA.add(update);
        
        delete = new JButton("DELETE");
        delete.setBounds(250, 450, 200, 30);
        delete.setBackground(Color.MAGENTA);
        MRA.add(delete);
        
        MRA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MRA.setVisible(true);
        MRA.setLocationRelativeTo(null);
        
        createpmskn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent ae) {
                MRA.dispose();
                Muzakky07123_CreatePemasukanGUI CreatePemasukanGUI = new Muzakky07123_CreatePemasukanGUI();
            }
        });
        
        createpnglrn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent ae) {
                MRA.dispose();
                Muzakky07123_CreatePengeluaranGUI CreatePengeluaranGUI = new Muzakky07123_CreatePengeluaranGUI();
            }
        });
        
        viewpmskn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent ae) {
                MRA.dispose();
                Muzakky07123_ViewPemasukanGUI ViewPemasukanGUI = new Muzakky07123_ViewPemasukanGUI();
            }
        });
    }

}
