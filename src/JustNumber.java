import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class JustNumber extends KeyAdapter {

        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if(!((c <= '9' && c >= '0') || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE )) {
                e.consume();
            }
        }

    }


