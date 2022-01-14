import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class JustChar extends KeyAdapter {

        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_SPACE)) {
                e.consume();
            }
        }

    }

