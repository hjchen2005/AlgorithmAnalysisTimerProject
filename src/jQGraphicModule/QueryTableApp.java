/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jQGraphicModule;
import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.data.*;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.xy.XYSeries;
//import java.awt.event.*;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
/**
 *
 * @author hjchen
 */
public class QueryTableApp extends javax.swing.JFrame {

    /**
     * Creates new form QueryTableApp
     */
    public QueryTableApp() {
        initComponents();
        this.setTitle("Algorithm Comparison Count Monitor");
        this.setLocationRelativeTo(null);
        //this.barras.setVisible(false);
        //this.pastel.setVisible(false);
    
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lineas = new javax.swing.JPanel();
        l = new javax.swing.JRadioButton();
        b = new javax.swing.JRadioButton();
        p = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout lineasLayout = new javax.swing.GroupLayout(lineas);
        lineas.setLayout(lineasLayout);
        lineasLayout.setHorizontalGroup(
            lineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        lineasLayout.setVerticalGroup(
            lineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );

        l.setText("Linear");
        l.setToolTipText("");
        l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lActionPerformed(evt);
            }
        });

        b.setText("Bar");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        p.setText("Pie");
        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });

        jButton1.setText("Graphicate");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "X", "Y"
            }
        ));
        jScrollPane.setViewportView(datos);

        jLabel1.setText("Hanjun Chen - Algorithm Project");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l)
                            .addComponent(b)
                            .addComponent(p)
                            .addComponent(jButton1)
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                        .addComponent(lineas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lineas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(86, 86, 86))))
        );

        pack();
    }// </editor-fold>                        

    private void lActionPerformed(java.awt.event.ActionEvent evt) {                                  
        // TODO add your handling code here:
        lineas.setVisible(true);
        capas.setLayer(lineas,0,0);
        b.setSelected(false);
        p.setSelected(false);
    }                                 

    private void bActionPerformed(java.awt.event.ActionEvent evt) {                                  
        // TODO add your handling code here:
        barras.setVisible(true);
        capas.setLayer(barras,0,0);
        b.setSelected(false);
        p.setSelected(false);
    }                                 

    private void pActionPerformed(java.awt.event.ActionEvent evt) {                                  
        // TODO add your handling code here:
        pastel.setVisible(true);
        capas.setLayer(pastel,0,0);
        b.setSelected(false);
        p.setSelected(false);
    }                                 

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        ChartPanel panel;
        JFreeChart chart = null;
        if (l.isSelected()){
            // linear chart
            int validar=1;
            XYSplineRenderer renderer = new XYSplineRenderer();
            XYSeriesCollection dataset = new XYSeriesCollection();
            
            XYSeries serie = new XYSeries("Data");
            ValueAxis x= new NumberAxis();
            ValueAxis y=new NumberAxis();
            XYPlot plot;
            lineas.removeAll();
            
            try{
                for(int f=0;f<6;f++){
                    serie.add(
                        Float.parseFloat(String.valueOf(datos.getValueAt(f,0))),
                        Float.parseFloat(String.valueOf(datos.getValueAt(f, 1)))
                    );
                }
            }catch (Exception e){
                validar=0;
                System.out.println("Cannot create data series for line graph");
            }// end catch
            if (validar==1){
                dataset.addSeries(serie);
                //x.setLabel
                plot = new XYPlot(dataset,x,y,renderer);
                chart = new JFreeChart(plot);
                chart.setTitle("Line chart");
            }
        } else  {
            if (b.isSelected()){
            // bar chart
            } else {
          // pir chart
            }
        }
    }                                        
    
    
    
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QueryTableApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QueryTableApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QueryTableApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QueryTableApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QueryTableApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JRadioButton b;
    private javax.swing.JTable datos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JRadioButton l;
    private javax.swing.JPanel lineas;
    private javax.swing.JRadioButton p;
    // End of variables declaration                   
    
    private JLayeredPane capas;
    private JLabel jLable1;
    private JPanel pastel;
    private JPanel barras;
}
