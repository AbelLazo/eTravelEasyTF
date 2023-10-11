package Main;
import javax.swing.*;
import java.awt.*;
import com.formdev.flatlaf.util.UIScale;


public class Main extends JFrame{

    public Main(){
        init();
    }

    private void init(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(.scale(new Dimension(1365, 768)));
        setLocationRelativeTo(null);
    }
}