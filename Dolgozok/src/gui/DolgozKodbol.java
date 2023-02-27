package gui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class DolgozKodbol {
    private JFrame frame;
    private JButton mentes;
    private JPanel osszesito,adatok;
    private javax.swing.JComboBox<String> lanyok,fiuk;
    
    public DolgozKodbol(){
    ini();
}
    
    public void ini(){
         frame = new JFrame("Dolgozók");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
        JLabel lany = new JLabel("Lányok");
        lanyok = new javax.swing.JComboBox<>();
        JLabel fiu = new JLabel("Fiúk");
        fiuk = new javax.swing.JComboBox<>();
        
        osszesito = new JPanel();
        osszesito.setBorder(new TitledBorder("Összesítő"));
        
        
        adatok = new JPanel();
        adatok.setBorder(new TitledBorder("Adatok"));
    }
    
    
    public static void main(String[] args) {
        new DolgozKodbol();
    }
}
