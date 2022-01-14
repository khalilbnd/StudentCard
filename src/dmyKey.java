import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class dmyKey extends KeyAdapter {

    private JTextField date;
    private int limit;

    dmyKey(JTextField date, int limit){
        this.date = date;
        this.limit = limit;
    }
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (!((c <= '9' && c >= '0') || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            e.consume();
            if (Integer.parseInt(this.date.getText()) > this.limit)
                this.date.setText(String.valueOf(this.limit));

        }
    }
}
