/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import static java.lang.Integer.parseInt;
import javax.naming.ldap.ManageReferralControl;

/**
 *
 * @author David
 */
public class main extends javax.swing.JFrame {

    BBDDManager manager = new BBDDManager();

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        deleteComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addAlbumFrame = new javax.swing.JFrame();
        albumName_addAlbum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        artist_addAlbum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        date_addAlbum = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        addSongFrame = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        nameSong_addSong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        albumBox_addSong = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        durationSong_addSong = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        alterSong = new javax.swing.JFrame();
        jLabel7 = new javax.swing.JLabel();
        newName_alterSong = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        newDuration_alterSong = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        newAlbum_alterSong = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jFrame1 = new javax.swing.JFrame();
        connect1 = new javax.swing.JButton();
        disconnect1 = new javax.swing.JButton();
        addAlbumButton1 = new javax.swing.JButton();
        albumBox1 = new javax.swing.JComboBox<>();
        showSongs1 = new javax.swing.JButton();
        restoreDatabaseButton1 = new javax.swing.JButton();
        addSongButton1 = new javax.swing.JButton();
        updateSongButton1 = new javax.swing.JButton();
        songBox_update1 = new javax.swing.JComboBox<>();
        songBox_delete1 = new javax.swing.JComboBox<>();
        deleteSongButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        connect = new javax.swing.JButton();
        disconnect = new javax.swing.JButton();
        addAlbumButton = new javax.swing.JButton();
        albumBox = new javax.swing.JComboBox<>();
        showSongs = new javax.swing.JButton();
        restoreDatabaseButton = new javax.swing.JButton();
        addSongButton = new javax.swing.JButton();
        updateSongButton = new javax.swing.JButton();
        songBox_update = new javax.swing.JComboBox<>();
        songBox_delete = new javax.swing.JComboBox<>();
        deleteSongButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        addAlbumFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre Album");

        jLabel2.setText("Artista");

        jLabel3.setText("Fecha Salida(YYYY-MM-DD)");

        date_addAlbum.setToolTipText("");
        date_addAlbum.setName(""); // NOI18N

        jButton3.setText("Aceptar");
        jButton3.setMaximumSize(new java.awt.Dimension(70, 25));
        jButton3.setMinimumSize(new java.awt.Dimension(70, 25));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addAlbumFrameLayout = new javax.swing.GroupLayout(addAlbumFrame.getContentPane());
        addAlbumFrame.getContentPane().setLayout(addAlbumFrameLayout);
        addAlbumFrameLayout.setHorizontalGroup(
            addAlbumFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addAlbumFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addAlbumFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addAlbumFrameLayout.createSequentialGroup()
                        .addGroup(addAlbumFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addAlbumFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date_addAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(artist_addAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(albumName_addAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addAlbumFrameLayout.setVerticalGroup(
            addAlbumFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addAlbumFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addAlbumFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(albumName_addAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addAlbumFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(artist_addAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addAlbumFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(date_addAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        date_addAlbum.getAccessibleContext().setAccessibleName("");

        addSongFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addSongFrame.setMinimumSize(new java.awt.Dimension(222, 138));

        jLabel4.setBackground(new java.awt.Color(102, 255, 51));
        jLabel4.setText("Nombre");

        jLabel5.setText("Album");

        jLabel6.setText("Duracion seg.");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addSongFrameLayout = new javax.swing.GroupLayout(addSongFrame.getContentPane());
        addSongFrame.getContentPane().setLayout(addSongFrameLayout);
        addSongFrameLayout.setHorizontalGroup(
            addSongFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSongFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addSongFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addSongFrameLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addSongFrameLayout.createSequentialGroup()
                        .addGroup(addSongFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(albumBox_addSong, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addSongFrameLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameSong_addSong, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addSongFrameLayout.createSequentialGroup()
                                .addGroup(addSongFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(7, 7, 7)
                                .addComponent(durationSong_addSong, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        addSongFrameLayout.setVerticalGroup(
            addSongFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSongFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addSongFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nameSong_addSong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addSongFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(albumBox_addSong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addSongFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(durationSong_addSong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        alterSong.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        alterSong.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Nuevo nombre");
        alterSong.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 16, 115, -1));
        alterSong.getContentPane().add(newName_alterSong, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 13, 91, -1));

        jLabel8.setText("Nueva duracion");
        alterSong.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 77, -1, -1));
        alterSong.getContentPane().add(newDuration_alterSong, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 91, -1));

        jLabel9.setText("Nuevo album");
        alterSong.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 45, 111, -1));

        alterSong.getContentPane().add(newAlbum_alterSong, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 42, 91, -1));

        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        alterSong.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 103, 210, -1));

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrame1.setMinimumSize(new java.awt.Dimension(820, 450));
        jFrame1.setPreferredSize(new java.awt.Dimension(820, 450));
        jFrame1.setSize(new java.awt.Dimension(820, 450));
        jFrame1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                jFrame1formWindowClosed(evt);
            }
        });
        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        connect1.setText("Conectar");
        connect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connect1ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(connect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        disconnect1.setText("Desconectar");
        disconnect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnect1ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(disconnect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        addAlbumButton1.setText("Añadir albúm");
        addAlbumButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAlbumButton1ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(addAlbumButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 140, -1));

        albumBox1.setMinimumSize(new java.awt.Dimension(33, 32));
        jFrame1.getContentPane().add(albumBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 150, 30));

        showSongs1.setText("Enseñar canciones");
        showSongs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSongs1ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(showSongs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 140, 30));

        restoreDatabaseButton1.setText("Restaurar base de datos");
        restoreDatabaseButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoreDatabaseButton1ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(restoreDatabaseButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 250, -1));

