package admin.admingui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class AddRoom extends JFrame{
    private JPanel RootPanel;
    private JLabel roomidfield;
    private JTextField roomidtext;
    private JLabel peoplelabel;
    private JTextField peopletext;
    private JLabel costlabel;
    private JTextField costtext;
    private JLabel addresslabel;
    private JTextField addresstext;
    private JButton submitbutton;
    private JButton returnToStartPanelButton;
    private JTextField Addroomfield;
    public AddRoom(String title) throws SQLException {
        super(title);
        //local
        //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/roomtunes", "root", "");
        //free-server
        Connection conn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/roomtunes", "kwstas1998", "1q2w3e4r");
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setContentPane(RootPanel);
        this.setLocationRelativeTo(null);
        this.setPreferredSize(new Dimension(400,400));
        this.pack();
        submitbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    try {
                        int RoomId = Integer.valueOf(roomidtext.getText());
                        int NumberOfPeople = Integer.valueOf((peopletext.getText()));
                        int CostPerHour = Integer.valueOf((costtext.getText()));
                        String Address = String.valueOf(addresstext.getText());
                        if(RoomId <= 0) {
                            //while(RoomId==ListRoomId){
                            Random rand = new Random();
                            int rand_int = rand.nextInt(1000);
                            RoomId = rand_int;
                            JOptionPane.showMessageDialog(null, "Random RoomId has been generated : " + RoomId,
                                    "Generated RoomId", JOptionPane.PLAIN_MESSAGE);
                            //an autos o arithmos den uparxei hdh kataxwrhse allios proxwra
                            //}
                        }
                        if (NumberOfPeople > 0 & CostPerHour > 0){
                            PreparedStatement prepst = conn.prepareStatement("INSERT INTO Room(Address,CostPerHour,RoomID,NumberOfPeople) VALUES(?,?,?,?)");
                            prepst.setString(1,Address);
                            prepst.setInt(2,CostPerHour);
                            prepst.setInt(3,RoomId);
                            prepst.setInt(4,NumberOfPeople);
                            prepst.executeUpdate();
                            JOptionPane.showMessageDialog(null,"Success");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "NumberOfPeople/CostPerHour must be positive number");
                        }

                    } catch (Exception a) {
                        JOptionPane.showMessageDialog(null,"Error,Please check your inputs");
                    }
            }
        });
        returnToStartPanelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                JFrame frame = new StartPanel("StartPanel");
                frame.setVisible(true);
            }
        });
    }


    public static void main(String[] args) throws SQLException {
        JFrame frame = new AddRoom("AddRoomWindow");
        frame.setVisible(true);
    }
}