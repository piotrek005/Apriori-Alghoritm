/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apriorialgorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.SwingWorker;

/**
 *
 * @author Piotrek
 */
public class MainFrame extends javax.swing.JFrame {
    private File file;
    
    private class MyWorker extends SwingWorker<Object, String> {

        @Override
        protected Object doInBackground() throws Exception {
            AprioriAlgorithm aa = new AprioriAlgorithm(file, 
                                                    Double.parseDouble(MainFrame.this.supportTextField.getText()),
                                                    Double.parseDouble(MainFrame.this.confidenceTextField.getText()));
            aa.compute();
            
            BufferedReader br = new BufferedReader(new FileReader(AprioriAlgorithm.OUTPUT));
            String line;
            while((line = br.readLine()) != null) {
                MainFrame.this.ruleTextBox.append(line + "\r\n");
            }
            
            return null;
        }
    }
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        csvFileChooser = new javax.swing.JFileChooser();
        mainSplitPane = new javax.swing.JSplitPane();
        buttonPanel = new javax.swing.JPanel();
        chooseFileLabel = new javax.swing.JLabel();
        chooseFileButton = new javax.swing.JButton();
        supportLabel = new javax.swing.JLabel();
        supportTextField = new javax.swing.JTextField();
        confidenceLabel = new javax.swing.JLabel();
        confidenceTextField = new javax.swing.JTextField();
        computeButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        textAreaPanel = new javax.swing.JPanel();
        textBoxScrollPane = new javax.swing.JScrollPane();
        ruleTextBox = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 500));

        buttonPanel.setLayout(new java.awt.GridBagLayout());

        chooseFileLabel.setText("Plik do obrobki");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.3;
        buttonPanel.add(chooseFileLabel, gridBagConstraints);

        chooseFileButton.setText("Wybierz plik");
        chooseFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFileButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.2;
        buttonPanel.add(chooseFileButton, gridBagConstraints);

        supportLabel.setText("Wsparcie");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.2;
        buttonPanel.add(supportLabel, gridBagConstraints);

        supportTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.2;
        buttonPanel.add(supportTextField, gridBagConstraints);

        confidenceLabel.setText("Wiarygodnosc");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.2;
        buttonPanel.add(confidenceLabel, gridBagConstraints);

        confidenceTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.2;
        buttonPanel.add(confidenceTextField, gridBagConstraints);

        computeButton.setText("Wylicz");
        computeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.2;
        buttonPanel.add(computeButton, gridBagConstraints);

        closeButton.setText("Zamknij");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.2;
        buttonPanel.add(closeButton, gridBagConstraints);

        mainSplitPane.setLeftComponent(buttonPanel);

        textAreaPanel.setLayout(new java.awt.BorderLayout());

        textBoxScrollPane.setEnabled(false);

        ruleTextBox.setColumns(20);
        ruleTextBox.setRows(5);
        textBoxScrollPane.setViewportView(ruleTextBox);

        textAreaPanel.add(textBoxScrollPane, java.awt.BorderLayout.CENTER);

        mainSplitPane.setRightComponent(textAreaPanel);

        getContentPane().add(mainSplitPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFileButtonActionPerformed
        int result = this.csvFileChooser.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION) {
            this.file = this.csvFileChooser.getSelectedFile();
        }
    }//GEN-LAST:event_chooseFileButtonActionPerformed

    private void computeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeButtonActionPerformed
        MyWorker mw = new MyWorker();
        mw.execute();
    }//GEN-LAST:event_computeButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton chooseFileButton;
    private javax.swing.JLabel chooseFileLabel;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton computeButton;
    private javax.swing.JLabel confidenceLabel;
    private javax.swing.JTextField confidenceTextField;
    private javax.swing.JFileChooser csvFileChooser;
    private javax.swing.JSplitPane mainSplitPane;
    private javax.swing.JTextArea ruleTextBox;
    private javax.swing.JLabel supportLabel;
    private javax.swing.JTextField supportTextField;
    private javax.swing.JPanel textAreaPanel;
    private javax.swing.JScrollPane textBoxScrollPane;
    // End of variables declaration//GEN-END:variables
}