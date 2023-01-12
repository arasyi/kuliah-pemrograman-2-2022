import net.miginfocom.swing.MigLayout;

import javax.swing.*;

public class LoginForm extends JFrame {
    private JLabel lblUsername;
    private JTextField txtUsername;
    private JLabel lblPassword;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JButton btnCancel;

    public LoginForm() {
        setTitle("Login");
//        setSize(300, 150);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new MigLayout());

        lblUsername = new JLabel("Username:");
        txtUsername = new JTextField(20);
        lblPassword = new JLabel("Password:");
        txtPassword = new JPasswordField(20);
        btnLogin = new JButton("Login");
        btnCancel = new JButton("Cancel");

        add(lblUsername);
        add(txtUsername, "wrap");
        add(lblPassword);
        add(txtPassword, "wrap");
        add(btnLogin);
        add(btnCancel);

        btnLogin.addActionListener(e -> loginAction());

        btnCancel.addActionListener(e -> cancelAction());

        pack();
//        setVisible(true);
    }

    private void loginAction() {
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        JOptionPane.showMessageDialog(
                this,
                "Username: " + username + "\n" +
                        "Password: " + password
        );
    }

    private void cancelAction() {
        txtUsername.setText("");
        txtPassword.setText("");
    }
}
