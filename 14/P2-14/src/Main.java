import com.formdev.flatlaf.FlatIntelliJLaf;

public class Main {
    public static void main(String[] args) {
        FlatIntelliJLaf.setup();
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }
}