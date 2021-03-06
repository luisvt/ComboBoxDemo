/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comboboxdemo.views.renderers;

import com.comboboxdemo.models.Animal;
import java.awt.Color;
import java.awt.Component;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author luis
 */
public class PetItemRenderer extends javax.swing.JPanel implements ListCellRenderer<Animal> {

    /**
     * Creates new form PetItemRenderer
     */
    public PetItemRenderer() {
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

        labelItem = new javax.swing.JLabel();

        setBackground(java.awt.Color.lightGray);
        setLayout(new java.awt.GridBagLayout());

        labelItem.setBackground(java.awt.Color.lightGray);
        labelItem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelItem.setText("jLabel2");
        labelItem.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(labelItem, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelItem;
    // End of variables declaration//GEN-END:variables

    @Override
    public Component getListCellRendererComponent(JList<? extends Animal> list, Animal value, int index, boolean isSelected, boolean cellHasFocus) {
//        String[] countryItem = (String[]) value;
 
        // set country name
        labelItem.setText(value.getName());
         
        // set country flag
        String path = "/images/" + value.getPicture() + ".gif";
        
        URL imgURL = this.getClass().getResource(path);
        ImageIcon imageIcon;
        if (imgURL != null) {
            imageIcon = new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
        
        labelItem.setIcon(imageIcon);
         
        if (isSelected) {
            labelItem.setBackground(Color.BLUE);
            labelItem.setForeground(Color.YELLOW);
        } else {
            labelItem.setForeground(Color.BLACK);
            labelItem.setBackground(Color.LIGHT_GRAY);
        }
         
        return this;
    }
}
