package com.edu.uptc.prgII.ActivityJSwing;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JFormattedTextField;

/**
 * @author SILVIA RODRIGUEZ, YEISON PIRACON, ERIKA CAMARGO y Diego Patiño.
 */
public class ActivityJSwing {
    private static JFrame frame = new JFrame("JSwing Example");
    private static JMenuBar menuBar = new JMenuBar();
    private static JMenu menu1 = new JMenu("popupWindows");
    private static JMenu menu2 = new JMenu("BackGround");
 


    /**
     * this method instance the frame.
     */
    public static void activateframe() {
    	frame.setPreferredSize(frame.getToolkit().getScreenSize());
    	frame.setSize(frame.getToolkit().getScreenSize());
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    /**
     * In this method we instance a new JCheckBox called check1 and demonstrated the
     * function of this class of java swing.
     */
    public static void checkBox1() {
        // In this line of code we create a JCheckBox and assign a name for this check
        // box.
        JCheckBox check1 = new JCheckBox("Activate");
        // In this line of code we assign the Default status of the check box.
        check1.setSelected(false);
        // In this line of code we assign the size of the check box.
        check1.setBounds(30, 30, 75, 30);
        // In this line of code we assign the color of the check box.
        check1.setBackground(Color.pink);
        // In this part of code we create a listener for the check box for we can see
        // the function of this.
        check1.addActionListener(e -> {
            if (check1.isSelected()) {
                System.out.println("Activate");
            } else {
                System.out.println("Unable");
            }
        });
        // In this line we add the check box to the frame.
        frame.add(check1);
    }

    /**
     * In this method we instance a new JCheckBox called check2 and demonstrated the
     * function of this class of java swing.
     */
    public static void checkBox2() {
        // In this line of code we create a JCheckBox and assign a name for this check
        // box.
        JCheckBox check2 = new JCheckBox("Activate");
        // In this line of code we assign the Default status of the check box.
        check2.setSelected(false);
        // In this line of code we assign the size of the check box.
        check2.setBounds(30, 60, 75, 30);
        // In this line of code we assign the color of the check box text.
        check2.setForeground(Color.green);
        // In this line of code we assign the color of the check box
        check2.setBackground(Color.gray);
        // In this line we add the check box to the frame.
        frame.add(check2);
    }

    /**
     * In this method we create a ButtonGrup of JRadioButtons.
     */
    public static void JbuttonGrupExample() {
        JRadioButton r1 = new JRadioButton("Opción 1 ");
        JRadioButton r2 = new JRadioButton("Opción 2 ");
        r1.setBounds(120, 30, 80, 30);
        r2.setBounds(120, 60, 80, 30);
        r1.setBackground(Color.yellow);
        r2.setBackground(Color.cyan);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        frame.add(r1);
        frame.add(r2);
    }

    /**
     * in this method we create a Jspinner, which let us to advance until the number
     * 99.
     */
    public static void JSpiner() {
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(0, 0, 99, 1);
        JSpinner spinner = new JSpinner(spinnerModel);
        JComponent editor = spinner.getEditor();
        JFormattedTextField tf = ((JSpinner.DefaultEditor) editor).getTextField();
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setColumns(2);
        spinner.setBounds(210, 30, 70, 30);
        frame.add(spinner);
    }

    /**
     * in this method we create a Jlist whit 3 or more items.
     */
    public static void ListExample() {
        String[] data = {"Item 1", "Item 2", "Item 3","Item 4"};  
        JList<String> list = new JList<>(data);
        list.setBounds(30, 120, 150, 55);
        frame.add(list);
    }

    /**
     * in this method we use the JMenuBar and the JMenu menu1 and create 2 items for
     * this menu. item 1: in this item we have to create a JDesktopPane. item 2: in
     * this item we have to create a JLayeredPane with 3 panes of different color
     * each one.
     */
    public static void popupWindows() {
       menuBar = new JMenuBar(); 
       JMenuItem menuItem1 = new JMenuItem("JDesktopPane");
        	menuItem1.addActionListener(new ActionListener() {
        		@Override
            	public void actionPerformed(ActionEvent e) {
                JDesktopPane desktopPane = new JDesktopPane();
                JInternalFrame internalFrame = new JInternalFrame("Mi JInternalFrame", true, true, true, true);
                internalFrame.setBounds(20, 200, 200, 200); // Establecemos la posición y tamaño
                internalFrame.setVisible(true);
                desktopPane.add(internalFrame);
                frame.add(internalFrame);
                JInternalFrame internalFrame1 = new JInternalFrame("Mi JInternalFrame", true, true, true, true);
                internalFrame1.setBounds(800, 50, 200, 200); // Establecemos la posición y tamaño
                internalFrame1.setVisible(true);
                frame.add(internalFrame1);
                
                JInternalFrame internalFrame2 = new JInternalFrame("Mi JInternalFrame", true, true, true, true);
                internalFrame2.setBounds(1050, 50, 200, 200); // Establecemos la posición y tamaño
                internalFrame2.setVisible(true);
                frame.add(internalFrame2);
                
                JInternalFrame internalFrame3 = new JInternalFrame("Mi JInternalFrame", true, true, true, true);
                internalFrame3.setBounds(800, 300, 200, 200); // Establecemos la posición y tamaño
                internalFrame3.setVisible(true);
                frame.add(internalFrame3);
                
                JInternalFrame internalFrame4 = new JInternalFrame("Mi JInternalFrame", true, true, true, true);
                internalFrame4.setBounds(1050, 300, 200, 200); // Establecemos la posición y tamaño
                internalFrame4.setVisible(true);
                frame.add(internalFrame4);
                frame.repaint();
                
            }
        });

        JMenuItem menuItem2 = new JMenuItem("JLayeredPane");
        menuItem2.addActionListener(new ActionListener() {
        	
            @Override
            public void actionPerformed(ActionEvent e) {
            	JLayeredPane layeredPane=new JLayeredPane();
                JPanel panel1 = new JPanel();
                panel1.setBackground(Color.RED);
                panel1.setBounds(400, 30, 200, 250);

                JPanel panel2 = new JPanel();
                panel2.setBackground(Color.GREEN);
                panel2.setBounds(430, 50, 200, 250);

                JPanel panel3 = new JPanel();
                panel3.setBackground(Color.BLUE);
                panel3.setBounds(460, 70, 200, 250);
                
                // Creamos el JLayeredPane y le asignamos la posición de cada panel
                layeredPane.setPreferredSize(new Dimension(800, 800));
                layeredPane.add(panel1, 0);
                layeredPane.add(panel2, Integer.valueOf(1));
                layeredPane.add(panel3, Integer.valueOf(2));
                // Añadimos el JLayeredPane al JFrame
                frame.add(panel1);
                frame.add(panel2);
                frame.add(panel3);
                frame.repaint();
                
                
            }
        });
        JMenuItem item3=new JMenuItem("Modo oscuro");
        item3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().setBackground(Color.black);
			}
		});
        JMenuItem item4=new JMenuItem("Modo claro");
        item4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().setBackground(Color.LIGHT_GRAY);
			}
		});
        
        menu1 = new JMenu("PopupWindows");
        
        menu2 = new JMenu("Background");
        menu1.add(menuItem1);
        menu1.add(menuItem2);
        menu2.add(item3);
        menu2.add(item4);
        menuBar.add(menu1);
        menuBar.add(menu2);
        frame.setJMenuBar(menuBar);
    }

    /**
     * in this method we use the JMenuBar and the JMenu menu2 and create 2 items for
     * this menu. item 1: in this item we can to change the color of the background
     * of our frame to the color black or one of your preference. item 2: in this
     * item we can to change the color of the background of our frame to the color
     * grey or one of your preference.
     */
    public static void setColor() {
        JMenuItem item1 = new JMenuItem("Modo oscuro");
        JMenuItem item2 = new JMenuItem("Modo claro");
        item1.addActionListener(e->{
            frame.setBackground(Color.black);
            
 
        });
        item2.addActionListener(e->{
            frame.setBackground(Color.lightGray);
           
        });
        menu2.add(item1);
        menu2.add(item2);
        menuBar.add(menu2);
        frame.setJMenuBar(menuBar);
    }

    /**
     * this method amalgam all the other methods.
     */
    public static void runner() {
        popupWindows();// vale 1.
        JSpiner();// vale 1
        JbuttonGrupExample();// vale 1
        ListExample();// vale 1
        checkBox1();// se deja de ejemplo.
        checkBox2();// se deja de ejemplo.
        activateframe();// este es el activador del frame.       
    }
   

    public static void main(String[] args) {
        runner();
    }
}
