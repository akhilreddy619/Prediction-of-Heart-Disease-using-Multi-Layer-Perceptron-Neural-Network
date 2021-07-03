/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NormalizeDataset.java
 *
 
 */
package ketan.ui;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import ketan.auth.DataOperations;
import ketan.logic.GlobalStorage;

/**
 *
 * @author Administrator
 */
public class NormalizeDataset extends javax.swing.JFrame {

   java.sql.Connection con;
   Object []headers;
   Object [][]data;
    /** Creates new form NormalizeDataset */
    public NormalizeDataset() 
    {
        initComponents();
        uploadUnormalized();
    }
    private void uploadUnormalized()
    {
        DataOperations dp=new DataOperations();
          try
          {
              ResultSet rs=dp.getTranactions();
              ResultSetMetaData rsmd=rs.getMetaData();
              
              headers=new Object[rsmd.getColumnCount()];
              data=new Object[GlobalStorage.rowscount][rsmd.getColumnCount()];
              
              for(int i=1;i<=rsmd.getColumnCount();i++)
                   headers[i-1]=rsmd.getColumnName(i);
              
              int rowno=0;
              while(rs.next())
              {
                   for(int i=1;i<=rsmd.getColumnCount();i++)
                          data[rowno][i-1]=rs.getString(i);
                   rowno++;
              }
             rs.close();
      
             TableModel tm=new DefaultTableModel(data, headers);
             jTable1.setModel(tm);
          }
          catch(Exception ex)
          {
              JOptionPane.showMessageDialog(this,"Error : " + ex.getMessage());
          }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 100, 0, 0));
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(mlbphd_alg.MLBPHD_ALGApp.class).getContext().getResourceMap(NormalizeDataset.class);
        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setForeground(resourceMap.getColor("jLabel1.foreground")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jSplitPane1.setDividerLocation(480);
        jSplitPane1.setName("jSplitPane1"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setName("jTable1"); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        jSplitPane1.setLeftComponent(jScrollPane1);

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setName("jTable2"); // NOI18N
        jScrollPane2.setViewportView(jTable2);

        jSplitPane1.setRightComponent(jScrollPane2);

        jButton1.setFont(resourceMap.getFont("jButton2.font")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(resourceMap.getFont("jButton2.font")); // NOI18N
        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(resourceMap.getFont("jButton3.font")); // NOI18N
        jButton3.setText(resourceMap.getString("jButton3.text")); // NOI18N
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1061, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 596, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(7, 7, 7)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       Statement stmt;
       ResultSet rs;
        try
        {
            con=ketan.auth.ConnectionObj.getConnection();
            stmt=con.createStatement();
             rs=stmt.executeQuery("select * from tblUnnormalized");
          ResultSetMetaData rsmd=rs.getMetaData();
        data=new Object[GlobalStorage.rowscount][rsmd.getColumnCount()];
          int row=0;
          String attvalue="";
          while(rs.next())
          {
              for(int i=1;i<=rsmd.getColumnCount();i++)
              {
                  attvalue=rs.getString(i);
                  if(i==1)
                  {
                        if(Integer.parseInt(attvalue)>=30 && Integer.parseInt(attvalue)<=70)
                          data[row][i-1]=1;
                          else
                      data[row][i-1]=2;
                  }
                if(i==2)
                {
                    if(attvalue.equalsIgnoreCase("male"))
                        data[row][i-1]=1;
                    else
                        data[row][i-1]=2;
                }
                if(i==3) //for chest pain
                {
                    if(attvalue.startsWith("typ"))
                         data[row][i-1]=1;
                    else
                        if(attvalue.startsWith("atyp"))
                            data[row][i-1]=2;
                    else
                        if(attvalue.startsWith("non"))
                            data[row][i-1]=3;
                    else
                            data[row][i-1]=4;
                    
                }
                if(i==4) //bp
                {
                    if(Integer.parseInt(attvalue)<134)
                        data[row][i-1]=1;
                    else
                        if(Integer.parseInt(attvalue)>=134 && Integer.parseInt(attvalue)<153)
                            data[row][i-1]=2;
                    else
                            if(Integer.parseInt(attvalue)>=153 && Integer.parseInt(attvalue)<172)
                            data[row][i-1]=3;
                    else
                                data[row][i-1]=4;
                }
                if(i==5) //cholestrol
                {
                    if(Integer.parseInt(attvalue)<197)
                        data[row][i-1]=1;
                    else
                        if(Integer.parseInt(attvalue)>=197 && Integer.parseInt(attvalue)<250)
                            data[row][i-1]=2;
                    else
                            if(Integer.parseInt(attvalue)>=250 && Integer.parseInt(attvalue)<307)
                            data[row][i-1]=3;
                    else
                                data[row][i-1]=4;
                }
                if(i==6)
                {
                    if(Integer.parseInt(attvalue)>120)
                                data[row][i-1]=1;
                    else
                                data[row][i-1]=0;
                }
               if(i==7)
               {
                   if(Double.parseDouble(attvalue)<0.4)
                                data[row][i-1]=0;
                   else
                       if(Double.parseDouble(attvalue)>=0.4 && Double.parseDouble(attvalue)<0.8)
                                data[row][i-1]=1;
                   else
                                data[row][i-1]=2;
               }
               if(i==8)
               {
                    if(attvalue.startsWith("normal"))
                                data[row][i-1]=0;
                    else
                                data[row][i-1]=1;
               }  
               if(i==9)
               {
                   if(attvalue.startsWith("yes"))
                                data[row][i-1]=1;
                    else
                                data[row][i-1]=0;
               }
               
 if(i==10)
 {
     if(Double.parseDouble(attvalue)<2)
                                data[row][i-1]=1;
                    else
        if(Double.parseDouble(attvalue)>=2 && Double.parseDouble(attvalue)<=4.2)
             data[row][i-1]=2;
                                else
                                data[row][i-1]=3;
 }
 if(i==11)
 {
     data[row][i-1]=attvalue;
 }
 if(i==12)
 {
     if(attvalue.startsWith("norm"))
         data[row][i-1]=3;
     else
         if(attvalue.startsWith("fix"))
             data[row][i-1]=6;
     else
             data[row][i-1]=7;
 }
 if(i==13)
 {
 if(attvalue.equals("yes"))     
             data[row][i-1]=1;
 else
             data[row][i-1]=0;
 }
 if(i==14)
 {
     if(attvalue.startsWith("health"))
         data[row][i-1]=0;
     else
         data[row][i-1]=1;
 }
          } //end of for
              row++;
          }//end of while
          rs.close();
           stmt.close();
           
        //   Object []dupheaders=new Object[headers.length-1];
          // for(int i=0;i<headers.length;i++)
              //  dupheaders[i]=headers[i];
           
           TableModel tm=new DefaultTableModel(data, headers);
           jTable2.setModel(tm);
    }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,"Unable to Perform Normalization Now ");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Tasks t=new Tasks();
        this.setVisible(false);
        t.setVisible(true);
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try
        {
          //try to save normalized data for future training  
             Statement stmt=con.createStatement();
             String sql="";
             
             
             ResultSet rs=stmt.executeQuery("select count(*) from tab where tname like 'NORMALIZED'");
           rs.next();
           int cnt=Integer.parseInt(rs.getString(1));
           
           if(cnt>0)
           {
                 stmt=con.createStatement();
                  stmt.executeQuery("delete normalized");
                 //stmt.executeUpdate("drop table tblunnormalized");
           }
            cnt=1;  
            
             for(int i=0;i<data.length;i++)
             {
                   sql="insert into normalized values(";
                   for(int j=0;j<data[i].length;j++)
                   {
                       if(data[i][j]!=null)
                       {
                           System.out.print("Y ");
                        sql+=Double.parseDouble(data[i][j].toString()) + ",";
                        cnt++;
                       }
                   }
                   sql=sql.substring(0,sql.length()-1);
                   sql+=")";
                   System.out.println();
                   System.out.println(sql + "---" + cnt +"-----" + data[i].length);
                 //  if(cnt==data[i].length)
                       if(sql.indexOf(".0")>=0)
                   stmt.executeUpdate(sql);
                   cnt=1;
             }
             JOptionPane.showMessageDialog(this,"Normalized Table Saved Successfully ");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,"Eror In Saving Normalized Table ");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new NormalizeDataset().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
