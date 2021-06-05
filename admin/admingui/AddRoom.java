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
                    try {
                        int tempRoomId = Integer.valueOf(roomidtext.getText());
                        int tempNumberOfPeople = Integer.valueOf((peopletext.getText()));
                        int tempCostPerHour = Integer.valueOf((costtext.getText()));
                        String tempAddress = String.valueOf(addresstext.getText());
                    } catch (Exception a) {
                        JOptionPane.showMessageDialog(null,"Error,Please check your inputs");
                        System.exit(0);
                    }

               int RoomId = Integer.valueOf(roomidtext.getText());
               int NumberOfPeople = Integer.valueOf((peopletext.getText()));
               int CostPerHour = Integer.valueOf((costtext.getText()));
               String Address = String.valueOf(addresstext.getText());
                if(RoomId <= 0) {
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
                    JOptionPane.showMessageDialog(null,"Success");
                    System.exit(0);
                }
                else{
                    JOptionPane.showMessageDialog(null, "NumberOfPeople/CostPerHour must be positive number");
                    System.exit(0);
                }
            }
        });
    }


    public static void main(String[] args){
        JFrame frame = new AddRoom("AddRoomWindow");
        frame.setVisible(true);
    }
}