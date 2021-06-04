package admin.admingui;


import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private JTextField Addroomfield;
    public AddRoom(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(RootPanel);
        this.setLocationRelativeTo(null);
        this.setPreferredSize(new Dimension(400,400));
        this.pack();
        submitbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int NumberOfPeople = 0;
                int RoomId = 0;
                int CostPerHour = 0;
                try {
                    RoomId = Integer.valueOf(roomidtext.getText());
                    NumberOfPeople = Integer.valueOf((peopletext.getText()));
                    CostPerHour = Integer.valueOf((costtext.getText()));
                    String Address = String.valueOf(addresstext.getText());
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null,
                            "Error,Please check your inputs");
                }
                if (RoomId <= 0) {
                    //while(RoomId==ListRoomId){
                    Random rand = new Random();
                    int rand_int = rand.nextInt(1000);
                    RoomId = rand_int;
                    JOptionPane.showMessageDialog(null,
                            "Random RoomId has been generated : " + RoomId,
                            "Generated RoomId",
                            JOptionPane.PLAIN_MESSAGE);
                    //an autos o arithmos den uparxei hdh kataxwrhse allios proxwra
                    //}
                }
                if (NumberOfPeople > 0 & CostPerHour > 0){
                   // Room r = new Room();
                   // r.increaseRoom();
                    // call the Room class and exec the query
                }
                else{
                    JOptionPane.showMessageDialog(null, "NumberOfPeople/CostPerHour must be positive number");
                }
            }
        });
    }


    public static void main(String[] args){
        JFrame frame = new AddRoom("AddRoomWindow");
        frame.setVisible(true);
    }
}