package admin.admingui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
        //We could call the User Class and Retrieve the Users and parse them to the List
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
                try{
                  String  DateStart=String.valueOf(DateStartText.getText());
                  String  DateEnd=String.valueOf(DateEndText.getText());
                  int Discount=Integer.valueOf(DiscountText.getText());
                  String CouponID=String.valueOf(CouponIDText.getText());

                    SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/MM/yyyy");
                    sdfrmt.setLenient(false);
                    try{
                        Date FdateStart = sdfrmt.parse(DateStart);
                        Date FdateEnd = sdfrmt.parse(DateEnd);
                        if (FdateStart.equals(FdateEnd)||FdateStart.after(FdateEnd)){
                            JOptionPane.showMessageDialog(null,"DateStart must be before DateEnd");
                        }
                        else if (Discount >=100||Discount<=0){
                            JOptionPane.showMessageDialog(null,"Discount must be in range of 1-100");
                        }
                        else{
                            //Parse the data to Coupon Class
                            //Activate Coupon to Users who are selected
                            List SelectedUsers=UsersList.getSelectedValuesList();
                            JOptionPane.showMessageDialog(null,"Coupon Activated For " +SelectedUsers);
                        }
                    }
                    catch (ParseException b){
                        JOptionPane.showMessageDialog(null,"Error Date is Invalid");
                    }
                }
                catch(Exception a){
                    JOptionPane.showMessageDialog(null, "Wrong Input, Try Again");
                }

            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new AddCoupon("AddCouponWindow");
        frame.setVisible(true);
    }
}
