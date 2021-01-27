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
        connect = new javax.swing.JButton();
        disconnect = new javax.swing.JButton();
        mainText = new javax.swing.JTextArea();
        addAlbumButton = new javax.swing.JButton();
        albumBox = new javax.swing.JComboBox<>();
        showSongs = new javax.swing.JButton();
        restoreDatabaseButton = new javax.swing.JButton();
        addSongButton = new javax.swing.JButton();
        deleteSongButton = new javax.swing.JButton();
        songBox = new javax.swing.JComboBox<>();

        addAlbumFrame.setPreferredSize(new java.awt.Dimension(200, 200));

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
                .addGroup(addSongFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(addSongFrameLayout.createSequentialGroup()
                        .addGroup(addSongFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addSongFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameSong_addSong, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(durationSong_addSong, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(albumBox_addSong, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(130, Short.MAX_VALUE))
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
                .addComponent(jButton1)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(480, 400));
        setSize(new java.awt.Dimension(480, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        connect.setText("Conectar");
        connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectActionPerformed(evt);
            }
        });
        getContentPane().add(connect, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        disconnect.setText("Desconectar");
        disconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnectActionPerformed(evt);
            }
        });
        getContentPane().add(disconnect, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 11, -1, -1));

        mainText.setColumns(20);
        mainText.setRows(5);
        getContentPane().add(mainText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 210, 302));

        addAlbumButton.setText("Añadir albúm");
        addAlbumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAlbumButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addAlbumButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 110, -1));

        getContentPane().add(albumBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 69, -1));

        showSongs.setText("Enseñar canciones");
        showSongs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSongsActionPerformed(evt);
            }
        });
        getContentPane().add(showSongs, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 150, -1));

        restoreDatabaseButton.setText("Restaurar base de datos");
        restoreDatabaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoreDatabaseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(restoreDatabaseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 230, -1));

        addSongButton.setText("Añadir canción");
        addSongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSongButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addSongButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 110, -1));

        deleteSongButton.setText("Borrar cancion");
        deleteSongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSongButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteSongButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 150, -1));

        getContentPane().add(songBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 69, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectActionPerformed
        manager.connectionPool();
        putComponents();
    }//GEN-LAST:event_connectActionPerformed

    private void disconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnectActionPerformed
        manager.close();
        deleteComponents();
    }//GEN-LAST:event_disconnectActionPerformed

    private void showSongsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSongsActionPerformed
        mainText.setText(manager.getDataSongs(albumBox.getSelectedItem().toString()));
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
        addSongFrame.setVisible(false);
        manager.addSong(nameSong_addSong.getText(), albumBox_addSong.getSelectedIndex(), parseInt(durationSong_addSong.getText()));
        deleteComponents();
        putComponents();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteSongButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSongButtonActionPerformed
        manager.deleteSong(songBox.getSelectedItem().toString());
        deleteComponents();
        putComponents();
    }//GEN-LAST:event_deleteSongButtonActionPerformed

    public void putComponents() {
        //Añadimos todos los componentes que necesitamos de la base de datos 
        albumBox.addItem("");
        songBox.addItem("");
        albumBox_addSong.addItem("");
        connect.setEnabled(false);
        addSongButton.setEnabled(true);
        disconnect.setEnabled(true);
        restoreDatabaseButton.setEnabled(true);
        showSongs.setEnabled(true);
        deleteSongButton.setEnabled(true);
        addAlbumButton.setEnabled(true);
        for (int i = 0; i < manager.getAlbum().size(); i++) {
            albumBox.addItem(manager.getAlbum().get(i));
            albumBox_addSong.addItem(manager.getAlbum().get(i));
        }
        for (int i = 0; i < manager.getSong().size(); i++) {
            songBox.addItem(manager.getSong().get(i));
        }
    }

    public void deleteComponents() {
        connect.setEnabled(true);
        disconnect.setEnabled(false);
        restoreDatabaseButton.setEnabled(false);
        showSongs.setEnabled(false);
        addSongButton.setEnabled(false);
        addAlbumButton.setEnabled(false);
        deleteSongButton.setEnabled(false);
        for (int i = albumBox.getItemCount() - 1; i >= 0; i--) {
            albumBox.removeItemAt(i);
            albumBox_addSong.removeItemAt(i);
        }
        for (int i = songBox.getItemCount() - 1; i >= 0; i--) {
            songBox.removeItemAt(i);
        }
        mainText.setText("");
        albumName_addAlbum.setText("");
        date_addAlbum.setText("");
        artist_addAlbum.setText("");
        durationSong_addSong.setText("");
        nameSong_addSong.setText("");
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
    private javax.swing.JFrame addAlbumFrame;
    private javax.swing.JButton addSongButton;
    private javax.swing.JFrame addSongFrame;
    private javax.swing.JComboBox<String> albumBox;
    private javax.swing.JComboBox<String> albumBox_addSong;
    private javax.swing.JTextField albumName_addAlbum;
    private javax.swing.JTextField artist_addAlbum;
    private javax.swing.JButton connect;
    private javax.swing.JTextField date_addAlbum;
    private javax.swing.JButton deleteSongButton;
    private javax.swing.JButton disconnect;
    private javax.swing.JTextField durationSong_addSong;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextArea mainText;
    private javax.swing.JTextField nameSong_addSong;
    private javax.swing.JButton restoreDatabaseButton;
    private javax.swing.JButton showSongs;
    private javax.swing.JComboBox<String> songBox;
    // End of variables declaration//GEN-END:variables
}
