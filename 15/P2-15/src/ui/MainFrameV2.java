package ui;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import entity.Todo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.List;

// Versi tanpa Swing UI Designer
public class MainFrameV2 extends JFrame {
    // Database
    private static final String CONNECTION_URL = "jdbc:sqlite:todo.db";
    private ConnectionSource connectionSource;
    private Dao<Todo, Integer> todoDao;

    // Components
    private JScrollPane scrollPane;
    private TodoList panelTodoList;
    private JButton btnAddTodo;

    public MainFrameV2() {
        setTitle("Todo List");

        setupUIComponents();
        setupListeners();
        initializeData();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void setupUIComponents() {
        setSize(300, 500);
        setLayout(new BorderLayout());

        btnAddTodo = new JButton("Add Todo");
        panelTodoList = new TodoList();
        scrollPane = new JScrollPane(panelTodoList);

        add(scrollPane, BorderLayout.CENTER);
        add(btnAddTodo, BorderLayout.SOUTH);
    }

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
                    "Error",
                    "Terjadi Kesalahan: " + e.getMessage(),
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void setupListeners() {
        btnAddTodo.addActionListener(e -> addTodo());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (connectionSource != null) {
                    try {
                        connectionSource.close();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(
                                MainFrameV2.this,
                                "Error",
                                "Terjadi Kesalahan: " + ex.getMessage(),
                                JOptionPane.ERROR_MESSAGE
                        );
                    }
                }
                super.windowClosing(e);
            }
        });
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
        panelTodoList.addTodo(todo);

        if (todoDao == null) {
            return;
        }

        try {
            todo.setDao(todoDao);
            todo.create();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error",
                    "Terjadi Kesalahan: " + e.getMessage(),
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public static void main(String[] args) {
        FlatIntelliJLaf.setup();

        new MainFrameV2();
    }
}
