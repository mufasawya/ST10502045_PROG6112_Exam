/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.guiapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class GUIApplication extends JFrame {

        private JTextField customerName;
        private JTextField price;
        private JComboBox<String> cboMattress;
        private JButton process;

        public GUIApplication() {

            setTitle("Product App");
            setSize(500, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new GridLayout(4, 2, 5, 5));

            customerName = new JTextField();

            cboMattress = new JComboBox<String>();
            cboMattress.addItem("Cozy Nights Monarch");
            cboMattress.addItem("Restonic Barbados");
            cboMattress.addItem("Sealy Phuket");

            price = new JTextField();

            process = new JButton("Process");

            add(new JLabel("Customer Name:"));
            add(customerName);

            add(new JLabel("Product:"));
            add(cboMattress);

            add(new JLabel("Product Price:"));
            add(price);

            add(new JLabel(""));
            add(process);

            process.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String txtCustomerName = customerName.getText();
                    String product = cboMattress.getSelectedItem().toString();
                    double txtPrice = Double.parseDouble(price.getText());

                    double vat = txtPrice * 0.15;
                    double commission = txtPrice * 0.05;
                    double total = txtPrice + vat + commission;

                    JOptionPane.showMessageDialog(null,
                            "Customer Name: " + txtCustomerName
                            + "\nProduct: " + product
                            + "\nVAT: R " + vat
                            + "\nCOMMISSION: R " + commission
                            + "\nTOTAL: R " + total);

                    try {

                        PrintWriter output = new PrintWriter(
                                new FileWriter("data.txt", true));

                        output.println("DATA LOG");
                        output.println("************************");
                        output.println("Customer Name: " + txtCustomerName);
                        output.println("Product: " + product);
                        output.println("VAT: R " + vat);
                        output.println("COMMISSION: R " + commission);
                        output.println("TOTAL: R " + total);
                        output.println("************************");

                        output.close();

                    } catch (IOException ex) {

                        JOptionPane.showMessageDialog(null,
                                "Error saving file!");

                    }

                }

            });
            
            setVisible(true);

        }

        public static void main(String[] args) {
            new GUIApplication();
        }

    }
