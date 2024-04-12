import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ajay{
    public static void main(String[] args) {
        TodoListFrame frame = new TodoListFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

class TodoListFrame extends JFrame implements ActionListener {
    private DefaultListModel<String> listModel;
    private JList<String> todoList;
    private JTextField taskField;
    private JButton addButton;
    private JButton removeButton;

    public TodoListFrame() {
        setTitle("To-Do List");

        listModel = new DefaultListModel<>();
        todoList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(todoList);

        taskField = new JTextField(15);
        addButton = new JButton("Add Task");
        removeButton = new JButton("Remove Task");

        addButton.addActionListener(this);
        removeButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(taskField);
        panel.add(addButton);
        panel.add(removeButton);

        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String task = taskField.getText();
            if (!task.isEmpty()) {
                listModel.addElement(task);
                taskField.setText("");
            }
        } else if (e.getSource() == removeButton) {
            int selectedIndex = todoList.getSelectedIndex();
            if (selectedIndex != -1) {
                listModel.remove(selectedIndex);
            }
        }
    }
}