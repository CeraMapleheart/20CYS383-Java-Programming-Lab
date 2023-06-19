import javax.swing.*;
import java.awt.*;

public class FileManagementSystemUI {
    public FileManagementSystemUI() {
        JFrame frame = new JFrame("21UCYS End Semester Assignment File Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel headingLabel = new JLabel("21UCYS End Semester Assignment File Manager");
        frame.add(headingLabel);

        // File details input components
        JLabel nameLabel = new JLabel("File Name:");
        JTextField nameField = new JTextField(20);
        JLabel sizeLabel = new JLabel("File Size:");
        JTextField sizeField = new JTextField(10);
        JLabel typeLabel = new JLabel("File Type:");
        String[] fileTypes = {"Document", "Image", "Video"};
        JLabel resolutionLabel = new JLabel("Resolution:");
        JTextField resolutionField = new JTextField(10);
        JLabel durationLabel = new JLabel("Duration:");
        JTextField durationField = new JTextField(10);
        JLabel documentTypeLabel = new JLabel("Document Type:");
        JTextField documentTypeField = new JTextField(10);
        JButton addButton = new JButton("Add File");
        JButton deleteButton = new JButton("Delete File");
        JButton refreshButton = new JButton("Refresh");

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(sizeLabel);
        frame.add(sizeField);
        frame.add(typeLabel);
        resolutionLabel.setVisible(false);
        resolutionField.setVisible(false);
        frame.add(resolutionLabel);
        frame.add(resolutionField);
        durationLabel.setVisible(false);
        durationField.setVisible(false);
        frame.add(durationLabel);
        frame.add(durationField);
        documentTypeLabel.setVisible(false);
        documentTypeField.setVisible(false);
        frame.add(documentTypeLabel);
        frame.add(documentTypeField);
        frame.add(addButton);
        frame.add(deleteButton);
        frame.add(refreshButton);

        String[] columnNames = {"File Name", "File Size", "File Type"};
        String[][] rowData = {{"Example.docx", "25 KB", "Document"}};
        JTable table = new JTable(rowData, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);


        frame.pack();
        frame.setVisible(true);
    }
}
