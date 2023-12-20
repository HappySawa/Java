package PRAC8.src;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // Создание окна
        JFrame frame = new JFrame("");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создание панели для отображения изображения
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("/Users/Saveliy/eclipse-workspace/PRAC8/background.jpg");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, this);
            }
        };

        // Установка предпочтительного размера панели
        panel.setPreferredSize(new Dimension(800, 600));

        // Добавление панели в окно
        frame.getContentPane().add(panel);

        // Отображение окна
        frame.pack();
        frame.setVisible(true);
    }
}
