package br.com.jogo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

public class ContainerDeJanelas extends JFrame {
    
    private static final long serialVersionUID = -1026074368249935922L;

    public ContainerDeJanelas() {
        
        JMenuBar barraMenu = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem sobre = new JMenuItem("Sobre");
        sobre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Jogo Desenvolvido Por Felipe Malfatti!", "Informações", 1);
            }
        });
        JMenuItem sair = new JMenuItem("Sair");
        sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu.add(sair);
        menu.add(new JSeparator());
        menu.add(sobre);
        barraMenu.add(menu);
        setJMenuBar(barraMenu);

        add(new Fase());
        setTitle("Nave Invaders");
        setDefaultCloseOperation(3);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ContainerDeJanelas();
    }
}
