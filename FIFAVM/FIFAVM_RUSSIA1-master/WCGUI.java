package fifavm_russia;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Charlie
 */
public class WCGUI extends javax.swing.JFrame{
    ArrayList<String> groupContain=new ArrayList<String>();
    MatchHandler matchHandler=new MatchHandler();
    Random rand=new Random();
    int winpoint=3;
    
    
    /**
     * Creates new form WCGUI
     */
    public WCGUI() {
        initComponents();
        fillTextFields();
    }
    
    public ArrayList<String> getCountries(){
         Iterator itr = randomCountriesToGroup().iterator();
        while(itr.hasNext()){
                String Countri=itr.next().toString();
                groupContain.add(Countri);            
            } 
        return groupContain;
    }
    
    private double parcialPorcent(int totalpoint,int numberofmatches){
        int maxpoint=numberofmatches*winpoint;
        double subpoint=(totalpoint*100)/maxpoint;
        return subpoint;
    }
    

      private void fillTextFields() {
          
       String C1=getCountries().get(0);
       int C1points=matchHandler.getPointsFromCountry(C1);
       System.out.println("Total of points obtained: "+C1points);
       int maxmatches=matchHandler.getNumberOfMatches(C1);
          
          System.out.println(parcialPorcent(C1points,maxmatches) +" %");
          
       String C2=getCountries().get(1);
       matchHandler.removetotalPoints();
       int C2points=matchHandler.getPointsFromCountry(C2);
       System.out.println("Total of points obtained: "+C2points);
         int maxmatches2=matchHandler.getNumberOfMatches(C2);
          
          System.out.println(parcialPorcent(C2points,maxmatches2) +" %");
       
       matchHandler.removetotalPoints();
       String C3=getCountries().get(2);
       int C3points=matchHandler.getPointsFromCountry(C3);
       System.out.println("Total of points obtained: "+C3points);
       int maxmatches3=matchHandler.getNumberOfMatches(C3);
          
          System.out.println(parcialPorcent(C3points,maxmatches3) +" %");
        
       matchHandler.removetotalPoints();
       String C4=getCountries().get(3);
       int C4points=matchHandler.getPointsFromCountry(C4);
       System.out.println("Total of points obtained: "+C4points);
       int maxmatches4=matchHandler.getNumberOfMatches(C4);
          
          System.out.println(parcialPorcent(C4points,maxmatches4)+" %");
        
        jTextField1.setText(C1);
        jTextField2.setText(C3);
        jTextField3.setText(C2);
        jTextField4.setText(C4);
        
        //Update TableStanding. Lav en metode til det og sæt ind her.
        
        jTextField5.setText(C1);
        jTextField6.setText(C3);
        jTextField7.setText(C2);
        jTextField8.setText(C4);
        
        //Update TableStanding. Lav en metode til det og sæt ind her.
        
        jTextField9.setText(C1);
        jTextField10.setText(C4);
        jTextField11.setText(C2);
        jTextField12.setText(C3);
        
        //Update TableStanding. Lav en metode til det og sæt ind her.
        
        double n = parcialPorcent(C1points,maxmatches);
        double n2 = parcialPorcent(C2points,maxmatches2);
        double n3 = parcialPorcent(C3points,maxmatches3);
        double n4 = parcialPorcent(C4points,maxmatches4);
        double differ=n-n2;
        double differ2=n-n3;
        double differ3=n-n4;
        double differ4=n2-n3;
        double differ5=n2-n4;
        double differ6=n3-n4;
    
        if(differ<0){
            differ *= -1;
        }
       
        if(differ>0 && differ<4){
            int a1= 0;
            String s = String.valueOf(a1);
            jTextField17.setText(s);
            int b1=0;
            String s2 = String.valueOf(b1);
            jTextField18.setText(s2);
            
        }
        else if(differ>4 && differ<8){
            int a1= 1;
            String s = String.valueOf(a1);
            jTextField17.setText(s);
            int b1=1;
            String s2 = String.valueOf(b1);
            jTextField18.setText(s2);
            
        }
        else if(differ>8 && differ<12){
            int a1= 2;
            String s = String.valueOf(a1);
            jTextField17.setText(s);
            int b1=2;
            String s2 = String.valueOf(b1);
            jTextField18.setText(s2);
            
        }
        else if(differ>12 && differ<15){
            int a1= 3;
            String s = String.valueOf(a1);
            jTextField17.setText(s);
            int b1=3;
            String s2 = String.valueOf(b1);
            jTextField18.setText(s2);
            
        }
        else{
         int a = rand.nextInt(5);
         String s = String.valueOf(a);
         jTextField17.setText(s);
         
          int b = rand.nextInt(5);
        String s2 = String.valueOf(a);
         jTextField18.setText(s);
         }
        
        if(differ6<0){
            differ6 *= -1;
        }
        if(differ6>0 && differ6<4){
            int a1= 0;
            String s3 = String.valueOf(a1);
            jTextField19.setText(s3);
            int b1=0;
            String s4 = String.valueOf(b1);
            jTextField20.setText(s4);
            
        }
        else if(differ6>4 && differ6<8){
            int a1= 1;
            String s3 = String.valueOf(a1);
            jTextField19.setText(s3);
            int b1=1;
            String s4 = String.valueOf(b1);
            jTextField20.setText(s4);
            
        }
        else if(differ6>8 && differ6<12){
            int a1= 2;
            String s3 = String.valueOf(a1);
            jTextField19.setText(s3);
            int b1=2;
            String s4 = String.valueOf(b1);
            jTextField20.setText(s4);
            
        }
        else if(differ6>12 && differ6<15){
            int a1= 3;
            String s3 = String.valueOf(a1);
            jTextField19.setText(s3);
            int b1=3;
            String s4 = String.valueOf(b1);
            jTextField20.setText(s4);
            
        }
        else{
          int c = rand.nextInt(5);
         String s3 = String.valueOf(c);
         jTextField19.setText(s3);
         
          int d = rand.nextInt(5);
         String s4 = String.valueOf(d);
         jTextField20.setText(s4);
        }
        
        if(differ<0){
            differ *= -1;
        }
       
        if(differ>0 && differ<4){
            int a1= 0;
            String s = String.valueOf(a1);
            jTextField17.setText(s);
            int b1=0;
            String s2 = String.valueOf(b1);
            jTextField18.setText(s2);
            
        }
        else if(differ>4 && differ<8){
            int a1= 1;
            String s = String.valueOf(a1);
            jTextField17.setText(s);
            int b1=1;
            String s2 = String.valueOf(b1);
            jTextField18.setText(s2);
            
        }
        else if(differ>8 && differ<12){
            int a1= 2;
            String s = String.valueOf(a1);
            jTextField17.setText(s);
            int b1=2;
            String s2 = String.valueOf(b1);
            jTextField18.setText(s2);
            
        }
        else if(differ>12 && differ<15){
            int a1= 3;
            String s = String.valueOf(a1);
            jTextField17.setText(s);
            int b1=3;
            String s2 = String.valueOf(b1);
            jTextField18.setText(s2);
            
        }
        else{
         int a = rand.nextInt(5);
         String s = String.valueOf(a);
         jTextField17.setText(s);
         
          int b = rand.nextInt(5);
        String s2 = String.valueOf(a);
         jTextField18.setText(s);
         }
        
        if(differ2<0){
            differ2 *= -1;
        }
        if(differ2>0 && differ2<4){
            int a1= 0;
            String s5 = String.valueOf(a1);
            jTextField21.setText(s5);
            int b1=0;
            String s6 = String.valueOf(b1);
            jTextField22.setText(s6);
            
        }
        else if(differ2>4 && differ2<8){
            int a1= 1;
            String s5 = String.valueOf(a1);
            jTextField21.setText(s5);
            int b1=1;
            String s6 = String.valueOf(b1);
            jTextField22.setText(s6);
            
        }
        else if(differ2>8 && differ2<12){
            int a1= 2;
            String s5 = String.valueOf(a1);
            jTextField21.setText(s5);
            int b1=2;
            String s6 = String.valueOf(b1);
            jTextField22.setText(s6);
            
        }
        else if(differ2>12 && differ2<15){
            int a1= 3;
            String s5 = String.valueOf(a1);
            jTextField21.setText(s5);
            int b1=3;
            String s6 = String.valueOf(b1);
            jTextField22.setText(s6);
            
        }
        else{
          int e = rand.nextInt(5);
         String s5 = String.valueOf(e);
         jTextField21.setText(s5);
         
          int f = rand.nextInt(5);
         String s6 = String.valueOf(f);
         jTextField22.setText(s6);
        }
           int g = rand.nextInt(5);
         String s7 = String.valueOf(g);
         jTextField23.setText(s7);
         
          int h = rand.nextInt(5);
         String s8 = String.valueOf(h);
         jTextField24.setText(s8);
         
          int i = rand.nextInt(5);
         String s9 = String.valueOf(i);
         jTextField25.setText(s9);
         
          int j = rand.nextInt(5);
         String s10 = String.valueOf(j);
         jTextField26.setText(s10);
         
          int k = rand.nextInt(5);
         String s11 = String.valueOf(k);
         jTextField27.setText(s11);
         
          int l = rand.nextInt(5);
         String s12 = String.valueOf(l);
         jTextField28.setText(s12); 
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel4.setText(" --");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setEditable(false);

        jTextField2.setEditable(false);

        jTextField3.setEditable(false);

        jTextField4.setEditable(false);

        jTextField5.setEditable(false);

        jTextField6.setEditable(false);

        jTextField7.setEditable(false);

        jTextField8.setEditable(false);

        jTextField9.setEditable(false);

        jTextField10.setEditable(false);

        jTextField11.setEditable(false);

        jTextField12.setEditable(false);

        jLabel1.setText(" --");

        jLabel2.setText(" --");

        jLabel3.setText(" --");

        jLabel5.setText(" --");

        jLabel6.setText(" --");

        jLabel7.setText(" --");

        jTextField17.setEditable(false);

        jTextField18.setEditable(false);

        jTextField19.setEditable(false);

        jTextField20.setEditable(false);

        jTextField21.setEditable(false);

        jTextField22.setEditable(false);

        jTextField23.setEditable(false);

        jTextField24.setEditable(false);

        jTextField25.setEditable(false);

        jTextField26.setEditable(false);

        jTextField27.setEditable(false);

        jTextField28.setEditable(false);

        jLabel10.setText("Round 1");

        jLabel11.setText("Round 2");

        jLabel12.setText("Round 3");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("FIFA World Cup");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jTextField9)
                                    .addComponent(jTextField7)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jTextField4)
                            .addComponent(jTextField6)
                            .addComponent(jTextField8)
                            .addComponent(jTextField10)
                            .addComponent(jTextField12)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(WCGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WCGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WCGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WCGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WCGUI().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables


   Set qualiferedCountries= new HashSet();
   HashSet groupCountries= new HashSet();
   ArrayList<String> tempcount= new ArrayList<String>();
 // static Random rand=new Random();
  
  //metode som vælger fire lande og ligger dem en i en hashset som skal bruges til GroupStages klassen.
  public HashSet randomCountriesToGroup(){
      
      qualiferedCountries.add("Tyskland");
      qualiferedCountries.add("Belgien");
      qualiferedCountries.add("Argentina");
      qualiferedCountries.add("Colombia");
      qualiferedCountries.add("Brasilien");
      qualiferedCountries.add("Holland");
      qualiferedCountries.add("Portugal");
      qualiferedCountries.add("Uruguay");
      qualiferedCountries.add("Frankrig");
      qualiferedCountries.add("Spanien");
      qualiferedCountries.add("Schweiz");
      qualiferedCountries.add("Rumanien");
      qualiferedCountries.add("Italien");
      qualiferedCountries.add("Costa Rica");
      qualiferedCountries.add("England");
      qualiferedCountries.add("Sverige");
      qualiferedCountries.add("Tjekkiet");
      qualiferedCountries.add("Slovakiet");
      qualiferedCountries.add("Kroatien");
      qualiferedCountries.add("Chile");
      qualiferedCountries.add("Austria");
      qualiferedCountries.add("Algeriet");
      qualiferedCountries.add("Mexico");
      qualiferedCountries.add("Elfenbenskysten");
      qualiferedCountries.add("Graekland");
      qualiferedCountries.add("Rusland");
      qualiferedCountries.add("USA");
      qualiferedCountries.add("Skotland");
      qualiferedCountries.add("Tunesien");
      qualiferedCountries.add("Danmark");
      qualiferedCountries.add("Ecuador");
      qualiferedCountries.add("Sverige");
       Iterator itr = qualiferedCountries.iterator();
        while(itr.hasNext()){
            
                String Countrys=itr.next().toString();
                tempcount.add(Countrys);
            // System.out.println(tempcount);
            }
       // Starter med 16 lande, da jeg stadig er igang med at udvikle produktet.
        for(int i=0;i<16;i++){
            int index = rand.nextInt(tempcount.size());
           // System.out.println(index);
            String paisito = tempcount.get(index);
            // Her tager vi 4 lande og ligger ind i gruppe.
            if(groupCountries.size()<4){
            groupCountries.add(paisito);
        }}
      // System.out.println(qualiferedCountries);
       hashSetCompare();
      // System.out.println(qualiferedCountries);
       return groupCountries;
  }
  
  // Denne metode sletter de lande som allerede er valgt fra listen over lande som er med.
  public  void hashSetCompare(){
  //Compare both hashset
      Iterator<String> iterator = qualiferedCountries.iterator();  
      while (iterator.hasNext()) {
                //remove from hashset
                
                String element = iterator.next();
                
                Iterator<String> iterator2 = groupCountries.iterator();
                
                while (iterator2.hasNext()) {
                String element2 = iterator2.next();
                    
                if (element.equals(element2)){   
                iterator.remove();                  
                }       
      }}     
  }
}
