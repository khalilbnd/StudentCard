import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class CardStudent extends JFrame {

    private ImageIcon id;
    private String nom, prenom, ddn, filiere, fac, anneeSco, numEtu;
    CardStudent(ImageIcon id, String nom, String prenom, String ddn, String filiere, String fac, String anneeSco, String numEtu){
        super("CARTE D'ETUDIANT");
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.ddn = ddn;
        this.filiere = filiere;
        this.fac = fac;
        this.anneeSco = anneeSco;
        this.numEtu = numEtu;








        ImageIcon logo = new ImageIcon("./assets/images/logo/logo.png");
        JLabel bgLg = new JLabel(logo);
        setLayout(null);
        bgLg.setBounds(50,30,100,97);

        JPanel greenPanel = new JPanel();
        greenPanel.setBounds(750, 0, 20, 500);
        greenPanel.setBackground(new Color(0x57B143));

        JPanel redPanel = new JPanel();
        redPanel.setBounds(770, 0, 20, 500);
        redPanel.setBackground(new Color(0xE55121));

        JPanel bluePanel = new JPanel();
        bluePanel.setBounds(790, 0, 20, 500);
        bluePanel.setBackground(new Color(0x3362A8));

        JLabel desc = new JLabel("<html><p style='text-align: center;'>République Algérienne Démocratique et Populaire<br/>Ministère de l'enseignement supérieur et de la recherche scientifique<br/> Université de Mostaganem</p></html>", SwingConstants.CENTER);
        desc.setFont(new Font("monospace", Font.ITALIC, 14));
        desc.setForeground(Color.BLACK);
        desc.setBounds(200, 1, 500, 120);
        desc.setOpaque(false);


        JLabel idLab = new JLabel(this.id);
        idLab.setBounds(665,150,192,253);

        JLabel CarteEtu = new JLabel("Carte D'etudiant");
        CarteEtu.setBounds(340, 110, 300, 50);
        CarteEtu.setForeground(Color.BLACK);
        CarteEtu.setFont(new Font("monospace", Font.BOLD, 27));

        JLabel Nomtit = new JLabel("Nom Complet :");
        Nomtit.setBounds(70, 180, 200,50);
        Nomtit.setForeground(Color.BLACK);
        Nomtit.setFont(new Font("monospace", Font.PLAIN, 16));

        JLabel Nom = new JLabel(this.nom + " " + this.prenom);
        Nom.setBounds(250, 180, 300,50);
        Nom.setForeground(Color.BLACK);
        Nom.setFont(new Font("monospace", Font.BOLD, 18));

        JLabel DDNTit = new JLabel("Date de naissance :");
        DDNTit.setBounds(70, 220, 200,50);
        DDNTit.setForeground(Color.BLACK);
        DDNTit.setFont(new Font("monospace", Font.PLAIN, 16));

        JLabel DDN = new JLabel(this.ddn);
        DDN.setBounds(250, 220, 300,50);
        DDN.setForeground(Color.BLACK);
        DDN.setFont(new Font("monospace", Font.BOLD, 18));

        JLabel filiereTit = new JLabel("Filiere :");
        filiereTit.setBounds(70,260,200, 50);
        filiereTit.setForeground(Color.black);
        filiereTit.setFont(new Font("monospace", Font.PLAIN, 16));

        JLabel Filiere = new JLabel(this.filiere);
        Filiere.setBounds(220, 260, 300,50);
        Filiere.setForeground(Color.BLACK);
        Filiere.setFont(new Font("monospace", Font.BOLD, 18));

        JLabel facTit = new JLabel("Faculté :");
        facTit.setBounds(70,300,200, 50);
        facTit.setForeground(Color.black);
        facTit.setFont(new Font("monospace", Font.PLAIN, 16));

        JLabel Fac = new JLabel(this.fac);
        Fac.setBounds(230, 300, 440,50);
        Fac.setForeground(Color.BLACK);
        Fac.setFont(new Font("monospace", Font.BOLD, 18));
        JLabel asTit = new JLabel("Année Scolaire :");

        asTit.setBounds(70,340,200, 50);
        asTit.setForeground(Color.black);
        asTit.setFont(new Font("monospace", Font.PLAIN, 16));

        JLabel As = new JLabel(this.anneeSco);
        As.setBounds(250, 340, 340,50);
        As.setForeground(Color.BLACK);
        As.setFont(new Font("monospace", Font.BOLD, 18));

        JLabel NEtuTit = new JLabel("Numéro d'etudiant");
        NEtuTit.setBounds(70,380,200, 50);
        NEtuTit.setForeground(Color.black);
        NEtuTit.setFont(new Font("monospace", Font.PLAIN, 16));

        JLabel NEtu = new JLabel(this.numEtu);
        NEtu.setBounds(250, 380, 340,50);
        NEtu.setForeground(Color.BLACK);
        NEtu.setFont(new Font("monospace", Font.BOLD, 18));


        add(NEtuTit);
        add(NEtu);
        add(As);
        add(asTit);
        add(Fac);
        add(facTit);
        add(Filiere);
        add(filiereTit);
        add(DDN);
        add(DDNTit);
        add(Nom);
        add(Nomtit);
        add(CarteEtu);
        add(idLab);
        add(desc);
        add(bluePanel);
        add(redPanel);
        add(greenPanel);
        add(bgLg);




        setSize(900,500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(new Color(0xc2d5ff));
        setVisible(true);

    }


}


/*ImageIcon id, String nom, String prenom, String ddn, String filiere, String fac, String anneeSco, String numEtu*/