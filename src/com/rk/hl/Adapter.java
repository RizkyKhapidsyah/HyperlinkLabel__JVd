package com.rk.hl;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

public class Adapter extends MouseAdapter {

    String AlamatWeb;

    public Adapter(String AlamatWeb_Param) {
        this.AlamatWeb = AlamatWeb_Param;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        try {
            Desktop TampilanDepan = java.awt.Desktop.getDesktop();
            URI Urin = new java.net.URI(AlamatWeb);
            TampilanDepan.browse(Urin);
        } catch (Exception f) {
            System.out.println(f);
        }
    }

}
