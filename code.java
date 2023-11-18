import java.awt.*;
import java.awt.event.*;


public class code extends Panel implements ActionListener,ItemListener{

    Panel panel;
    Label text;
    Font font;
    Choice choiceManufacturer, choiceResolution, choiceBattery, 
        choiceWirelessCharger, choiceMemory;
    Button buttonBack, buttonNext;

    public code(){
        panel = new Panel(new GridLayout(0,0));

        
    }

    public static void main(String args[]) {
            source panel = new source ();
        
            Frame frame = new Frame("Экспертная система по выбору смартфона");	
            frame.add(panel);
            frame.setSize(1260, 660);
            frame.setLocation(100, 100);
            frame.setVisible(true);
            frame.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
            });
        }

        @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'itemStateChanged'");
    }
}
