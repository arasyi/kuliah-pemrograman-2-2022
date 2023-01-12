import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class HelloGui {
    public static void main(String[] args) throws Exception {
//        javax.swing.plaf.metal.MetalLookAndFeel
//        javax.swing.plaf.nimbus.NimbusLookAndFeel
//        com.sun.java.swing.plaf.motif.MotifLookAndFeel
//        com.sun.java.swing.plaf.windows.WindowsLookAndFeel
//        com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel

//        UIManager.setLookAndFeel(
////                new FlatDarkLaf()
////                new FlatLightLaf()
//                new FlatMacLightLaf()
////                new FlatIntelliJLaf()
////                UIManager.getSystemLookAndFeelClassName()
////                "javax.swing.plaf.nimbus.NimbusLookAndFeel"
//        );

//        FlatLightLaf.setup();
        FlatIntelliJLaf.setup();
//        FlatMacDarkLaf.setup();



        JFrame frame1 = new JFrame("Login");
        frame1.setSize(300, 150);
        frame1.setResizable(false);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLocationRelativeTo(null);
        frame1.setLayout(new MigLayout());

        JLabel lblUsername = new JLabel("Username:");
        JTextField txtUsername = new JTextField(20);
        JLabel lblPassword = new JLabel("Password:");
        JPasswordField txtPassword = new JPasswordField(20);
        JButton btnLogin = new JButton("Login");
        JButton btnCancel = new JButton("Cancel");

        btnLogin.addActionListener(e -> {
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            JOptionPane.showMessageDialog(
                    frame1,
                    "Username: " + username + "\n" +
                            "Password: " + password
            );
        });

        btnCancel.addActionListener(e ->  {
            txtUsername.setText("");
            txtPassword.setText("");
        });

        frame1.add(lblUsername);
        frame1.add(txtUsername, "wrap");
        frame1.add(lblPassword);
        frame1.add(txtPassword, "wrap");
        frame1.add(btnLogin);
        frame1.add(btnCancel);

        frame1.setVisible(true);
    }
}
