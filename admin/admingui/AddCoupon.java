package admin.admingui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCoupon extends JFrame {
    private JPanel CouponRootPanel;
    private JTextField CouponIDText;
    private JTextField DiscountText;
    private JTextField DateEndText;
    private JTextField DateStartText;
    private JList<String> UsersList;
    private JButton ActivateButton;
    private JLabel CouponIDLabel;
    private JLabel DateStartLabel;
    private JLabel DateEndLabel;
    private JLabel DiscountLabel;

    public AddCoupon(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(CouponRootPanel);
        this.setPreferredSize(new Dimension(500,500));
        this.setLocationRelativeTo(null);
        this.pack();

        String[] Users = new String[10];
        Users[0]="Kwnstantinos Melissourgos";
        Users[1]="Fotis Tsolakidis";
        Users[2]="Stefanos Fokias";
        Users[3]="Konstantinos Ninis";
        Users[4]="Leonidas Choudhurry";
        Users[5]="Mixalis AlDente";
        Users[6]="Tasos Xatzigiovanis";
        Users[7]="Giannis Alfzos";
        Users[8]="Young Light";
        Users[9]="Madclip";

        UsersList.setListData(Users);

        ActivateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new AddCoupon("AddCouponWindow");
        frame.setVisible(true);
    }
}
