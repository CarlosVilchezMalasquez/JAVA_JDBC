/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.crvm.eurekacs.view;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import pe.crvm.eurekacs.controller.ClienteController;
import pe.crvm.eurekacs.domain.Cliente;
import pe.crvm.eurekacs.util.Dialogo;
import pe.crvm.eurekacs.util.Eureka;
import pe.crvm.eurekacs.util.Memoria;

/**
 *
 * @author Alumno
 */
public class MantClientesView extends javax.swing.JInternalFrame {

    private ClienteController control;
    private List<Cliente> lista;
    
    public MantClientesView() {
        initComponents();
        
        control = new ClienteController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPaterno = new javax.swing.JTextField();
        txtMaterno = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("MANTENIMIENTO DE CLIENTES");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Paterno");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Materno");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nombre");

        txtPaterno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtMaterno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/crvm/eurekacs/img/buscar.gif"))); // NOI18N
        btnBuscar.setToolTipText("Buscar Cliente");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/crvm/eurekacs/img/new.png"))); // NOI18N
        btnNuevo.setToolTipText("Nuevo Cliente");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/crvm/eurekacs/img/edit.png"))); // NOI18N
        btnEditar.setToolTipText("Editar Cliente");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/crvm/eurekacs/img/delete.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar Cliente");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/crvm/eurekacs/img/Excel.png"))); // NOI18N

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/crvm/eurekacs/img/PDF.png"))); // NOI18N

        tblData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Paterno", "Materno", "Nombre", "DNI", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblData);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Exportar a:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(89, 89, 89)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton7)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton7)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnEditar)
                                .addComponent(btnNuevo)
                                .addComponent(btnBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btnEliminar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
                // Datos
                Cliente cliente = new Cliente();
                
                cliente.setPaterno(txtPaterno.getText());
                cliente.setMaterno(txtMaterno.getText());
                cliente.setNombre(txtNombre.getText());
                // Proceso
                lista = control.getClientes(cliente);
                // Reporte
                mostrarLista(lista);
        } catch (Exception e) {
                Dialogo.error(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        Cliente bean = new Cliente();
        bean.setCodigo("NONE");
        EditarClienteView view = new EditarClienteView(null, true);
        view.setBean(bean);
        view.setAccion(Eureka.CRUD_NUEVO);
        Memoria.put("bean", null);
        view.setVisible(true);
        if(Memoria.get("bean") != null ){
            bean = (Cliente) Memoria.get("bean");
            lista.add(0,bean);
            mostrarLista(lista);
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int fila;
        fila = tblData.getSelectedRow();
        if(fila == -1) return;
        
        Cliente bean = lista.get(fila);
        EditarClienteView view = new EditarClienteView(null, true);
        view.setBean(bean);
        view.setAccion(Eureka.CRUD_EDITAR);
        Memoria.put("bean", null);
        view.setVisible(true);
        if(Memoria.get("bean") != null ){
            bean = (Cliente) Memoria.get("bean");
            lista.set(fila,bean);
            mostrarLista(lista);
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila;
        fila = tblData.getSelectedRow();
        if(fila == -1) return;
        
        Cliente bean = lista.get(fila);
        EditarClienteView view = new EditarClienteView(null, true);
        view.setBean(bean);
        view.setAccion(Eureka.CRUD_ELIMINAR);
        view.setVisible(true);
        if ( Memoria.get("bean") != null ){
            lista.remove(fila);
            mostrarLista(lista);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaterno;
    // End of variables declaration//GEN-END:variables

private void mostrarLista(List<Cliente> lista) {
    DefaultTableModel tabla;
    tabla = (DefaultTableModel) tblData.getModel();
    tabla.setRowCount(0);
    for (Cliente cliente : lista) {
      Object[] rowData = {
        cliente.getCodigo(),
        cliente.getPaterno(),
        cliente.getMaterno(),
        cliente.getNombre(),
        cliente.getDni(),
        cliente.getEmail()
      };
      tabla.addRow(rowData);
    }
    
  }



}
