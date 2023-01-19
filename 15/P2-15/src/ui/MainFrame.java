package ui;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import entity.Todo;

import javax.swing.*;
import java.sql.SQLException;
import java.util.List;

public class MainFrame extends JFrame {
    private static final String CONNECTION_URL =
            "jdbc:sqlite:todo.db";

    private ConnectionSource connectionSource;
    private Dao<Todo, Integer> todoDao;

    private void initializeData() {
        try {
            connectionSource =
                    new JdbcConnectionSource(CONNECTION_URL);

            todoDao = DaoManager.createDao(
                        connectionSource,
                        Todo.class
                    );

            TableUtils.createTableIfNotExists(
                    connectionSource, Todo.class
            );

            List<Todo> todos = todoDao.queryForAll();

            for (Todo todo: todos) {
                panelTodoList.addTodo(todo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Terjadi Kesalahan"
            );
        }
    }


    private JPanel panel;
    private JButton btnAddTodo;
    private JLabel lblTitle;
    private JScrollPane panelTodo;

    private TodoList panelTodoList;

    public MainFrame() {
        setContentPane(panel);
        setTitle("Todo App");
        setSize(300, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnAddTodo.addActionListener(e -> addTodo());

        initializeData();

        setVisible(true);
    }

    private void addTodo() {
        String todoText = JOptionPane.showInputDialog(
                this,
                "Enter Todo:"
                );

        if (todoText == null || todoText.trim().equals("")) {
            return;
        }

        Todo todo = new Todo(todoText, false);
        todo.setDao(todoDao);
        try {
//            todoDao.create(todo);
            todo.create();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Terjadi Kesalahan"
            );
        }
        panelTodoList.addTodo(todo);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        panelTodoList = new TodoList();
        panelTodo = new JScrollPane(panelTodoList);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
