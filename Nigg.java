import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Nigg {


    static int x = 180;
    static int width = 500;
    static int height = 50;
    public static void main(String[] args) throws URISyntaxException{
        /*Typical GUI Setup */
        JFrame frame = new JFrame("Class Links");
        frame.setResizable(false);
        frame.setSize(900,850);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
            //for the icon in the window
        ImageIcon icon = new ImageIcon("har.png");
        frame.setIconImage(icon.getImage());

        /*for discrete structure button */

        URI Ds1 = new URI("https://meet.google.com/kci-mtpi-omv");
        Javasucks Ds1Button = new Javasucks("Discrete Structures", Ds1);
        Ds1Button.setBounds(x, 10, width, height);
        frame.add(Ds1Button);

        /*Stats */

        URI Stats = new URI("https://meet.google.com/xzp-kbbo-apv");
        Javasucks StatsButton = new Javasucks("Probability and Statistics", Stats);
        StatsButton.setBounds(x, 80, width, height);
        frame.add(StatsButton);

        /*Arts */

        URI Arts = new URI("https://meet.google.com/kko-phus-nmz");
        Javasucks ArtsButton = new Javasucks("Reading in Visual Arts", Arts);
        ArtsButton.setBounds(x, 150, width, height);
        frame.add(ArtsButton);

        /*Math */

        URI Math = new URI("https://meet.google.com/sgq-tjux-bre");
        Javasucks MathButton = new Javasucks("Math in the Modern World", Math);
        MathButton.setBounds(x, 220, width, height);
        frame.add(MathButton);
     
        /*NSTP 2 */

        URI NSTP2 = new URI("https://meet.google.com/jnf-vphq-fhv");
        Javasucks NSTP2Button = new Javasucks("NSTP2", NSTP2);
        NSTP2Button.setBounds(x, 290, width, height);
        frame.add(NSTP2Button);

        /*PathFit */

        URI PathFit2 = new URI("https://meet.google.com/pah-nbuu-dkh");
        Javasucks PFButton = new Javasucks("PathFit2", PathFit2);
        PFButton.setBounds(x, 360, width, height);
        frame.add(PFButton);

        /*INFO LAB AND LEC */
        URI IMLEC = new URI("https://meet.google.com/omw-uhiz-fgg");
        Javasucks IMLECButton = new Javasucks("Info Management (LEC)", IMLEC);
        IMLECButton.setBounds(x, 430, width, height);
        frame.add(IMLECButton);

        URI IMLAB = new URI("https://meet.google.com/npu-ykhd-gri");
        Javasucks IMLABButton = new Javasucks("Info Management (LAB)", IMLAB);
        IMLABButton.setBounds(x, 500, width, height);
        frame.add(IMLABButton);

        /*ComProg 2 LAB and LEC */
        URI CPLEC = new URI("https://meet.google.com/pmw-ryva-zpj");
        Javasucks CPLECButton = new Javasucks("ComProg 2 (LEC)", CPLEC);
        CPLECButton.setBounds(x, 570, width, height);
        frame.add(CPLECButton);

        URI CPLAB = new URI("https://meet.google.com/pde-dokx-vme");
        Javasucks CPLABButton = new Javasucks("ComProg 2 (LAB)", CPLAB);
        CPLABButton.setBounds(x, 640, width, height);
        frame.add(CPLABButton);

        /*STS */
        URI STS = new URI("https://meet.google.com/pex-idsj-xrj");
        Javasucks STSButton = new Javasucks("Science, Tech, and Society", STS);
        STSButton.setBounds(x, 710, width, height);
        frame.add(STSButton);



       frame.setVisible(true);
       
    }
}
