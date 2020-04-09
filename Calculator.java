package com.stephen;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

public class Calculator implements ActionListener{

    static JFrame frame = new JFrame();
    static JPanel panel = new JPanel(new BorderLayout());

    private JButton button1 = new JButton("1");
    private JButton button2 = new JButton("2");
    private JButton button3 = new JButton("3");
    private JButton button4 = new JButton("4");
    private JButton button5 = new JButton("5");
    private JButton button6 = new JButton("6");
    private JButton button7 = new JButton("7");
    private JButton button8 = new JButton("8");
    private JButton button9 = new JButton("9");
    private JButton deleteButton = new JButton("DEL");
    private JButton plusButton = new JButton("+");
    private JButton minusButton = new JButton("-");
    private JButton multiplicationButton = new JButton("*");
    private JButton divisionButton = new JButton("/");


    private int firstNumber = 0;
    private int secondNumber;
    private int result = 0;
    private String operation = new String();
    private int numberOfButton;
    boolean n1 = false;
    boolean n2 = true;
    boolean op = false;

    static JLabel mathematical_operation = new JLabel("");
    static JLabel resultLabel = new JLabel("");

    public Calculator() {
        create_window();
    }

    public static void main(String[] args) {
        new Calculator();
    }

    public void create_window() {
        panel.setLayout(new GridLayout(3, 3, 10, 10));

        add_stuff();

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(700, 500);
    }

    public void add_stuff() {
        add_buttons();
    }

    public void add_buttons() {
        button1.addActionListener(this);
        button2.addActionListener(this); 
        button3.addActionListener(this);
        button4.addActionListener(this); 
        button5.addActionListener(this); 
        button6.addActionListener(this); 
        button7.addActionListener(this); 
        button8.addActionListener(this); 
        button9.addActionListener(this); 
        deleteButton.addActionListener(this); 
        minusButton.addActionListener(this); 
        plusButton.addActionListener(this); 
        divisionButton.addActionListener(this); 
        multiplicationButton.addActionListener(this); 
        panel.add(mathematical_operation);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(plusButton);
        panel.add(multiplicationButton);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(minusButton);
        panel.add(divisionButton);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(deleteButton);
        //panel.add(resultLabel);
        button1.setBackground(new Color(59, 89, 182));
        button1.setForeground(Color.WHITE);
        button1.setFocusPainted(false);
        button1.setFont(new Font("Tahoma", Font.BOLD, 12));

        button2.setBackground(new Color(59, 89, 182));
        button2.setForeground(Color.WHITE);
        button2.setFocusPainted(false);
        button2.setFont(new Font("Tahoma", Font.BOLD, 12));

        button3.setBackground(new Color(59, 89, 182));
        button3.setForeground(Color.WHITE);
        button3.setFocusPainted(false);
        button3.setFont(new Font("Tahoma", Font.BOLD, 12));

        button4.setBackground(new Color(59, 89, 182));
        button4.setForeground(Color.WHITE);
        button4.setFocusPainted(false);
        button4.setFont(new Font("Tahoma", Font.BOLD, 12));        

        button5.setBackground(new Color(59, 89, 182));
        button5.setForeground(Color.WHITE);
        button5.setFocusPainted(false);
        button5.setFont(new Font("Tahoma", Font.BOLD, 12));

        button5.setBackground(new Color(59, 89, 182));
        button5.setForeground(Color.WHITE);
        button5.setFocusPainted(false);
        button5.setFont(new Font("Tahoma", Font.BOLD, 12));

        button6.setBackground(new Color(59, 89, 182));
        button6.setForeground(Color.WHITE);
        button6.setFocusPainted(false);
        button6.setFont(new Font("Tahoma", Font.BOLD, 12));

        button7.setBackground(new Color(59, 89, 182));
        button7.setForeground(Color.WHITE);
        button7.setFocusPainted(false);
        button7.setFont(new Font("Tahoma", Font.BOLD, 12));

        button8.setBackground(new Color(59, 89, 182));
        button8.setForeground(Color.WHITE);
        button8.setFocusPainted(false);
        button8.setFont(new Font("Tahoma", Font.BOLD, 12));

        button9.setBackground(new Color(59, 89, 182));
        button9.setForeground(Color.WHITE);
        button9.setFocusPainted(false);
        button9.setFont(new Font("Tahoma", Font.BOLD, 12));

        deleteButton.setBackground(new Color(59, 89, 182));
        deleteButton.setForeground(Color.WHITE);
        deleteButton.setFocusPainted(false);
        deleteButton.setFont(new Font("Tahoma", Font.BOLD, 12));

        minusButton.setBackground(new Color(59, 89, 182));
        minusButton.setForeground(Color.WHITE);
        minusButton.setFocusPainted(false);
        minusButton.setFont(new Font("Tahoma", Font.BOLD, 12));

        plusButton.setBackground(new Color(59, 89, 182));
        plusButton.setForeground(Color.WHITE);
        plusButton.setFocusPainted(false);
        plusButton.setFont(new Font("Tahoma", Font.BOLD, 12));

        multiplicationButton.setBackground(new Color(59, 89, 182));
        multiplicationButton.setForeground(Color.WHITE);
        multiplicationButton.setFocusPainted(false);
        multiplicationButton.setFont(new Font("Tahoma", Font.BOLD, 12));

        divisionButton.setBackground(new Color(59, 89, 182));
        divisionButton.setForeground(Color.WHITE);
        divisionButton.setFocusPainted(false);
        divisionButton.setFont(new Font("Tahoma", Font.BOLD, 12));

        mathematical_operation.setFont(new Font("Tahoma", Font.BOLD, 12));
    }

