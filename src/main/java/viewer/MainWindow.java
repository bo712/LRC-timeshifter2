package viewer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

	private boolean anch = false;

	public boolean isAnch() {
		return anch;
	}

	private  JButton  btnOpenFile;

	private  JButton  btnSaveFile;

	private JPanel contents;

	private Font defaultFont;

	private JFileChooser fileChooser;

	private String inputPath;

	private String outputFile;

	private JLabel label;

	private JTextField textField;

	public String getInputPath() {
		return inputPath;
	}

	public String getOutputFile() {
		return outputFile;
	}

	public MainWindow () {
		//задаём параметры окна
		super("LRC-timeshifter");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(250,120);
		defaultFont = new Font("Ubuntu", Font.BOLD,14);

		//кнопка создания диалогового окна открытия файла
		btnOpenFile = new JButton("Открыть lrc-файл");
		btnOpenFile.setFont(defaultFont);

		//кнопка создания диалогового окна сохранения файла
		btnSaveFile = new JButton("Сохранить, как ...");
		btnSaveFile.setFont(defaultFont);

		//Создание экземпляра JFileChooser
		fileChooser = new JFileChooser();

		// Подключение слушателей к кнопкам
		addFileChooserListeners();

		//Подпись текстового поля
		label = new JLabel("Введите смещение!: ");
		label.setFont(defaultFont);

		//Текстовое поле для ввода смещения
		textField = new JTextField("+00:00.00");
		textField.setFont(defaultFont);

		//Размещение кнопок в интерфейсе
		contents = new JPanel();
		contents.add(label);
		contents.add(textField);
		getContentPane().add(BorderLayout.NORTH, btnOpenFile);
		getContentPane().add(BorderLayout.CENTER, contents);
		getContentPane().add(BorderLayout.SOUTH, btnSaveFile);

		setVisible(true);
	}

	private void addFileChooserListeners() {
		btnOpenFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				fileChooser.setDialogTitle("Выбор lrc-файла");
				fileChooser.setFont(defaultFont);

				int result = fileChooser.showOpenDialog(MainWindow.this);
				inputPath = fileChooser.getSelectedFile().toString();
				if (result == JFileChooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(MainWindow.this, fileChooser.getSelectedFile(), "Выбран файл:", 1);
				}


			}
		});

		btnSaveFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				fileChooser.setDialogTitle("Сохранение файла");
				fileChooser.setFont(defaultFont);
				fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				int result = fileChooser.showSaveDialog(MainWindow.this);
				outputFile = fileChooser.getSelectedFile().toString();
				if (result == JFileChooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(MainWindow.this,
							"Новый файл будет сохранён здесь:\n" + fileChooser.getSelectedFile(),
							"Место сохранения", 1);
					anch = true;

				}

			}
		});

	}
}
