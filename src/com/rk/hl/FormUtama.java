package com.rk.hl;

import javax.swing.*;
import java.awt.*;

public class FormUtama extends JFrame {

    JLabel ObjekLabel;
    String TujuanAlamatWeb = "http://programmerfiles.blogspot.com";

    public FormUtama() {
        super("Hyperlink Label");
        Inisialisasi_Komponen();
    }

    public void Inisialisasi_Komponen() {
        aturLabelHyperLink();
        setPreferredSize(new Dimension(300, 100));
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void aturLabelHyperLink() {
        ObjekLabel = new JLabel();
        ObjekLabel.setText("<HTML><U>Klik Untuk Menuju Halaman Website</U><HTML>");
        ObjekLabel.setForeground(Color.BLUE);
        ObjekLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ObjekLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ObjekLabel.addMouseListener(new Adapter(TujuanAlamatWeb));
        add(ObjekLabel);

    }
}
