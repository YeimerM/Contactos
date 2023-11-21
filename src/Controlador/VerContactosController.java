package Controlador;

import Vista.VerContactosPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerContactosController {
    private VerContactosPanel view;

    public VerContactosController(VerContactosPanel view){
        this.view = view;
        view.addLabelListener(new labelListener());


    }

    class labelListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //view.volverMenu();
        }
    }
}
