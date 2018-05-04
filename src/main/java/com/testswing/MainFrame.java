package com.testswing;

import javax.swing.*;

public class MainFrame extends JFrame {

    private String[] args;

    public MainFrame(String title) {
        super();
        setTitle(title);
        setSize(640,480);
    }

    public void setArgs(String[] args) {
        try {
            Thread.sleep(2000);
        } catch (Exception exc) {
            exc.printStackTrace();
        }

        this.args = args;
    }

    public void init() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}