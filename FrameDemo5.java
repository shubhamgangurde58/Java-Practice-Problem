
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


class FrameDemo5{

    JFrame f;
    JPanel p;

    JButton btn1 , btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;

    public FrameDemo5(){

        f = new JFrame();
        p = new JPanel();

        btn1 = new JButton("Button 1");     
        btn2 = new JButton("Button 2");   
        btn3 = new JButton("Button 3");   
        btn4 = new JButton("Button 4");   
        btn5 = new JButton("Button 5");   
        btn6 = new JButton("Button 6");   
        btn7 = new JButton("Button 7");   
        btn8 = new JButton("Button 8");   
        btn9 = new JButton("Button 9");   
        btn0 = new JButton("Button 0");      
        
        p.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));

        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        p.add(btn4);
        p.add(btn5);
        p.add(btn6);
        p.add(btn7);
        p.add(btn8);
        p.add(btn9);
        p.add(btn0);

        f.add(p);
        f.setSize(400,500);
        f.setTitle("My Frame 4");
        f.setLocation(450,50);
        f.setVisible(true);
        

    }
    public static void main(String[] args) {
        
            new FrameDemo5();

    }

}