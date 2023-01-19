package ui;

import entity.Todo;

import javax.swing.*;

public class TodoList extends JPanel {

    public TodoList() {
        setLayout(
                new BoxLayout(
                        this,
                        BoxLayout.Y_AXIS
                )
        );
        setAlignmentX(LEFT_ALIGNMENT);
        setAlignmentY(TOP_ALIGNMENT);
    }

    public void addTodo(Todo todo) {
        TodoRow todoRow = new TodoRow(todo);
        add(todoRow);
        repaint();
        revalidate();
    }
}
