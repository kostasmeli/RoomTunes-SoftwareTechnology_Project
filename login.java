package admin.admingui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LoginAdmin extends JFrame {
    private JPasswordField passwordField;
    private JPanel panel1;
    private JTextField UsernameField;
    private JButton loginButton;
    private JButton registerHereButton;
    public LoginAdmin(String title) throws SQLException {
        super(title);
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/roomtunes", "root", "");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setLocationRelativeTo(null);
        this.setPreferredSize(new Dimension(400,400));
        this.pack();

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String username=String.valueOf(UsernameField.getText());
                    String password=String.valueOf(passwordField.getPassword());
                    PreparedStatement prepst = conn.prepareStatement("SELECT Username,Password FROM roomtunes.users where Password=? and Username=? and isAdmin=1 ");
                    prepst.setString(1,password);
                    prepst.setString(2,username);
                    ResultSet rs = prepst.executeQuery();
                    if (rs.next() == false) {
                        /* αν δεν βρεθέι χρήστης με αυτό το username και το password εμφανίζεται το ανάλογο μήνυμα*/
                        JOptionPane.showMessageDialog(null,"No user with these login Details");
                    } else {
                        /* επιτυχής αναγνώριση του username και του password του χρήστη και τον καλωσορίζει. */
                        JOptionPane.showMessageDialog(null,"Welcome in "+username);
                        dispose();
                        JFrame frame=new StartPanel("Admin Panel of "+username );
                        frame.setVisible(true);
                    }
                    }
                catch(Exception a){
                    JOptionPane.showMessageDialog(null,"Error,Please check your inputs "+a);
                }
            }
        });
    }
    public static void main(String[] args) throws SQLException {
        JFrame frame = new LoginAdmin("LoginWindow");
        frame.setVisible(true);
    }
}
