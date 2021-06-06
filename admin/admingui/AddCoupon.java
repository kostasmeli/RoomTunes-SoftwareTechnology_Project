package admin.admingui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class AddCoupon extends JFrame {
    private JPanel CouponRootPanel;
    private JTextField CouponCodeText;
    private JTextField DiscountText;
    private JTextField DateEndText;
    private JTextField DateStartText;
    private JList<String> UsersList;
    private JButton ActivateButton;
    private JLabel CouponCodeLabel;
    private JLabel DateStartLabel;
    private JLabel DateEndLabel;
    private JLabel DiscountLabel;

    public AddCoupon(String title) throws SQLException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(CouponRootPanel);
        this.setPreferredSize(new Dimension(500,500));
        this.setLocationRelativeTo(null);
        this.pack();

        List<String> Users = new ArrayList<String>();
        Vector<String> UsersAppend = new Vector<String>();

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/roomtunes", "root", "");
        String UsersQuery = "Select FullName From Users;";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(UsersQuery);
        //we fetch Strings and add them to String List,but GUI list only takes String Array or Vector List
        //So... we convert the String List into Vector List
        while(rs.next()){
            String FullName = rs.getString("FullName");
            Users.add(FullName);
        }
        st.close();
        int n = Users.size();
        for(int i = 0; i < n; i++){
            UsersAppend.add(Users.get(i));
        }

        UsersList.setListData(UsersAppend);

        ActivateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                  String  DateStart=String.valueOf(DateStartText.getText());
                  String  DateEnd=String.valueOf(DateEndText.getText());
                  int Discount=Integer.valueOf(DiscountText.getText());
                  String CouponCode=String.valueOf(CouponCodeText.getText());

                    SimpleDateFormat sdfrmt = new SimpleDateFormat("yyyy-MM-dd");
                    sdfrmt.setLenient(false);
                    try{
                        Date FdateStart = sdfrmt.parse(DateStart);
                        Date FdateEnd = sdfrmt.parse(DateEnd);
                        if (FdateStart.equals(FdateEnd)||FdateStart.after(FdateEnd)){
                            JOptionPane.showMessageDialog(null,"DateStart must be before DateEnd");
                        }
                        else if (Discount >=100||Discount<=0){
                            JOptionPane.showMessageDialog(null,"Discount must be in range of 1-99");
                        }
                        else{
                            //List users to String
                            List SelectedUsers=UsersList.getSelectedValuesList();
                            int size=SelectedUsers.size();
                            List<Integer> Identifiers= new ArrayList<Integer>();
                            PreparedStatement prepst = conn.prepareStatement("SELECT UserID From Users WHERE FullName = ?");
                            for(int i=0; i<size; i++){
                                String TempFullName = String.valueOf(SelectedUsers.get(i));
                                prepst.setString(1,TempFullName);
                                ResultSet rs = prepst.executeQuery();
                                while(rs.next()) {
                                    Identifiers.add(rs.getInt(i+1));
                                }
                            }
                            //"INSERT INTO `ad`.`ad` (`imgURL`, `linkURL`, `client`, `idx`) VALUES (?, ?, ?, ?)";
                            prepst.close();
                            PreparedStatement prepst2 =conn.prepareStatement("INSERT INTO Coupon(DateStart,DateEnd,Discount,CouponUsers,CouponCode) VALUES(?,?,?,?,?)");
                            int sizeID=Identifiers.size();
                            for(int i=0; i<sizeID; i++){
                                prepst2.setDate(1,java.sql.Date.valueOf(DateStart));
                                prepst2.setDate(2,java.sql.Date.valueOf(DateEnd));
                                prepst2.setInt(3,Discount);
                                prepst2.setInt(4,Identifiers.get(i));
                                prepst2.setString(5,CouponCode);
                                prepst2.executeUpdate();
                            }
                            JOptionPane.showMessageDialog(null,"Coupon Activated For " +SelectedUsers);
                        }
                    }
                    catch (ParseException b){
                        JOptionPane.showMessageDialog(null,"Error Date is Invalid ");
                    }
                }
                catch(Exception a){
                    JOptionPane.showMessageDialog(null, "Wrong Input, Try Again"+a);
                }

            }
        });
    }

    public static void main(String[] args) throws SQLException {
        JFrame frame = new AddCoupon("AddCouponWindow");
        frame.setVisible(true);
    }
}
