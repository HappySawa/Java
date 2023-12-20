package PRAC8.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyApp extends JFrame {
    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 600;
    private static final int DELAY = 100;
    private static final String[] IMAGE_PATHS = {
    		//// Пути к изображениям
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame1.jpg",
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame2.jpg",
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame3.jpg",
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame4.jpg",
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame5.jpg",
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame6.jpg",
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame7.jpg",
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame8.jpg",
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame9.jpg",
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame10.jpg",
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame12.jpg",
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame13.jpg",
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame14.jpg",
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame15.jpg",
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame16.jpg",
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame17.jpg",
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame18.jpg",
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame19.jpg",
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame20.jpg",
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame21.jpg",
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame22.jpg",
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame23.jpg",
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame24.jpg",
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame25.jpg",
            "/Users/Saveliy/eclipse-workspace/PRAC8/animation/frame26.jpg",
            
            
            
    };
 // Индекс текущего кадра
    private int currentFrameIndex = 0;
    
 // Метка для отображения изображения
    private JLabel imageLabel;
    
 // рандом фигуры панель
    private RandomShapes randomShapes;
    
    //тайми
    private Timer timer;

    public MyApp() {
        setTitle("Random Shapes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        
     // создаем панель с ранд фигурами
        randomShapes = new RandomShapes();
        add(randomShapes, BorderLayout.CENTER);

     // содаем и добавляем панели для анимации
        AnimationDisplay animationDisplay = new AnimationDisplay();
        add(animationDisplay.createAndShowGUI(), BorderLayout.NORTH);

        //кнопка
        JButton startAnimationButton = new JButton("Start Animation");
        startAnimationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                animationDisplay.startAnimation();
            }
        });
        add(startAnimationButton, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MyApp();
            }
        });
    }

    class AnimationDisplay {
    	// Метод для создания и настройки гуи
        private JPanel animationPanel;
        
        

        public JComponent createAndShowGUI() {
            animationPanel = new JPanel();
            animationPanel.setBackground(Color.WHITE);
            imageLabel = new JLabel();
            animationPanel.add(imageLabel);
            return animationPanel;
        }

        public void startAnimation() {
            timer = new Timer(DELAY, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                	
                	// Загрузка текущего кадра
                    ImageIcon imageIcon = new ImageIcon(IMAGE_PATHS[currentFrameIndex]);
                    Image image = imageIcon.getImage();

                    int labelWidth = animationPanel.getWidth();
                    int labelHeight = animationPanel.getHeight();

                    
                 // Проверка что размеры imageLabel больше 0
                    if (labelWidth > 0 && labelHeight > 0) {
                    	
                    	// масштабирование изображения для отображения на всю область метки
                        Image scaledImage = image.getScaledInstance(labelWidth, labelHeight, Image.SCALE_DEFAULT);
                        imageLabel.setIcon(new ImageIcon(scaledImage));
                        imageLabel.repaint();
                    }
                 // увеличение индекса текущего кадра
                    currentFrameIndex = (currentFrameIndex + 1) % IMAGE_PATHS.length;
                }
            });

            timer.start();
        }
    }

    class RandomShapes extends JPanel {
        private static final int NUM_SHAPES = 20;
        private Shape[] shapes;

        public RandomShapes() {
            setBackground(Color.WHITE);
            setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));

            shapes = new Shape[NUM_SHAPES];
            Random random = new Random();

            for (int i = 0; i < NUM_SHAPES; i++) {
                int x = random.nextInt(FRAME_WIDTH);
                int y = random.nextInt(FRAME_HEIGHT);
                int size = random.nextInt(50) + 50;
                Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

                if (random.nextBoolean()) {
                    shapes[i] = new Rectangle(color, x, y, size, size);
                } else {
                    shapes[i] = new Circle(color, x, y, size / 2);
                }
            }
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (Shape shape : shapes) {
                shape.draw(g);
            }
        }
    }

 // абстрактный класс для фигур
    abstract class Shape {
        protected Color color;
        protected int x, y;

        public Shape(Color color, int x, int y) {
            this.color = color;
            this.x = x;
            this.y = y;
        }

        public abstract void draw(Graphics g);
    }

    class Rectangle extends Shape {
        private int width, height;

        public Rectangle(Color color, int x, int y, int width, int height) {
            super(color, x, y);
            this.width = width;
            this.height = height;
        }

        public void draw(Graphics g) {
            g.setColor(color);
            g.fillRect(x, y, width, height);
        }
    }

    class Circle extends Shape {
        private int radius;

        public Circle(Color color, int x, int y, int radius) {
            super(color, x, y);
            this.radius = radius;
        }

        public void draw(Graphics g) {
            g.setColor(color);
            g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
        }
    }
}
