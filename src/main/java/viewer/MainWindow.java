package viewer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
	private boolean anchor = false;
	public boolean isAnchor() {
		return anchor;
	}



	private  JButton  btnOpenFile;
	private  JButton  btnSaveFile;

	private JPanel contents;

	private Font font;

	private JFileChooser fileChooser;

	private String inputPath;
	private String outputFile;

	public String getInputPath() {
		return inputPath;
	}

	public String getOutputFile() {
		return outputFile;
	}

	public MainWindow () {
		//параметры окна
		super("Название программы");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,200);
		font = new Font("Ubuntu", Font.BOLD,14);

		//кнопка создания диалогового окна открытия файла
		btnOpenFile = new JButton("Открыть lrc-файл");
		btnOpenFile.setFont(font);

		//кнопка создания диалогового окна сохранения файла
		btnSaveFile = new JButton("Сохранить, как ...");
		btnSaveFile.setFont(font);

		//Создание экземпляра JFileChooser
		fileChooser = new JFileChooser();

		// Подключение слушателей к кнопкам
		addFileChooserListeners();

		//Размещение кнопок в интерфейсе
		contents = new JPanel();
		contents.add(btnOpenFile);
		contents.add(btnSaveFile);
		setContentPane(contents);

		setVisible(true);
	}

	private void addFileChooserListeners() {
		btnOpenFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				fileChooser.setDialogTitle("Выбор lrc-файла");
				fileChooser.setFont(font);

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
				fileChooser.setFont(font);
				fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				int result = fileChooser.showSaveDialog(MainWindow.this);
				outputFile = fileChooser.getSelectedFile().toString();
				if (result == JFileChooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(MainWindow.this,
							"Новый файл будет сохранён здесь:\n" + fileChooser.getSelectedFile(),
							"Место сохранения", 1);
					anchor = true;

				}

			}
		});

	}
}
