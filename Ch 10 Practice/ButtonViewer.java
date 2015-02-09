import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class ButtonViewer
{
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 250;

    private JFrame frame;
    private JPanel panel;
    private JButton buttonA;
    private JButton buttonB;
    private JLabel label;

    public ButtonViewer()
    {
        frame = new JFrame();
        buttonA = new JButton("A");
        buttonB = new JButton("B");
        label = new JLabel("No button clicked.");
        panel = new JPanel();
        panel.add(buttonA);
        panel.add(buttonB);
        panel.add(label);

        frame.add(panel);

        ActionListener listener = new ClickListener();
        buttonA.addActionListener(listener);
        buttonB.addActionListener(listener);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public class ClickListener implements ActionListener
    {

        public void actionPerformed(ActionEvent event)
        {
            label.setText("Button " +event.getActionCommand()+ " was clicked!");
        }

    }

    public static void main(String[] args)
    {
        ButtonViewer viewer = new ButtonViewer();

    }
}
