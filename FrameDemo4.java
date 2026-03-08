
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


class FrameDemo4{

    JFrame f;
    JPanel p;

    JButton btnNorth, btnEast , btnSouth, btnWest , btnCenter;


    public FrameDemo4(){

        f = new JFrame();
        p = new JPanel();
        p.setLayout(new BorderLayout());

        btnNorth = new JButton("NORTH");
        btnEast = new JButton("EAST");
        btnSouth = new JButton("SOUTH");
        btnWest = new JButton("WEST");
        btnCenter = new JButton("CENTER");

        p.add(btnNorth , BorderLayout.NORTH);
        p.add(btnEast , BorderLayout.EAST);
        p.add(btnSouth , BorderLayout.SOUTH);
        p.add(btnWest , BorderLayout.WEST);
        p.add(btnCenter , BorderLayout.CENTER);


        f.add(p);
        f.setSize(400,500);
        f.setTitle("My Frame 4");
        f.setLocation(450,50);
        f.setVisible(true);
        

    }
    public static void main(String[] args) {
        
            new FrameDemo4();

    }

}