import javax.swing.*;
import javax.swing.border.AbstractBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

public class mainFrame extends JFrame {

    mainFrame(){
        super("GENERATEUR DE CARTE D'ETUDIANT - UNIVERSITE ABD EL HAMID IBN BADIS");

        dragFrame move = new dragFrame(this);
        this.addMouseListener(move);
        this.addMouseMotionListener(move);

        /* Ajouter une photo */
        ImageIcon bgUniv = new ImageIcon("./assets/images/bg/img.jfif");
        JLabel bgLab = new JLabel(bgUniv);
        /* Ajouter une photo */

        /*Le titre "GENERATEUR DE CARTE D'ETUDIANT*/
        JLabel title = new JLabel("GENERATEUR DE CARTE D'ETUDIANT");
        title.setFont(new Font("monospace", Font.BOLD, 24));
        title.setForeground(Color.white);
        title.setBounds(320, 20, 450, 50);
        /*Le titre "GENERATEUR DE CARTE D'ETUDIANT*/

        /*Description*/
        JLabel desc = new JLabel("<html><p style='text-align: center;'>Cette application permet de genérer des carte d'etudiant en remplissant une formulaire (Nom, Prénom, Date de naissance, faculté et l'année d'etude)</p></html>", SwingConstants.CENTER);
        desc.setFont(new Font("monospace", Font.PLAIN, 18));
        desc.setForeground(Color.white);
        desc.setBounds(325, 55, 450, 150);
        desc.setOpaque(false);
        /*Description*/

        /*Quitter et reduire */

        JLabel xQuitter = new JLabel("X");
        xQuitter.setFont(new Font("monospace", Font.BOLD, 15));
        xQuitter.setForeground(Color.white);
        xQuitter.setBounds(1030, 7, 40, 20);
        xQuitter.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
               new funcQuitter();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                xQuitter.setForeground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                xQuitter.setForeground(Color.white);
            }
        });

        JLabel reduire = new JLabel("_");
        reduire.setFont(new Font("monospace", Font.BOLD, 15));
        reduire.setForeground(Color.white);
        reduire.setBounds(1000, 2, 10, 20);
        reduire.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                setState(Frame.ICONIFIED);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                reduire.setForeground(Color.green);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                reduire.setForeground(Color.white);
            }
        });

        /*Quiiter et reduire */
        /*Student List Button*/

        /*Student List Button */

        /*Genérer Button */
        JButton gButton = new JButton("Genérer");
        gButton.setFont(new Font("monospace", Font.BOLD, 18));
        gButton.setBackground(Color.white);
        gButton.setForeground(new Color(0x1887dd));
        gButton.setBounds(450, 570, 180, 60);
        gButton.setFocusable(false);
        gButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new form();
                dispose();
            }
        });
        /*Générer Button */


        add(gButton);

        add(desc);
        add(title);
        add(reduire);
        add(xQuitter);
        add(bgLab);
        setSize(1050, 700);
        setUndecorated(true);
        setVisible(true);
        getContentPane().setBackground(new Color(0x1887dd));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args){
        new mainFrame();
    }
}