        addSongButton1.setText("Añadir canción");
        addSongButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSongButton1ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(addSongButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 140, -1));

        updateSongButton1.setText("Actualizar canción");
        updateSongButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSongButton1ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(updateSongButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 140, 30));

        songBox_update1.setMinimumSize(new java.awt.Dimension(33, 32));
        jFrame1.getContentPane().add(songBox_update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 150, 30));

        songBox_delete1.setMinimumSize(new java.awt.Dimension(33, 32));
        jFrame1.getContentPane().add(songBox_delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 150, 30));

        deleteSongButton1.setText("Borrar canción");
        deleteSongButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSongButton1ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(deleteSongButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 140, 30));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre cancion", "Artista", "Duracion"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jFrame1.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 450, 310));
        jFrame1.getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 310, 10));
        jFrame1.getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 310, 10));
        jFrame1.getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 310, 10));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(820, 450));
        setPreferredSize(new java.awt.Dimension(820, 450));
        setSize(new java.awt.Dimension(820, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        connect.setText("Conectar");
        connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectActionPerformed(evt);
            }
        });
        getContentPane().add(connect, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        disconnect.setText("Desconectar");
        disconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnectActionPerformed(evt);
            }
        });
        getContentPane().add(disconnect, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        addAlbumButton.setText("Añadir albúm");
        addAlbumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAlbumButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addAlbumButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 140, -1));

        albumBox.setMinimumSize(new java.awt.Dimension(33, 32));
        getContentPane().add(albumBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 150, 30));

        showSongs.setText("Enseñar canciones");
        showSongs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSongsActionPerformed(evt);
            }
        });
        getContentPane().add(showSongs, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 140, 30));

        restoreDatabaseButton.setText("Restaurar base de datos");
        restoreDatabaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoreDatabaseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(restoreDatabaseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 250, -1));

        addSongButton.setText("Añadir canción");
        addSongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSongButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addSongButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 140, -1));

        updateSongButton.setText("Actualizar canción");
        updateSongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSongButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateSongButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 140, 30));

        songBox_update.setMinimumSize(new java.awt.Dimension(33, 32));
        getContentPane().add(songBox_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 150, 30));

        songBox_delete.setMinimumSize(new java.awt.Dimension(33, 32));
        getContentPane().add(songBox_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 150, 30));

        deleteSongButton.setText("Borrar canción");
        deleteSongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSongButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteSongButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 140, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre cancion", "Artista", "Duracion"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 450, 310));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 310, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 310, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 310, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectActionPerformed
        if (manager.connectionPool()) {
            putComponents();
        }

    }//GEN-LAST:event_connectActionPerformed

    private void disconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnectActionPerformed
        manager.close();
        deleteComponents();
    }//GEN-LAST:event_disconnectActionPerformed

    private void showSongsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSongsActionPerformed
        manager.getDataSongs(albumBox.getSelectedItem().toString());
        String[][] data = manager.getDataSongs(albumBox.getSelectedItem().toString());
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                jTable2.getModel().setValueAt(data[i][j], j, i);
            }
        }
    }//GEN-LAST:event_showSongsActionPerformed

    private void addAlbumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAlbumButtonActionPerformed
        addAlbumFrame.setVisible(true);
        addAlbumFrame.setSize(300, 200);
    }//GEN-LAST:event_addAlbumButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        addAlbumFrame.setVisible(false);
        manager.addAlbum(albumName_addAlbum.getText(), artist_addAlbum.getText(), date_addAlbum.getText());
        deleteComponents();
        putComponents();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void restoreDatabaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoreDatabaseButtonActionPerformed
        manager.createDataBase();
        deleteComponents();
        putComponents();
    }//GEN-LAST:event_restoreDatabaseButtonActionPerformed

    private void addSongButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSongButtonActionPerformed
        addSongFrame.setVisible(true);
        addSongFrame.setSize(220, 180);

    }//GEN-LAST:event_addSongButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (nameSong_addSong.getText().equals("") || albumBox_addSong.getSelectedIndex() == 0 || durationSong_addSong.getText().equals("")) {
            System.out.println(nameSong_addSong.getText()+","+albumBox_addSong.getSelectedIndex()+","+durationSong_addSong.getText());
            addSongFrame.setVisible(false);
            manager.addSong(nameSong_addSong.getText(), albumBox_addSong.getSelectedIndex(), parseInt(durationSong_addSong.getText()));
            deleteComponents();
            putComponents();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updateSongButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSongButtonActionPerformed
        if (songBox_update.getSelectedIndex() != 0) {
            alterSong.setVisible(true);
            alterSong.setSize(242, 145);
        }

    }//GEN-LAST:event_updateSongButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        manager.updateSong(songBox_update.getSelectedItem().toString(), newName_alterSong.getText(), newAlbum_alterSong.getSelectedIndex(), newDuration_alterSong.getText());
        alterSong.setVisible(false);
        deleteComponents();
        putComponents();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void deleteSongButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSongButtonActionPerformed
        manager.deleteSong(songBox_delete.getSelectedItem().toString());
        deleteComponents();
        putComponents();
    }//GEN-LAST:event_deleteSongButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        manager.close();
        System.exit(0);
    }//GEN-LAST:event_formWindowClosed

    private void connect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connect1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_connect1ActionPerformed

    private void disconnect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnect1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disconnect1ActionPerformed

    private void addAlbumButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAlbumButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addAlbumButton1ActionPerformed

    private void showSongs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSongs1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showSongs1ActionPerformed

    private void restoreDatabaseButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoreDatabaseButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restoreDatabaseButton1ActionPerformed

    private void addSongButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSongButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addSongButton1ActionPerformed

    private void updateSongButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSongButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateSongButton1ActionPerformed

    private void deleteSongButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSongButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteSongButton1ActionPerformed

    private void jFrame1formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame1formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrame1formWindowClosed

    public void putComponents() {
        //Añadimos todos los componentes que necesitamos de la base de datos 
        albumBox.addItem("");
        songBox_delete.addItem("");
        songBox_update.addItem("");
        newAlbum_alterSong.addItem("");
        albumBox_addSong.addItem("");
        connect.setEnabled(false);
        addSongButton.setEnabled(true);
        disconnect.setEnabled(true);
        restoreDatabaseButton.setEnabled(true);
        showSongs.setEnabled(true);
        updateSongButton.setEnabled(true);
        addAlbumButton.setEnabled(true);
        deleteSongButton.setEnabled(true);
        for (int i = 0; i < manager.getAlbum().size(); i++) {
            albumBox.addItem(manager.getAlbum().get(i));
            newAlbum_alterSong.addItem(manager.getAlbum().get(i));
            albumBox_addSong.addItem(manager.getAlbum().get(i));
        }
        for (int i = 0; i < manager.getSong().size(); i++) {
            songBox_update.addItem(manager.getSong().get(i));
            songBox_delete.addItem(manager.getSong().get(i));
        }

    }

    public void deleteComponents() {
        albumName_addAlbum.setText("");
        date_addAlbum.setText("");
        artist_addAlbum.setText("");
        durationSong_addSong.setText("");
        nameSong_addSong.setText("");
        newDuration_alterSong.setText("");
        newName_alterSong.setText("");
        connect.setEnabled(true);
        disconnect.setEnabled(false);
        restoreDatabaseButton.setEnabled(false);
        showSongs.setEnabled(false);
        addSongButton.setEnabled(false);
        addAlbumButton.setEnabled(false);
        updateSongButton.setEnabled(false);
        deleteSongButton.setEnabled(false);
        for (int i = albumBox.getItemCount() - 1; i >= 0; i--) {
            albumBox.removeItemAt(i);
            albumBox_addSong.removeItemAt(i);
            newAlbum_alterSong.removeItemAt(i);
        }
        for (int i = songBox_update.getItemCount() - 1; i >= 0; i--) {
            songBox_update.removeItemAt(i);
            songBox_delete.removeItemAt(i);
        }
        try {
            for (int i = 0; i < jTable2.getRowCount() * jTable2.getRowCount(); i++) {
                for (int j = 0; j < jTable2.getColumnCount(); j++) {
                    jTable2.getModel().setValueAt("", i, j);
                }
            }
        } catch (Exception e) {
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAlbumButton;
    private javax.swing.JButton addAlbumButton1;
    private javax.swing.JFrame addAlbumFrame;
    private javax.swing.JButton addSongButton;
    private javax.swing.JButton addSongButton1;
    private javax.swing.JFrame addSongFrame;
    private javax.swing.JComboBox<String> albumBox;
    private javax.swing.JComboBox<String> albumBox1;
    private javax.swing.JComboBox<String> albumBox_addSong;
    private javax.swing.JTextField albumName_addAlbum;
    private javax.swing.JFrame alterSong;
    private javax.swing.JTextField artist_addAlbum;
    private javax.swing.JButton connect;
    private javax.swing.JButton connect1;
    private javax.swing.JTextField date_addAlbum;
    private javax.swing.JButton deleteSongButton;
    private javax.swing.JButton deleteSongButton1;
    private javax.swing.JButton disconnect;
    private javax.swing.JButton disconnect1;
    private javax.swing.JTextField durationSong_addSong;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField nameSong_addSong;
    private javax.swing.JComboBox<String> newAlbum_alterSong;
    private javax.swing.JTextField newDuration_alterSong;
    private javax.swing.JTextField newName_alterSong;
    private javax.swing.JButton restoreDatabaseButton;
    private javax.swing.JButton restoreDatabaseButton1;
    private javax.swing.JButton showSongs;
    private javax.swing.JButton showSongs1;
    private javax.swing.JComboBox<String> songBox_delete;
    private javax.swing.JComboBox<String> songBox_delete1;
    private javax.swing.JComboBox<String> songBox_update;
    private javax.swing.JComboBox<String> songBox_update1;
    private javax.swing.JButton updateSongButton;
    private javax.swing.JButton updateSongButton1;
    // End of variables declaration//GEN-END:variables
}
