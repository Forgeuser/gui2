package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class main  {







    public static void main(String[] args) {


        JButton b = new JButton();
        JFrame f = new JFrame();

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(500,500);
        f.setLayout(new BorderLayout() );
        f.add(b);








        JPanel p1 = new JPanel();
        p1.setBackground(Color.ORANGE);
        p1.setPreferredSize(new Dimension(100,100));






        JPanel p2 = new JPanel();
        p2.setBackground(Color.green);
        p2.setPreferredSize(new Dimension(100,100));



        JPanel p3 = new JPanel();
        p3.setBackground(Color.red);
        p3.setPreferredSize(new Dimension(100,100));




        JPanel p4 = new JPanel();
        p4.setBackground(Color.blue);
        p4.setPreferredSize(new Dimension(100,100));

        JPanel p5 = new JPanel();
        p5.setBackground(Color.GREEN);
        p5.setPreferredSize(new Dimension(50,50));

        p5.setLayout(new BorderLayout());

        JPanel p6 = new JPanel();
        p6.setBackground(Color.MAGENTA);
        p6.setPreferredSize(new Dimension(50,50));

        JPanel p7 = new JPanel();
        p7.setBackground(Color.pink);
        p7.setPreferredSize(new Dimension(50,50));

        JPanel p8 = new JPanel();
        p8.setBackground(Color.blue);

        p8.setPreferredSize(new Dimension(50,50));
        JPanel p9 = new JPanel();


        p9.setBackground(Color.LIGHT_GRAY);
        p9.setPreferredSize(new Dimension(50,50));

        p5.add(p6,BorderLayout.SOUTH);
        p5.add(p7,BorderLayout.WEST);
        p5.add(p8,BorderLayout.EAST);
        p5.add(p9,BorderLayout.NORTH);





ImageIcon i = new ImageIcon("bro.png");
ImageIcon e = new ImageIcon("hehe.png");






        f.add(p1,BorderLayout.NORTH);
        f.add(p2,BorderLayout.EAST);
        f.add(p3,BorderLayout.SOUTH);
        f.add(p4,BorderLayout.WEST);
        f.add(p5,BorderLayout.CENTER);


        // Button's


        f.setTitle("border's  lol");
        f.setIconImage(e.getImage());



        b.setBounds(150, 150, 200, 200);

        b.setText("yo click me ");
        b.setFocusable(false);

        b.setIcon(i);
        b.setHorizontalTextPosition(JButton.CENTER);
        b.setVerticalTextPosition(JButton.TOP);
        b.setFont(new Font("Cosmic Sans", Font.BOLD, 20));
        b.setIconTextGap(0);
        b.setForeground(Color.BLUE);
        b.setBackground(Color.LIGHT_GRAY);
        b.setBorder(BorderFactory.createEtchedBorder());
      b.addMouseListener(new MouseAdapter() {
          @Override
          public void mouseClicked(MouseEvent e) {
              if(e.getClickCount() == 10) {
                  b.setEnabled(false);


              }
          }
      });

      b.addActionListener(new AbstractAction() {
          @Override
          public void actionPerformed(ActionEvent e) {
              if(e.getSource() == b) {
                  System.out.println("yo");

              }

          }
      });


        }







}



