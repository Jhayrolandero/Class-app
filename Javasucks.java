import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import javax.swing.JButton;

public class Javasucks extends JButton {
  private URI redirectURI;

  public Javasucks(String text, URI redirectURI) {
    super(text);
    this.redirectURI = redirectURI;

    addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        redirect();
      }
    });
  }

  private void redirect() {
    if (Desktop.isDesktopSupported()) {
      try {
        Desktop.getDesktop().browse(redirectURI);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}