	@Override
	public void actionPerformed(ActionEvent e) {
        mathematical_operation.setText("");
        JButton b = (JButton)e.getSource();
        if(b == button1) {
            numberOfButton = 1;
        } else {
            if(b == button2) {
                numberOfButton = 2;
            } else {
                if(b == button3) {
                    numberOfButton = 3;
                } else {
                    if(b == button4) {
                        numberOfButton = 4;
                    } else {
                        if(b == button5) {
                            numberOfButton = 5;
                        } else {
                            if(b == button6) {
                                numberOfButton = 6;
                            } else {
                                if(b == button7) {
                                    numberOfButton = 7;
                                } else {
                                    if(b == button8) {
                                        numberOfButton = 8;
                                    } else {
                                        if(b == button9) {
                                            numberOfButton = 9;
                                        } else {
                                            if(b == plusButton) {
                                                operation = " + ";
                                                numberOfButton = 10;
                                            } else {
                                                if(b == minusButton) {
                                                    operation = " - ";
                                                    numberOfButton = 10;
                                                } else {
                                                    if(b == multiplicationButton) {
                                                        operation = " * ";
                                                        numberOfButton = 10;
                                                    } else {
                                                        if(b == divisionButton) {
                                                            operation = " / ";
                                                            numberOfButton = 10;
                                                        } else {
                                                            if(b == deleteButton) {
                                                                operation = "delete";
                                                                numberOfButton = 10;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
		if(op == false && numberOfButton <= 9) {
            firstNumber =firstNumber * 10 + (Integer)numberOfButton;
        } else {
            if(op == true && numberOfButton <= 9)
            secondNumber = secondNumber * 10 + (Integer)numberOfButton;
        }
        
        if(firstNumber != 0 && !operation.isBlank()) {
            op = true;
            if(operation == " + ") {
                result = firstNumber + secondNumber;
            } else {
                if(operation == " - ") {
                    result = firstNumber - secondNumber;
                } else {
                    if(operation == " / ") {
                        result = firstNumber / secondNumber;
                    } else {
                        if(operation == " * ") {
                            result = firstNumber * secondNumber;
                        } else {
                            if(operation == "delete") {
                                result = 0;
                                firstNumber = 0;
                                secondNumber = 0;
                                frame.setVisible(false);
                            }
                        }
                    }
                }
            }
        }
        mathematical_operation.setText(firstNumber + operation + secondNumber + " = " + result);
	}
}
