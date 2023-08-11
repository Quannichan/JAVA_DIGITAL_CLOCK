/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Quân
 */


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Gui implements Runnable, ActionListener {
    DateTimeFormatter hour = DateTimeFormatter.ofPattern("HH");
    DateTimeFormatter minute = DateTimeFormatter.ofPattern("mm");
    DateTimeFormatter sec = DateTimeFormatter.ofPattern("ss");
    JFrame Gui;
    LocalTime localTime;
    int x = 0;
    int y = 0;
    String HOUR;
    String MIN;
    String SEC;
    JLabel h0, h1, h2, h3, h4, h5, h6, h7, h8, h9,
            h_0, h_1, h_2, h_3, h_4, h_5, h_6, h_7, h_8, h_9,
            m0, m1, m2, m3, m4, m5,
            m_0, m_1, m_2, m_3, m_4, m_5, m_6, m_7, m_8, m_9,
            s0, s1, s2, s3, s4, s5,
            s_0, s_1, s_2, s_3, s_4, s_5, s_6, s_7, s_8, s_9,
            tdot1, tdot2;
    JLayeredPane background;
    JMenuBar mb;
    JMenu me1;
    JCheckBoxMenuItem second, alontop;
    JMenuItem exit, theme;
    ImageIcon icon = new ImageIcon(getClass().getResource("/Image/icon.png")),
            number0 = new ImageIcon(getClass().getResource("/Image/0.png")),
            number1 = new ImageIcon(getClass().getResource("/Image/1.png")),
            number2 = new ImageIcon(getClass().getResource("/Image/2.png")),
            number3 = new ImageIcon(getClass().getResource("/Image/3.png")),
            number4 = new ImageIcon(getClass().getResource("/Image/4.png")),
            number5 = new ImageIcon(getClass().getResource("/Image/5.png")),
            number6 = new ImageIcon(getClass().getResource("/Image/6.png")),
            number7 = new ImageIcon(getClass().getResource("/Image/7.png")),
            number8 = new ImageIcon(getClass().getResource("/Image/8.png")),
            number9 = new ImageIcon(getClass().getResource("/Image/9.png")),
            twodot = new ImageIcon(getClass().getResource("/Image/2dot.png"));
    ImageIcon number0_black = new ImageIcon(getClass().getResource("/Image/0_black.png")),
            number1_black = new ImageIcon(getClass().getResource("/Image/1_black.png")),
            number2_black = new ImageIcon(getClass().getResource("/Image/2_black.png")),
            number3_black = new ImageIcon(getClass().getResource("/Image/3_black.png")),
            number4_black = new ImageIcon(getClass().getResource("/Image/4_black.png")),
            number5_black = new ImageIcon(getClass().getResource("/Image/5_black.png")),
            number6_black = new ImageIcon(getClass().getResource("/Image/6_black.png")),
            number7_black = new ImageIcon(getClass().getResource("/Image/7_black.png")),
            number8_black = new ImageIcon(getClass().getResource("/Image/8_black.png")),
            number9_black = new ImageIcon(getClass().getResource("/Image/9_black.png")),
            twodot_black = new ImageIcon(getClass().getResource("/Image/2dot_black.png"));

    public Gui() {

        this.tdot1 = new JLabel(this.twodot);
        this.tdot1.setVisible(true);
        this.tdot1.setBounds(200, 22, this.twodot.getIconWidth(), this.twodot.getIconHeight());

        this.h0 = new JLabel(this.number0);
        this.h0.setVisible(true);
        this.h0.setBounds(20, -106, this.number0.getIconWidth(), this.number0.getIconHeight());

        this.h1 = new JLabel(this.number1);
        this.h1.setVisible(true);
        this.h1.setBounds(20, -106, this.number1.getIconWidth(), this.number1.getIconHeight());

        this.h2 = new JLabel(this.number2);
        this.h2.setVisible(true);
        this.h2.setBounds(20, -106, this.number2.getIconWidth(), this.number2.getIconHeight());

        this.h_0 = new JLabel(this.number0);
        this.h_0.setVisible(true);
        this.h_0.setBounds(110, -106, this.number0.getIconWidth(), this.number0.getIconHeight());

        this.h_1 = new JLabel(this.number1);
        this.h_1.setVisible(true);
        this.h_1.setBounds(110, -106, this.number1.getIconWidth(), this.number1.getIconHeight());

        this.h_2 = new JLabel(this.number2);
        this.h_2.setVisible(true);
        this.h_2.setBounds(110, -106, this.number2.getIconWidth(), this.number2.getIconHeight());

        this.h_3 = new JLabel(this.number3);
        this.h_3.setVisible(true);
        this.h_3.setBounds(110, -106, this.number3.getIconWidth(), this.number3.getIconHeight());

        this.h_4 = new JLabel(this.number4);
        this.h_4.setVisible(true);
        this.h_4.setBounds(110, -106, this.number4.getIconWidth(), this.number4.getIconHeight());

        this.h_5 = new JLabel(this.number5);
        this.h_5.setVisible(true);
        this.h_5.setBounds(110, -106, this.number5.getIconWidth(), this.number5.getIconHeight());

        this.h_6 = new JLabel(this.number6);
        this.h_6.setVisible(true);
        this.h_6.setBounds(110, -106, this.number6.getIconWidth(), this.number6.getIconHeight());

        this.h_7 = new JLabel(this.number7);
        this.h_7.setVisible(true);
        this.h_7.setBounds(110, -106, this.number7.getIconWidth(), this.number7.getIconHeight());

        this.h_8 = new JLabel(this.number8);
        this.h_8.setVisible(true);
        this.h_8.setBounds(110, -106, this.number8.getIconWidth(), this.number8.getIconHeight());

        this.h_9 = new JLabel(this.number9);
        this.h_9.setVisible(true);
        this.h_9.setBounds(110, -106, this.number9.getIconWidth(), this.number9.getIconHeight());

        this.m0 = new JLabel(this.number0);
        this.m0.setVisible(true);
        this.m0.setBounds(240, -106, this.number0.getIconWidth(), this.number0.getIconHeight());

        this.m1 = new JLabel(this.number1);
        this.m1.setVisible(true);
        this.m1.setBounds(240, -106, this.number1.getIconWidth(), this.number1.getIconHeight());

        this.m2 = new JLabel(this.number2);
        this.m2.setVisible(true);
        this.m2.setBounds(240, -106, this.number2.getIconWidth(), this.number2.getIconHeight());

        this.m3 = new JLabel(this.number3);
        this.m3.setVisible(true);
        this.m3.setBounds(240, -106, this.number3.getIconWidth(), this.number3.getIconHeight());

        this.m4 = new JLabel(this.number4);
        this.m4.setVisible(true);
        this.m4.setBounds(240, -106, this.number4.getIconWidth(), this.number4.getIconHeight());

        this.m5 = new JLabel(this.number5);
        this.m5.setVisible(true);
        this.m5.setBounds(240, -106, this.number5.getIconWidth(), this.number5.getIconHeight());

        this.m_0 = new JLabel(this.number0);
        this.m_0.setVisible(true);
        this.m_0.setBounds(330, -106, this.number0.getIconWidth(), this.number0.getIconHeight());

        this.m_1 = new JLabel(this.number1);
        this.m_1.setVisible(true);
        this.m_1.setBounds(330, -106, this.number1.getIconWidth(), this.number1.getIconHeight());

        this.m_2 = new JLabel(this.number2);
        this.m_2.setVisible(true);
        this.m_2.setBounds(330, -106, this.number2.getIconWidth(), this.number2.getIconHeight());

        this.m_3 = new JLabel(this.number3);
        this.m_3.setVisible(true);
        this.m_3.setBounds(330, -106, this.number3.getIconWidth(), this.number3.getIconHeight());

        this.m_4 = new JLabel(this.number4);
        this.m_4.setVisible(true);
        this.m_4.setBounds(330, -106, this.number4.getIconWidth(), this.number4.getIconHeight());

        this.m_5 = new JLabel(this.number5);
        this.m_5.setVisible(true);
        this.m_5.setBounds(330, -106, this.number5.getIconWidth(), this.number5.getIconHeight());

        this.m_6 = new JLabel(this.number6);
        this.m_6.setVisible(true);
        this.m_6.setBounds(330, -106, this.number6.getIconWidth(), this.number6.getIconHeight());

        this.m_7 = new JLabel(this.number7);
        this.m_7.setVisible(true);
        this.m_7.setBounds(330, -106, this.number7.getIconWidth(), this.number7.getIconHeight());

        this.m_8 = new JLabel(this.number8);
        this.m_8.setVisible(true);
        this.m_8.setBounds(330, -106, this.number8.getIconWidth(), this.number8.getIconHeight());

        this.m_9 = new JLabel(this.number9);
        this.m_9.setVisible(true);
        this.m_9.setBounds(330, -106, this.number9.getIconWidth(), this.number9.getIconHeight());

        this.tdot2 = new JLabel(this.twodot);
        this.tdot2.setVisible(true);
        this.tdot2.setBounds(420, 22, this.twodot.getIconWidth(), this.twodot.getIconHeight());

        this.s0 = new JLabel(this.number0);
        this.s0.setVisible(true);
        this.s0.setBounds(460, -106, this.number0.getIconWidth(), this.number0.getIconHeight());

        this.s1 = new JLabel(this.number1);
        this.s1.setVisible(true);
        this.s1.setBounds(460, -106, this.number1.getIconWidth(), this.number1.getIconHeight());

        this.s2 = new JLabel(this.number2);
        this.s2.setVisible(true);
        this.s2.setBounds(460, -106, this.number2.getIconWidth(), this.number2.getIconHeight());

        this.s3 = new JLabel(this.number3);
        this.s3.setVisible(true);
        this.s3.setBounds(460, -106, this.number3.getIconWidth(), this.number3.getIconHeight());

        this.s4 = new JLabel(this.number4);
        this.s4.setVisible(true);
        this.s4.setBounds(460, -106, this.number4.getIconWidth(), this.number4.getIconHeight());

        this.s5 = new JLabel(this.number5);
        this.s5.setVisible(true);
        this.s5.setBounds(460, -106, this.number5.getIconWidth(), this.number5.getIconHeight());

        this.s_0 = new JLabel(this.number0);
        this.s_0.setVisible(true);
        this.s_0.setBounds(550, -106, this.number0.getIconWidth(), this.number0.getIconHeight());

        this.s_1 = new JLabel(this.number1);
        this.s_1.setVisible(true);
        this.s_1.setBounds(550, -106, this.number1.getIconWidth(), this.number1.getIconHeight());

        this.s_2 = new JLabel(this.number2);
        this.s_2.setVisible(true);
        this.s_2.setBounds(550, -106, this.number2.getIconWidth(), this.number2.getIconHeight());

        this.s_3 = new JLabel(this.number3);
        this.s_3.setVisible(true);
        this.s_3.setBounds(550, -106, this.number3.getIconWidth(), this.number3.getIconHeight());

        this.s_4 = new JLabel(this.number4);
        this.s_4.setVisible(true);
        this.s_4.setBounds(550, -106, this.number4.getIconWidth(), this.number4.getIconHeight());

        this.s_5 = new JLabel(this.number5);
        this.s_5.setVisible(true);
        this.s_5.setBounds(550, -106, this.number5.getIconWidth(), this.number5.getIconHeight());

        this.s_6 = new JLabel(this.number6);
        this.s_6.setVisible(true);
        this.s_6.setBounds(550, -106, this.number6.getIconWidth(), this.number6.getIconHeight());

        this.s_7 = new JLabel(this.number7);
        this.s_7.setVisible(true);
        this.s_7.setBounds(550, -106, this.number7.getIconWidth(), this.number7.getIconHeight());

        this.s_8 = new JLabel(this.number8);
        this.s_8.setVisible(true);
        this.s_8.setBounds(550, -106, this.number8.getIconWidth(), this.number8.getIconHeight());

        this.s_9 = new JLabel(this.number9);
        this.s_9.setVisible(true);
        this.s_9.setBounds(550, -106, this.number9.getIconWidth(), this.number9.getIconHeight());

        this.background = new JLayeredPane();
        this.background.setLayout(null);
        this.background.setBackground(Color.black);
        this.background.setOpaque(true);
        this.background.add(this.h0);
        this.background.add(this.h1);
        this.background.add(this.h2);
        this.background.add(this.tdot1);

        this.background.add(this.h_0);
        this.background.add(this.h_1);
        this.background.add(this.h_2);
        this.background.add(this.h_3);
        this.background.add(this.h_4);
        this.background.add(this.h_5);
        this.background.add(this.h_6);
        this.background.add(this.h_7);
        this.background.add(this.h_8);
        this.background.add(this.h_9);

        this.background.add(this.m0);
        this.background.add(this.m1);
        this.background.add(this.m2);
        this.background.add(this.m3);
        this.background.add(this.m4);
        this.background.add(this.m5);

        this.background.add(this.m_0);
        this.background.add(this.m_1);
        this.background.add(this.m_2);
        this.background.add(this.m_3);
        this.background.add(this.m_4);
        this.background.add(this.m_5);
        this.background.add(this.m_6);
        this.background.add(this.m_7);
        this.background.add(this.m_8);
        this.background.add(this.m_9);
        this.background.add(this.tdot2);

        this.background.add(this.s0);
        this.background.add(this.s1);
        this.background.add(this.s2);
        this.background.add(this.s3);
        this.background.add(this.s4);
        this.background.add(this.s5);

        this.background.add(this.s_0);
        this.background.add(this.s_1);
        this.background.add(this.s_2);
        this.background.add(this.s_3);
        this.background.add(this.s_4);
        this.background.add(this.s_5);
        this.background.add(this.s_6);
        this.background.add(this.s_7);
        this.background.add(this.s_8);
        this.background.add(this.s_9);

        this.second = new JCheckBoxMenuItem("Enable second");
        this.alontop = new JCheckBoxMenuItem("Always on top");
        this.theme = new JMenuItem("Black theme");
        this.theme.addActionListener(this);
        this.alontop.addActionListener(this);
        this.exit = new JMenuItem("Exit");
        this.exit.addActionListener(this);
        this.second.addActionListener(this);
        this.second.setSelected(true);
        this.me1 = new JMenu("Option");
        this.me1.add(second);
        this.me1.add(alontop);
        this.me1.add(theme);
        this.me1.add(exit);
        this.mb = new JMenuBar();
        this.mb.add(me1);

        this.Gui = new JFrame("Digital clock");
        this.Gui.setUndecorated(true);
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        this.Gui.setSize(655, 160);
        this.Gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.Gui.setOpacity(0.5f);
        this.Gui.setLocationRelativeTo(null);
        this.Gui.setVisible(true);
        this.Gui.setIconImage(this.icon.getImage());
        this.Gui.setContentPane(this.background);
        this.Gui.setResizable(false);
        this.Gui.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub
                // throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (second.isSelected()) {
                    if (e.getKeyCode() == KeyEvent.VK_UP) {
                        if (Gui.getY() > 0) {
                            Gui.setLocation(Gui.getX(), Gui.getY() - 10);
                        }
                    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                        if (Gui.getY() <= (int) size.getHeight() - 170) {
                            Gui.setLocation(Gui.getX(), Gui.getY() + 10);
                        }
                    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                        if (Gui.getX() <= (int) size.getWidth() - 645) {
                            Gui.setLocation(Gui.getX() + 10, Gui.getY());
                        }
                    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                        if (Gui.getX() >= 0) {
                            Gui.setLocation(Gui.getX() - 10, Gui.getY());
                        }

                    }
                } else {
                    if (e.getKeyCode() == KeyEvent.VK_UP) {
                        if (Gui.getY() > 0) {
                            Gui.setLocation(Gui.getX(), Gui.getY() - 10);
                        }
                    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                        if (Gui.getY() <= (int) size.getHeight() - 170) {
                            Gui.setLocation(Gui.getX(), Gui.getY() + 10);
                        }
                    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                        if (Gui.getX() <= (int) size.getWidth() - 420) {
                            Gui.setLocation(Gui.getX() + 10, Gui.getY());
                        }
                    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                        if (Gui.getX() >= 0) {
                            Gui.setLocation(Gui.getX() - 10, Gui.getY());
                        }

                    }

                }
                AWTKeyStroke ak = AWTKeyStroke.getAWTKeyStrokeForEvent(e);
                if (ak.equals(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_DOWN_MASK))) {
                    if (theme.getText().equals("White theme")) {
                        theme.setText("Black theme");
                        h0.setIcon(number0);
                        h1.setIcon(number1);
                        h2.setIcon(number2);
                        h_0.setIcon(number0);
                        h_1.setIcon(number1);
                        h_2.setIcon(number2);
                        h_3.setIcon(number3);
                        h_4.setIcon(number4);
                        h_5.setIcon(number5);
                        h_6.setIcon(number6);
                        h_7.setIcon(number7);
                        h_8.setIcon(number8);
                        h_9.setIcon(number9);

                        m0.setIcon(number0);
                        m1.setIcon(number1);
                        m2.setIcon(number2);
                        m3.setIcon(number3);
                        m4.setIcon(number4);
                        m5.setIcon(number5);
                        m_0.setIcon(number0);
                        m_1.setIcon(number1);
                        m_2.setIcon(number2);
                        m_3.setIcon(number3);
                        m_4.setIcon(number4);
                        m_5.setIcon(number5);
                        m_6.setIcon(number6);
                        m_7.setIcon(number7);
                        m_8.setIcon(number8);
                        m_9.setIcon(number9);

                        s0.setIcon(number0);
                        s1.setIcon(number1);
                        s2.setIcon(number2);
                        s3.setIcon(number3);
                        s4.setIcon(number4);
                        s5.setIcon(number5);
                        s_1.setIcon(number1);
                        s_2.setIcon(number2);
                        s_3.setIcon(number3);
                        s_4.setIcon(number4);
                        s_5.setIcon(number5);
                        s_6.setIcon(number6);
                        s_7.setIcon(number7);
                        s_8.setIcon(number8);
                        s_9.setIcon(number9);
                        s_0.setIcon(number0);
                        tdot1.setIcon(twodot);
                        tdot2.setIcon(twodot);
                        Gui.setOpacity(0.5F);
                        Gui.setBackground(new Color(0, 0, 0, 0));
                    } else if (theme.getText().equals("Black theme")) {
                        theme.setText("White theme");
                        h0.setIcon(number0_black);
                        h1.setIcon(number1_black);
                        h2.setIcon(number2_black);
                        h_0.setIcon(number0_black);
                        h_1.setIcon(number1_black);
                        h_2.setIcon(number2_black);
                        h_3.setIcon(number3_black);
                        h_4.setIcon(number4_black);
                        h_5.setIcon(number5_black);
                        h_6.setIcon(number6_black);
                        h_7.setIcon(number7_black);
                        h_8.setIcon(number8_black);
                        h_9.setIcon(number9_black);

                        m0.setIcon(number0_black);
                        m1.setIcon(number1_black);
                        m2.setIcon(number2_black);
                        m3.setIcon(number3_black);
                        m4.setIcon(number4_black);
                        m5.setIcon(number5_black);
                        m_0.setIcon(number0_black);
                        m_1.setIcon(number1_black);
                        m_2.setIcon(number2_black);
                        m_3.setIcon(number3_black);
                        m_4.setIcon(number4_black);
                        m_5.setIcon(number5_black);
                        m_6.setIcon(number6_black);
                        m_7.setIcon(number7_black);
                        m_8.setIcon(number8_black);
                        m_9.setIcon(number9_black);

                        s0.setIcon(number0_black);
                        s1.setIcon(number1_black);
                        s2.setIcon(number2_black);
                        s3.setIcon(number3_black);
                        s4.setIcon(number4_black);
                        s5.setIcon(number5_black);
                        s_1.setIcon(number1_black);
                        s_2.setIcon(number2_black);
                        s_3.setIcon(number3_black);
                        s_4.setIcon(number4_black);
                        s_5.setIcon(number5_black);
                        s_6.setIcon(number6_black);
                        s_7.setIcon(number7_black);
                        s_8.setIcon(number8_black);
                        s_9.setIcon(number9_black);
                        s_0.setIcon(number0_black);
                        tdot1.setIcon(twodot_black);
                        tdot2.setIcon(twodot_black);
                        Gui.setOpacity(0.5F);
                        Gui.setBackground(new Color(0, 0, 0, 0));
                    }

                } else if (ak.equals(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK))) {
                    if (second.isSelected() != true) {
                        second.setSelected(true);
                        Gui.setSize(655, 160);
                        Gui.setLocationRelativeTo(null);
                        tdot2.setVisible(true);
                        s0.setVisible(true);
                        s1.setVisible(true);
                        s2.setVisible(true);
                        s3.setVisible(true);
                        s4.setVisible(true);
                        s5.setVisible(true);
                        s_0.setVisible(true);
                        s_1.setVisible(true);
                        s_2.setVisible(true);
                        s_3.setVisible(true);
                        s_4.setVisible(true);
                        s_5.setVisible(true);
                        s_6.setVisible(true);
                        s_7.setVisible(true);
                        s_8.setVisible(true);
                        s_9.setVisible(true);
                    } else {
                        second.setSelected(false);
                        Gui.setSize(435, 160);
                        Gui.setLocationRelativeTo(null);
                        tdot2.setVisible(false);
                        s0.setVisible(false);
                        s1.setVisible(false);
                        s2.setVisible(false);
                        s3.setVisible(false);
                        s4.setVisible(false);
                        s5.setVisible(false);
                        s_0.setVisible(false);
                        s_1.setVisible(false);
                        s_2.setVisible(false);
                        s_3.setVisible(false);
                        s_4.setVisible(false);
                        s_5.setVisible(false);
                        s_6.setVisible(false);
                        s_7.setVisible(false);
                        s_8.setVisible(false);
                        s_9.setVisible(false);
                    }
                } else if (ak.equals(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK))) {
                    if (alontop.isSelected() != true) {
                        Gui.setAlwaysOnTop(true);
                        alontop.setSelected(true);
                    } else {
                        alontop.setSelected(false);
                        Gui.setAlwaysOnTop(false);
                    }
                }else if (ak.equals(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_DOWN_MASK))){
                    setClockSec();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                // throw new UnsupportedOperationException("Unimplemented method
                // 'keyReleased'");
            }

        });
        // this.Gui.setCursor(3);
        this.Gui.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (e.getClickCount() % 2 == 0) {
                        Gui.setOpacity(1f);
                        Gui.setBackground(new Color(0, 0, 0, 0));
                        Gui.setJMenuBar(mb);
                    } else {
                        Gui.setOpacity(0.5f);
                        Gui.setBackground(new Color(0, 0, 0, 0));
                        Gui.setJMenuBar(null);
                    }

                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                // throw new UnsupportedOperationException("Unimplemented method
                // 'mousePressed'");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                // throw new UnsupportedOperationException("Unimplemented method
                // 'mouseReleased'");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub
                // throw new UnsupportedOperationException("Unimplemented method
                // 'mouseEntered'");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                // throw new UnsupportedOperationException("Unimplemented method
                // 'mouseExited'");
            }

        });
        new Thread(new setTime()).start();
        new Thread(new tdotblink()).start();
       
    }

    public void changeSEC() {
        if (this.SEC.equals("00")) {
            if (this.s_1.getY() != -106) {
                this.s_1.setLocation(this.s_1.getX(), this.s_1.getY() - 1);
                this.s_2.setLocation(this.s_2.getX(), this.s_2.getY() - 1);
                this.s_3.setLocation(this.s_3.getX(), this.s_3.getY() - 1);
                this.s_4.setLocation(this.s_4.getX(), this.s_4.getY() - 1);
                this.s_5.setLocation(this.s_5.getX(), this.s_5.getY() - 1);
                this.s_6.setLocation(this.s_6.getX(), this.s_6.getY() - 1);
                this.s_7.setLocation(this.s_7.getX(), this.s_7.getY() - 1);
                this.s_8.setLocation(this.s_8.getX(), this.s_8.getY() - 1);
                if (this.s1.getY() != -106) {
                    this.s1.setLocation(this.s1.getX(), this.s1.getY() - 1);
                    this.s2.setLocation(this.s2.getX(), this.s2.getY() - 1);
                    this.s3.setLocation(this.s3.getX(), this.s3.getY() - 1);
                    this.s4.setLocation(this.s4.getX(), this.s4.getY() - 1);
                    if (this.s_0.getY() != 22) {
                        this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() - 1);
                        if (this.s0.getY() != 22) {
                            this.s0.setLocation(this.s0.getX(), this.s0.getY() - 1);
                            if (this.s5.getY() != -106) {
                                this.s5.setLocation(this.s5.getX(), this.s5.getY() - 1);
                                if (this.s_9.getY() != -106) {
                                    this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                                }
                            } else {
                                if (this.s_9.getY() != -106) {
                                    this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                                }
                            }
                        }
                    } else {
                        if (this.s0.getY() != 22) {
                            this.s0.setLocation(this.s0.getX(), this.s0.getY() - 1);
                            if (this.s5.getY() != -106) {
                                this.s5.setLocation(this.s5.getX(), this.s5.getY() - 1);
                                if (this.s_9.getY() != -106) {
                                    this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                                }
                            } else {
                                if (this.s_9.getY() != -106) {
                                    this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                                }
                            }
                        }
                    }
                } else {
                    if (this.s_0.getY() != 22) {
                        this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() - 1);
                        if (this.s0.getY() != 22) {
                            this.s0.setLocation(this.s0.getX(), this.s0.getY() - 1);
                            if (this.s5.getY() != -106) {
                                this.s5.setLocation(this.s5.getX(), this.s5.getY() - 1);
                                if (this.s_9.getY() != -106) {
                                    this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                                }
                            } else {
                                if (this.s_9.getY() != -106) {
                                    this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                                }
                            }
                        }
                    } else {
                        if (this.s0.getY() != 22) {
                            this.s0.setLocation(this.s0.getX(), this.s0.getY() - 1);
                            if (this.s5.getY() != -106) {
                                this.s5.setLocation(this.s5.getX(), this.s5.getY() - 1);
                                if (this.s_9.getY() != -106) {
                                    this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                                }
                            } else {
                                if (this.s_9.getY() != -106) {
                                    this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                                }
                            }
                        }
                    }
                }
            } else {
                if (this.s1.getY() != -106) {
                    this.s1.setLocation(this.s1.getX(), this.s1.getY() - 1);
                    this.s2.setLocation(this.s2.getX(), this.s2.getY() - 1);
                    this.s3.setLocation(this.s3.getX(), this.s3.getY() - 1);
                    this.s4.setLocation(this.s4.getX(), this.s4.getY() - 1);
                    if (this.s_0.getY() != 22) {
                        this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() - 1);
                        if (this.s0.getY() != 22) {
                            this.s0.setLocation(this.s0.getX(), this.s0.getY() - 1);
                            if (this.s5.getY() != -106) {
                                this.s5.setLocation(this.s5.getX(), this.s5.getY() - 1);
                                if (this.s_9.getY() != -106) {
                                    this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                                }
                            } else {
                                if (this.s_9.getY() != -106) {
                                    this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                                }
                            }
                        }
                    } else {
                        if (this.s0.getY() != 22) {
                            this.s0.setLocation(this.s0.getX(), this.s0.getY() - 1);
                            if (this.s5.getY() != -106) {
                                this.s5.setLocation(this.s5.getX(), this.s5.getY() - 1);
                                if (this.s_9.getY() != -106) {
                                    this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                                }
                            } else {
                                if (this.s_9.getY() != -106) {
                                    this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                                }
                            }
                        }
                    }
                } else {
                    if (this.s_0.getY() != 22) {
                        this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() - 1);
                        if (this.s0.getY() != 22) {
                            this.s0.setLocation(this.s0.getX(), this.s0.getY() - 1);
                            if (this.s5.getY() != -106) {
                                this.s5.setLocation(this.s5.getX(), this.s5.getY() - 1);
                                if (this.s_9.getY() != -106) {
                                    this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                                }
                            } else {
                                if (this.s_9.getY() != -106) {
                                    this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                                }
                            }
                        }
                    } else {
                        if (this.s0.getY() != 22) {
                            this.s0.setLocation(this.s0.getX(), this.s0.getY() - 1);
                            if (this.s5.getY() != -106) {
                                this.s5.setLocation(this.s5.getX(), this.s5.getY() - 1);
                                if (this.s_9.getY() != -106) {
                                    this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                                }
                            } else {
                                if (this.s_9.getY() != -106) {
                                    this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                                }
                            }
                        }
                    }
                }
            }
            changeMIN();
        } else if (this.SEC.equals("01")) {
            if (this.s_1.getY() != 22) {
                this.s_1.setLocation(this.s_1.getX(), this.s_1.getY() + 1);
                if (this.s_0.getY() != 150) {
                    this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() + 1);
                }
            } else {
                if (this.s_0.getY() != 150) {
                    this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("02")) {
            if (this.s_2.getY() != 22) {
                this.s_2.setLocation(this.s_2.getX(), this.s_2.getY() + 1);
                if (this.s_1.getY() != 150) {
                    this.s_1.setLocation(this.s_1.getX(), this.s_1.getY() + 1);
                }
            } else {
                if (this.s_1.getY() != 150) {
                    this.s_1.setLocation(this.s_1.getX(), this.s_1.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("03")) {
            if (this.s_3.getY() != 22) {
                this.s_3.setLocation(this.s_3.getX(), this.s_3.getY() + 1);
                if (this.s_2.getY() != 150) {
                    this.s_2.setLocation(this.s_2.getX(), this.s_2.getY() + 1);
                }
            } else {
                if (this.s_2.getY() != 150) {
                    this.s_2.setLocation(this.s_2.getX(), this.s_2.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("04")) {
            if (this.s_4.getY() != 22) {
                this.s_4.setLocation(this.s_4.getX(), this.s_4.getY() + 1);
                if (this.s_3.getY() != 150) {
                    this.s_3.setLocation(this.s_3.getX(), this.s_3.getY() + 1);
                }
            } else {
                if (this.s_3.getY() != 150) {
                    this.s_3.setLocation(this.s_3.getX(), this.s_3.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("05")) {
            if (this.s_5.getY() != 22) {
                this.s_5.setLocation(this.s_5.getX(), this.s_5.getY() + 1);
                if (this.s_4.getY() != 150) {
                    this.s_4.setLocation(this.s_4.getX(), this.s_4.getY() + 1);
                }
            } else {
                if (this.s_4.getY() != 150) {
                    this.s_4.setLocation(this.s_4.getX(), this.s_4.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("06")) {
            if (this.s_6.getY() != 22) {
                this.s_6.setLocation(this.s_6.getX(), this.s_6.getY() + 1);
                if (this.s_5.getY() != 150) {
                    this.s_5.setLocation(this.s_5.getX(), this.s_5.getY() + 1);
                }
            } else {
                if (this.s_5.getY() != 150) {
                    this.s_5.setLocation(this.s_5.getX(), this.s_5.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("07")) {
            if (this.s_7.getY() != 22) {
                this.s_7.setLocation(this.s_7.getX(), this.s_7.getY() + 1);
                if (this.s_6.getY() != 150) {
                    this.s_6.setLocation(this.s_6.getX(), this.s_6.getY() + 1);
                }
            } else {
                if (this.s_6.getY() != 150) {
                    this.s_6.setLocation(this.s_6.getX(), this.s_6.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("08")) {
            if (this.s_8.getY() != 22) {
                this.s_8.setLocation(this.s_8.getX(), this.s_8.getY() + 1);
                if (this.s_7.getY() != 150) {
                    this.s_7.setLocation(this.s_7.getX(), this.s_7.getY() + 1);
                }
            } else {
                if (this.s_7.getY() != 150) {
                    this.s_7.setLocation(this.s_7.getX(), this.s_7.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("09")) {
            if (this.s_9.getY() != 22) {
                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() + 1);
                if (this.s_8.getY() != 150) {
                    this.s_8.setLocation(this.s_8.getX(), this.s_8.getY() + 1);
                }
            } else {
                if (this.s_8.getY() != 150) {
                    this.s_8.setLocation(this.s_8.getX(), this.s_8.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("10")) {
            if (this.s_1.getY() != -106) {
                this.s_1.setLocation(this.s_1.getX(), this.s_1.getY() - 1);
                this.s_2.setLocation(this.s_2.getX(), this.s_2.getY() - 1);
                this.s_3.setLocation(this.s_3.getX(), this.s_3.getY() - 1);
                this.s_4.setLocation(this.s_4.getX(), this.s_4.getY() - 1);
                this.s_5.setLocation(this.s_5.getX(), this.s_5.getY() - 1);
                this.s_6.setLocation(this.s_6.getX(), this.s_6.getY() - 1);
                this.s_7.setLocation(this.s_7.getX(), this.s_7.getY() - 1);
                this.s_8.setLocation(this.s_8.getX(), this.s_8.getY() - 1);
                if (this.s_0.getY() != 22) {
                    this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() - 1);
                    if (this.s0.getY() != 150) {
                        this.s0.setLocation(this.s0.getX(), this.s0.getY() + 1);
                        if (this.s1.getY() != 22) {
                            this.s1.setLocation(this.s1.getX(), this.s1.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.s1.getY() != 22) {
                            this.s1.setLocation(this.s1.getX(), this.s1.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    }
                } else {
                    if (this.s0.getY() != 150) {
                        this.s0.setLocation(this.s0.getX(), this.s0.getY() + 1);
                        if (this.s1.getY() != 22) {
                            this.s1.setLocation(this.s1.getX(), this.s1.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.s1.getY() != 22) {
                            this.s1.setLocation(this.s1.getX(), this.s1.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    }
                }
            } else {
                if (this.s_0.getY() != 22) {
                    this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() - 1);
                    if (this.s0.getY() != 150) {
                        this.s0.setLocation(this.s0.getX(), this.s0.getY() + 1);
                        if (this.s1.getY() != 22) {
                            this.s1.setLocation(this.s1.getX(), this.s1.getY() + 1);
                        }
                    } else {
                        if (this.s1.getY() != 22) {
                            this.s1.setLocation(this.s1.getX(), this.s1.getY() + 1);
                        }
                    }
                } else {
                    if (this.s0.getY() != 150) {
                        this.s0.setLocation(this.s0.getX(), this.s0.getY() + 1);
                        if (this.s1.getY() != 22) {
                            this.s1.setLocation(this.s1.getX(), this.s1.getY() + 1);
                        }
                    } else {
                        if (this.s1.getY() != 22) {
                            this.s1.setLocation(this.s1.getX(), this.s1.getY() + 1);
                        }
                    }
                }
            }
            changeMIN();
        } else if (this.SEC.equals("11")) {
            if (this.s_1.getY() != 22) {
                this.s_1.setLocation(this.s_1.getX(), this.s_1.getY() + 1);
                if (this.s_0.getY() != 150) {
                    this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() + 1);
                }
            } else {
                if (this.s_0.getY() != 150) {
                    this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("12")) {
            if (this.s_2.getY() != 22) {
                this.s_2.setLocation(this.s_2.getX(), this.s_2.getY() + 1);
                if (this.s_1.getY() != 150) {
                    this.s_1.setLocation(this.s_1.getX(), this.s_1.getY() + 1);
                }
            } else {
                if (this.s_1.getY() != 150) {
                    this.s_1.setLocation(this.s_1.getX(), this.s_1.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("13")) {
            if (this.s_3.getY() != 22) {
                this.s_3.setLocation(this.s_3.getX(), this.s_3.getY() + 1);
                if (this.s_2.getY() != 150) {
                    this.s_2.setLocation(this.s_2.getX(), this.s_2.getY() + 1);
                }
            } else {
                if (this.s_2.getY() != 150) {
                    this.s_2.setLocation(this.s_2.getX(), this.s_2.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("14")) {
            if (this.s_4.getY() != 22) {
                this.s_4.setLocation(this.s_4.getX(), this.s_4.getY() + 1);
                if (this.s_3.getY() != 150) {
                    this.s_3.setLocation(this.s_3.getX(), this.s_3.getY() + 1);
                }
            } else {
                if (this.s_3.getY() != 150) {
                    this.s_3.setLocation(this.s_3.getX(), this.s_3.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("15")) {
            if (this.s_5.getY() != 22) {
                this.s_5.setLocation(this.s_5.getX(), this.s_5.getY() + 1);
                if (this.s_4.getY() != 150) {
                    this.s_4.setLocation(this.s_4.getX(), this.s_4.getY() + 1);
                }
            } else {
                if (this.s_4.getY() != 150) {
                    this.s_4.setLocation(this.s_4.getX(), this.s_4.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("16")) {
            if (this.s_6.getY() != 22) {
                this.s_6.setLocation(this.s_6.getX(), this.s_6.getY() + 1);
                if (this.s_5.getY() != 150) {
                    this.s_5.setLocation(this.s_5.getX(), this.s_5.getY() + 1);
                }
            } else {
                if (this.s_5.getY() != 150) {
                    this.s_5.setLocation(this.s_5.getX(), this.s_5.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("17")) {
            if (this.s_7.getY() != 22) {
                this.s_7.setLocation(this.s_7.getX(), this.s_7.getY() + 1);
                if (this.s_6.getY() != 150) {
                    this.s_6.setLocation(this.s_6.getX(), this.s_6.getY() + 1);
                }
            } else {
                if (this.s_6.getY() != 150) {
                    this.s_6.setLocation(this.s_6.getX(), this.s_6.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("18")) {
            if (this.s_8.getY() != 22) {
                this.s_8.setLocation(this.s_8.getX(), this.s_8.getY() + 1);
                if (this.s_7.getY() != 150) {
                    this.s_7.setLocation(this.s_7.getX(), this.s_7.getY() + 1);
                }
            } else {
                if (this.s_7.getY() != 150) {
                    this.s_7.setLocation(this.s_7.getX(), this.s_7.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("19")) {
            if (this.s_9.getY() != 22) {
                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() + 1);
                if (this.s_8.getY() != 150) {
                    this.s_8.setLocation(this.s_8.getX(), this.s_8.getY() + 1);
                }
            } else {
                if (this.s_4.getY() != 150) {
                    this.s_8.setLocation(this.s_8.getX(), this.s_8.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("20")) {
            if (this.s_1.getY() != -106) {
                this.s_1.setLocation(this.s_1.getX(), this.s_1.getY() - 1);
                this.s_2.setLocation(this.s_2.getX(), this.s_2.getY() - 1);
                this.s_3.setLocation(this.s_3.getX(), this.s_3.getY() - 1);
                this.s_4.setLocation(this.s_4.getX(), this.s_4.getY() - 1);
                this.s_5.setLocation(this.s_5.getX(), this.s_5.getY() - 1);
                this.s_6.setLocation(this.s_6.getX(), this.s_6.getY() - 1);
                this.s_7.setLocation(this.s_7.getX(), this.s_7.getY() - 1);
                this.s_8.setLocation(this.s_8.getX(), this.s_8.getY() - 1);
                if (this.s_0.getY() != 22) {
                    this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() - 1);
                    if (this.s1.getY() != 150) {
                        this.s1.setLocation(this.s1.getX(), this.s1.getY() + 1);
                        if (this.s2.getY() != 22) {
                            this.s2.setLocation(this.s2.getX(), this.s2.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.s2.getY() != 22) {
                            this.s2.setLocation(this.s2.getX(), this.s2.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    }
                } else {
                    if (this.s1.getY() != 150) {
                        this.s1.setLocation(this.s1.getX(), this.s1.getY() + 1);
                        if (this.s2.getY() != 22) {
                            this.s2.setLocation(this.s2.getX(), this.s2.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.s2.getY() != 22) {
                            this.s2.setLocation(this.s2.getX(), this.s2.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    }
                }
            } else {
                if (this.s_0.getY() != 22) {
                    this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() - 1);
                    if (this.s1.getY() != 150) {
                        this.s1.setLocation(this.s1.getX(), this.s1.getY() + 1);
                        if (this.s2.getY() != 22) {
                            this.s2.setLocation(this.s2.getX(), this.s2.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.s2.getY() != 22) {
                            this.s2.setLocation(this.s2.getX(), this.s2.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    }
                } else {
                    if (this.s1.getY() != 150) {
                        this.s1.setLocation(this.s1.getX(), this.s1.getY() + 1);
                        if (this.s2.getY() != 22) {
                            this.s2.setLocation(this.s2.getX(), this.s2.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.s2.getY() != 22) {
                            this.s2.setLocation(this.s2.getX(), this.s2.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    }
                }
            }
            changeMIN();
        } else if (this.SEC.equals("21")) {
            if (this.s_1.getY() != 22) {
                this.s_1.setLocation(this.s_1.getX(), this.s_1.getY() + 1);
                if (this.s_0.getY() != 150) {
                    this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() + 1);
                }
            } else {
                if (this.s_0.getY() != 150) {
                    this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("22")) {
            if (this.s_2.getY() != 22) {
                this.s_2.setLocation(this.s_2.getX(), this.s_2.getY() + 1);
                if (this.s_1.getY() != 150) {
                    this.s_1.setLocation(this.s_1.getX(), this.s_1.getY() + 1);
                }
            } else {
                if (this.s_1.getY() != 150) {
                    this.s_1.setLocation(this.s_1.getX(), this.s_1.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("23")) {
            if (this.s_3.getY() != 22) {
                this.s_3.setLocation(this.s_3.getX(), this.s_3.getY() + 1);
                if (this.s_2.getY() != 150) {
                    this.s_2.setLocation(this.s_2.getX(), this.s_2.getY() + 1);
                }
            } else {
                if (this.s_2.getY() != 150) {
                    this.s_2.setLocation(this.s_2.getX(), this.s_2.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("24")) {
            if (this.s_4.getY() != 22) {
                this.s_4.setLocation(this.s_4.getX(), this.s_4.getY() + 1);
                if (this.s_3.getY() != 150) {
                    this.s_3.setLocation(this.s_3.getX(), this.s_3.getY() + 1);
                }
            } else {
                if (this.s_3.getY() != 150) {
                    this.s_3.setLocation(this.s_3.getX(), this.s_3.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("25")) {
            if (this.s_5.getY() != 22) {
                this.s_5.setLocation(this.s_5.getX(), this.s_5.getY() + 1);
                if (this.s_4.getY() != 150) {
                    this.s_4.setLocation(this.s_4.getX(), this.s_4.getY() + 1);
                }
            } else {
                if (this.s_4.getY() != 150) {
                    this.s_4.setLocation(this.s_4.getX(), this.s_4.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("26")) {
            if (this.s_6.getY() != 22) {
                this.s_6.setLocation(this.s_6.getX(), this.s_6.getY() + 1);
                if (this.s_5.getY() != 150) {
                    this.s_5.setLocation(this.s_5.getX(), this.s_5.getY() + 1);
                }
            } else {
                if (this.s_5.getY() != 150) {
                    this.s_5.setLocation(this.s_5.getX(), this.s_5.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("27")) {
            if (this.s_7.getY() != 22) {
                this.s_7.setLocation(this.s_7.getX(), this.s_7.getY() + 1);
                if (this.s_6.getY() != 150) {
                    this.s_6.setLocation(this.s_6.getX(), this.s_6.getY() + 1);
                }
            } else {
                if (this.s_6.getY() != 150) {
                    this.s_6.setLocation(this.s_6.getX(), this.s_6.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("28")) {
            if (this.s_8.getY() != 22) {
                this.s_8.setLocation(this.s_8.getX(), this.s_8.getY() + 1);
                if (this.s_7.getY() != 150) {
                    this.s_7.setLocation(this.s_7.getX(), this.s_7.getY() + 1);
                }
            } else {
                if (this.s_7.getY() != 150) {
                    this.s_7.setLocation(this.s_7.getX(), this.s_7.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("29")) {
            if (this.s_9.getY() != 22) {
                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() + 1);
                if (this.s_8.getY() != 150) {
                    this.s_8.setLocation(this.s_8.getX(), this.s_8.getY() + 1);
                }
            } else {
                if (this.s_8.getY() != 150) {
                    this.s_8.setLocation(this.s_8.getX(), this.s_8.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("30")) {
            if (this.s_1.getY() != -106) {
                this.s_1.setLocation(this.s_1.getX(), this.s_1.getY() - 1);
                this.s_2.setLocation(this.s_2.getX(), this.s_2.getY() - 1);
                this.s_3.setLocation(this.s_3.getX(), this.s_3.getY() - 1);
                this.s_4.setLocation(this.s_4.getX(), this.s_4.getY() - 1);
                this.s_5.setLocation(this.s_5.getX(), this.s_5.getY() - 1);
                this.s_6.setLocation(this.s_6.getX(), this.s_6.getY() - 1);
                this.s_7.setLocation(this.s_7.getX(), this.s_7.getY() - 1);
                this.s_8.setLocation(this.s_8.getX(), this.s_8.getY() - 1);
                if (this.s_0.getY() != 22) {
                    this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() - 1);
                    if (this.s2.getY() != 150) {
                        this.s2.setLocation(this.s2.getX(), this.s2.getY() + 1);
                        if (this.s3.getY() != 22) {
                            this.s3.setLocation(this.s3.getX(), this.s3.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.s3.getY() != 22) {
                            this.s3.setLocation(this.s3.getX(), this.s3.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    }
                } else {
                    if (this.s2.getY() != 150) {
                        this.s2.setLocation(this.s2.getX(), this.s2.getY() + 1);
                        if (this.s3.getY() != 22) {
                            this.s3.setLocation(this.s3.getX(), this.s3.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.s3.getY() != 22) {
                            this.s3.setLocation(this.s3.getX(), this.s3.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    }
                }
            } else {
                if (this.s_0.getY() != 22) {
                    this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() - 1);
                    if (this.s2.getY() != 150) {
                        this.s2.setLocation(this.s2.getX(), this.s2.getY() + 1);
                        if (this.s3.getY() != 22) {
                            this.s3.setLocation(this.s3.getX(), this.s3.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.s3.getY() != 22) {
                            this.s3.setLocation(this.s3.getX(), this.s3.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    }
                } else {
                    if (this.s2.getY() != 150) {
                        this.s2.setLocation(this.s2.getX(), this.s2.getY() + 1);
                        if (this.s3.getY() != 22) {
                            this.s3.setLocation(this.s3.getX(), this.s3.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.s3.getY() != 22) {
                            this.s3.setLocation(this.s3.getX(), this.s3.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    }
                }
            }
            changeMIN();
        } else if (this.SEC.equals("31")) {
            if (this.s_1.getY() != 22) {
                this.s_1.setLocation(this.s_1.getX(), this.s_1.getY() + 1);
                if (this.s_0.getY() != 150) {
                    this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() + 1);
                }
            } else {
                if (this.s_0.getY() != 150) {
                    this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() + 1);
                }
            }
        } else if (this.SEC.equals("32")) {
            if (this.s_2.getY() != 22) {
                this.s_2.setLocation(this.s_2.getX(), this.s_2.getY() + 1);
                if (this.s_1.getY() != 150) {
                    this.s_1.setLocation(this.s_1.getX(), this.s_1.getY() + 1);
                }
            } else {
                if (this.s_1.getY() != 150) {
                    this.s_1.setLocation(this.s_1.getX(), this.s_1.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("33")) {
            if (this.s_3.getY() != 22) {
                this.s_3.setLocation(this.s_3.getX(), this.s_3.getY() + 1);
                if (this.s_2.getY() != 150) {
                    this.s_2.setLocation(this.s_2.getX(), this.s_2.getY() + 1);
                }
            } else {
                if (this.s_2.getY() != 150) {
                    this.s_2.setLocation(this.s_2.getX(), this.s_2.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("34")) {
            if (this.s_4.getY() != 22) {
                this.s_4.setLocation(this.s_4.getX(), this.s_4.getY() + 1);
                if (this.s_3.getY() != 150) {
                    this.s_3.setLocation(this.s_3.getX(), this.s_3.getY() + 1);
                }
            } else {
                if (this.s_3.getY() != 150) {
                    this.s_3.setLocation(this.s_3.getX(), this.s_3.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("35")) {
            if (this.s_5.getY() != 22) {
                this.s_5.setLocation(this.s_5.getX(), this.s_5.getY() + 1);
                if (this.s_4.getY() != 150) {
                    this.s_4.setLocation(this.s_4.getX(), this.s_4.getY() + 1);
                }
            } else {
                if (this.s_4.getY() != 150) {
                    this.s_4.setLocation(this.s_4.getX(), this.s_4.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("36")) {
            if (this.s_6.getY() != 22) {
                this.s_6.setLocation(this.s_6.getX(), this.s_6.getY() + 1);
                if (this.s_5.getY() != 150) {
                    this.s_5.setLocation(this.s_5.getX(), this.s_5.getY() + 1);
                }
            } else {
                if (this.s_5.getY() != 150) {
                    this.s_5.setLocation(this.s_5.getX(), this.s_5.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("37")) {
            if (this.s_7.getY() != 22) {
                this.s_7.setLocation(this.s_7.getX(), this.s_7.getY() + 1);
                if (this.s_6.getY() != 150) {
                    this.s_6.setLocation(this.s_6.getX(), this.s_6.getY() + 1);
                }
            } else {
                if (this.s_6.getY() != 150) {
                    this.s_6.setLocation(this.s_6.getX(), this.s_6.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("38")) {
            if (this.s_8.getY() != 22) {
                this.s_8.setLocation(this.s_8.getX(), this.s_8.getY() + 1);
                if (this.s_7.getY() != 150) {
                    this.s_7.setLocation(this.s_7.getX(), this.s_7.getY() + 1);
                }
            } else {
                if (this.s_7.getY() != 150) {
                    this.s_7.setLocation(this.s_7.getX(), this.s_7.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("39")) {
            if (this.s_9.getY() != 22) {
                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() + 1);
                if (this.s_8.getY() != 150) {
                    this.s_8.setLocation(this.s_8.getX(), this.s_8.getY() + 1);
                }
            } else {
                if (this.s_8.getY() != 150) {
                    this.s_8.setLocation(this.s_8.getX(), this.s_8.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("40")) {
            if (this.s_1.getY() != -106) {
                this.s_1.setLocation(this.s_1.getX(), this.s_1.getY() - 1);
                this.s_2.setLocation(this.s_2.getX(), this.s_2.getY() - 1);
                this.s_3.setLocation(this.s_3.getX(), this.s_3.getY() - 1);
                this.s_4.setLocation(this.s_4.getX(), this.s_4.getY() - 1);
                this.s_5.setLocation(this.s_5.getX(), this.s_5.getY() - 1);
                this.s_6.setLocation(this.s_6.getX(), this.s_6.getY() - 1);
                this.s_7.setLocation(this.s_7.getX(), this.s_7.getY() - 1);
                this.s_8.setLocation(this.s_8.getX(), this.s_8.getY() - 1);
                if (this.s_0.getY() != 22) {
                    this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() - 1);
                    if (this.s3.getY() != 150) {
                        this.s3.setLocation(this.s3.getX(), this.s3.getY() + 1);
                        if (this.s4.getY() != 22) {
                            this.s4.setLocation(this.s4.getX(), this.s4.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.s4.getY() != 22) {
                            this.s4.setLocation(this.s4.getX(), this.s4.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    }
                } else {
                    if (this.s3.getY() != 150) {
                        this.s3.setLocation(this.s3.getX(), this.s3.getY() + 1);
                        if (this.s4.getY() != 22) {
                            this.s4.setLocation(this.s4.getX(), this.s4.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.s4.getY() != 22) {
                            this.s4.setLocation(this.s4.getX(), this.s4.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    }
                }
            } else {
                if (this.s_0.getY() != 22) {
                    this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() - 1);
                    if (this.s3.getY() != 150) {
                        this.s3.setLocation(this.s3.getX(), this.s3.getY() + 1);
                        if (this.s4.getY() != 22) {
                            this.s4.setLocation(this.s4.getX(), this.s4.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.s4.getY() != 22) {
                            this.s4.setLocation(this.s4.getX(), this.s4.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    }
                } else {
                    if (this.s3.getY() != 150) {
                        this.s3.setLocation(this.s3.getX(), this.s3.getY() + 1);
                        if (this.s4.getY() != 22) {
                            this.s4.setLocation(this.s4.getX(), this.s4.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.s4.getY() != 22) {
                            this.s4.setLocation(this.s4.getX(), this.s4.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    }
                }
            }
            changeMIN();
        } else if (this.SEC.equals("41")) {
            if (this.s_1.getY() != 22) {
                this.s_1.setLocation(this.s_1.getX(), this.s_1.getY() + 1);
                if (this.s_0.getY() != 150) {
                    this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() + 1);
                }
            } else {
                if (this.s_0.getY() != 150) {
                    this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("42")) {
            if (this.s_2.getY() != 22) {
                this.s_2.setLocation(this.s_2.getX(), this.s_2.getY() + 1);
                if (this.s_1.getY() != 150) {
                    this.s_1.setLocation(this.s_1.getX(), this.s_1.getY() + 1);
                }
            } else {
                if (this.s_1.getY() != 150) {
                    this.s_1.setLocation(this.s_1.getX(), this.s_1.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("43")) {
            if (this.s_3.getY() != 22) {
                this.s_3.setLocation(this.s_3.getX(), this.s_3.getY() + 1);
                if (this.s_2.getY() != 150) {
                    this.s_2.setLocation(this.s_2.getX(), this.s_2.getY() + 1);
                }
            } else {
                if (this.s_2.getY() != 150) {
                    this.s_2.setLocation(this.s_2.getX(), this.s_2.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("44")) {
            if (this.s_4.getY() != 22) {
                this.s_4.setLocation(this.s_4.getX(), this.s_4.getY() + 1);
                if (this.s_3.getY() != 150) {
                    this.s_3.setLocation(this.s_3.getX(), this.s_3.getY() + 1);
                }
            } else {
                if (this.s_3.getY() != 150) {
                    this.s_3.setLocation(this.s_3.getX(), this.s_3.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("45")) {
            if (this.s_5.getY() != 22) {
                this.s_5.setLocation(this.s_5.getX(), this.s_5.getY() + 1);
                if (this.s_4.getY() != 150) {
                    this.s_4.setLocation(this.s_4.getX(), this.s_4.getY() + 1);
                }
            } else {
                if (this.s_4.getY() != 150) {
                    this.s_4.setLocation(this.s_4.getX(), this.s_4.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("46")) {
            if (this.s_6.getY() != 22) {
                this.s_6.setLocation(this.s_6.getX(), this.s_6.getY() + 1);
                if (this.s_5.getY() != 150) {
                    this.s_5.setLocation(this.s_5.getX(), this.s_5.getY() + 1);
                }
            } else {
                if (this.s_5.getY() != 150) {
                    this.s_5.setLocation(this.s_5.getX(), this.s_5.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("47")) {
            if (this.s_7.getY() != 22) {
                this.s_7.setLocation(this.s_7.getX(), this.s_7.getY() + 1);
                if (this.s_6.getY() != 150) {
                    this.s_6.setLocation(this.s_6.getX(), this.s_6.getY() + 1);
                }
            } else {
                if (this.s_6.getY() != 150) {
                    this.s_6.setLocation(this.s_6.getX(), this.s_6.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("48")) {
            if (this.s_8.getY() != 22) {
                this.s_8.setLocation(this.s_8.getX(), this.s_8.getY() + 1);
                if (this.s_7.getY() != 150) {
                    this.s_7.setLocation(this.s_7.getX(), this.s_7.getY() + 1);
                }
            } else {
                if (this.s_7.getY() != 150) {
                    this.s_7.setLocation(this.s_7.getX(), this.s_7.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("49")) {
            if (this.s_9.getY() != 22) {
                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() + 1);
                if (this.s_8.getY() != 150) {
                    this.s_8.setLocation(this.s_8.getX(), this.s_8.getY() + 1);
                }
            } else {
                if (this.s_8.getY() != 150) {
                    this.s_8.setLocation(this.s_8.getX(), this.s_8.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("50")) {
            if (this.s_1.getY() != -106) {
                this.s_1.setLocation(this.s_1.getX(), this.s_1.getY() - 1);
                this.s_2.setLocation(this.s_2.getX(), this.s_2.getY() - 1);
                this.s_3.setLocation(this.s_3.getX(), this.s_3.getY() - 1);
                this.s_4.setLocation(this.s_4.getX(), this.s_4.getY() - 1);
                this.s_5.setLocation(this.s_5.getX(), this.s_5.getY() - 1);
                this.s_6.setLocation(this.s_6.getX(), this.s_6.getY() - 1);
                this.s_7.setLocation(this.s_7.getX(), this.s_7.getY() - 1);
                this.s_8.setLocation(this.s_8.getX(), this.s_8.getY() - 1);
                if (this.s_0.getY() != 22) {
                    this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() - 1);
                    if (this.s4.getY() != 150) {
                        this.s4.setLocation(this.s4.getX(), this.s4.getY() + 1);
                        if (this.s5.getY() != 22) {
                            this.s5.setLocation(this.s5.getX(), this.s5.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.s5.getY() != 22) {
                            this.s5.setLocation(this.s5.getX(), this.s5.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    }
                } else {
                    if (this.s4.getY() != 150) {
                        this.s4.setLocation(this.s4.getX(), this.s4.getY() + 1);
                        if (this.s5.getY() != 22) {
                            this.s5.setLocation(this.s5.getX(), this.s5.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.s5.getY() != 22) {
                            this.s5.setLocation(this.s5.getX(), this.s5.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    }
                }
            } else {
                if (this.s_0.getY() != 22) {
                    this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() - 1);
                    if (this.s4.getY() != 150) {
                        this.s4.setLocation(this.s4.getX(), this.s4.getY() + 1);
                        if (this.s5.getY() != 22) {
                            this.s5.setLocation(this.s5.getX(), this.s5.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.s5.getY() != 22) {
                            this.s5.setLocation(this.s5.getX(), this.s5.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    }
                } else {
                    if (this.s4.getY() != 150) {
                        this.s4.setLocation(this.s4.getX(), this.s4.getY() + 1);
                        if (this.s5.getY() != 22) {
                            this.s5.setLocation(this.s5.getX(), this.s5.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.s5.getY() != 22) {
                            this.s5.setLocation(this.s5.getX(), this.s5.getY() + 1);
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        } else {
                            if (this.s_9.getY() != -106) {
                                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() - 1);
                            }
                        }
                    }
                }
            }
            changeMIN();
        } else if (this.SEC.equals("51")) {
            if (this.s_1.getY() != 22) {
                this.s_1.setLocation(this.s_1.getX(), this.s_1.getY() + 1);
                if (this.s_0.getY() != 150) {
                    this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() + 1);
                }
            } else {
                if (this.s_0.getY() != 150) {
                    this.s_0.setLocation(this.s_0.getX(), this.s_0.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("52")) {
            if (this.s_2.getY() != 22) {
                this.s_2.setLocation(this.s_2.getX(), this.s_2.getY() + 1);
                if (this.s_1.getY() != 150) {
                    this.s_1.setLocation(this.s_1.getX(), this.s_1.getY() + 1);
                }
            } else {
                if (this.s_1.getY() != 150) {
                    this.s_1.setLocation(this.s_1.getX(), this.s_1.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("53")) {
            if (this.s_3.getY() != 22) {
                this.s_3.setLocation(this.s_3.getX(), this.s_3.getY() + 1);
                if (this.s_2.getY() != 150) {
                    this.s_2.setLocation(this.s_2.getX(), this.s_2.getY() + 1);
                }
            } else {
                if (this.s_2.getY() != 150) {
                    this.s_2.setLocation(this.s_2.getX(), this.s_2.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("54")) {
            if (this.s_4.getY() != 22) {
                this.s_4.setLocation(this.s_4.getX(), this.s_4.getY() + 1);
                if (this.s_3.getY() != 150) {
                    this.s_3.setLocation(this.s_3.getX(), this.s_3.getY() + 1);
                }
            } else {
                if (this.s_3.getY() != 150) {
                    this.s_3.setLocation(this.s_3.getX(), this.s_3.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("55")) {
            if (this.s_5.getY() != 22) {
                this.s_5.setLocation(this.s_5.getX(), this.s_5.getY() + 1);
                if (this.s_4.getY() != 150) {
                    this.s_4.setLocation(this.s_4.getX(), this.s_4.getY() + 1);
                }
            } else {
                if (this.s_4.getY() != 150) {
                    this.s_4.setLocation(this.s_4.getX(), this.s_4.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("56")) {
            if (this.s_6.getY() != 22) {
                this.s_6.setLocation(this.s_6.getX(), this.s_6.getY() + 1);
                if (this.s_5.getY() != 150) {
                    this.s_5.setLocation(this.s_5.getX(), this.s_5.getY() + 1);
                }
            } else {
                if (this.s_5.getY() != 150) {
                    this.s_5.setLocation(this.s_5.getX(), this.s_5.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("57")) {
            if (this.s_7.getY() != 22) {
                this.s_7.setLocation(this.s_7.getX(), this.s_7.getY() + 1);
                if (this.s_6.getY() != 150) {
                    this.s_6.setLocation(this.s_6.getX(), this.s_6.getY() + 1);
                }
            } else {
                if (this.s_6.getY() != 150) {
                    this.s_6.setLocation(this.s_6.getX(), this.s_6.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("58")) {
            if (this.s_8.getY() != 22) {
                this.s_8.setLocation(this.s_8.getX(), this.s_8.getY() + 1);
                if (this.s_7.getY() != 150) {
                    this.s_7.setLocation(this.s_7.getX(), this.s_7.getY() + 1);
                }
            } else {
                if (this.s_7.getY() != 150) {
                    this.s_7.setLocation(this.s_7.getX(), this.s_7.getY() + 1);
                }
            }
            changeMIN();
        } else if (this.SEC.equals("59")) {
            if (this.s_9.getY() != 22) {
                this.s_9.setLocation(this.s_9.getX(), this.s_9.getY() + 1);
                if (this.s_8.getY() != 150) {
                    this.s_8.setLocation(this.s_8.getX(), this.s_8.getY() + 1);
                }
            } else {
                if (this.s_8.getY() != 150) {
                    this.s_8.setLocation(this.s_8.getX(), this.s_8.getY() + 1);
                }
            }
            changeMIN();
        }
    }

    public void changeMIN() {
        if (MIN.equals("00")) {
            if (this.m_1.getY() != -106) {
                this.m_1.setLocation(this.m_1.getX(), this.m_1.getY() - 1);
                this.m_2.setLocation(this.m_2.getX(), this.m_2.getY() - 1);
                this.m_3.setLocation(this.m_3.getX(), this.m_3.getY() - 1);
                this.m_4.setLocation(this.m_4.getX(), this.m_4.getY() - 1);
                this.m_5.setLocation(this.m_5.getX(), this.m_5.getY() - 1);
                this.m_6.setLocation(this.m_6.getX(), this.m_6.getY() - 1);
                this.m_7.setLocation(this.m_7.getX(), this.m_7.getY() - 1);
                this.m_8.setLocation(this.m_8.getX(), this.m_8.getY() - 1);
                if (this.m1.getY() != -106) {
                    this.m1.setLocation(this.m1.getX(), this.m1.getY() - 1);
                    this.m2.setLocation(this.m2.getX(), this.m2.getY() - 1);
                    this.m3.setLocation(this.m3.getX(), this.m3.getY() - 1);
                    this.m4.setLocation(this.m4.getX(), this.m4.getY() - 1);
                    if (this.m_0.getY() != 22) {
                        this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() - 1);
                        if (this.m0.getY() != 22) {
                            this.m0.setLocation(this.m0.getX(), this.m0.getY() - 1);
                            if (this.m5.getY() != 106) {
                                this.m5.setLocation(this.m5.getX(), this.m5.getY() - 1);
                                if (this.m_9.getY() != 106) {
                                    this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                                }
                            }
                        } else {
                            if (this.m5.getY() != 106) {
                                this.m5.setLocation(this.m5.getX(), this.m5.getY() - 1);
                                if (this.m_9.getY() != 106) {
                                    this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                                }
                            }
                        }
                    } else {
                        if (this.m0.getY() != 22) {
                            this.m0.setLocation(this.m0.getX(), this.m0.getY() - 1);
                            if (this.m5.getY() != 106) {
                                this.m5.setLocation(this.m5.getX(), this.m5.getY() - 1);
                                if (this.m_9.getY() != 106) {
                                    this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                                }
                            }
                        } else {
                            if (this.m5.getY() != 106) {
                                this.m5.setLocation(this.m5.getX(), this.m5.getY() - 1);
                                if (this.m_9.getY() != 106) {
                                    this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                                }
                            }
                        }
                    }
                } else {
                    if (this.m_0.getY() != 22) {
                        this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() - 1);
                        if (this.m0.getY() != 22) {
                            this.m0.setLocation(this.m0.getX(), this.m0.getY() - 1);
                            if (this.m5.getY() != 106) {
                                this.m5.setLocation(this.m5.getX(), this.m5.getY() - 1);
                                if (this.m_9.getY() != 106) {
                                    this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                                }
                            }
                        } else {
                            if (this.m5.getY() != 106) {
                                this.m5.setLocation(this.m5.getX(), this.m5.getY() - 1);
                                if (this.m_9.getY() != 106) {
                                    this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                                }
                            }
                        }
                    } else {
                        if (this.m0.getY() != 22) {
                            this.m0.setLocation(this.m0.getX(), this.m0.getY() - 1);
                            if (this.m5.getY() != 106) {
                                this.m5.setLocation(this.m5.getX(), this.m5.getY() - 1);
                                if (this.m_9.getY() != 106) {
                                    this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                                }
                            }
                        } else {
                            if (this.m5.getY() != 106) {
                                this.m5.setLocation(this.m5.getX(), this.m5.getY() - 1);
                                if (this.m_9.getY() != 106) {
                                    this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                                }
                            }
                        }
                    }
                }
            } else {
                if (this.m1.getY() != -106) {
                    this.m1.setLocation(this.m1.getX(), this.m1.getY() - 1);
                    this.m2.setLocation(this.m2.getX(), this.m2.getY() - 1);
                    this.m3.setLocation(this.m3.getX(), this.m3.getY() - 1);
                    this.m4.setLocation(this.m4.getX(), this.m4.getY() - 1);
                    if (this.m_0.getY() != 22) {
                        this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() - 1);
                        if (this.m0.getY() != 22) {
                            this.m0.setLocation(this.m0.getX(), this.m0.getY() - 1);
                            if (this.m5.getY() != 106) {
                                this.m5.setLocation(this.m5.getX(), this.m5.getY() - 1);
                                if (this.m_9.getY() != 106) {
                                    this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                                }
                            }
                        } else {
                            if (this.m5.getY() != 106) {
                                this.m5.setLocation(this.m5.getX(), this.m5.getY() - 1);
                                if (this.m_9.getY() != 106) {
                                    this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                                }
                            }
                        }
                    } else {
                        if (this.m0.getY() != 22) {
                            this.m0.setLocation(this.m0.getX(), this.m0.getY() - 1);
                            if (this.m5.getY() != 106) {
                                this.m5.setLocation(this.m5.getX(), this.m5.getY() - 1);
                                if (this.m_9.getY() != 106) {
                                    this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                                }
                            }
                        } else {
                            if (this.m5.getY() != 106) {
                                this.m5.setLocation(this.m5.getX(), this.m5.getY() - 1);
                                if (this.m_9.getY() != 106) {
                                    this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                                }
                            }
                        }
                    }
                } else {
                    if (this.m_0.getY() != 22) {
                        this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() - 1);
                        if (this.m0.getY() != 22) {
                            this.m0.setLocation(this.m0.getX(), this.m0.getY() - 1);
                            if (this.m5.getY() != 106) {
                                this.m5.setLocation(this.m5.getX(), this.m5.getY() - 1);
                                if (this.m_9.getY() != 106) {
                                    this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                                }
                            }
                        } else {
                            if (this.m5.getY() != 106) {
                                this.m5.setLocation(this.m5.getX(), this.m5.getY() - 1);
                                if (this.m_9.getY() != 106) {
                                    this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                                }
                            }
                        }
                    } else {
                        if (this.m0.getY() != 22) {
                            this.m0.setLocation(this.m0.getX(), this.m0.getY() - 1);
                            if (this.m5.getY() != 106) {
                                this.m5.setLocation(this.m5.getX(), this.m5.getY() - 1);
                                if (this.m_9.getY() != 106) {
                                    this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                                }
                            }
                        } else {
                            if (this.m5.getY() != 106) {
                                this.m5.setLocation(this.m5.getX(), this.m5.getY() - 1);
                                if (this.m_9.getY() != 106) {
                                    this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                                }
                            }
                        }
                    }
                }
            }
            changeHOUR();
        } else if (MIN.equals("01")) {
            if (this.m_1.getY() != 22) {
                this.m_1.setLocation(this.m_1.getX(), this.m_1.getY() + 1);
                if (this.m_0.getY() != 150) {
                    this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() + 1);
                }
            } else {
                if (this.m_0.getY() != 150) {
                    this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("02")) {
            if (this.m_2.getY() != 22) {
                this.m_2.setLocation(this.m_2.getX(), this.m_2.getY() + 1);
                if (this.m_1.getY() != 150) {
                    this.m_1.setLocation(this.m_1.getX(), this.m_1.getY() + 1);
                }
            } else {
                if (this.m_1.getY() != 150) {
                    this.m_1.setLocation(this.m_1.getX(), this.m_1.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("03")) {
            if (this.m_3.getY() != 22) {
                this.m_3.setLocation(this.m_3.getX(), this.m_3.getY() + 1);
                if (this.m_2.getY() != 150) {
                    this.m_2.setLocation(this.m_2.getX(), this.m_2.getY() + 1);
                }
            } else {
                if (this.m_2.getY() != 150) {
                    this.m_2.setLocation(this.m_2.getX(), this.m_2.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("04")) {
            if (this.m_4.getY() != 22) {
                this.m_4.setLocation(this.m_4.getX(), this.m_4.getY() + 1);
                if (this.m_3.getY() != 150) {
                    this.m_3.setLocation(this.m_3.getX(), this.m_3.getY() + 1);
                }
            } else {
                if (this.m_3.getY() != 150) {
                    this.m_3.setLocation(this.m_3.getX(), this.m_3.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("05")) {
            if (this.m_5.getY() != 22) {
                this.m_5.setLocation(this.m_5.getX(), this.m_5.getY() + 1);
                if (this.m_4.getY() != 150) {
                    this.m_4.setLocation(this.m_4.getX(), this.m_4.getY() + 1);
                }
            } else {
                if (this.m_4.getY() != 150) {
                    this.m_4.setLocation(this.m_4.getX(), this.m_4.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("06")) {
            if (this.m_6.getY() != 22) {
                this.m_6.setLocation(this.m_6.getX(), this.m_6.getY() + 1);
                if (this.m_5.getY() != 150) {
                    this.m_5.setLocation(this.m_5.getX(), this.m_5.getY() + 1);
                }
            } else {
                if (this.m_5.getY() != 150) {
                    this.m_5.setLocation(this.m_5.getX(), this.m_5.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("07")) {
            if (this.m_7.getY() != 22) {
                this.m_7.setLocation(this.m_7.getX(), this.m_7.getY() + 1);
                if (this.m_6.getY() != 150) {
                    this.m_6.setLocation(this.m_6.getX(), this.m_6.getY() + 1);
                }
            } else {
                if (this.m_6.getY() != 150) {
                    this.m_6.setLocation(this.m_6.getX(), this.m_6.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("08")) {
            if (this.m_8.getY() != 22) {
                this.m_8.setLocation(this.m_8.getX(), this.m_8.getY() + 1);
                if (this.m_7.getY() != 150) {
                    this.m_7.setLocation(this.m_7.getX(), this.m_7.getY() + 1);
                }
            } else {
                if (this.m_7.getY() != 150) {
                    this.m_7.setLocation(this.m_7.getX(), this.m_7.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("09")) {
            if (this.m_9.getY() != 22) {
                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() + 1);
                if (this.m_8.getY() != 150) {
                    this.m_8.setLocation(this.m_8.getX(), this.m_8.getY() + 1);
                }
            } else {
                if (this.m_8.getY() != 150) {
                    this.m_8.setLocation(this.m_8.getX(), this.m_8.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("10")) {
            if (this.m_1.getY() != -106) {
                this.m_1.setLocation(this.m_1.getX(), this.m_1.getY() - 1);
                this.m_2.setLocation(this.m_2.getX(), this.m_2.getY() - 1);
                this.m_3.setLocation(this.m_3.getX(), this.m_3.getY() - 1);
                this.m_4.setLocation(this.m_4.getX(), this.m_4.getY() - 1);
                this.m_5.setLocation(this.m_5.getX(), this.m_5.getY() - 1);
                this.m_6.setLocation(this.m_6.getX(), this.m_6.getY() - 1);
                this.m_7.setLocation(this.m_7.getX(), this.m_7.getY() - 1);
                this.m_8.setLocation(this.m_8.getX(), this.m_8.getY() - 1);
                if (this.m_0.getY() != 22) {
                    this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() - 1);
                    if (this.m0.getY() != 150) {
                        this.m0.setLocation(this.m0.getX(), this.m0.getY() + 1);
                        if (this.m1.getY() != 22) {
                            this.m1.setLocation(this.m1.getX(), this.m1.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.m1.getY() != 22) {
                            this.m1.setLocation(this.m1.getX(), this.m1.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    }
                } else {
                    if (this.m0.getY() != 150) {
                        this.m0.setLocation(this.m0.getX(), this.m0.getY() + 1);
                        if (this.m1.getY() != 22) {
                            this.m1.setLocation(this.m1.getX(), this.m1.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.m1.getY() != 22) {
                            this.m1.setLocation(this.m1.getX(), this.m1.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    }
                }
            } else {
                if (this.m_0.getY() != 22) {
                    this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() - 1);
                    if (this.m0.getY() != 150) {
                        this.m0.setLocation(this.m0.getX(), this.m0.getY() + 1);
                        if (this.m1.getY() != 22) {
                            this.m1.setLocation(this.m1.getX(), this.m1.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.m1.getY() != 22) {
                            this.m1.setLocation(this.m1.getX(), this.m1.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    }
                } else {
                    if (this.m0.getY() != 150) {
                        this.m0.setLocation(this.m0.getX(), this.m0.getY() + 1);
                        if (this.m1.getY() != 22) {
                            this.m1.setLocation(this.m1.getX(), this.m1.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.m1.getY() != 22) {
                            this.m1.setLocation(this.m1.getX(), this.m1.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    }
                }
            }
            changeHOUR();
        } else if (MIN.equals("11")) {
            if (this.m_1.getY() != 22) {
                this.m_1.setLocation(this.m_1.getX(), this.m_1.getY() + 1);
                if (this.m_0.getY() != 150) {
                    this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() + 1);
                }
            } else {
                if (this.m_0.getY() != 150) {
                    this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("12")) {
            if (this.m_2.getY() != 22) {
                this.m_2.setLocation(this.m_2.getX(), this.m_2.getY() + 1);
                if (this.m_1.getY() != 150) {
                    this.m_1.setLocation(this.m_1.getX(), this.m_1.getY() + 1);
                }
            } else {
                if (this.m_1.getY() != 150) {
                    this.m_1.setLocation(this.m_1.getX(), this.m_1.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("13")) {
            if (this.m_3.getY() != 22) {
                this.m_3.setLocation(this.m_3.getX(), this.m_3.getY() + 1);
                if (this.m_2.getY() != 150) {
                    this.m_2.setLocation(this.m_2.getX(), this.m_2.getY() + 1);
                }
            } else {
                if (this.m_2.getY() != 150) {
                    this.m_2.setLocation(this.m_2.getX(), this.m_2.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("14")) {
            if (this.m_4.getY() != 22) {
                this.m_4.setLocation(this.m_4.getX(), this.m_4.getY() + 1);
                if (this.m_3.getY() != 150) {
                    this.m_3.setLocation(this.m_3.getX(), this.m_3.getY() + 1);
                }
            } else {
                if (this.m_3.getY() != 150) {
                    this.m_3.setLocation(this.m_3.getX(), this.m_3.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("15")) {
            if (this.m_5.getY() != 22) {
                this.m_5.setLocation(this.m_5.getX(), this.m_5.getY() + 1);
                if (this.m_4.getY() != 150) {
                    this.m_4.setLocation(this.m_4.getX(), this.m_4.getY() + 1);
                }
            } else {
                if (this.m_4.getY() != 150) {
                    this.m_4.setLocation(this.m_4.getX(), this.m_4.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("16")) {
            if (this.m_6.getY() != 22) {
                this.m_6.setLocation(this.m_6.getX(), this.m_6.getY() + 1);
                if (this.m_5.getY() != 150) {
                    this.m_5.setLocation(this.m_5.getX(), this.m_5.getY() + 1);
                }
            } else {
                if (this.m_5.getY() != 150) {
                    this.m_5.setLocation(this.m_5.getX(), this.m_5.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("17")) {
            if (this.m_7.getY() != 22) {
                this.m_7.setLocation(this.m_7.getX(), this.m_7.getY() + 1);
                if (this.m_6.getY() != 150) {
                    this.m_6.setLocation(this.m_6.getX(), this.m_6.getY() + 1);
                }
            } else {
                if (this.m_6.getY() != 150) {
                    this.m_6.setLocation(this.m_6.getX(), this.m_6.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("18")) {
            if (this.m_8.getY() != 22) {
                this.m_8.setLocation(this.m_8.getX(), this.m_8.getY() + 1);
                if (this.m_7.getY() != 150) {
                    this.m_7.setLocation(this.m_7.getX(), this.m_7.getY() + 1);
                }
            } else {
                if (this.m_7.getY() != 150) {
                    this.m_7.setLocation(this.m_7.getX(), this.m_7.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("19")) {
            if (this.m_9.getY() != 22) {
                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() + 1);
                if (this.m_8.getY() != 150) {
                    this.m_8.setLocation(this.m_8.getX(), this.m_8.getY() + 1);
                }
            } else {
                if (this.m_8.getY() != 150) {
                    this.m_8.setLocation(this.m_8.getX(), this.m_8.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("20")) {
            if (this.m_1.getY() != -106) {
                this.m_1.setLocation(this.m_1.getX(), this.m_1.getY() - 1);
                this.m_2.setLocation(this.m_2.getX(), this.m_2.getY() - 1);
                this.m_3.setLocation(this.m_3.getX(), this.m_3.getY() - 1);
                this.m_4.setLocation(this.m_4.getX(), this.m_4.getY() - 1);
                this.m_5.setLocation(this.m_5.getX(), this.m_5.getY() - 1);
                this.m_6.setLocation(this.m_6.getX(), this.m_6.getY() - 1);
                this.m_7.setLocation(this.m_7.getX(), this.m_7.getY() - 1);
                this.m_8.setLocation(this.m_8.getX(), this.m_8.getY() - 1);
                if (this.m_0.getY() != 22) {
                    this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() - 1);
                    if (this.m1.getY() != 150) {
                        this.m1.setLocation(this.m1.getX(), this.m1.getY() + 1);
                        if (this.m2.getY() != 22) {
                            this.m2.setLocation(this.m2.getX(), this.m2.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.m2.getY() != 22) {
                            this.m2.setLocation(this.m2.getX(), this.m2.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    }
                } else {
                    if (this.m1.getY() != 150) {
                        this.m1.setLocation(this.m1.getX(), this.m1.getY() + 1);
                        if (this.m2.getY() != 22) {
                            this.m2.setLocation(this.m2.getX(), this.m2.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.m2.getY() != 22) {
                            this.m2.setLocation(this.m2.getX(), this.m2.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    }
                }
            } else {
                if (this.m_0.getY() != 22) {
                    this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() - 1);
                    if (this.m1.getY() != 150) {
                        this.m1.setLocation(this.m1.getX(), this.m1.getY() + 1);
                        if (this.m2.getY() != 22) {
                            this.m2.setLocation(this.m2.getX(), this.m2.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.m2.getY() != 22) {
                            this.m2.setLocation(this.m2.getX(), this.m2.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    }
                } else {
                    if (this.m1.getY() != 150) {
                        this.m1.setLocation(this.m1.getX(), this.m1.getY() + 1);
                        if (this.m2.getY() != 22) {
                            this.m2.setLocation(this.m2.getX(), this.m2.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.m2.getY() != 22) {
                            this.m2.setLocation(this.m2.getX(), this.m2.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    }
                }
            }
            changeHOUR();
        } else if (MIN.equals("21")) {
            if (this.m_1.getY() != 22) {
                this.m_1.setLocation(this.m_1.getX(), this.m_1.getY() + 1);
                if (this.m_0.getY() != 150) {
                    this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() + 1);
                }
            } else {
                if (this.m_0.getY() != 150) {
                    this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("22")) {
            if (this.m_2.getY() != 22) {
                this.m_2.setLocation(this.m_2.getX(), this.m_2.getY() + 1);
                if (this.m_1.getY() != 150) {
                    this.m_1.setLocation(this.m_1.getX(), this.m_1.getY() + 1);
                }
            } else {
                if (this.m_1.getY() != 150) {
                    this.m_1.setLocation(this.m_1.getX(), this.m_1.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("23")) {
            if (this.m_3.getY() != 22) {
                this.m_3.setLocation(this.m_3.getX(), this.m_3.getY() + 1);
                if (this.m_2.getY() != 150) {
                    this.m_2.setLocation(this.m_2.getX(), this.m_2.getY() + 1);
                }
            } else {
                if (this.m_2.getY() != 150) {
                    this.m_2.setLocation(this.m_2.getX(), this.m_2.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("24")) {
            if (this.m_4.getY() != 22) {
                this.m_4.setLocation(this.m_4.getX(), this.m_4.getY() + 1);
                if (this.m_3.getY() != 150) {
                    this.m_3.setLocation(this.m_3.getX(), this.m_3.getY() + 1);
                }
            } else {
                if (this.m_3.getY() != 150) {
                    this.m_3.setLocation(this.m_3.getX(), this.m_3.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("25")) {
            if (this.m_5.getY() != 22) {
                this.m_5.setLocation(this.m_5.getX(), this.m_5.getY() + 1);
                if (this.m_4.getY() != 150) {
                    this.m_4.setLocation(this.m_4.getX(), this.m_4.getY() + 1);
                }
            } else {
                if (this.m_4.getY() != 150) {
                    this.m_4.setLocation(this.m_4.getX(), this.m_4.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("26")) {
            if (this.m_6.getY() != 22) {
                this.m_6.setLocation(this.m_6.getX(), this.m_6.getY() + 1);
                if (this.m_5.getY() != 150) {
                    this.m_5.setLocation(this.m_5.getX(), this.m_5.getY() + 1);
                }
            } else {
                if (this.m_5.getY() != 150) {
                    this.m_5.setLocation(this.m_5.getX(), this.m_5.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("27")) {
            if (this.m_7.getY() != 22) {
                this.m_7.setLocation(this.m_7.getX(), this.m_7.getY() + 1);
                if (this.m_6.getY() != 150) {
                    this.m_6.setLocation(this.m_6.getX(), this.m_6.getY() + 1);
                }
            } else {
                if (this.m_6.getY() != 150) {
                    this.m_6.setLocation(this.m_6.getX(), this.m_6.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("28")) {
            if (this.m_8.getY() != 22) {
                this.m_8.setLocation(this.m_8.getX(), this.m_8.getY() + 1);
                if (this.m_7.getY() != 150) {
                    this.m_7.setLocation(this.m_7.getX(), this.m_7.getY() + 1);
                }
            } else {
                if (this.m_7.getY() != 150) {
                    this.m_7.setLocation(this.m_7.getX(), this.m_7.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("29")) {
            if (this.m_9.getY() != 22) {
                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() + 1);
                if (this.m_8.getY() != 150) {
                    this.m_8.setLocation(this.m_8.getX(), this.m_8.getY() + 1);
                }
            } else {
                if (this.m_8.getY() != 150) {
                    this.m_8.setLocation(this.m_8.getX(), this.m_8.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("30")) {
            if (this.m_1.getY() != -106) {
                this.m_1.setLocation(this.m_1.getX(), this.m_1.getY() - 1);
                this.m_2.setLocation(this.m_2.getX(), this.m_2.getY() - 1);
                this.m_3.setLocation(this.m_3.getX(), this.m_3.getY() - 1);
                this.m_4.setLocation(this.m_4.getX(), this.m_4.getY() - 1);
                this.m_5.setLocation(this.m_5.getX(), this.m_5.getY() - 1);
                this.m_6.setLocation(this.m_6.getX(), this.m_6.getY() - 1);
                this.m_7.setLocation(this.m_7.getX(), this.m_7.getY() - 1);
                this.m_8.setLocation(this.m_8.getX(), this.m_8.getY() - 1);
                if (this.m_0.getY() != 22) {
                    this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() - 1);
                    if (this.m2.getY() != 150) {
                        this.m2.setLocation(this.m2.getX(), this.m2.getY() + 1);
                        if (this.m3.getY() != 22) {
                            this.m3.setLocation(this.m3.getX(), this.m3.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.m3.getY() != 22) {
                            this.m3.setLocation(this.m3.getX(), this.m3.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    }
                } else {
                    if (this.m2.getY() != 150) {
                        this.m2.setLocation(this.m2.getX(), this.m2.getY() + 1);
                        if (this.m3.getY() != 22) {
                            this.m3.setLocation(this.m3.getX(), this.m3.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.m3.getY() != 22) {
                            this.m3.setLocation(this.m3.getX(), this.m3.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    }
                }
            } else {
                if (this.m_0.getY() != 22) {
                    this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() - 1);
                    if (this.m2.getY() != 150) {
                        this.m2.setLocation(this.m2.getX(), this.m2.getY() + 1);
                        if (this.m3.getY() != 22) {
                            this.m3.setLocation(this.m3.getX(), this.m3.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.m3.getY() != 22) {
                            this.m3.setLocation(this.m3.getX(), this.m3.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    }
                } else {
                    if (this.m2.getY() != 150) {
                        this.m2.setLocation(this.m2.getX(), this.m2.getY() + 1);
                        if (this.m3.getY() != 22) {
                            this.m3.setLocation(this.m3.getX(), this.m3.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.m3.getY() != 22) {
                            this.m3.setLocation(this.m3.getX(), this.m3.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    }
                }
            }
            changeHOUR();
        } else if (MIN.equals("31")) {
            if (this.m_1.getY() != 22) {
                this.m_1.setLocation(this.m_1.getX(), this.m_1.getY() + 1);
                if (this.m_0.getY() != 150) {
                    this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() + 1);
                }
            } else {
                if (this.m_0.getY() != 150) {
                    this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() + 1);
                }
            }
        } else if (MIN.equals("32")) {
            if (this.m_2.getY() != 22) {
                this.m_2.setLocation(this.m_2.getX(), this.m_2.getY() + 1);
                if (this.m_1.getY() != 150) {
                    this.m_1.setLocation(this.m_1.getX(), this.m_1.getY() + 1);
                }
            } else {
                if (this.m_1.getY() != 150) {
                    this.m_1.setLocation(this.m_1.getX(), this.m_1.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("33")) {
            if (this.m_3.getY() != 22) {
                this.m_3.setLocation(this.m_3.getX(), this.m_3.getY() + 1);
                if (this.m_2.getY() != 150) {
                    this.m_2.setLocation(this.m_2.getX(), this.m_2.getY() + 1);
                }
            } else {
                if (this.m_2.getY() != 150) {
                    this.m_2.setLocation(this.m_2.getX(), this.m_2.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("34")) {
            if (this.m_4.getY() != 22) {
                this.m_4.setLocation(this.m_4.getX(), this.m_4.getY() + 1);
                if (this.m_3.getY() != 150) {
                    this.m_3.setLocation(this.m_3.getX(), this.m_3.getY() + 1);
                }
            } else {
                if (this.m_3.getY() != 150) {
                    this.m_3.setLocation(this.m_3.getX(), this.m_3.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("35")) {
            if (this.m_5.getY() != 22) {
                this.m_5.setLocation(this.m_5.getX(), this.m_5.getY() + 1);
                if (this.m_4.getY() != 150) {
                    this.m_4.setLocation(this.m_4.getX(), this.m_4.getY() + 1);
                }
            } else {
                if (this.m_4.getY() != 150) {
                    this.m_4.setLocation(this.m_4.getX(), this.m_4.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("36")) {
            if (this.m_6.getY() != 22) {
                this.m_6.setLocation(this.m_6.getX(), this.m_6.getY() + 1);
                if (this.m_5.getY() != 150) {
                    this.m_5.setLocation(this.m_5.getX(), this.m_5.getY() + 1);
                }
            } else {
                if (this.m_5.getY() != 150) {
                    this.m_5.setLocation(this.m_5.getX(), this.m_5.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("37")) {
            if (this.m_7.getY() != 22) {
                this.m_7.setLocation(this.m_7.getX(), this.m_7.getY() + 1);
                if (this.m_6.getY() != 150) {
                    this.m_6.setLocation(this.m_6.getX(), this.m_6.getY() + 1);
                }
            } else {
                if (this.m_6.getY() != 150) {
                    this.m_6.setLocation(this.m_6.getX(), this.m_6.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("38")) {
            if (this.m_8.getY() != 22) {
                this.m_8.setLocation(this.m_8.getX(), this.m_8.getY() + 1);
                if (this.m_7.getY() != 150) {
                    this.m_7.setLocation(this.m_7.getX(), this.m_7.getY() + 1);
                }
            } else {
                if (this.m_7.getY() != 150) {
                    this.m_7.setLocation(this.m_7.getX(), this.m_7.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("39")) {
            if (this.m_9.getY() != 22) {
                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() + 1);
                if (this.m_8.getY() != 150) {
                    this.m_8.setLocation(this.m_8.getX(), this.m_8.getY() + 1);
                }
            } else {
                if (this.m_8.getY() != 150) {
                    this.m_8.setLocation(this.m_8.getX(), this.m_8.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("40")) {
            if (this.m_1.getY() != -106) {
                this.m_1.setLocation(this.m_1.getX(), this.m_1.getY() - 1);
                this.m_2.setLocation(this.m_2.getX(), this.m_2.getY() - 1);
                this.m_3.setLocation(this.m_3.getX(), this.m_3.getY() - 1);
                this.m_4.setLocation(this.m_4.getX(), this.m_4.getY() - 1);
                this.m_5.setLocation(this.m_5.getX(), this.m_5.getY() - 1);
                this.m_6.setLocation(this.m_6.getX(), this.m_6.getY() - 1);
                this.m_7.setLocation(this.m_7.getX(), this.m_7.getY() - 1);
                this.m_8.setLocation(this.m_8.getX(), this.m_8.getY() - 1);

                if (this.m_0.getY() != 22) {
                    this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() - 1);
                    if (this.m3.getY() != 150) {
                        this.m3.setLocation(this.m3.getX(), this.m3.getY() + 1);
                        if (this.m4.getY() != 22) {
                            this.m4.setLocation(this.m4.getX(), this.m4.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.m4.getY() != 22) {
                            this.m4.setLocation(this.m4.getX(), this.m4.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    }
                } else {
                    if (this.m3.getY() != 150) {
                        this.m3.setLocation(this.m3.getX(), this.m3.getY() + 1);
                        if (this.m4.getY() != 22) {
                            this.m4.setLocation(this.m4.getX(), this.m4.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.m4.getY() != 22) {
                            this.m4.setLocation(this.m4.getX(), this.m4.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    }
                }
            } else {
                if (this.m_0.getY() != 22) {
                    this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() - 1);
                    if (this.m3.getY() != 150) {
                        this.m3.setLocation(this.m3.getX(), this.m3.getY() + 1);
                        if (this.m4.getY() != 22) {
                            this.m4.setLocation(this.m4.getX(), this.m4.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.m4.getY() != 22) {
                            this.m4.setLocation(this.m4.getX(), this.m4.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    }
                } else {
                    if (this.m3.getY() != 150) {
                        this.m3.setLocation(this.m3.getX(), this.m3.getY() + 1);
                        if (this.m4.getY() != 22) {
                            this.m4.setLocation(this.m4.getX(), this.m4.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.m4.getY() != 22) {
                            this.m4.setLocation(this.m4.getX(), this.m4.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    }
                }
            }
            changeHOUR();
        } else if (MIN.equals("41")) {
            if (this.m_1.getY() != 22) {
                this.m_1.setLocation(this.m_1.getX(), this.m_1.getY() + 1);
                if (this.m_0.getY() != 150) {
                    this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() + 1);
                }
            } else {
                if (this.m_0.getY() != 150) {
                    this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() + 1);
                }
            }
        } else if (MIN.equals("42")) {
            if (this.m_2.getY() != 22) {
                this.m_2.setLocation(this.m_2.getX(), this.m_2.getY() + 1);
                if (this.m_1.getY() != 150) {
                    this.m_1.setLocation(this.m_1.getX(), this.m_1.getY() + 1);
                }
            } else {
                if (this.m_1.getY() != 150) {
                    this.m_1.setLocation(this.m_1.getX(), this.m_1.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("43")) {
            if (this.m_3.getY() != 22) {
                this.m_3.setLocation(this.m_3.getX(), this.m_3.getY() + 1);
                if (this.m_2.getY() != 150) {
                    this.m_2.setLocation(this.m_2.getX(), this.m_2.getY() + 1);
                }
            } else {
                if (this.m_2.getY() != 150) {
                    this.m_2.setLocation(this.m_2.getX(), this.m_2.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("44")) {
            if (this.m_4.getY() != 22) {
                this.m_4.setLocation(this.m_4.getX(), this.m_4.getY() + 1);
                if (this.m_3.getY() != 150) {
                    this.m_3.setLocation(this.m_3.getX(), this.m_3.getY() + 1);
                }
            } else {
                if (this.m_3.getY() != 150) {
                    this.m_3.setLocation(this.m_3.getX(), this.m_3.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("45")) {
            if (this.m_5.getY() != 22) {
                this.m_5.setLocation(this.m_5.getX(), this.m_5.getY() + 1);
                if (this.m_4.getY() != 150) {
                    this.m_4.setLocation(this.m_4.getX(), this.m_4.getY() + 1);
                }
            } else {
                if (this.m_4.getY() != 150) {
                    this.m_4.setLocation(this.m_4.getX(), this.m_4.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("46")) {
            if (this.m_6.getY() != 22) {
                this.m_6.setLocation(this.m_6.getX(), this.m_6.getY() + 1);
                if (this.m_5.getY() != 150) {
                    this.m_5.setLocation(this.m_5.getX(), this.m_5.getY() + 1);
                }
            } else {
                if (this.m_5.getY() != 150) {
                    this.m_5.setLocation(this.m_5.getX(), this.m_5.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("47")) {
            if (this.m_7.getY() != 22) {
                this.m_7.setLocation(this.m_7.getX(), this.m_7.getY() + 1);
                if (this.m_6.getY() != 150) {
                    this.m_6.setLocation(this.m_6.getX(), this.m_6.getY() + 1);
                }
            } else {
                if (this.m_6.getY() != 150) {
                    this.m_6.setLocation(this.m_6.getX(), this.m_6.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("48")) {
            if (this.m_8.getY() != 22) {
                this.m_8.setLocation(this.m_8.getX(), this.m_8.getY() + 1);
                if (this.m_7.getY() != 150) {
                    this.m_7.setLocation(this.m_7.getX(), this.m_7.getY() + 1);
                }
            } else {
                if (this.m_7.getY() != 150) {
                    this.m_7.setLocation(this.m_7.getX(), this.m_7.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("49")) {
            if (this.m_9.getY() != 22) {
                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() + 1);
                if (this.m_8.getY() != 150) {
                    this.m_8.setLocation(this.m_8.getX(), this.m_8.getY() + 1);
                }
            } else {
                if (this.m_8.getY() != 150) {
                    this.m_8.setLocation(this.m_8.getX(), this.m_8.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("50")) {
            if (this.m_1.getY() != -106) {
                this.m_1.setLocation(this.m_1.getX(), this.m_1.getY() - 1);
                this.m_2.setLocation(this.m_2.getX(), this.m_2.getY() - 1);
                this.m_3.setLocation(this.m_3.getX(), this.m_3.getY() - 1);
                this.m_4.setLocation(this.m_4.getX(), this.m_4.getY() - 1);
                this.m_5.setLocation(this.m_5.getX(), this.m_5.getY() - 1);
                this.m_6.setLocation(this.m_6.getX(), this.m_6.getY() - 1);
                this.m_7.setLocation(this.m_7.getX(), this.m_7.getY() - 1);
                this.m_8.setLocation(this.m_8.getX(), this.m_8.getY() - 1);
                if (this.m_0.getY() != 22) {
                    this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() - 1);
                    if (this.m4.getY() != 150) {
                        this.m4.setLocation(this.m4.getX(), this.m4.getY() + 1);
                        if (this.m5.getY() != 22) {
                            this.m5.setLocation(this.m5.getX(), this.m5.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.m5.getY() != 22) {
                            this.m5.setLocation(this.m5.getX(), this.m5.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    }
                } else {
                    if (this.m4.getY() != 150) {
                        this.m4.setLocation(this.m4.getX(), this.m4.getY() + 1);
                        if (this.m5.getY() != 22) {
                            this.m5.setLocation(this.m5.getX(), this.m5.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.m5.getY() != 22) {
                            this.m5.setLocation(this.m5.getX(), this.m5.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    }
                }
            } else {
                if (this.m_0.getY() != 22) {
                    this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() - 1);
                    if (this.m4.getY() != 150) {
                        this.m4.setLocation(this.m4.getX(), this.m4.getY() + 1);
                        if (this.m5.getY() != 22) {
                            this.m5.setLocation(this.m5.getX(), this.m5.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.m5.getY() != 22) {
                            this.m5.setLocation(this.m5.getX(), this.m5.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    }
                } else {
                    if (this.m4.getY() != 150) {
                        this.m4.setLocation(this.m4.getX(), this.m4.getY() + 1);
                        if (this.m5.getY() != 22) {
                            this.m5.setLocation(this.m5.getX(), this.m5.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.m5.getY() != 22) {
                            this.m5.setLocation(this.m5.getX(), this.m5.getY() + 1);
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        } else {
                            if (this.m_9.getY() != -106) {
                                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() - 1);
                            }
                        }
                    }
                }
            }
            changeHOUR();
        } else if (MIN.equals("51")) {
            if (this.m_1.getY() != 22) {
                this.m_1.setLocation(this.m_1.getX(), this.m_1.getY() + 1);
                if (this.m_0.getY() != 150) {
                    this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() + 1);
                }
            } else {
                if (this.m_0.getY() != 150) {
                    this.m_0.setLocation(this.m_0.getX(), this.m_0.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("52")) {
            if (this.m_2.getY() != 22) {
                this.m_2.setLocation(this.m_2.getX(), this.m_2.getY() + 1);
                if (this.m_1.getY() != 150) {
                    this.m_1.setLocation(this.m_1.getX(), this.m_1.getY() + 1);
                }
            } else {
                if (this.m_1.getY() != 150) {
                    this.m_1.setLocation(this.m_1.getX(), this.m_1.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("53")) {
            if (this.m_3.getY() != 22) {
                this.m_3.setLocation(this.m_3.getX(), this.m_3.getY() + 1);
                if (this.m_2.getY() != 150) {
                    this.m_2.setLocation(this.m_2.getX(), this.m_2.getY() + 1);
                }
            } else {
                if (this.m_2.getY() != 150) {
                    this.m_2.setLocation(this.m_2.getX(), this.m_2.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("54")) {
            if (this.m_4.getY() != 22) {
                this.m_4.setLocation(this.m_4.getX(), this.m_4.getY() + 1);
                if (this.m_3.getY() != 150) {
                    this.m_3.setLocation(this.m_3.getX(), this.m_3.getY() + 1);
                }
            } else {
                if (this.m_3.getY() != 150) {
                    this.m_3.setLocation(this.m_3.getX(), this.m_3.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("55")) {
            if (this.m_5.getY() != 22) {
                this.m_5.setLocation(this.m_5.getX(), this.m_5.getY() + 1);
                if (this.m_4.getY() != 150) {
                    this.m_4.setLocation(this.m_4.getX(), this.m_4.getY() + 1);
                }
            } else {
                if (this.m_4.getY() != 150) {
                    this.m_4.setLocation(this.m_4.getX(), this.m_4.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("56")) {
            if (this.m_6.getY() != 22) {
                this.m_6.setLocation(this.m_6.getX(), this.m_6.getY() + 1);
                if (this.m_5.getY() != 150) {
                    this.m_5.setLocation(this.m_5.getX(), this.m_5.getY() + 1);
                }
            } else {
                if (this.m_5.getY() != 150) {
                    this.m_5.setLocation(this.m_5.getX(), this.m_5.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("57")) {
            if (this.m_7.getY() != 22) {
                this.m_7.setLocation(this.m_7.getX(), this.m_7.getY() + 1);
                if (this.m_6.getY() != 150) {
                    this.m_6.setLocation(this.m_6.getX(), this.m_6.getY() + 1);
                }
            } else {
                if (this.m_6.getY() != 150) {
                    this.m_6.setLocation(this.m_6.getX(), this.m_6.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("58")) {
            if (this.m_8.getY() != 22) {
                this.m_8.setLocation(this.m_8.getX(), this.m_8.getY() + 1);
                if (this.m_7.getY() != 150) {
                    this.m_7.setLocation(this.m_7.getX(), this.m_7.getY() + 1);
                }
            } else {
                if (this.m_7.getY() != 150) {
                    this.m_7.setLocation(this.m_7.getX(), this.m_7.getY() + 1);
                }
            }
            changeHOUR();
        } else if (MIN.equals("59")) {
            if (this.m_9.getY() != 22) {
                this.m_9.setLocation(this.m_9.getX(), this.m_9.getY() + 1);
                if (this.m_8.getY() != 150) {
                    this.m_8.setLocation(this.m_8.getX(), this.m_8.getY() + 1);
                }
            } else {
                if (this.m_8.getY() != 150) {
                    this.m_8.setLocation(this.m_8.getX(), this.m_8.getY() + 1);
                }
            }
            changeHOUR();
        }
    }

    public void changeHOUR() {
        if (this.HOUR.equals("00") || HOUR.equals("24")) {
            if (this.h_1.getY() != -106) {
                this.h_1.setLocation(this.h_1.getX(), this.h_1.getY() - 1);
                this.h_2.setLocation(this.h_2.getX(), this.h_2.getY() - 1);
                if (this.h1.getY() != -106) {
                    this.h1.setLocation(this.h1.getX(), this.h1.getY() - 1);
                    this.h2.setLocation(this.h2.getX(), this.h2.getY() - 1);
                    if (this.h_0.getY() != 22) {
                        this.h_0.setLocation(this.h_0.getX(), this.h_0.getY() - 1);
                        if (this.h0.getY() != 22) {
                            this.h0.setLocation(this.h0.getX(), this.h0.getY() - 1);
                            if (this.h_3.getY() != -106) {
                                this.h_3.setLocation(this.h_3.getX(), this.h_3.getY() - 1);
                                if (this.h2.getY() != -106) {
                                    this.h2.setLocation(this.h2.getX(), this.h2.getY() - 1);
                                }
                            } else {
                                if (this.h2.getY() != -106) {
                                    this.h2.setLocation(this.h2.getX(), this.h2.getY() - 1);
                                }
                            }
                        } else {
                            if (this.h_3.getY() != -106) {
                                this.h_3.setLocation(this.h_3.getX(), this.h_3.getY() - 1);
                                if (this.h2.getY() != -106) {
                                    this.h2.setLocation(this.h2.getX(), this.h2.getY() - 1);
                                }
                            } else {
                                if (this.h2.getY() != -106) {
                                    this.h2.setLocation(this.h2.getX(), this.h2.getY() - 1);
                                }
                            }
                        }
                    } else {
                        if (this.h0.getY() != 22) {
                            this.h0.setLocation(this.h0.getX(), this.h0.getY() - 1);
                            if (this.h_3.getY() != -106) {
                                this.h_3.setLocation(this.h_3.getX(), this.h_3.getY() - 1);
                                if (this.h2.getY() != -106) {
                                    this.h2.setLocation(this.h2.getX(), this.h2.getY() - 1);
                                }
                            } else {
                                if (this.h2.getY() != -106) {
                                    this.h2.setLocation(this.h2.getX(), this.h2.getY() - 1);
                                }
                            }
                        } else {
                            if (this.h_3.getY() != -106) {
                                this.h_3.setLocation(this.h_3.getX(), this.h_3.getY() - 1);
                                if (this.h2.getY() != -106) {
                                    this.h2.setLocation(this.h2.getX(), this.h2.getY() - 1);
                                }
                            } else {
                                if (this.h2.getY() != -106) {
                                    this.h2.setLocation(this.h2.getX(), this.h2.getY() - 1);
                                }
                            }
                        }
                    }
                } else {
                    if (this.h_0.getY() != 22) {
                        this.h_0.setLocation(this.h_0.getX(), this.h_0.getY() - 1);
                        if (this.h0.getY() != 22) {
                            this.h0.setLocation(this.h0.getX(), this.h0.getY() - 1);
                            if (this.h_3.getY() != -106) {
                                this.h_3.setLocation(this.h_3.getX(), this.h_3.getY() - 1);
                            }
                        } else {
                            if (this.h_3.getY() != -106) {
                                this.h_3.setLocation(this.h_3.getX(), this.h_3.getY() - 1);
                            }
                        }
                    } else {
                        if (this.h0.getY() != 22) {
                            this.h0.setLocation(this.h0.getX(), this.h0.getY() - 1);
                            if (this.h_3.getY() != -106) {
                                this.h_3.setLocation(this.h_3.getX(), this.h_3.getY() - 1);
                            }
                        } else {
                            if (this.h_3.getY() != -106) {
                                this.h_3.setLocation(this.h_3.getX(), this.h_3.getY() - 1);
                            }
                        }
                    }
                }
            } else {
                if (this.h1.getY() != -106) {
                    this.h1.setLocation(this.h1.getX(), this.h1.getY() - 1);
                    this.h2.setLocation(this.h2.getX(), this.h2.getY() - 1);
                    if (this.h_0.getY() != 22) {
                        this.h_0.setLocation(this.h_0.getX(), this.h_0.getY() - 1);
                        if (this.h0.getY() != 22) {
                            this.h0.setLocation(this.h0.getX(), this.h0.getY() - 1);
                            if (this.h_3.getY() != -106) {
                                this.h_3.setLocation(this.h_3.getX(), this.h_3.getY() - 1);
                                if (this.h2.getY() != -106) {
                                    this.h2.setLocation(this.h2.getX(), this.h2.getY() - 1);
                                }
                            } else {
                                if (this.h2.getY() != -106) {
                                    this.h2.setLocation(this.h2.getX(), this.h2.getY() - 1);
                                }
                            }
                        } else {
                            if (this.h_3.getY() != -106) {
                                this.h_3.setLocation(this.h_3.getX(), this.h_3.getY() - 1);
                                if (this.h2.getY() != -106) {
                                    this.h2.setLocation(this.h2.getX(), this.h2.getY() - 1);
                                }
                            } else {
                                if (this.h2.getY() != -106) {
                                    this.h2.setLocation(this.h2.getX(), this.h2.getY() - 1);
                                }
                            }
                        }
                    } else {
                        if (this.h0.getY() != 22) {
                            this.h0.setLocation(this.h0.getX(), this.h0.getY() - 1);
                            if (this.h_3.getY() != -106) {
                                this.h_3.setLocation(this.h_3.getX(), this.h_3.getY() - 1);
                                if (this.h2.getY() != -106) {
                                    this.h2.setLocation(this.h2.getX(), this.h2.getY() - 1);
                                }
                            } else {
                                if (this.h2.getY() != -106) {
                                    this.h2.setLocation(this.h2.getX(), this.h2.getY() - 1);
                                }
                            }
                        } else {
                            if (this.h_3.getY() != -106) {
                                this.h_3.setLocation(this.h_3.getX(), this.h_3.getY() - 1);
                                if (this.h2.getY() != -106) {
                                    this.h2.setLocation(this.h2.getX(), this.h2.getY() - 1);
                                }
                            } else {
                                if (this.h2.getY() != -106) {
                                    this.h2.setLocation(this.h2.getX(), this.h2.getY() - 1);
                                }
                            }
                        }
                    }
                }
            }
        } else if (this.HOUR.equals("01")) {
            if (this.h_1.getY() != 22) {
                this.h_1.setLocation(this.h_1.getX(), this.h_1.getY() + 1);
                if (this.h_0.getY() != 150) {
                    this.h_0.setLocation(this.h_0.getX(), this.h_0.getY() + 1);
                }
            } else {
                if (this.h_0.getY() != 150) {
                    this.h_0.setLocation(this.h_0.getX(), this.h_0.getY() + 1);
                }
            }
        } else if (this.HOUR.equals("02")) {
            if (this.h_2.getY() != 22) {
                this.h_2.setLocation(this.h_2.getX(), this.h_2.getY() + 1);
                if (this.h_1.getY() != 150) {
                    this.h_1.setLocation(this.h_1.getX(), this.h_1.getY() + 1);
                }
            } else {
                if (this.h_1.getY() != 150) {
                    this.h_1.setLocation(this.h_1.getX(), this.h_1.getY() + 1);
                }
            }
        } else if (this.HOUR.equals("03")) {
            if (this.h_3.getY() != 22) {
                this.h_3.setLocation(this.h_3.getX(), this.h_3.getY() + 1);
                if (this.h_2.getY() != 150) {
                    this.h_2.setLocation(this.h_2.getX(), this.h_2.getY() + 1);
                }
            } else {
                if (this.h_2.getY() != 150) {
                    this.h_2.setLocation(this.h_2.getX(), this.h_2.getY() + 1);
                }
            }
        } else if (this.HOUR.equals("04")) {
            if (this.h_4.getY() != 22) {
                this.h_4.setLocation(this.h_4.getX(), this.h_4.getY() + 1);
                if (this.h_3.getY() != 150) {
                    this.h_3.setLocation(this.h_3.getX(), this.h_3.getY() + 1);
                }
            } else {
                if (this.h_3.getY() != 150) {
                    this.h_3.setLocation(this.h_3.getX(), this.h_3.getY() + 1);
                }
            }
        } else if (this.HOUR.equals("05")) {
            if (this.h_5.getY() != 22) {
                this.h_5.setLocation(this.h_5.getX(), this.h_5.getY() + 1);
                if (this.h_4.getY() != 150) {
                    this.h_4.setLocation(this.h_4.getX(), this.h_4.getY() + 1);
                }
            } else {
                if (this.h_4.getY() != 150) {
                    this.h_4.setLocation(this.h_4.getX(), this.h_4.getY() + 1);
                }
            }
        } else if (this.HOUR.equals("06")) {
            if (this.h_6.getY() != 22) {
                this.h_6.setLocation(this.h_5.getX(), this.h_5.getY() + 1);
                if (this.h_5.getY() != 150) {
                    this.h_5.setLocation(this.h_5.getX(), this.h_5.getY() + 1);
                }
            } else {
                if (this.h_5.getY() != 150) {
                    this.h_5.setLocation(this.h_5.getX(), this.h_5.getY() + 1);
                }
            }
        } else if (this.HOUR.equals("07")) {
            if (this.h_7.getY() != 22) {
                this.h_7.setLocation(this.h_7.getX(), this.h_7.getY() + 1);
                if (this.h_6.getY() != 150) {
                    this.h_6.setLocation(this.h_6.getX(), this.h_6.getY() + 1);
                }
            } else {
                if (this.h_6.getY() != 150) {
                    this.h_6.setLocation(this.h_6.getX(), this.h_6.getY() + 1);
                }
            }
        } else if (this.HOUR.equals("08")) {
            if (this.h_8.getY() != 22) {
                this.h_8.setLocation(this.h_8.getX(), this.h_8.getY() + 1);
                if (this.h_7.getY() != 150) {
                    this.h_7.setLocation(this.h_7.getX(), this.h_7.getY() + 1);
                }
            } else {
                if (this.h_7.getY() != 150) {
                    this.h_7.setLocation(this.h_7.getX(), this.h_7.getY() + 1);
                }
            }
        } else if (this.HOUR.equals("09")) {
            if (this.h_9.getY() != 22) {
                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() + 1);
                if (this.h_8.getY() != 150) {
                    this.h_8.setLocation(this.h_8.getX(), this.h_8.getY() + 1);
                }
            } else {
                if (this.h_8.getY() != 150) {
                    this.h_8.setLocation(this.h_8.getX(), this.h_8.getY() + 1);
                }
            }
        } else if (this.HOUR.equals("10")) {
            if (this.h_1.getY() != -106) {
                this.h_1.setLocation(this.h_1.getX(), this.h_1.getY() - 1);
                this.h_2.setLocation(this.h_2.getX(), this.h_2.getY() - 1);
                this.h_3.setLocation(this.h_3.getX(), this.h_3.getY() - 1);
                this.h_4.setLocation(this.h_4.getX(), this.h_4.getY() - 1);
                this.h_5.setLocation(this.h_5.getX(), this.h_5.getY() - 1);
                this.h_6.setLocation(this.h_6.getX(), this.h_6.getY() - 1);
                this.h_7.setLocation(this.h_7.getX(), this.h_7.getY() - 1);
                this.h_8.setLocation(this.h_8.getX(), this.h_8.getY() - 1);
                if (this.h_0.getY() != 22) {
                    this.h_0.setLocation(this.h_0.getX(), this.h_0.getY() - 1);
                    if (this.h0.getY() != 150) {
                        this.h0.setLocation(this.h0.getX(), this.h0.getY() + 1);
                        if (this.h1.getY() != 22) {
                            this.h1.setLocation(this.h1.getX(), this.h1.getY() + 1);
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        } else {
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.h1.getY() != 22) {
                            this.h1.setLocation(this.h1.getX(), this.h1.getY() + 1);
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        } else {
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        }
                    }
                } else {
                    if (this.h0.getY() != 150) {
                        this.h0.setLocation(this.h0.getX(), this.h0.getY() + 1);
                        if (this.h1.getY() != 22) {
                            this.h1.setLocation(this.h1.getX(), this.h1.getY() + 1);
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        } else {
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.h1.getY() != 22) {
                            this.h1.setLocation(this.h1.getX(), this.h1.getY() + 1);
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        } else {
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        }
                    }
                }
            } else {
                if (this.h_0.getY() != 22) {
                    this.h_0.setLocation(this.h_0.getX(), this.h_0.getY() - 1);
                    if (this.h0.getY() != 150) {
                        this.h0.setLocation(this.h0.getX(), this.h0.getY() + 1);
                        if (this.h1.getY() != 22) {
                            this.h1.setLocation(this.h1.getX(), this.h1.getY() + 1);
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        } else {
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.h1.getY() != 22) {
                            this.h1.setLocation(this.h1.getX(), this.h1.getY() + 1);
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        } else {
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        }
                    }
                } else {
                    if (this.h0.getY() != 150) {
                        this.h0.setLocation(this.h0.getX(), this.h0.getY() + 1);
                        if (this.h1.getY() != 22) {
                            this.h1.setLocation(this.h1.getX(), this.h1.getY() + 1);
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        } else {
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.h1.getY() != 22) {
                            this.h1.setLocation(this.h1.getX(), this.h1.getY() + 1);
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        } else {
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        }
                    }
                }
            }
        } else if (this.HOUR.equals("11")) {
            if (this.h_1.getY() != 22) {
                this.h_1.setLocation(this.h_1.getX(), this.h_1.getY() + 1);
                if (this.h_0.getY() != 150) {
                    this.h_0.setLocation(this.h_0.getX(), this.h_0.getY() + 1);
                }
            } else {
                if (this.h_0.getY() != 150) {
                    this.h_0.setLocation(this.h_0.getX(), this.h_0.getY() + 1);
                }
            }
        } else if (this.HOUR.equals("12")) {
            if (this.h_2.getY() != 22) {
                this.h_2.setLocation(this.h_2.getX(), this.h_2.getY() + 1);
                if (this.h_1.getY() != 150) {
                    this.h_1.setLocation(this.h_1.getX(), this.h_1.getY() + 1);
                }
            } else {
                if (this.h_1.getY() != 150) {
                    this.h_1.setLocation(this.h_1.getX(), this.h_1.getY() + 1);
                }
            }
        } else if (this.HOUR.equals("13")) {
            if (this.h_3.getY() != 22) {
                this.h_3.setLocation(this.h_3.getX(), this.h_3.getY() + 1);
                if (this.h_2.getY() != 150) {
                    this.h_2.setLocation(this.h_2.getX(), this.h_2.getY() + 1);
                }
            } else {
                if (this.h_2.getY() != 150) {
                    this.h_2.setLocation(this.h_2.getX(), this.h_2.getY() + 1);
                }
            }
        } else if (this.HOUR.equals("14")) {
            if (this.h_4.getY() != 22) {
                this.h_4.setLocation(this.h_4.getX(), this.h_4.getY() + 1);
                if (this.h_3.getY() != 150) {
                    this.h_3.setLocation(this.h_3.getX(), this.h_3.getY() + 1);
                }
            } else {
                if (this.h_3.getY() != 150) {
                    this.h_3.setLocation(this.h_3.getX(), this.h_3.getY() + 1);
                }
            }
        } else if (this.HOUR.equals("15")) {
            if (this.h_5.getY() != 22) {
                this.h_5.setLocation(this.h_5.getX(), this.h_5.getY() + 1);
                if (this.h_4.getY() != 150) {
                    this.h_4.setLocation(this.h_4.getX(), this.h_4.getY() + 1);
                }
            } else {
                if (this.h_4.getY() != 150) {
                    this.h_4.setLocation(this.h_4.getX(), this.h_4.getY() + 1);
                }
            }
        } else if (this.HOUR.equals("16")) {
            if (this.h_6.getY() != 22) {
                this.h_6.setLocation(this.h_6.getX(), this.h_6.getY() + 1);
                if (this.h_5.getY() != 150) {
                    this.h_5.setLocation(this.h_5.getX(), this.h_5.getY() + 1);
                }
            } else {
                if (this.h_5.getY() != 150) {
                    this.h_5.setLocation(this.h_5.getX(), this.h_5.getY() + 1);
                }
            }
        } else if (this.HOUR.equals("17")) {
            if (this.h_7.getY() != 22) {
                this.h_7.setLocation(this.h_7.getX(), this.h_7.getY() + 1);
                if (this.h_6.getY() != 150) {
                    this.h_6.setLocation(this.h_6.getX(), this.h_6.getY() + 1);
                }
            } else {
                if (this.h_6.getY() != 150) {
                    this.h_6.setLocation(this.h_6.getX(), this.h_6.getY() + 1);
                }
            }
        } else if (this.HOUR.equals("18")) {
            if (this.h_8.getY() != 22) {
                this.h_8.setLocation(this.h_8.getX(), this.h_8.getY() + 1);
                if (this.h_7.getY() != 150) {
                    this.h_7.setLocation(this.h_7.getX(), this.h_7.getY() + 1);
                }
            } else {
                if (this.h_7.getY() != 150) {
                    this.h_7.setLocation(this.h_7.getX(), this.h_7.getY() + 1);
                }
            }
        } else if (this.HOUR.equals("19")) {
            if (this.h_9.getY() != 22) {
                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() + 1);
                if (this.h_8.getY() != 150) {
                    this.h_8.setLocation(this.h_8.getX(), this.h_8.getY() + 1);
                }
            } else {
                if (this.h_4.getY() != 150) {
                    this.h_8.setLocation(this.h_8.getX(), this.h_8.getY() + 1);
                }
            }
        } else if (this.HOUR.equals("20")) {
            if (this.h_1.getY() != -106) {
                this.h_1.setLocation(this.h_1.getX(), this.h_1.getY() - 1);
                this.h_2.setLocation(this.h_2.getX(), this.h_2.getY() - 1);
                this.h_3.setLocation(this.h_3.getX(), this.h_3.getY() - 1);
                this.h_4.setLocation(this.h_4.getX(), this.h_4.getY() - 1);
                this.h_5.setLocation(this.h_5.getX(), this.h_5.getY() - 1);
                this.h_6.setLocation(this.h_6.getX(), this.h_6.getY() - 1);
                this.h_7.setLocation(this.h_7.getX(), this.h_7.getY() - 1);
                this.h_8.setLocation(this.h_8.getX(), this.h_8.getY() - 1);
                if (this.h_0.getY() != 22) {
                    this.h_0.setLocation(this.h_0.getX(), this.h_0.getY() - 1);
                    if (this.h1.getY() != 150) {
                        this.h1.setLocation(this.h1.getX(), this.h1.getY() + 1);
                        if (this.h2.getY() != 22) {
                            this.h2.setLocation(this.h2.getX(), this.h2.getY() + 1);
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        } else {
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.h2.getY() != 22) {
                            this.h2.setLocation(this.h2.getX(), this.h2.getY() + 1);
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        } else {
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        }
                    }
                } else {
                    if (this.h1.getY() != 150) {
                        this.h1.setLocation(this.h1.getX(), this.h1.getY() + 1);
                        if (this.h2.getY() != 22) {
                            this.h2.setLocation(this.h2.getX(), this.h2.getY() + 1);
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        } else {
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.h2.getY() != 22) {
                            this.h2.setLocation(this.h2.getX(), this.h2.getY() + 1);
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        } else {
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        }
                    }
                }
            } else {
                if (this.h_0.getY() != 22) {
                    this.h_0.setLocation(this.h_0.getX(), this.h_0.getY() - 1);
                    if (this.h1.getY() != 150) {
                        this.h1.setLocation(this.h1.getX(), this.h1.getY() + 1);
                        if (this.h2.getY() != 22) {
                            this.h2.setLocation(this.h2.getX(), this.h2.getY() + 1);
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        } else {
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.h2.getY() != 22) {
                            this.h2.setLocation(this.h2.getX(), this.h2.getY() + 1);
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        } else {
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        }
                    }
                } else {
                    if (this.h1.getY() != 150) {
                        this.h1.setLocation(this.h1.getX(), this.h1.getY() + 1);
                        if (this.h2.getY() != 22) {
                            this.h2.setLocation(this.h2.getX(), this.h2.getY() + 1);
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        } else {
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        }
                    } else {
                        if (this.h2.getY() != 22) {
                            this.h2.setLocation(this.h2.getX(), this.h2.getY() + 1);
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        } else {
                            if (this.h_9.getY() != -106) {
                                this.h_9.setLocation(this.h_9.getX(), this.h_9.getY() - 1);
                            }
                        }
                    }
                }
            }
        } else if (this.HOUR.equals("21")) {
            if (this.h_1.getY() != 22) {
                this.h_1.setLocation(this.h_1.getX(), this.h_1.getY() + 1);
                if (this.h_0.getY() != 150) {
                    this.h_0.setLocation(this.h_0.getX(), this.h_0.getY() + 1);
                }
            } else {
                if (this.h_0.getY() != 150) {
                    this.h_0.setLocation(this.h_0.getX(), this.h_0.getY() + 1);
                }
            }
        } else if (this.HOUR.equals("22")) {
            if (this.h_2.getY() != 22) {
                this.h_2.setLocation(this.h_2.getX(), this.h_2.getY() + 1);
                if (this.h_1.getY() != 150) {
                    this.h_1.setLocation(this.h_1.getX(), this.h_1.getY() + 1);
                }
            } else {
                if (this.h_1.getY() != 150) {
                    this.h_1.setLocation(this.h_1.getX(), this.h_1.getY() + 1);
                }
            }
        } else if (this.HOUR.equals("23")) {
            if (this.h_3.getY() != 22) {
                this.h_3.setLocation(this.h_3.getX(), this.h_3.getY() + 1);
                if (this.h_2.getY() != 150) {
                    this.h_2.setLocation(this.h_2.getX(), this.h_2.getY() + 1);
                }
            } else {
                if (this.h_2.getY() != 150) {
                    this.h_2.setLocation(this.h_2.getX(), this.h_2.getY() + 1);
                }
            }
        }
    }

    public void setClockSec() {
        localTime = LocalTime.now();
        this.SEC = this.sec.format(localTime);
        if (this.SEC.equals("00")) {
            this.s0.setLocation(this.s0.getX(), 22);
            this.s1.setLocation(this.s1.getX(), -106);
            this.s2.setLocation(this.s2.getX(), -106);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 22);
            this.s_1.setLocation(this.s_1.getX(), -106);
            this.s_2.setLocation(this.s_2.getX(), -106);
            this.s_3.setLocation(this.s_3.getX(), -106);
            this.s_4.setLocation(this.s_4.getX(), -106);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("01")) {
            this.s0.setLocation(this.s0.getX(), 22);
            this.s1.setLocation(this.s1.getX(), -106);
            this.s2.setLocation(this.s2.getX(), -106);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 22);
            this.s_2.setLocation(this.s_2.getX(), -106);
            this.s_3.setLocation(this.s_3.getX(), -106);
            this.s_4.setLocation(this.s_4.getX(), -106);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("02")) {
            this.s0.setLocation(this.s0.getX(), 22);
            this.s1.setLocation(this.s1.getX(), -106);
            this.s2.setLocation(this.s2.getX(), -106);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 22);
            this.s_3.setLocation(this.s_3.getX(), -106);
            this.s_4.setLocation(this.s_4.getX(), -106);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("03")) {
            this.s0.setLocation(this.s0.getX(), 22);
            this.s1.setLocation(this.s1.getX(), -106);
            this.s2.setLocation(this.s2.getX(), -106);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 22);
            this.s_4.setLocation(this.s_4.getX(), -106);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("04")) {
            this.s0.setLocation(this.s0.getX(), 22);
            this.s1.setLocation(this.s1.getX(), -106);
            this.s2.setLocation(this.s2.getX(), -106);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 22);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("05")) {
            this.s0.setLocation(this.s0.getX(), 22);
            this.s1.setLocation(this.s1.getX(), -106);
            this.s2.setLocation(this.s2.getX(), -106);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 22);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("06")) {
            this.s0.setLocation(this.s0.getX(), 22);
            this.s1.setLocation(this.s1.getX(), -106);
            this.s2.setLocation(this.s2.getX(), -106);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 150);
            this.s_6.setLocation(this.s_6.getX(), 22);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("07")) {
            this.s0.setLocation(this.s0.getX(), 22);
            this.s1.setLocation(this.s1.getX(), -106);
            this.s2.setLocation(this.s2.getX(), -106);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 150);
            this.s_6.setLocation(this.s_6.getX(), 150);
            this.s_7.setLocation(this.s_7.getX(), 22);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("08")) {
            this.s0.setLocation(this.s0.getX(), 22);
            this.s1.setLocation(this.s1.getX(), -106);
            this.s2.setLocation(this.s2.getX(), -106);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 150);
            this.s_6.setLocation(this.s_6.getX(), 150);
            this.s_7.setLocation(this.s_7.getX(), 150);
            this.s_8.setLocation(this.s_8.getX(), 22);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("09")) {
            this.s0.setLocation(this.s0.getX(), 22);
            this.s1.setLocation(this.s1.getX(), -106);
            this.s2.setLocation(this.s2.getX(), -106);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 150);
            this.s_6.setLocation(this.s_6.getX(), 150);
            this.s_7.setLocation(this.s_7.getX(), 150);
            this.s_8.setLocation(this.s_8.getX(), 150);
            this.s_9.setLocation(this.s_9.getX(), 22);
            setClockMin();
        } else if (this.SEC.equals("10")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 22);
            this.s2.setLocation(this.s2.getX(), -106);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 22);
            this.s_1.setLocation(this.s_1.getX(), -106);
            this.s_2.setLocation(this.s_2.getX(), -106);
            this.s_3.setLocation(this.s_3.getX(), -106);
            this.s_4.setLocation(this.s_4.getX(), -106);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("11")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 22);
            this.s2.setLocation(this.s2.getX(), -106);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 22);
            this.s_2.setLocation(this.s_2.getX(), -106);
            this.s_3.setLocation(this.s_3.getX(), -106);
            this.s_4.setLocation(this.s_4.getX(), -106);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("12")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 22);
            this.s2.setLocation(this.s2.getX(), -106);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 22);
            this.s_3.setLocation(this.s_3.getX(), -106);
            this.s_4.setLocation(this.s_4.getX(), -106);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("13")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 22);
            this.s2.setLocation(this.s2.getX(), -106);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 22);
            this.s_4.setLocation(this.s_4.getX(), -106);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("14")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 22);
            this.s2.setLocation(this.s2.getX(), -106);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 22);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("15")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 22);
            this.s2.setLocation(this.s2.getX(), -106);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 22);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("16")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 22);
            this.s2.setLocation(this.s2.getX(), -106);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 150);
            this.s_6.setLocation(this.s_6.getX(), 22);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("17")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 22);
            this.s2.setLocation(this.s2.getX(), -106);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 150);
            this.s_6.setLocation(this.s_6.getX(), 150);
            this.s_7.setLocation(this.s_7.getX(), 22);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("18")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 22);
            this.s2.setLocation(this.s2.getX(), -106);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 150);
            this.s_6.setLocation(this.s_6.getX(), 150);
            this.s_7.setLocation(this.s_7.getX(), 150);
            this.s_8.setLocation(this.s_8.getX(), 22);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("19")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 22);
            this.s2.setLocation(this.s2.getX(), -106);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 150);
            this.s_6.setLocation(this.s_6.getX(), 150);
            this.s_7.setLocation(this.s_7.getX(), 150);
            this.s_8.setLocation(this.s_8.getX(), 150);
            this.s_9.setLocation(this.s_9.getX(), 22);
            setClockMin();
        } else if (this.SEC.equals("20")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 22);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 22);
            this.s_1.setLocation(this.s_1.getX(), -106);
            this.s_2.setLocation(this.s_2.getX(), -106);
            this.s_3.setLocation(this.s_3.getX(), -106);
            this.s_4.setLocation(this.s_4.getX(), -106);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("21")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 22);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 22);
            this.s_2.setLocation(this.s_2.getX(), -106);
            this.s_3.setLocation(this.s_3.getX(), -106);
            this.s_4.setLocation(this.s_4.getX(), -106);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("22")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 22);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 22);
            this.s_3.setLocation(this.s_3.getX(), -106);
            this.s_4.setLocation(this.s_4.getX(), -106);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("23")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 22);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 22);
            this.s_4.setLocation(this.s_4.getX(), -106);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("24")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 22);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 22);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("25")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 22);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 22);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("26")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 22);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 150);
            this.s_6.setLocation(this.s_6.getX(), 22);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("27")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 22);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 150);
            this.s_6.setLocation(this.s_6.getX(), 150);
            this.s_7.setLocation(this.s_7.getX(), 22);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("28")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 22);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 150);
            this.s_6.setLocation(this.s_6.getX(), 150);
            this.s_7.setLocation(this.s_7.getX(), 150);
            this.s_8.setLocation(this.s_8.getX(), 22);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("29")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 22);
            this.s3.setLocation(this.s3.getX(), -106);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 150);
            this.s_6.setLocation(this.s_6.getX(), 150);
            this.s_7.setLocation(this.s_7.getX(), 150);
            this.s_8.setLocation(this.s_8.getX(), 150);
            this.s_9.setLocation(this.s_9.getX(), 22);
            setClockMin();
        } else if (this.SEC.equals("30")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 22);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 22);
            this.s_1.setLocation(this.s_1.getX(), -106);
            this.s_2.setLocation(this.s_2.getX(), -106);
            this.s_3.setLocation(this.s_3.getX(), -106);
            this.s_4.setLocation(this.s_4.getX(), -106);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("31")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 22);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 22);
            this.s_2.setLocation(this.s_2.getX(), -106);
            this.s_3.setLocation(this.s_3.getX(), -106);
            this.s_4.setLocation(this.s_4.getX(), -106);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("32")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 22);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 22);
            this.s_3.setLocation(this.s_3.getX(), -106);
            this.s_4.setLocation(this.s_4.getX(), -106);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("33")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 22);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 22);
            this.s_4.setLocation(this.s_4.getX(), -106);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("34")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 22);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 22);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("35")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 22);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 22);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("36")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 22);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 150);
            this.s_6.setLocation(this.s_6.getX(), 22);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("37")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 22);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 150);
            this.s_6.setLocation(this.s_6.getX(), 150);
            this.s_7.setLocation(this.s_7.getX(), 22);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("38")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 22);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 150);
            this.s_6.setLocation(this.s_6.getX(), 150);
            this.s_7.setLocation(this.s_7.getX(), 150);
            this.s_8.setLocation(this.s_8.getX(), 22);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("39")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 22);
            this.s4.setLocation(this.s4.getX(), -106);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 150);
            this.s_6.setLocation(this.s_6.getX(), 150);
            this.s_7.setLocation(this.s_7.getX(), 150);
            this.s_8.setLocation(this.s_8.getX(), 150);
            this.s_9.setLocation(this.s_9.getX(), 22);
            setClockMin();
        } else if (this.SEC.equals("40")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 150);
            this.s4.setLocation(this.s4.getX(), 22);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 22);
            this.s_1.setLocation(this.s_1.getX(), -106);
            this.s_2.setLocation(this.s_2.getX(), -106);
            this.s_3.setLocation(this.s_3.getX(), -106);
            this.s_4.setLocation(this.s_4.getX(), -106);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("41")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 150);
            this.s4.setLocation(this.s4.getX(), 22);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 22);
            this.s_2.setLocation(this.s_2.getX(), -106);
            this.s_3.setLocation(this.s_3.getX(), -106);
            this.s_4.setLocation(this.s_4.getX(), -106);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("42")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 150);
            this.s4.setLocation(this.s4.getX(), 22);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 22);
            this.s_3.setLocation(this.s_3.getX(), -106);
            this.s_4.setLocation(this.s_4.getX(), -106);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("43")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 150);
            this.s4.setLocation(this.s4.getX(), 22);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 22);
            this.s_4.setLocation(this.s_4.getX(), -106);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("44")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 150);
            this.s4.setLocation(this.s4.getX(), 22);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 22);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("45")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 150);
            this.s4.setLocation(this.s4.getX(), 22);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 22);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("46")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 150);
            this.s4.setLocation(this.s4.getX(), 22);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 150);
            this.s_6.setLocation(this.s_6.getX(), 22);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("47")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 150);
            this.s4.setLocation(this.s4.getX(), 22);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 150);
            this.s_6.setLocation(this.s_6.getX(), 150);
            this.s_7.setLocation(this.s_7.getX(), 22);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("48")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 150);
            this.s4.setLocation(this.s4.getX(), 22);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 150);
            this.s_6.setLocation(this.s_6.getX(), 150);
            this.s_7.setLocation(this.s_7.getX(), 150);
            this.s_8.setLocation(this.s_8.getX(), 22);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("49")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 150);
            this.s4.setLocation(this.s4.getX(), 22);
            this.s5.setLocation(this.s5.getX(), -106);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 150);
            this.s_6.setLocation(this.s_6.getX(), 150);
            this.s_7.setLocation(this.s_7.getX(), 150);
            this.s_8.setLocation(this.s_8.getX(), 150);
            this.s_9.setLocation(this.s_9.getX(), 22);
            setClockMin();
        } else if (this.SEC.equals("50")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 150);
            this.s4.setLocation(this.s4.getX(), 150);
            this.s5.setLocation(this.s5.getX(), 22);
            this.s_0.setLocation(this.s_0.getX(), 22);
            this.s_1.setLocation(this.s_1.getX(), -106);
            this.s_2.setLocation(this.s_2.getX(), -106);
            this.s_3.setLocation(this.s_3.getX(), -106);
            this.s_4.setLocation(this.s_4.getX(), -106);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("51")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 150);
            this.s4.setLocation(this.s4.getX(), 150);
            this.s5.setLocation(this.s5.getX(), 22);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 22);
            this.s_2.setLocation(this.s_2.getX(), -106);
            this.s_3.setLocation(this.s_3.getX(), -106);
            this.s_4.setLocation(this.s_4.getX(), -106);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("52")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 150);
            this.s4.setLocation(this.s4.getX(), 150);
            this.s5.setLocation(this.s5.getX(), 22);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 22);
            this.s_3.setLocation(this.s_3.getX(), -106);
            this.s_4.setLocation(this.s_4.getX(), -106);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("53")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 150);
            this.s4.setLocation(this.s4.getX(), 150);
            this.s5.setLocation(this.s5.getX(), 22);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 22);
            this.s_4.setLocation(this.s_4.getX(), -106);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("54")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 150);
            this.s4.setLocation(this.s4.getX(), 150);
            this.s5.setLocation(this.s5.getX(), 22);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 22);
            this.s_5.setLocation(this.s_5.getX(), -106);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("55")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 150);
            this.s4.setLocation(this.s4.getX(), 150);
            this.s5.setLocation(this.s5.getX(), 22);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 22);
            this.s_6.setLocation(this.s_6.getX(), -106);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("56")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 150);
            this.s4.setLocation(this.s4.getX(), 150);
            this.s5.setLocation(this.s5.getX(), 22);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 150);
            this.s_6.setLocation(this.s_6.getX(), 22);
            this.s_7.setLocation(this.s_7.getX(), -106);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("57")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 150);
            this.s4.setLocation(this.s4.getX(), 150);
            this.s5.setLocation(this.s5.getX(), 22);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 150);
            this.s_6.setLocation(this.s_6.getX(), 150);
            this.s_7.setLocation(this.s_7.getX(), 22);
            this.s_8.setLocation(this.s_8.getX(), -106);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("58")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 150);
            this.s4.setLocation(this.s4.getX(), 150);
            this.s5.setLocation(this.s5.getX(), 22);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 150);
            this.s_6.setLocation(this.s_6.getX(), 150);
            this.s_7.setLocation(this.s_7.getX(), 150);
            this.s_8.setLocation(this.s_8.getX(), 22);
            this.s_9.setLocation(this.s_9.getX(), -106);
            setClockMin();
        } else if (this.SEC.equals("59")) {
            this.s0.setLocation(this.s0.getX(), 150);
            this.s1.setLocation(this.s1.getX(), 150);
            this.s2.setLocation(this.s2.getX(), 150);
            this.s3.setLocation(this.s3.getX(), 150);
            this.s4.setLocation(this.s4.getX(), 150);
            this.s5.setLocation(this.s5.getX(), 22);
            this.s_0.setLocation(this.s_0.getX(), 150);
            this.s_1.setLocation(this.s_1.getX(), 150);
            this.s_2.setLocation(this.s_2.getX(), 150);
            this.s_3.setLocation(this.s_3.getX(), 150);
            this.s_4.setLocation(this.s_4.getX(), 150);
            this.s_5.setLocation(this.s_5.getX(), 150);
            this.s_6.setLocation(this.s_6.getX(), 150);
            this.s_7.setLocation(this.s_7.getX(), 150);
            this.s_8.setLocation(this.s_8.getX(), 150);
            this.s_9.setLocation(this.s_9.getX(), 22);
            setClockMin();
        }
    }

    public void setClockMin() {
        this.MIN = this.minute.format(localTime);
        if (this.MIN.equals("00")) {
            this.m0.setLocation(this.m0.getX(), 22);
            this.m1.setLocation(this.m1.getX(), -106);
            this.m2.setLocation(this.m2.getX(), -106);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 22);
            this.m_1.setLocation(this.m_1.getX(), -106);
            this.m_2.setLocation(this.m_2.getX(), -106);
            this.m_3.setLocation(this.m_3.getX(), -106);
            this.m_4.setLocation(this.m_4.getX(), -106);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("01")) {
            this.m0.setLocation(this.m0.getX(), 22);
            this.m1.setLocation(this.m1.getX(), -106);
            this.m2.setLocation(this.m2.getX(), -106);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 22);
            this.m_2.setLocation(this.m_2.getX(), -106);
            this.m_3.setLocation(this.m_3.getX(), -106);
            this.m_4.setLocation(this.m_4.getX(), -106);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("02")) {
            this.m0.setLocation(this.m0.getX(), 22);
            this.m1.setLocation(this.m1.getX(), -106);
            this.m2.setLocation(this.m2.getX(), -106);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 22);
            this.m_3.setLocation(this.m_3.getX(), -106);
            this.m_4.setLocation(this.m_4.getX(), -106);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("03")) {
            this.m0.setLocation(this.m0.getX(), 22);
            this.m1.setLocation(this.m1.getX(), -106);
            this.m2.setLocation(this.m2.getX(), -106);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 22);
            this.m_4.setLocation(this.m_4.getX(), -106);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("04")) {
            this.m0.setLocation(this.m0.getX(), 22);
            this.m1.setLocation(this.m1.getX(), -106);
            this.m2.setLocation(this.m2.getX(), -106);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 22);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("05")) {
            this.m0.setLocation(this.m0.getX(), 22);
            this.m1.setLocation(this.m1.getX(), -106);
            this.m2.setLocation(this.m2.getX(), -106);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 22);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("06")) {
            this.m0.setLocation(this.m0.getX(), 22);
            this.m1.setLocation(this.m1.getX(), -106);
            this.m2.setLocation(this.m2.getX(), -106);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 150);
            this.m_6.setLocation(this.m_6.getX(), 22);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("07")) {
            this.m0.setLocation(this.m0.getX(), 22);
            this.m1.setLocation(this.m1.getX(), -106);
            this.m2.setLocation(this.m2.getX(), -106);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 150);
            this.m_6.setLocation(this.m_6.getX(), 150);
            this.m_7.setLocation(this.m_7.getX(), 22);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("08")) {
            this.m0.setLocation(this.m0.getX(), 22);
            this.m1.setLocation(this.m1.getX(), -106);
            this.m2.setLocation(this.m2.getX(), -106);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 150);
            this.m_6.setLocation(this.m_6.getX(), 150);
            this.m_7.setLocation(this.m_7.getX(), 150);
            this.m_8.setLocation(this.m_8.getX(), 22);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("09")) {
            this.m0.setLocation(this.m0.getX(), 22);
            this.m1.setLocation(this.m1.getX(), -106);
            this.m2.setLocation(this.m2.getX(), -106);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 150);
            this.m_6.setLocation(this.m_6.getX(), 150);
            this.m_7.setLocation(this.m_7.getX(), 150);
            this.m_8.setLocation(this.m_8.getX(), 150);
            this.m_9.setLocation(this.m_9.getX(), 22);
            setClockHour();
        } else if (this.MIN.equals("10")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 22);
            this.m2.setLocation(this.m2.getX(), -106);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 22);
            this.m_1.setLocation(this.m_1.getX(), -106);
            this.m_2.setLocation(this.m_2.getX(), -106);
            this.m_3.setLocation(this.m_3.getX(), -106);
            this.m_4.setLocation(this.m_4.getX(), -106);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("11")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 22);
            this.m2.setLocation(this.m2.getX(), -106);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 22);
            this.m_2.setLocation(this.m_2.getX(), -106);
            this.m_3.setLocation(this.m_3.getX(), -106);
            this.m_4.setLocation(this.m_4.getX(), -106);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("12")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 22);
            this.m2.setLocation(this.m2.getX(), -106);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 22);
            this.m_3.setLocation(this.m_3.getX(), -106);
            this.m_4.setLocation(this.m_4.getX(), -106);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("13")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 22);
            this.m2.setLocation(this.m2.getX(), -106);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 22);
            this.m_4.setLocation(this.m_4.getX(), -106);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("14")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 22);
            this.m2.setLocation(this.m2.getX(), -106);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 22);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("15")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 22);
            this.m2.setLocation(this.m2.getX(), -106);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 22);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("16")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 22);
            this.m2.setLocation(this.m2.getX(), -106);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 150);
            this.m_6.setLocation(this.m_6.getX(), 22);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("17")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 22);
            this.m2.setLocation(this.m2.getX(), -106);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 150);
            this.m_6.setLocation(this.m_6.getX(), 150);
            this.m_7.setLocation(this.m_7.getX(), 22);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("18")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 22);
            this.m2.setLocation(this.m2.getX(), -106);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 150);
            this.m_6.setLocation(this.m_6.getX(), 150);
            this.m_7.setLocation(this.m_7.getX(), 150);
            this.m_8.setLocation(this.m_8.getX(), 22);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("19")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 22);
            this.m2.setLocation(this.m2.getX(), -106);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 150);
            this.m_6.setLocation(this.m_6.getX(), 150);
            this.m_7.setLocation(this.m_7.getX(), 150);
            this.m_8.setLocation(this.m_8.getX(), 150);
            this.m_9.setLocation(this.m_9.getX(), 22);
            setClockHour();
        } else if (this.MIN.equals("20")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 22);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 22);
            this.m_1.setLocation(this.m_1.getX(), -106);
            this.m_2.setLocation(this.m_2.getX(), -106);
            this.m_3.setLocation(this.m_3.getX(), -106);
            this.m_4.setLocation(this.m_4.getX(), -106);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("21")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 22);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 22);
            this.m_2.setLocation(this.m_2.getX(), -106);
            this.m_3.setLocation(this.m_3.getX(), -106);
            this.m_4.setLocation(this.m_4.getX(), -106);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("22")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 22);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 22);
            this.m_3.setLocation(this.m_3.getX(), -106);
            this.m_4.setLocation(this.m_4.getX(), -106);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("23")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 22);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 22);
            this.m_4.setLocation(this.m_4.getX(), -106);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("24")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 22);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 22);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("25")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 22);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 22);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("26")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 22);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 150);
            this.m_6.setLocation(this.m_6.getX(), 22);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("27")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 22);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 150);
            this.m_6.setLocation(this.m_6.getX(), 150);
            this.m_7.setLocation(this.m_7.getX(), 22);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("28")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 22);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 150);
            this.m_6.setLocation(this.m_6.getX(), 150);
            this.m_7.setLocation(this.m_7.getX(), 150);
            this.m_8.setLocation(this.m_8.getX(), 22);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("29")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 22);
            this.m3.setLocation(this.m3.getX(), -106);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 150);
            this.m_6.setLocation(this.m_6.getX(), 150);
            this.m_7.setLocation(this.m_7.getX(), 150);
            this.m_8.setLocation(this.m_8.getX(), 150);
            this.m_9.setLocation(this.m_9.getX(), 22);
            setClockHour();
        } else if (this.MIN.equals("30")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 22);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 22);
            this.m_1.setLocation(this.m_1.getX(), -106);
            this.m_2.setLocation(this.m_2.getX(), -106);
            this.m_3.setLocation(this.m_3.getX(), -106);
            this.m_4.setLocation(this.m_4.getX(), -106);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("31")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 22);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 22);
            this.m_2.setLocation(this.m_2.getX(), -106);
            this.m_3.setLocation(this.m_3.getX(), -106);
            this.m_4.setLocation(this.m_4.getX(), -106);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("32")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 22);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 22);
            this.m_3.setLocation(this.m_3.getX(), -106);
            this.m_4.setLocation(this.m_4.getX(), -106);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("33")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 22);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 22);
            this.m_4.setLocation(this.m_4.getX(), -106);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("34")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 22);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 22);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("35")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 22);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 22);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("36")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 22);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 150);
            this.m_6.setLocation(this.m_6.getX(), 22);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("37")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 22);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 150);
            this.m_6.setLocation(this.m_6.getX(), 150);
            this.m_7.setLocation(this.m_7.getX(), 22);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("38")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 22);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 150);
            this.m_6.setLocation(this.m_6.getX(), 150);
            this.m_7.setLocation(this.m_7.getX(), 150);
            this.m_8.setLocation(this.m_8.getX(), 22);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("39")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 22);
            this.m4.setLocation(this.m4.getX(), -106);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 150);
            this.m_6.setLocation(this.m_6.getX(), 150);
            this.m_7.setLocation(this.m_7.getX(), 150);
            this.m_8.setLocation(this.m_8.getX(), 150);
            this.m_9.setLocation(this.m_9.getX(), 22);
            setClockHour();
        } else if (this.MIN.equals("40")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 150);
            this.m4.setLocation(this.m4.getX(), 22);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 22);
            this.m_1.setLocation(this.m_1.getX(), -106);
            this.m_2.setLocation(this.m_2.getX(), -106);
            this.m_3.setLocation(this.m_3.getX(), -106);
            this.m_4.setLocation(this.m_4.getX(), -106);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("41")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 150);
            this.m4.setLocation(this.m4.getX(), 22);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 22);
            this.m_2.setLocation(this.m_2.getX(), -106);
            this.m_3.setLocation(this.m_3.getX(), -106);
            this.m_4.setLocation(this.m_4.getX(), -106);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("42")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 150);
            this.m4.setLocation(this.m4.getX(), 22);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 22);
            this.m_3.setLocation(this.m_3.getX(), -106);
            this.m_4.setLocation(this.m_4.getX(), -106);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("43")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 150);
            this.m4.setLocation(this.m4.getX(), 22);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 22);
            this.m_4.setLocation(this.m_4.getX(), -106);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("44")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 150);
            this.m4.setLocation(this.m4.getX(), 22);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 22);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("45")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 150);
            this.m4.setLocation(this.m4.getX(), 22);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 22);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("46")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 150);
            this.m4.setLocation(this.m4.getX(), 22);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 150);
            this.m_6.setLocation(this.m_6.getX(), 22);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("47")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 150);
            this.m4.setLocation(this.m4.getX(), 22);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 150);
            this.m_6.setLocation(this.m_6.getX(), 150);
            this.m_7.setLocation(this.m_7.getX(), 22);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("48")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 150);
            this.m4.setLocation(this.m4.getX(), 22);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 150);
            this.m_6.setLocation(this.m_6.getX(), 150);
            this.m_7.setLocation(this.m_7.getX(), 150);
            this.m_8.setLocation(this.m_8.getX(), 22);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("49")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 150);
            this.m4.setLocation(this.m4.getX(), 22);
            this.m5.setLocation(this.m5.getX(), -106);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 150);
            this.m_6.setLocation(this.m_6.getX(), 150);
            this.m_7.setLocation(this.m_7.getX(), 150);
            this.m_8.setLocation(this.m_8.getX(), 150);
            this.m_9.setLocation(this.m_9.getX(), 22);
            setClockHour();
        } else if (this.MIN.equals("50")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 150);
            this.m4.setLocation(this.m4.getX(), 150);
            this.m5.setLocation(this.m5.getX(), 22);
            this.m_0.setLocation(this.m_0.getX(), 22);
            this.m_1.setLocation(this.m_1.getX(), -106);
            this.m_2.setLocation(this.m_2.getX(), -106);
            this.m_3.setLocation(this.m_3.getX(), -106);
            this.m_4.setLocation(this.m_4.getX(), -106);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("51")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 150);
            this.m4.setLocation(this.m4.getX(), 150);
            this.m5.setLocation(this.m5.getX(), 22);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 22);
            this.m_2.setLocation(this.m_2.getX(), -106);
            this.m_3.setLocation(this.m_3.getX(), -106);
            this.m_4.setLocation(this.m_4.getX(), -106);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("52")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 150);
            this.m4.setLocation(this.m4.getX(), 150);
            this.m5.setLocation(this.m5.getX(), 22);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 22);
            this.m_3.setLocation(this.m_3.getX(), -106);
            this.m_4.setLocation(this.m_4.getX(), -106);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("53")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 150);
            this.m4.setLocation(this.m4.getX(), 150);
            this.m5.setLocation(this.m5.getX(), 22);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 22);
            this.m_4.setLocation(this.m_4.getX(), -106);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("54")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 150);
            this.m4.setLocation(this.m4.getX(), 150);
            this.m5.setLocation(this.m5.getX(), 22);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 22);
            this.m_5.setLocation(this.m_5.getX(), -106);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("55")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 150);
            this.m4.setLocation(this.m4.getX(), 150);
            this.m5.setLocation(this.m5.getX(), 22);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 22);
            this.m_6.setLocation(this.m_6.getX(), -106);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("56")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 150);
            this.m4.setLocation(this.m4.getX(), 150);
            this.m5.setLocation(this.m5.getX(), 22);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 150);
            this.m_6.setLocation(this.m_6.getX(), 22);
            this.m_7.setLocation(this.m_7.getX(), -106);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("57")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 150);
            this.m4.setLocation(this.m4.getX(), 150);
            this.m5.setLocation(this.m5.getX(), 22);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 150);
            this.m_6.setLocation(this.m_6.getX(), 150);
            this.m_7.setLocation(this.m_7.getX(), 22);
            this.m_8.setLocation(this.m_8.getX(), -106);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("58")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 150);
            this.m4.setLocation(this.m4.getX(), 150);
            this.m5.setLocation(this.m5.getX(), 22);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 150);
            this.m_6.setLocation(this.m_6.getX(), 150);
            this.m_7.setLocation(this.m_7.getX(), 150);
            this.m_8.setLocation(this.m_8.getX(), 22);
            this.m_9.setLocation(this.m_9.getX(), -106);
            setClockHour();
        } else if (this.MIN.equals("59")) {
            this.m0.setLocation(this.m0.getX(), 150);
            this.m1.setLocation(this.m1.getX(), 150);
            this.m2.setLocation(this.m2.getX(), 150);
            this.m3.setLocation(this.m3.getX(), 150);
            this.m4.setLocation(this.m4.getX(), 150);
            this.m5.setLocation(this.m5.getX(), 22);
            this.m_0.setLocation(this.m_0.getX(), 150);
            this.m_1.setLocation(this.m_1.getX(), 150);
            this.m_2.setLocation(this.m_2.getX(), 150);
            this.m_3.setLocation(this.m_3.getX(), 150);
            this.m_4.setLocation(this.m_4.getX(), 150);
            this.m_5.setLocation(this.m_5.getX(), 150);
            this.m_6.setLocation(this.m_6.getX(), 150);
            this.m_7.setLocation(this.m_7.getX(), 150);
            this.m_8.setLocation(this.m_8.getX(), 150);
            this.m_9.setLocation(this.m_9.getX(), 22);
            setClockHour();
        }
    }

    public void setClockHour() {
        this.HOUR = this.hour.format(localTime);
        if (this.HOUR.equals("00") || this.HOUR.equals("24")) {
            this.h0.setLocation(this.h0.getX(), 22);
            this.h1.setLocation(this.h1.getX(), -106);
            this.h2.setLocation(this.h2.getX(), -106);
            this.h_0.setLocation(this.h_0.getX(), 22);
            this.h_1.setLocation(this.h_1.getX(), -106);
            this.h_2.setLocation(this.h_2.getX(), -106);
            this.h_3.setLocation(this.h_3.getX(), -106);
            this.h_4.setLocation(this.h_4.getX(), -106);
            this.h_5.setLocation(this.h_5.getX(), -106);
            this.h_6.setLocation(this.h_6.getX(), -106);
            this.h_7.setLocation(this.h_7.getX(), -106);
            this.h_8.setLocation(this.h_8.getX(), -106);
            this.h_9.setLocation(this.h_9.getX(), -106);
        } else if (this.HOUR.equals("01")) {
            this.h0.setLocation(this.h0.getX(), 22);
            this.h1.setLocation(this.h1.getX(), -106);
            this.h2.setLocation(this.h2.getX(), -106);
            this.h_0.setLocation(this.h_0.getX(), 150);
            this.h_1.setLocation(this.h_1.getX(), 22);
            this.h_2.setLocation(this.h_2.getX(), -106);
            this.h_3.setLocation(this.h_3.getX(), -106);
            this.h_4.setLocation(this.h_4.getX(), -106);
            this.h_5.setLocation(this.h_5.getX(), -106);
            this.h_6.setLocation(this.h_6.getX(), -106);
            this.h_7.setLocation(this.h_7.getX(), -106);
            this.h_8.setLocation(this.h_8.getX(), -106);
            this.h_9.setLocation(this.h_9.getX(), -106);

        } else if (this.HOUR.equals("02")) {
            this.h0.setLocation(this.h0.getX(), 22);
            this.h1.setLocation(this.h1.getX(), -106);
            this.h2.setLocation(this.h2.getX(), -106);
            this.h_0.setLocation(this.h_0.getX(), 150);
            this.h_1.setLocation(this.h_1.getX(), 150);
            this.h_2.setLocation(this.h_2.getX(), 22);
            this.h_3.setLocation(this.h_3.getX(), -106);
            this.h_4.setLocation(this.h_4.getX(), -106);
            this.h_5.setLocation(this.h_5.getX(), -106);
            this.h_6.setLocation(this.h_6.getX(), -106);
            this.h_7.setLocation(this.h_7.getX(), -106);
            this.h_8.setLocation(this.h_8.getX(), -106);
            this.h_9.setLocation(this.h_9.getX(), -106);

        } else if (this.HOUR.equals("03")) {
            this.h0.setLocation(this.h0.getX(), 22);
            this.h1.setLocation(this.h1.getX(), -106);
            this.h2.setLocation(this.h2.getX(), -106);

            this.h_0.setLocation(this.h_0.getX(), 150);
            this.h_1.setLocation(this.h_1.getX(), 150);
            this.h_2.setLocation(this.h_2.getX(), 150);
            this.h_3.setLocation(this.h_3.getX(), 22);
            this.h_4.setLocation(this.h_4.getX(), -106);
            this.h_5.setLocation(this.h_5.getX(), -106);
            this.h_6.setLocation(this.h_6.getX(), -106);
            this.h_7.setLocation(this.h_7.getX(), -106);
            this.h_8.setLocation(this.h_8.getX(), -106);
            this.h_9.setLocation(this.h_9.getX(), -106);

        } else if (this.HOUR.equals("04")) {
            this.h0.setLocation(this.h0.getX(), 22);
            this.h1.setLocation(this.h1.getX(), -106);
            this.h2.setLocation(this.h2.getX(), -106);

            this.h_0.setLocation(this.h_0.getX(), 150);
            this.h_1.setLocation(this.h_1.getX(), 150);
            this.h_2.setLocation(this.h_2.getX(), 150);
            this.h_3.setLocation(this.h_3.getX(), 150);
            this.h_4.setLocation(this.h_4.getX(), 22);
            this.h_5.setLocation(this.h_5.getX(), -106);
            this.h_6.setLocation(this.h_6.getX(), -106);
            this.h_7.setLocation(this.h_7.getX(), -106);
            this.h_8.setLocation(this.h_8.getX(), -106);
            this.h_9.setLocation(this.h_9.getX(), -106);

        } else if (this.HOUR.equals("05")) {
            this.h0.setLocation(this.h0.getX(), 22);
            this.h1.setLocation(this.h1.getX(), -106);
            this.h2.setLocation(this.h2.getX(), -106);

            this.h_0.setLocation(this.h_0.getX(), 150);
            this.h_1.setLocation(this.h_1.getX(), 150);
            this.h_2.setLocation(this.h_2.getX(), 150);
            this.h_3.setLocation(this.h_3.getX(), 150);
            this.h_4.setLocation(this.h_4.getX(), 150);
            this.h_5.setLocation(this.h_5.getX(), 22);
            this.h_6.setLocation(this.h_6.getX(), -106);
            this.h_7.setLocation(this.h_7.getX(), -106);
            this.h_8.setLocation(this.h_8.getX(), -106);
            this.h_9.setLocation(this.h_9.getX(), -106);

        } else if (this.HOUR.equals("06")) {
            this.h0.setLocation(this.h0.getX(), 22);
            this.h1.setLocation(this.h1.getX(), -106);
            this.h2.setLocation(this.h2.getX(), -106);

            this.h_0.setLocation(this.h_0.getX(), 150);
            this.h_1.setLocation(this.h_1.getX(), 150);
            this.h_2.setLocation(this.h_2.getX(), 150);
            this.h_3.setLocation(this.h_3.getX(), 150);
            this.h_4.setLocation(this.h_4.getX(), 150);
            this.h_5.setLocation(this.h_5.getX(), 150);
            this.h_6.setLocation(this.h_6.getX(), 22);
            this.h_7.setLocation(this.h_7.getX(), -106);
            this.h_8.setLocation(this.h_8.getX(), -106);
            this.h_9.setLocation(this.h_9.getX(), -106);

        } else if (this.HOUR.equals("07")) {
            this.h0.setLocation(this.h0.getX(), 22);
            this.h1.setLocation(this.h1.getX(), -106);
            this.h2.setLocation(this.h2.getX(), -106);

            this.h_0.setLocation(this.h_0.getX(), 150);
            this.h_1.setLocation(this.h_1.getX(), 150);
            this.h_2.setLocation(this.h_2.getX(), 150);
            this.h_3.setLocation(this.h_3.getX(), 150);
            this.h_4.setLocation(this.h_4.getX(), 150);
            this.h_5.setLocation(this.h_5.getX(), 150);
            this.h_6.setLocation(this.h_6.getX(), 150);
            this.h_7.setLocation(this.h_7.getX(), 22);
            this.h_8.setLocation(this.h_8.getX(), -106);
            this.h_9.setLocation(this.h_9.getX(), -106);

        } else if (this.HOUR.equals("08")) {
            this.h0.setLocation(this.h0.getX(), 22);
            this.h1.setLocation(this.h1.getX(), -106);
            this.h2.setLocation(this.h2.getX(), -106);

            this.h_0.setLocation(this.h_0.getX(), 150);
            this.h_1.setLocation(this.h_1.getX(), 150);
            this.h_2.setLocation(this.h_2.getX(), 150);
            this.h_3.setLocation(this.h_3.getX(), 150);
            this.h_4.setLocation(this.h_4.getX(), 150);
            this.h_5.setLocation(this.h_5.getX(), 150);
            this.h_6.setLocation(this.h_6.getX(), 150);
            this.h_7.setLocation(this.h_7.getX(), 150);
            this.h_8.setLocation(this.h_8.getX(), 22);
            this.h_9.setLocation(this.h_9.getX(), -106);

        } else if (this.HOUR.equals("09")) {
            this.h0.setLocation(this.h0.getX(), 22);
            this.h1.setLocation(this.h1.getX(), -106);
            this.h2.setLocation(this.h2.getX(), -106);

            this.h_0.setLocation(this.h_0.getX(), 150);
            this.h_1.setLocation(this.h_1.getX(), 150);
            this.h_2.setLocation(this.h_2.getX(), 150);
            this.h_3.setLocation(this.h_3.getX(), 150);
            this.h_4.setLocation(this.h_4.getX(), 150);
            this.h_5.setLocation(this.h_5.getX(), 150);
            this.h_6.setLocation(this.h_6.getX(), 150);
            this.h_7.setLocation(this.h_7.getX(), 150);
            this.h_8.setLocation(this.h_8.getX(), 150);
            this.h_9.setLocation(this.h_9.getX(), 22);

        } else if (this.HOUR.equals("10")) {
            this.h0.setLocation(this.h0.getX(), 150);
            this.h1.setLocation(this.h1.getX(), 22);
            this.h2.setLocation(this.h2.getX(), -106);

            this.h_0.setLocation(this.h_0.getX(), 22);
            this.h_1.setLocation(this.h_1.getX(), -106);
            this.h_2.setLocation(this.h_2.getX(), -106);
            this.h_3.setLocation(this.h_3.getX(), -106);
            this.h_4.setLocation(this.h_4.getX(), -106);
            this.h_5.setLocation(this.h_5.getX(), -106);
            this.h_6.setLocation(this.h_6.getX(), -106);
            this.h_7.setLocation(this.h_7.getX(), -106);
            this.h_8.setLocation(this.h_8.getX(), -106);
            this.h_9.setLocation(this.h_9.getX(), -106);

        } else if (this.HOUR.equals("11")) {
            this.h0.setLocation(this.h0.getX(), 150);
            this.h1.setLocation(this.h1.getX(), 22);
            this.h2.setLocation(this.h2.getX(), -106);

            this.h_0.setLocation(this.h_0.getX(), 150);
            this.h_1.setLocation(this.h_1.getX(), 22);
            this.h_2.setLocation(this.h_2.getX(), -106);
            this.h_3.setLocation(this.h_3.getX(), -106);
            this.h_4.setLocation(this.h_4.getX(), -106);
            this.h_5.setLocation(this.h_5.getX(), -106);
            this.h_6.setLocation(this.h_6.getX(), -106);
            this.h_7.setLocation(this.h_7.getX(), -106);
            this.h_8.setLocation(this.h_8.getX(), -106);
            this.h_9.setLocation(this.h_9.getX(), -106);

        } else if (this.HOUR.equals("12")) {
            this.h0.setLocation(this.h0.getX(), 150);
            this.h1.setLocation(this.h1.getX(), 22);
            this.h2.setLocation(this.h2.getX(), -106);

            this.h_0.setLocation(this.h_0.getX(), 150);
            this.h_1.setLocation(this.h_1.getX(), 150);
            this.h_2.setLocation(this.h_2.getX(), 22);
            this.h_3.setLocation(this.h_3.getX(), -106);
            this.h_4.setLocation(this.h_4.getX(), -106);
            this.h_5.setLocation(this.h_5.getX(), -106);
            this.h_6.setLocation(this.h_6.getX(), -106);
            this.h_7.setLocation(this.h_7.getX(), -106);
            this.h_8.setLocation(this.h_8.getX(), -106);
            this.h_9.setLocation(this.h_9.getX(), -106);

        } else if (this.HOUR.equals("13")) {
            this.h0.setLocation(this.h0.getX(), 150);
            this.h1.setLocation(this.h1.getX(), 22);
            this.h2.setLocation(this.h2.getX(), -106);

            this.h_0.setLocation(this.h_0.getX(), 150);
            this.h_1.setLocation(this.h_1.getX(), 150);
            this.h_2.setLocation(this.h_2.getX(), 150);
            this.h_3.setLocation(this.h_3.getX(), 22);
            this.h_4.setLocation(this.h_4.getX(), -106);
            this.h_5.setLocation(this.h_5.getX(), -106);
            this.h_6.setLocation(this.h_6.getX(), -106);
            this.h_7.setLocation(this.h_7.getX(), -106);
            this.h_8.setLocation(this.h_8.getX(), -106);
            this.h_9.setLocation(this.h_9.getX(), -106);

        } else if (this.HOUR.equals("14")) {
            this.h0.setLocation(this.h0.getX(), 150);
            this.h1.setLocation(this.h1.getX(), 22);
            this.h2.setLocation(this.h2.getX(), -106);

            this.h_0.setLocation(this.h_0.getX(), 150);
            this.h_1.setLocation(this.h_1.getX(), 150);
            this.h_2.setLocation(this.h_2.getX(), 150);
            this.h_3.setLocation(this.h_3.getX(), 150);
            this.h_4.setLocation(this.h_4.getX(), 22);
            this.h_5.setLocation(this.h_5.getX(), -106);
            this.h_6.setLocation(this.h_6.getX(), -106);
            this.h_7.setLocation(this.h_7.getX(), -106);
            this.h_8.setLocation(this.h_8.getX(), -106);
            this.h_9.setLocation(this.h_9.getX(), -106);

        } else if (this.HOUR.equals("15")) {
            this.h0.setLocation(this.h0.getX(), 150);
            this.h1.setLocation(this.h1.getX(), 22);
            this.h2.setLocation(this.h2.getX(), -106);

            this.h_0.setLocation(this.h_0.getX(), 150);
            this.h_1.setLocation(this.h_1.getX(), 150);
            this.h_2.setLocation(this.h_2.getX(), 150);
            this.h_3.setLocation(this.h_3.getX(), 150);
            this.h_4.setLocation(this.h_4.getX(), 150);
            this.h_5.setLocation(this.h_5.getX(), 22);
            this.h_6.setLocation(this.h_6.getX(), -106);
            this.h_7.setLocation(this.h_7.getX(), -106);
            this.h_8.setLocation(this.h_8.getX(), -106);
            this.h_9.setLocation(this.h_9.getX(), -106);

        } else if (this.HOUR.equals("16")) {
            this.h0.setLocation(this.h0.getX(), 150);
            this.h1.setLocation(this.h1.getX(), 22);
            this.h2.setLocation(this.h2.getX(), -106);

            this.h_0.setLocation(this.h_0.getX(), 150);
            this.h_1.setLocation(this.h_1.getX(), 150);
            this.h_2.setLocation(this.h_2.getX(), 150);
            this.h_3.setLocation(this.h_3.getX(), 150);
            this.h_4.setLocation(this.h_4.getX(), 150);
            this.h_5.setLocation(this.h_5.getX(), 150);
            this.h_6.setLocation(this.h_6.getX(), 22);
            this.h_7.setLocation(this.h_7.getX(), -106);
            this.h_8.setLocation(this.h_8.getX(), -106);
            this.h_9.setLocation(this.h_9.getX(), -106);

        } else if (this.HOUR.equals("17")) {
            this.h0.setLocation(this.h0.getX(), 150);
            this.h1.setLocation(this.h1.getX(), 22);
            this.h2.setLocation(this.h2.getX(), -106);

            this.h_0.setLocation(this.h_0.getX(), 150);
            this.h_1.setLocation(this.h_1.getX(), 150);
            this.h_2.setLocation(this.h_2.getX(), 150);
            this.h_3.setLocation(this.h_3.getX(), 150);
            this.h_4.setLocation(this.h_4.getX(), 150);
            this.h_5.setLocation(this.h_5.getX(), 150);
            this.h_6.setLocation(this.h_6.getX(), 150);
            this.h_7.setLocation(this.h_7.getX(), 22);
            this.h_8.setLocation(this.h_8.getX(), -106);
            this.h_9.setLocation(this.h_9.getX(), -106);

        } else if (this.HOUR.equals("18")) {
            this.h0.setLocation(this.h0.getX(), 150);
            this.h1.setLocation(this.h1.getX(), 22);
            this.h2.setLocation(this.h2.getX(), -106);

            this.h_0.setLocation(this.h_0.getX(), 150);
            this.h_1.setLocation(this.h_1.getX(), 150);
            this.h_2.setLocation(this.h_2.getX(), 150);
            this.h_3.setLocation(this.h_3.getX(), 150);
            this.h_4.setLocation(this.h_4.getX(), 150);
            this.h_5.setLocation(this.h_5.getX(), 150);
            this.h_6.setLocation(this.h_6.getX(), 150);
            this.h_7.setLocation(this.h_7.getX(), 150);
            this.h_8.setLocation(this.h_8.getX(), 22);
            this.h_9.setLocation(this.h_9.getX(), -106);

        } else if (this.HOUR.equals("19")) {
            this.h0.setLocation(this.h0.getX(), 150);
            this.h1.setLocation(this.h1.getX(), 22);
            this.h2.setLocation(this.h2.getX(), -106);

            this.h_0.setLocation(this.h_0.getX(), 150);
            this.h_1.setLocation(this.h_1.getX(), 150);
            this.h_2.setLocation(this.h_2.getX(), 150);
            this.h_3.setLocation(this.h_3.getX(), 150);
            this.h_4.setLocation(this.h_4.getX(), 150);
            this.h_5.setLocation(this.h_5.getX(), 150);
            this.h_6.setLocation(this.h_6.getX(), 150);
            this.h_7.setLocation(this.h_7.getX(), 150);
            this.h_8.setLocation(this.h_8.getX(), 150);
            this.h_9.setLocation(this.h_9.getX(), 22);

        } else if (this.HOUR.equals("20")) {
            this.h0.setLocation(this.h0.getX(), 150);
            this.h1.setLocation(this.h1.getX(), 150);
            this.h2.setLocation(this.h2.getX(), 22);

            this.h_0.setLocation(this.h_0.getX(), 22);
            this.h_1.setLocation(this.h_1.getX(), -106);
            this.h_2.setLocation(this.h_2.getX(), -106);
            this.h_3.setLocation(this.h_3.getX(), -106);
            this.h_4.setLocation(this.h_4.getX(), -106);
            this.h_5.setLocation(this.h_5.getX(), -106);
            this.h_6.setLocation(this.h_6.getX(), -106);
            this.h_7.setLocation(this.h_7.getX(), -106);
            this.h_8.setLocation(this.h_8.getX(), -106);
            this.h_9.setLocation(this.h_9.getX(), -106);

        } else if (this.HOUR.equals("21")) {
            this.h0.setLocation(this.h0.getX(), 150);
            this.h1.setLocation(this.h1.getX(), 150);
            this.h2.setLocation(this.h2.getX(), 22);

            this.h_0.setLocation(this.h_0.getX(), 150);
            this.h_1.setLocation(this.h_1.getX(), 22);
            this.h_2.setLocation(this.h_2.getX(), -106);
            this.h_3.setLocation(this.h_3.getX(), -106);
            this.h_4.setLocation(this.h_4.getX(), -106);
            this.h_5.setLocation(this.h_5.getX(), -106);
            this.h_6.setLocation(this.h_6.getX(), -106);
            this.h_7.setLocation(this.h_7.getX(), -106);
            this.h_8.setLocation(this.h_8.getX(), -106);
            this.h_9.setLocation(this.h_9.getX(), -106);

        } else if (this.HOUR.equals("22")) {
            this.h0.setLocation(this.h0.getX(), 150);
            this.h1.setLocation(this.h1.getX(), 150);
            this.h2.setLocation(this.h2.getX(), 22);

            this.h_0.setLocation(this.h_0.getX(), 150);
            this.h_1.setLocation(this.h_1.getX(), 150);
            this.h_2.setLocation(this.h_2.getX(), 22);
            this.h_3.setLocation(this.h_3.getX(), -106);
            this.h_4.setLocation(this.h_4.getX(), -106);
            this.h_5.setLocation(this.h_5.getX(), -106);
            this.h_6.setLocation(this.h_6.getX(), -106);
            this.h_7.setLocation(this.h_7.getX(), -106);
            this.h_8.setLocation(this.h_8.getX(), -106);
            this.h_9.setLocation(this.h_9.getX(), -106);

        } else if (this.HOUR.equals("23")) {
            this.h0.setLocation(this.h0.getX(), 150);
            this.h1.setLocation(this.h1.getX(), 150);
            this.h2.setLocation(this.h2.getX(), 22);

            this.h_0.setLocation(this.h_0.getX(), 150);
            this.h_1.setLocation(this.h_1.getX(), 150);
            this.h_2.setLocation(this.h_2.getX(), 150);
            this.h_3.setLocation(this.h_3.getX(), 22);
            this.h_4.setLocation(this.h_4.getX(), -106);
            this.h_5.setLocation(this.h_5.getX(), -106);
            this.h_6.setLocation(this.h_6.getX(), -106);
            this.h_7.setLocation(this.h_7.getX(), -106);
            this.h_8.setLocation(this.h_8.getX(), -106);
            this.h_9.setLocation(this.h_9.getX(), -106);

        }
    }

    @Override
    public void run() {
        this.Gui.setOpacity(1F);
        this.Gui.setBackground(new Color(0, 0, 0, 0));
        this.Gui.setOpacity(0.5F);
        setClockSec();
        while (true) {
            try {
                localTime = LocalTime.now();
                this.HOUR = this.hour.format(localTime);
                this.MIN = this.minute.format(localTime);
                this.SEC = this.sec.format(localTime);
                Thread.sleep(1);
                changeSEC();
            } catch (InterruptedException e) {
                System.exit(0);
            }

        }

    }

    class tdotblink implements Runnable {
        public void run() {
            while (true) {
                try {
                    tdot1.setIcon(null);
                    tdot2.setIcon(null);
                    Thread.sleep(1000);
                    if(theme.getText().equals("White theme")){
                        tdot1.setIcon(twodot);
                        tdot2.setIcon(twodot);
                        Thread.sleep(1000);  
                    }else if(theme.getText().equals("Black theme")){
                        tdot1.setIcon(twodot_black);
                        tdot2.setIcon(twodot_black);
                        Thread.sleep(1000);  
                    }
                    
                } catch (Exception e) {
                    System.exit(0);
                }
            }
        }
    }

    class setTime implements Runnable {
        public void run() {
            while (true) {
                try {
                    Thread.sleep(3000);
                    setClockSec();
                } catch (Exception e) {
                    System.exit(0);
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (this.second.isSelected()) {
            this.Gui.setSize(665, 160);
            this.Gui.setLocationRelativeTo(null);
            this.tdot2.setVisible(true);
            this.s0.setVisible(true);
            this.s1.setVisible(true);
            this.s2.setVisible(true);
            this.s3.setVisible(true);
            this.s4.setVisible(true);
            this.s5.setVisible(true);
            this.s_0.setVisible(true);
            this.s_1.setVisible(true);
            this.s_2.setVisible(true);
            this.s_3.setVisible(true);
            this.s_4.setVisible(true);
            this.s_5.setVisible(true);
            this.s_6.setVisible(true);
            this.s_7.setVisible(true);
            this.s_8.setVisible(true);
            this.s_9.setVisible(true);
        } else {
            this.Gui.setSize(435, 160);
            this.Gui.setLocationRelativeTo(null);
            this.tdot2.setVisible(false);
            this.s0.setVisible(false);
            this.s1.setVisible(false);
            this.s2.setVisible(false);
            this.s3.setVisible(false);
            this.s4.setVisible(false);
            this.s5.setVisible(false);
            this.s_0.setVisible(false);
            this.s_1.setVisible(false);
            this.s_2.setVisible(false);
            this.s_3.setVisible(false);
            this.s_4.setVisible(false);
            this.s_5.setVisible(false);
            this.s_6.setVisible(false);
            this.s_7.setVisible(false);
            this.s_8.setVisible(false);
            this.s_9.setVisible(false);
        }
        if (this.alontop.isSelected()) {
            this.Gui.setAlwaysOnTop(true);
        } else {
            this.Gui.setAlwaysOnTop(false);
        }
        if (e.getSource() == this.theme) {
            if (this.theme.getText().equals("Black theme")) {
                this.theme.setText("White theme");
                this.h0.setIcon(this.number0_black);
                this.h1.setIcon(this.number1_black);
                this.h2.setIcon(this.number2_black);
                this.h_0.setIcon(this.number0_black);
                this.h_1.setIcon(this.number1_black);
                this.h_2.setIcon(this.number2_black);
                this.h_3.setIcon(this.number3_black);
                this.h_4.setIcon(this.number4_black);
                this.h_5.setIcon(this.number5_black);
                this.h_6.setIcon(this.number6_black);
                this.h_7.setIcon(this.number7_black);
                this.h_8.setIcon(this.number8_black);
                this.h_9.setIcon(this.number9_black);

                this.m0.setIcon(this.number0_black);
                this.m1.setIcon(this.number1_black);
                this.m2.setIcon(this.number2_black);
                this.m3.setIcon(this.number3_black);
                this.m4.setIcon(this.number4_black);
                this.m5.setIcon(this.number5_black);
                this.m_0.setIcon(this.number0_black);
                this.m_1.setIcon(this.number1_black);
                this.m_2.setIcon(this.number2_black);
                this.m_3.setIcon(this.number3_black);
                this.m_4.setIcon(this.number4_black);
                this.m_5.setIcon(this.number5_black);
                this.m_6.setIcon(this.number6_black);
                this.m_7.setIcon(this.number7_black);
                this.m_8.setIcon(this.number8_black);
                this.m_9.setIcon(this.number9_black);

                this.s0.setIcon(this.number0_black);
                this.s1.setIcon(this.number1_black);
                this.s2.setIcon(this.number2_black);
                this.s3.setIcon(this.number3_black);
                this.s4.setIcon(this.number4_black);
                this.s5.setIcon(this.number5_black);
                this.s_1.setIcon(this.number1_black);
                this.s_2.setIcon(this.number2_black);
                this.s_3.setIcon(this.number3_black);
                this.s_4.setIcon(this.number4_black);
                this.s_5.setIcon(this.number5_black);
                this.s_6.setIcon(this.number6_black);
                this.s_7.setIcon(this.number7_black);
                this.s_8.setIcon(this.number8_black);
                this.s_9.setIcon(this.number9_black);
                this.s_0.setIcon(this.number0_black);
                this.tdot1.setIcon(this.twodot_black);
                this.tdot2.setIcon(this.twodot_black);
                this.Gui.setOpacity(1F);
                this.Gui.setBackground(new Color(0, 0, 0, 0));
            } else if (this.theme.getText().equals("White theme")) {
                this.theme.setText("Black theme");
                this.h0.setIcon(this.number0);
                this.h1.setIcon(this.number1);
                this.h2.setIcon(this.number2);
                this.h_0.setIcon(this.number0);
                this.h_1.setIcon(this.number1);
                this.h_2.setIcon(this.number2);
                this.h_3.setIcon(this.number3);
                this.h_4.setIcon(this.number4);
                this.h_5.setIcon(this.number5);
                this.h_6.setIcon(this.number6);
                this.h_7.setIcon(this.number7);
                this.h_8.setIcon(this.number8);
                this.h_9.setIcon(this.number9);

                this.m0.setIcon(this.number0);
                this.m1.setIcon(this.number1);
                this.m2.setIcon(this.number2);
                this.m3.setIcon(this.number3);
                this.m4.setIcon(this.number4);
                this.m5.setIcon(this.number5);
                this.m_0.setIcon(this.number0);
                this.m_1.setIcon(this.number1);
                this.m_2.setIcon(this.number2);
                this.m_3.setIcon(this.number3);
                this.m_4.setIcon(this.number4);
                this.m_5.setIcon(this.number5);
                this.m_6.setIcon(this.number6);
                this.m_7.setIcon(this.number7);
                this.m_8.setIcon(this.number8);
                this.m_9.setIcon(this.number9);

                this.s0.setIcon(this.number0);
                this.s1.setIcon(this.number1);
                this.s2.setIcon(this.number2);
                this.s3.setIcon(this.number3);
                this.s4.setIcon(this.number4);
                this.s5.setIcon(this.number5);
                this.s_1.setIcon(this.number1);
                this.s_2.setIcon(this.number2);
                this.s_3.setIcon(this.number3);
                this.s_4.setIcon(this.number4);
                this.s_5.setIcon(this.number5);
                this.s_6.setIcon(this.number6);
                this.s_7.setIcon(this.number7);
                this.s_8.setIcon(this.number8);
                this.s_9.setIcon(this.number9);
                this.s_0.setIcon(this.number0);
                this.tdot1.setIcon(this.twodot);
                this.tdot2.setIcon(this.twodot);
                this.Gui.setOpacity(1F);
                this.Gui.setBackground(new Color(0, 0, 0, 0));
            }

        } else if (e.getSource() == this.exit) {
            if (this.Gui.isAlwaysOnTop()) {
                this.Gui.setAlwaysOnTop(false);
                int i = JOptionPane.showConfirmDialog(null, "Wanna close digital clock?", "Notification",
                        JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null);
                if (i == 0) {
                    System.exit(0);
                } else {
                    this.Gui.setAlwaysOnTop(true);
                }
            } else {
                int i = JOptionPane.showConfirmDialog(null, "Wanna close digital clock?", "Notification",
                        JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null);
                if (i == 0) {
                    System.exit(0);
                } else {
                }
            }

        }
    }
}
