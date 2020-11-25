package lession8;

import javax.annotation.processing.Messager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.awt.Graphics;
public class MyWindow extends JFrame {
     MyWindow() {
        setVisible(true);
        setLocation(650,500);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Окно в мир");
        ;


        JPanel panel = new JPanel(new GridLayout(5,2));
        JButton btn1 = new JButton("Выход");
        btn1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)

            {
                System.out.println("Закрытие программы");
                 System.exit(0);

            }
        });

        panel.add(btn1);
        JButton btn2 = new JButton("Какой сегодня день?");
        panel.add (btn2);

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Date today = new Date();
                String.format("%tA, %tB %td", today, today, today);
                JOptionPane.showMessageDialog(panel,"Today is" + today);

            }
        });



       JButton btn3 = new JButton("Нажми меня");
        panel.add(btn3);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel,"I have been clicked");
            }
        });
        add(panel, BorderLayout.SOUTH);
         MouseListener mouse = new MouseListener()
         {
             @Override
             public void mouseClicked(MouseEvent e)
             {
                 System.out.println("Клик-клик");
             }

             @Override
             public void mousePressed(MouseEvent e)
             {
             }

             @Override
             public void mouseReleased(MouseEvent e)
             {
             }

             @Override

             public void mouseEntered(MouseEvent e)
             {
                 System.out.println("Мышь вошла");
             }

             @Override
             public void mouseExited(MouseEvent e)
             {
                 System.out.println("Мышь вышла");
             }
         };
         JButton btn4 = new JButton("Oval");
         panel.add(btn4);
         btn4.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                getGraphics().fillOval(70,70,100,100);
             }
         });

         panel.addMouseListener(mouse);



    }
}


