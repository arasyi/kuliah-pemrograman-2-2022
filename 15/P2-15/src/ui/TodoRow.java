package ui;

import entity.Todo;

import javax.swing.*;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.sql.SQLException;
import java.util.Map;

public class TodoRow extends JCheckBox {
    private Todo todo;

    public TodoRow(Todo todo) {
        this.todo = todo;

        setText(todo.getTodo());
        setSelected(todo.isComplete());
        updateInterface();

        addItemListener(e -> updateState());
    }

    private void updateState() {
        todo.setComplete(isSelected());
        try {
            todo.update();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error",
                    "Terjadi Kesalahan: " + e.getMessage(),
                    JOptionPane.ERROR_MESSAGE
            );
        }
        updateInterface();
    }

    private void updateInterface() {
        Map fontAttributes = getFont().getAttributes();
        fontAttributes.put(TextAttribute.STRIKETHROUGH, isSelected());
        setFont(new Font(fontAttributes));
    }
}
