package com.aps.sortingalgorithms;

import com.aps.utils.observables.Observable;
import com.aps.sortingalgorithms.sorting.algorithms.BubbleSort;
import com.aps.sortingalgorithms.sorting.algorithms.HeapSort;
import com.aps.sortingalgorithms.sorting.algorithms.ISortableAlgorithm;
import com.aps.sortingalgorithms.sorting.algorithms.InsertionSort;
import com.aps.sortingalgorithms.sorting.algorithms.MergeSort;
import com.aps.sortingalgorithms.sorting.algorithms.QuickSort;
import com.aps.sortingalgorithms.sorting.algorithms.RadixSort;
import com.aps.sortingalgorithms.utils.benchmark.Benchmark;
import java.awt.Color;

public class App extends javax.swing.JFrame {
    public App() {
        this.initComponents();
        this.setupDataLayer();
    }
    
    private void setupDataLayer() {
        this.dataLayer.bubbleSortResult.subscribeToAfterChange(DataLayer.makeListener(bubbleSortTextField));
        this.dataLayer.radixSortResult.subscribeToAfterChange(DataLayer.makeListener(radixSortTextField));
        this.dataLayer.quickSortResult.subscribeToAfterChange(DataLayer.makeListener(quickSortTextField));
        this.dataLayer.insertionSortResult.subscribeToAfterChange(DataLayer.makeListener(insertionSortTextField));
        this.dataLayer.heapSortResult.subscribeToAfterChange(DataLayer.makeListener(heapSortTextField));
        this.dataLayer.mergeSortResult.subscribeToAfterChange(DataLayer.makeListener(mergeSortTextField));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        listSizeComboBox = new javax.swing.JComboBox<>();
        listSizeLabel = new javax.swing.JLabel();
        bubbleSortLabel = new javax.swing.JLabel();
        executeButton = new javax.swing.JButton();
        timesLabel = new javax.swing.JLabel();
        radixSortLabel = new javax.swing.JLabel();
        quickSortLabel = new javax.swing.JLabel();
        radixSortTextField = new javax.swing.JTextField();
        bubbleSortTextField = new javax.swing.JTextField();
        quickSortTextField = new javax.swing.JTextField();
        mergeSortLabel = new javax.swing.JLabel();
        insertionSortTextField = new javax.swing.JTextField();
        heapSortTextField = new javax.swing.JTextField();
        heapSortLabel = new javax.swing.JLabel();
        mergeSortTextField = new javax.swing.JTextField();
        insertionSortLabel = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        executionStatusLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Algoritmos de ordenação");
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        titleLabel.setText("Algoritmos de ordenação");

        listSizeComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listSizeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "100", "1000", "10000", "100000", "1000000" }));
        listSizeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleListSizeChange(evt);
            }
        });

        listSizeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listSizeLabel.setText("Tamanho da lista");

        bubbleSortLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bubbleSortLabel.setText("Bubble sort");

        executeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        executeButton.setText("Clique para executar");
        executeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handleMouseClick(evt);
            }
        });

        timesLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        timesLabel.setText("Tempos");

        radixSortLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radixSortLabel.setText("Radix sort");

        quickSortLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        quickSortLabel.setText("Quick sort");

        radixSortTextField.setEditable(false);
        radixSortTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        bubbleSortTextField.setEditable(false);
        bubbleSortTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        quickSortTextField.setEditable(false);
        quickSortTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        mergeSortLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mergeSortLabel.setText("Merge sort");

        insertionSortTextField.setEditable(false);
        insertionSortTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        heapSortTextField.setEditable(false);
        heapSortTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        heapSortLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        heapSortLabel.setText("Heap sort");

        mergeSortTextField.setEditable(false);
        mergeSortTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        insertionSortLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        insertionSortLabel.setText("Insertion sort");

        executionStatusLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        executionStatusLabel.setText("Status de execução: Não iniciado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(executionStatusLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(heapSortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(heapSortLabel))
                            .addGap(87, 87, 87)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(insertionSortLabel)
                                .addComponent(insertionSortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timesLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(listSizeLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(listSizeComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(executeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bubbleSortTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bubbleSortLabel))
                                    .addGap(87, 87, 87)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(radixSortLabel)
                                        .addComponent(radixSortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(quickSortLabel)
                                        .addComponent(quickSortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mergeSortLabel)
                                        .addComponent(mergeSortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(titleLabel)
                .addGap(40, 40, 40)
                .addComponent(listSizeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listSizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(executeButton)
                .addGap(25, 25, 25)
                .addComponent(executionStatusLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(timesLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bubbleSortLabel)
                    .addComponent(radixSortLabel)
                    .addComponent(quickSortLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radixSortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bubbleSortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quickSortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heapSortLabel)
                    .addComponent(insertionSortLabel)
                    .addComponent(mergeSortLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertionSortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heapSortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mergeSortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void handleListSizeChange(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handleListSizeChange
        int listSize = Integer.parseInt(listSizeComboBox.getSelectedItem().toString());
        this.dataLayer.listSize.setState(listSize);
    }//GEN-LAST:event_handleListSizeChange

    private void setCurrentTaskPercentage(int currentTask) {
        if(currentTask == 6) {
            this.progressBar.setValue(100);
            return;
        }
        
        this.progressBar.setValue((int) (100 / 6) * currentTask);
    }
    
    private void clearResultTextFields() {
        this.bubbleSortTextField.setText("");
        this.radixSortTextField.setText("");
        this.mergeSortTextField.setText("");
        this.insertionSortTextField.setText("");
        this.heapSortTextField.setText("");
        this.quickSortTextField.setText("");
    }
    
    private void handleMouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_handleMouseClick
        this.clearResultTextFields();
        
        // Start a new thread so it doesn't block the main event loop
        Thread thread = new Thread(() -> {
            Integer[] list = Benchmark.makeList(this.dataLayer.listSize.getState());
            this.executionStatusLabel.setText("Status de execução: Executando");
            this.setCurrentTaskPercentage(0);
            this.executeBenchmark(new QuickSort(), list, this.dataLayer.quickSortResult);
            this.setCurrentTaskPercentage(1);
            this.executeBenchmark(new MergeSort(), list, this.dataLayer.mergeSortResult);
            this.setCurrentTaskPercentage(2);
            this.executeBenchmark(new RadixSort(), list, this.dataLayer.radixSortResult);
            this.setCurrentTaskPercentage(3);
            this.executeBenchmark(new HeapSort(), list, this.dataLayer.heapSortResult);
            this.setCurrentTaskPercentage(4);
            this.executeBenchmark(new InsertionSort(), list, this.dataLayer.insertionSortResult);
            this.setCurrentTaskPercentage(5);
            this.executeBenchmark(new BubbleSort(), list, this.dataLayer.bubbleSortResult);
            this.setCurrentTaskPercentage(6);
            this.executionStatusLabel.setText("Status de execução: Completo");
        });
        
        thread.start();
    }//GEN-LAST:event_handleMouseClick

    private void executeBenchmark(ISortableAlgorithm algorithm, Integer[] list, Observable<Double> observable) {
        double result = Benchmark.runBenchmark(algorithm, list);
        observable.setState(result);
    }
    

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(() -> new App().setVisible(true));
    }

    private final DataLayer dataLayer = new DataLayer();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bubbleSortLabel;
    private javax.swing.JTextField bubbleSortTextField;
    private javax.swing.JButton executeButton;
    private javax.swing.JLabel executionStatusLabel;
    private javax.swing.JLabel heapSortLabel;
    private javax.swing.JTextField heapSortTextField;
    private javax.swing.JLabel insertionSortLabel;
    private javax.swing.JTextField insertionSortTextField;
    private javax.swing.JComboBox<String> listSizeComboBox;
    private javax.swing.JLabel listSizeLabel;
    private javax.swing.JLabel mergeSortLabel;
    private javax.swing.JTextField mergeSortTextField;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel quickSortLabel;
    private javax.swing.JTextField quickSortTextField;
    private javax.swing.JLabel radixSortLabel;
    private javax.swing.JTextField radixSortTextField;
    private javax.swing.JLabel timesLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
