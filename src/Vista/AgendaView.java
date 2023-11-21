package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Objects;

public class AgendaView extends JFrame {
    private JButton btnVerContactos;
    private JButton btnAddContacto;
    private JButton btnUpdContacto;
    private JButton btnDelContacto;
    private JPanel panelBotones;
    private JPanel cards;
    private JPanel panelTitulo;

    public AgendaView(){
        initComp();
    }

    private void initComp() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(650, 850);
        this.setTitle("Agenda Univalle");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/iconoUV.jpg")));
        this.setLocationRelativeTo(null);

        ImageIcon bgImg = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagenes/fondoMenu.jpg")));
        panelTitulo = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(bgImg.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
            }
        };
        panelTitulo.setLayout(new FlowLayout());
        panelTitulo.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        ImageIcon iconoUv = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagenes/iconoUV.jpg")));
        JLabel lblTitulo = new JLabel(iconoUv);
        JLabel lblTituloTxt = new JLabel("AGENDA UNIVALLE");
        lblTituloTxt.setFont(new Font("Agency FB",Font.PLAIN,70));
        panelTitulo.add(lblTituloTxt);
        panelTitulo.add(lblTitulo);

        panelBotones = new JPanel(new GridBagLayout()){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(bgImg.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
            }
        };
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // Botones del Menu
        btnVerContactos = new JButton("Ver Contactos");
        btnAddContacto = new JButton("Agregar");
        btnUpdContacto = new JButton("Actualizar");
        btnDelContacto = new JButton("Borrar");

        btnVerContactos.setBorderPainted(false);
        btnVerContactos.setContentAreaFilled(false);
        btnVerContactos.setFocusPainted(false);
        btnVerContactos.setFont(new Font("SansSerif",Font.PLAIN,38));

        btnAddContacto.setBorderPainted(false);
        btnAddContacto.setContentAreaFilled(false);
        btnAddContacto.setFocusPainted(false);
        btnAddContacto.setFont(new Font("SansSerif",Font.PLAIN,38));

        btnUpdContacto.setBorderPainted(false);
        btnUpdContacto.setContentAreaFilled(false);
        btnUpdContacto.setFocusPainted(false);
        btnUpdContacto.setFont(new Font("SansSerif",Font.PLAIN,38));

        btnDelContacto.setBorderPainted(false);
        btnDelContacto.setContentAreaFilled(false);
        btnDelContacto.setFocusPainted(false);
        btnDelContacto.setFont(new Font("SansSerif",Font.PLAIN,38));



        gbc.gridx = 0;
        gbc.gridy = 0;
        panelBotones.add(btnVerContactos,gbc);
        gbc.gridy = 1;
        panelBotones.add(btnAddContacto,gbc);
        gbc.gridy = 2;
        panelBotones.add(btnUpdContacto,gbc);
        gbc.gridy = 3;
        panelBotones.add(btnDelContacto,gbc);

        // Panel con CardLayout
        cards = new JPanel(new CardLayout());

        cards.add(panelBotones,"menu");

        this.getContentPane().add(panelTitulo, BorderLayout.NORTH);
        this.getContentPane().add(cards, BorderLayout.CENTER);

        this.setVisible(true);
    }

    public JPanel getPanelPrincipal(){
        return cards;
    }

    public void addListarbtnListener(ActionListener listener) {
        btnVerContactos.addActionListener(listener);
    }
    public void addAgregarbtnListener(ActionListener listener) {
        btnAddContacto.addActionListener(listener);
    }
    public void addActualizarbtnListener(ActionListener listener) {
        btnUpdContacto.addActionListener(listener);
    }
    public void addEliminarbtnListener(ActionListener listener) {
        btnDelContacto.addActionListener(listener);
    }
    public CardLayout getCardLayout(){
        return (CardLayout) (cards.getLayout());
    }
}
