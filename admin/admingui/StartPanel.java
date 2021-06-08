package admin.admingui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class StartPanel extends JFrame {
    private JPanel RootPanel;
    private JButton addARoomButton;
    private JButton addACouponButton;
    public StartPanel(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(RootPanel);
        this.setLocationRelativeTo(null);
        this.setPreferredSize(new Dimension(400,200));
        this.pack();
        addARoomButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                JFrame frame = null;
                try {
                    frame = new AddRoom("AddRoomWindow");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                frame.setVisible(true);
            }
        });
        addACouponButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                JFrame frame = null;
                try {
                    frame = new AddCoupon("AddCouponWindow");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                frame.setVisible(true);
            }
        });
    }
    public static void main(String[] args){
        JFrame frame = new StartPanel("StartPanel");
        frame.setVisible(true);
    }
}
