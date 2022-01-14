

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;

import java.util.Objects;


public class form extends JFrame {
    ImageIcon icon, id;
    String ddn;

    form(){
        super("GENERATEUR DE CARTE D'ETUDIANT - UNIVERSITE ABD EL HAMID IBN BADIS");

        dragFrame move = new dragFrame(this);
        this.addMouseListener(move);
        this.addMouseMotionListener(move);

        setLayout(null);
        /*Logo*/
        icon = new ImageIcon("./assets/images/logo/logo.png");
        JLabel icoLab = new JLabel(icon);
        icoLab.setBounds(50,50,100,97);
        /*Logo*/
        /*Icon*/
        JLabel picLab = new JLabel();
        picLab.setBounds(420, 70, 140, 150);
        picLab.setBorder(new LineBorder(new Color(0x1887dd), 6));
        /*Icon*/

        /*Browse Button*/
        JButton browse = new JButton("Browse");
        browse.setBounds(440,230,100,30);
        browse.setFocusable(false);
        browse.setForeground(Color.white);
        browse.setBackground(new Color(0x1887dd));
        browse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                fc.setDialogTitle("Browse ID picture");
                fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
                fc.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "jfif"));
                fc.setAcceptAllFileFilterUsed(false);

                int choosenFile = fc.showDialog(null, "Choose");
                if(choosenFile == JFileChooser.APPROVE_OPTION) {
                    File f = fc.getSelectedFile();
                    try {
                        BufferedImage bufferedImage = ImageIO.read(new File(f.getAbsolutePath()));
                        Image img = bufferedImage.getScaledInstance(128, 150, Image.SCALE_DEFAULT);
                        id = new ImageIcon(img);
                        picLab.setIcon(id);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        /*Browse Button*/

        /*OBSTACLE JTEXTField to delete a default caret*/
        JTextField obs = new JTextField();
        /*Nom JtextField*/
        JTextField nomInp = new JTextField("Nom");
        nomInp.setBounds(340, 280, 290, 40);
        nomInp.setFont(new Font("monospace", Font.BOLD, 15));
        nomInp.setForeground(Color.gray);
        nomInp.setBorder(new EmptyBorder(0, 15,0 ,0));
        nomInp.addKeyListener(new JustChar());
        nomInp.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(Objects.equals(nomInp.getText(), "Nom")){
                    nomInp.setText("");
                    nomInp.setForeground(new Color(0x1887dd));
                    nomInp.getCaret().setVisible(true);
                }
            }
        });
        nomInp.setToolTipText("Cette case est obligé");
        /*Nom JtextField*/

        /*Prenom JtextField*/
        JTextField prenomInp = new JTextField("Prénom");
        prenomInp.setBounds(340, 340, 290, 40);
        prenomInp.setFont(new Font("monospace", Font.BOLD, 15));
        prenomInp.setForeground(Color.gray);
        prenomInp.setBorder(new EmptyBorder(0, 15,0 ,0));
        prenomInp.addKeyListener(new JustChar());
        prenomInp.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(Objects.equals(prenomInp.getText(), "Prénom")){
                    prenomInp.setText("");
                    prenomInp.setForeground(new Color(0x1887dd));
                    prenomInp.getCaret().setVisible(true);
                }
            }
        });
        prenomInp.setToolTipText("Cette case est obligé");
        /*Prenom JtextField*/

        /*Date de naissance*/
        JTextField JourInp = new JTextField("Jour");
        JourInp.setBounds(340, 400, 80, 40);




        JourInp.setFont(new Font("monospace", Font.BOLD, 15));
        JourInp.setForeground(Color.gray);
        JourInp.setBorder(new EmptyBorder(0, 15,0 ,0));
        JourInp.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(Objects.equals(JourInp.getText(), "Jour")){
                    JourInp.setText("");
                    JourInp.setForeground(new Color(0x1887dd));
                    JourInp.getCaret().setVisible(true);
                }
            }
        });
        JourInp.addKeyListener(new dmyKey(JourInp, 31));
        JTextField MoisInp = new JTextField("Mois");
        MoisInp.setBounds(445, 400, 80, 40);




        MoisInp.setFont(new Font("monospace", Font.BOLD, 15));
        MoisInp.setForeground(Color.gray);
        MoisInp.setBorder(new EmptyBorder(0, 15,0 ,0));
        MoisInp.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                    if(Objects.equals(MoisInp.getText(), "Mois")){
                    MoisInp.setText("");
                    MoisInp.setForeground(new Color(0x1887dd));
                    MoisInp.getCaret().setVisible(true);
                }
            }
        });
        MoisInp.addKeyListener(new dmyKey(MoisInp, 12))
        ;
        JTextField AnneeInp = new JTextField("Année");
        AnneeInp.setBounds(550, 400, 80, 40);




        AnneeInp.setFont(new Font("monospace", Font.BOLD, 15));
        AnneeInp.setForeground(Color.gray);
        AnneeInp.setBorder(new EmptyBorder(0, 15,0 ,0));
        AnneeInp.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(Objects.equals(AnneeInp.getText(), "Année")){
                    AnneeInp.setText("");
                    AnneeInp.setForeground(new Color(0x1887dd));
                    AnneeInp.getCaret().setVisible(true);
                }
            }
        });
        AnneeInp.addKeyListener(new dmyKey(AnneeInp, 2004));


        /*Date de naissance*/
        /*Filiere combobox */
        String[] filiere ={"    Filiere","    Sciences et technologie", "    Architecture", "    Biologie", "    Mathématique et informatique", "    Sciences de la matière", "    Medcine", "    Droit", "    Sciences Politiques", "    Sciences Commerce", "    Litterature Arabe", "    Arts", "    Sciences Sociales", "    Sport"};
        JComboBox<String> filiereInp = new JComboBox<>(filiere);
        filiereInp.setBounds(340, 460, 290, 40);
        filiereInp.setFont(new Font("monospace", Font.BOLD, 15));
        filiereInp.setRenderer(new CBLayout(filiereInp));
        filiereInp.setToolTipText("Cette case est obligé");
        /*Filiere Combobox*/

        /*Université Combobox*/
        String[] fac ={"    Faculté","    Sciences et de la technologie", "    Architecture", "    Sciences de la nature et de la vie", "    Sciences exactes et de l'informatique", "    Medcine", "    Droit et sciences Politiques", "    Sciences Commerce", "    Litterature Arabe et des arts", "    Sciences Sociales", "    Sport"};
        JComboBox<String> facInp= new JComboBox<>(fac);
        facInp.setBounds(340, 520, 290, 40);
        facInp.setFont(new Font("monospace", Font.BOLD, 15));
        facInp.setRenderer(new CBLayout(facInp));
        facInp.setToolTipText("Cette case est obligé");
        /*Université Combobox*/

        /*Année Scolaire JTextField*/
        JTextField asInp = new JTextField("Année Scolaire");
        asInp.setBounds(340, 580, 290, 40);
        asInp.setFont(new Font("monospace", Font.BOLD, 15));
        asInp.setForeground(Color.gray);
        asInp.setBorder(new EmptyBorder(0, 15,0 ,0));
        asInp.addKeyListener(new dmyKey(asInp, 2022));
        asInp.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(Objects.equals(asInp.getText(), "Année Scolaire")){
                    asInp.setText("");
                    asInp.setForeground(new Color(0x1887dd));
                    asInp.getCaret().setVisible(true);
                }
            }
        });
        asInp.setToolTipText("Cette case est obligé");
        /*Année Scolaire JTextField*/

        /*Numéro d'etudiant*/
        JTextField numInp = new JTextField("Numéro d'etudiant");
        numInp.setBounds(340, 640, 170, 40);
        numInp.setFont(new Font("monospace", Font.BOLD, 15));
        numInp.setForeground(Color.white);
        numInp.setBackground(Color.gray);
        numInp.setBorder(new EmptyBorder(0, 15,0 ,0));
        numInp.setEditable(false);
        numInp.setToolTipText("Cette case est obligé");

        JButton numBtn = new JButton("Génerer");
        numBtn.setBounds(510, 640, 120, 40);
        numBtn.setFocusable(false);
        numBtn.setFont(new Font("monospace", Font.BOLD, 12));
        numBtn.setBackground(new Color(0x1887dd));
        numBtn.setForeground(Color.white);

        numBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(asInp.getText().isEmpty() || Objects.equals(asInp.getText(), "Année Scolaire")){
                    JOptionPane.showMessageDialog(null, "VEUILLEZ SAISIR VOTRE ANNEE SCOLAIRE POUR GENERER VOTRE NUM D'ETUDAIANT", "Erreur", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String Matricule = String.valueOf(Integer.parseInt(asInp.getText()) % 100);
                boolean loop = true;
                int random;

                    Matricule += Matricule + "370";
                    random = (int) (Math.random() * (99999 - 10000)) + 10000;

                    Matricule += random;

                numInp.setText(Matricule);
                numInp.setForeground(new Color(0x1887dd));
                numInp.setBackground(Color.white);

            }
        });
        /*Numéro D'etudiant*/



        JButton create = new JButton("Afficher La Carte");
        create.setBounds(80, 310, 190, 50);
        create.setFocusable(false);
        create.setFont(new Font("monospace", Font.BOLD, 15));

        create.setEnabled(false);
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CardStudent(id, nomInp.getText(), prenomInp.getText(), ddn, (String)filiereInp.getSelectedItem(), (String) facInp.getSelectedItem(), asInp.getText(), numInp.getText());
            }
        });

        JButton print = new JButton("Imprimer");
        print.setBounds(80, 370, 190, 50);
        print.setFocusable(false);
        print.setFont(new Font("monospace", Font.BOLD, 15));

        print.setEnabled(false);
        print.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                PrinterJob job = PrinterJob.getPrinterJob();

                job.setJobName("Print Data");
                job.setPrintable(new Printable() {
                    @Override
                    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) {
                        if (pageIndex > 0) {
                            return NO_SUCH_PAGE;
                        }
                    Graphics2D g2 = (Graphics2D)graphics;
                        g2.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                        g2.scale(0.7, 0.7);


                        CardStudent frm = new CardStudent(id, nomInp.getText(), prenomInp.getText(), ddn, (String)filiereInp.getSelectedItem(), (String) facInp.getSelectedItem(), asInp.getText(), numInp.getText());
                        frm.paint(g2);
                        frm.dispose();


                        return PAGE_EXISTS;


                    }

                });
                boolean ok = job.printDialog();
                if (ok){
                    try{
                        job.print();
                        JOptionPane.showMessageDialog(null, "Impression Terminé", "Success", JOptionPane.PLAIN_MESSAGE);

                    } catch (PrinterException ignored){}
                }

            }
        });

        JButton save = new JButton("Sauvgarder");
        save.setBounds(80, 430, 190, 50);
        save.setFocusable(false);
        save.setFont(new Font("monospace", Font.BOLD, 15));

        save.setEnabled(false);
        save.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    CardStudent frm = new CardStudent(id, nomInp.getText(), prenomInp.getText(), ddn, (String)filiereInp.getSelectedItem(), (String) facInp.getSelectedItem(), asInp.getText(), numInp.getText());

                    BufferedImage image = new BufferedImage(frm.getWidth(), frm.getHeight(), BufferedImage.TYPE_INT_RGB);
                    Graphics2D graphics2D = image.createGraphics();

                    frm.paint(graphics2D);
                    ImageIO.write(image,"jpeg", new File("./"+ numInp.getText() +".jpg"));
                    frm.dispose();
                    JOptionPane.showMessageDialog(null, "Sauvgarde terminé", "Success", JOptionPane.PLAIN_MESSAGE);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        JButton verification = new JButton("Génerer La carte");
        verification.setBounds(80, 250, 190, 50);
        verification.setFocusable(false);
        verification.setFont(new Font("monospace", Font.BOLD, 15));
        verification.setBackground(new Color(0x1887dd));
        verification.setForeground(Color.white);

        verification.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean nomEmpty = Objects.equals(nomInp.getText(), "Nom") || nomInp.getText().isEmpty(),
                        prenomEmpty = Objects.equals(prenomInp.getText(), "Prénom") || prenomInp.getText().isEmpty(),
                        dateEmpty = Objects.equals(JourInp.getText(), "Jour") || JourInp.getText().isEmpty() ||
                                MoisInp.getText().isEmpty() || Objects.equals(MoisInp.getText(), "Mois") ||
                                AnneeInp.getText().isEmpty() || Objects.equals(AnneeInp.getText(), "Année"),
                        filiereEmpty = filiereInp.getSelectedItem() == "    Filiere",
                        facEmpty = facInp.getSelectedItem() == "    Faculté",
                        anneeEmpty = asInp.getText().isEmpty();

                if(nomEmpty || prenomEmpty || dateEmpty || filiereEmpty || facEmpty || anneeEmpty)
                    JOptionPane.showMessageDialog(null,  "Votre formulaire manque quelque information", "Manque de Formulaire",JOptionPane.ERROR_MESSAGE);
                else {
                    ddn = JourInp.getText() + "-" + MoisInp.getText() + "-" + AnneeInp.getText();
                    String str ="";
                    str += "Votre Formulaire est tout a fait complete\n";
                    str += "Nom : " + nomInp.getText() + "\n";
                    str += "Prénom : " + prenomInp.getText() + "\n";
                    str += "Date de naissance : " + ddn + "\n";
                    str += "Filiére : " + filiereInp.getSelectedItem() + "\n";
                    str += "Faculté : " + facInp.getSelectedItem() + "\n";
                    str += "Année Scolaire : " + asInp.getText() + "\n";
                    str += "Numéro d'etudiant : " + numInp.getText() +"\n";


                    JOptionPane.showMessageDialog(null, str, "Votre Formulaire", JOptionPane.PLAIN_MESSAGE, id);
                    create.setBackground(new Color(0x1887dd));
                    create.setForeground(Color.white);
                    create.setEnabled(true);
                    print.setBackground(new Color(0x1887dd));
                    print.setForeground(Color.white);
                    print.setEnabled(true);
                    save.setBackground(new Color(0x1887dd));
                    save.setForeground(Color.white);
                    save.setEnabled(true);
                }
            }});







        JLabel xQuitter = new JLabel("X");
        xQuitter.setFont(new Font("monospace", Font.BOLD, 15));
        xQuitter.setForeground(Color.BLACK);
        xQuitter.setBounds(680, 7, 40, 20);
        xQuitter.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

                dispose();
                new mainFrame();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                xQuitter.setForeground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                xQuitter.setForeground(Color.BLACK);
            }
        });
        JLabel reduire = new JLabel("_");
        reduire.setFont(new Font("monospace", Font.BOLD, 15));
        reduire.setForeground(Color.BLACK);
        reduire.setBounds(650, 2, 10, 20);
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
                reduire.setForeground(Color.BLACK);
            }
        });


        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(nomInp.getText().isEmpty()){
                    nomInp.setText("Nom");
                    nomInp.setForeground(Color.gray);
                    nomInp.getCaret().setVisible(false);
                }
                if(prenomInp.getText().isEmpty()){
                    prenomInp.setText("Prénom");
                    prenomInp.setForeground(Color.gray);
                    prenomInp.getCaret().setVisible(false);
                }

                if(JourInp.getText().isEmpty()){
                    JourInp.setText("Jour");
                    JourInp.setForeground(Color.gray);
                    JourInp.getCaret().setVisible(false);
                }
                if(MoisInp.getText().isEmpty()){
                    MoisInp.setText("Mois");
                    MoisInp.setForeground(Color.gray);
                    MoisInp.getCaret().setVisible(false);
                }
                if(AnneeInp.getText().isEmpty()){
                    AnneeInp.setText("Année");
                    AnneeInp.setForeground(Color.gray);
                    AnneeInp.getCaret().setVisible(false);
                }
                if(asInp.getText().isEmpty()){
                    asInp.setText("Année Scolaire");
                    asInp.setForeground(Color.gray);
                    asInp.getCaret().setVisible(false);
                }

            }
        });

        add(save);
        add(print);
        add(create);
        add(verification);
        add(numBtn);
        add(numInp);
        add(asInp);
        add(AnneeInp);
        add(MoisInp);
        add(JourInp);
        add(facInp);
        add(filiereInp);
        add(prenomInp);
        add(nomInp);
        add(obs);
        add(reduire);
        add(xQuitter);
        add(picLab);
        add(browse);
        add(icoLab);

        setSize(700, 727);
        setUndecorated(true);
        setVisible(true);
        getContentPane().setBackground(new Color(0xc2d5ff));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    private Image fitimage(Image img , int w , int h)
    {
        BufferedImage resizedimage = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizedimage.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img, 0, 0,w,h,null);
        g2.dispose();
        return resizedimage;
    }
    public static void main(String[] args){
        new form();
    }
}
