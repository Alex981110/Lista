package Lista;

import javax.swing.JOptionPane;

/**
 *
 * @author alexis
 */
public class ListaLig extends javax.swing.JFrame {
    
    public ListaLig() {
        initComponents();
        validaBotonTamanio();
        validaBotonNodo();
    }
    
    public void validaBotonTamanio(){
        //System.out.println("1");
        if(TamListJTF.getText().equals("")){
            checkJBT.setEnabled(false);
        }else{
            try {
                  Integer.parseInt(TamListJTF.getText());
                  checkJBT.setEnabled(true);
            } catch (Exception e) {
                checkJBT.setEnabled(false);
            }
        }
    }
    
    public void validaBotonNodo(){
        if(ValoresNodoJTF.getText().equals("")){
            InsertNodojBtn.setEnabled(false);
        }else{
            try {
                Integer.parseInt(ValoresNodoJTF.getText());
                InsertNodojBtn.setEnabled(true);
            } catch (Exception e) {
                InsertNodojBtn.setEnabled(false);
            }
        }
    }
    
    public void escondeNodo(){
        nodo1JP.setVisible(false);
        FlechaLabel1.setVisible(false);
        nodo2JP.setVisible(false);
        FlechaLabel2.setVisible(false);
    }
    
    
    public void eliminaNodo(){
        
        String numNodos;
        int nodo;
        numNodos = TamListJTF.getText();
        nodo = Integer.parseInt(numNodos);
        
        if((nodo > 1)){
            
            switch(nodo){
                
                case 1: JOptionPane.showMessageDialog(null, "La lista debe ser mayor a 1");
                
                case 2: FlechaLabel2.setVisible(false);
                        nodo3JP.setVisible(false);
                        FlechaLabel3.setVisible(false);
                        nodo4JP.setVisible(false);
                        FlechaLabel4.setVisible(false);
                        nodo5JP.setVisible(false);
                        FlechaLabel5.setVisible(false);
                        nodo6JP.setVisible(false);
                        FlechaLabel6.setVisible(false);
                        nodo7JP.setVisible(false);
                        FlechaLabel7.setVisible(false);
                        nodo8JP.setVisible(false);
                        FlechaLabel8.setVisible(false);
                        nodo9JP.setVisible(false);
                        FlechaLabel9.setVisible(false);
                        nodo10JP.setVisible(false);
                
                case 3: FlechaLabel3.setVisible(false);
                        nodo4JP.setVisible(false);
                        FlechaLabel4.setVisible(false);
                        nodo5JP.setVisible(false);
                        FlechaLabel5.setVisible(false);
                        nodo6JP.setVisible(false);
                        FlechaLabel6.setVisible(false);
                        nodo7JP.setVisible(false);
                        FlechaLabel7.setVisible(false);
                        nodo8JP.setVisible(false);
                        FlechaLabel8.setVisible(false);
                        nodo9JP.setVisible(false);
                        FlechaLabel9.setVisible(false);
                        nodo10JP.setVisible(false);
                
                case 4: FlechaLabel4.setVisible(false);
                        nodo5JP.setVisible(false);
                        FlechaLabel5.setVisible(false);
                        nodo6JP.setVisible(false);
                        FlechaLabel6.setVisible(false);
                        nodo7JP.setVisible(false);
                        FlechaLabel7.setVisible(false);
                        nodo8JP.setVisible(false);
                        FlechaLabel8.setVisible(false);
                        nodo9JP.setVisible(false);
                        FlechaLabel9.setVisible(false);
                        nodo10JP.setVisible(false);
                    
                case 5: FlechaLabel5.setVisible(false);
                        nodo6JP.setVisible(false);
                        FlechaLabel6.setVisible(false);
                        nodo7JP.setVisible(false);
                        FlechaLabel7.setVisible(false);
                        nodo8JP.setVisible(false);
                        FlechaLabel8.setVisible(false);
                        nodo9JP.setVisible(false);
                        FlechaLabel9.setVisible(false);
                        nodo10JP.setVisible(false);
                    
                case 6: FlechaLabel6.setVisible(false);
                        nodo7JP.setVisible(false);
                        FlechaLabel7.setVisible(false);
                        nodo8JP.setVisible(false);
                        FlechaLabel8.setVisible(false);
                        nodo9JP.setVisible(false);
                        FlechaLabel9.setVisible(false);
                        nodo10JP.setVisible(false);
                    
                case 7: FlechaLabel7.setVisible(false);
                        nodo8JP.setVisible(false);
                        FlechaLabel8.setVisible(false);
                        nodo9JP.setVisible(false);
                        FlechaLabel9.setVisible(false);
                        nodo10JP.setVisible(false);
                    
                case 8: FlechaLabel8.setVisible(false);
                        nodo9JP.setVisible(false);
                        FlechaLabel9.setVisible(false);
                        nodo10JP.setVisible(false);
                    
                case 9: FlechaLabel9.setVisible(false);
                        nodo10JP.setVisible(false);
                    
                case 10: nodo10JP.setVisible(false);
                      
            }
        }else{
            JOptionPane.showMessageDialog(null, "La lista debe ser mayor a 1");
        }
        System.out.println("-->"+numNodos);
        System.out.println("------->"+nodo);
    }
    
    public void insertaValor(){
        int maximo;
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        nodoVaciadoJTf = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        FlechaLabel1 = new javax.swing.JLabel();
        FlechaLabel2 = new javax.swing.JLabel();
        FlechaLabel3 = new javax.swing.JLabel();
        nodo4JP = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        FlechaLabel4 = new javax.swing.JLabel();
        nodo5JP = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        FlechaLabel5 = new javax.swing.JLabel();
        nodo6JP = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        FlechaLabel6 = new javax.swing.JLabel();
        FlechaLabel7 = new javax.swing.JLabel();
        nodo8JP = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        FlechaLabel8 = new javax.swing.JLabel();
        nodo9JP = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        FlechaLabel9 = new javax.swing.JLabel();
        nodo10JP = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        nodo1JP = new javax.swing.JPanel();
        Nodo1 = new javax.swing.JLabel();
        nodo3JP = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        nodo2JP = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        nodo7JP = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        InsertNodojBtn = new javax.swing.JButton();
        ValoresNodoJTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        TamListJTF = new javax.swing.JTextField();
        checkJBT = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        canvas1 = new java.awt.Canvas();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel1.setText("Nodos máximos: 10");

        jPanel13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(238, 32, 23)));

        jLabel21.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel21.setText("Nodo vaciado");

        jPanel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.setForeground(new java.awt.Color(140, 22, 174));

        nodoVaciadoJTf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nodoVaciadoJTf.setText("0");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nodoVaciadoJTf, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addComponent(nodoVaciadoJTf))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.red));

        FlechaLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/siguiente.png"))); // NOI18N

        FlechaLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/siguiente.png"))); // NOI18N

        FlechaLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/siguiente.png"))); // NOI18N

        nodo4JP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nodo4JP.setMaximumSize(new java.awt.Dimension(30000, 32767));

        jLabel14.setFont(new java.awt.Font("Noto Sans CJK SC", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("004000");

        javax.swing.GroupLayout nodo4JPLayout = new javax.swing.GroupLayout(nodo4JP);
        nodo4JP.setLayout(nodo4JPLayout);
        nodo4JPLayout.setHorizontalGroup(
            nodo4JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nodo4JPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        nodo4JPLayout.setVerticalGroup(
            nodo4JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo4JPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FlechaLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/siguiente.png"))); // NOI18N

        nodo5JP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nodo5JP.setPreferredSize(new java.awt.Dimension(80, 35));

        jLabel15.setFont(new java.awt.Font("Noto Sans CJK SC", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("005000");

        javax.swing.GroupLayout nodo5JPLayout = new javax.swing.GroupLayout(nodo5JP);
        nodo5JP.setLayout(nodo5JPLayout);
        nodo5JPLayout.setHorizontalGroup(
            nodo5JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo5JPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );
        nodo5JPLayout.setVerticalGroup(
            nodo5JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo5JPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15))
        );

        FlechaLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/siguiente.png"))); // NOI18N

        nodo6JP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setFont(new java.awt.Font("Noto Sans CJK SC", 1, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("006000");

        javax.swing.GroupLayout nodo6JPLayout = new javax.swing.GroupLayout(nodo6JP);
        nodo6JP.setLayout(nodo6JPLayout);
        nodo6JPLayout.setHorizontalGroup(
            nodo6JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo6JPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );
        nodo6JPLayout.setVerticalGroup(
            nodo6JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo6JPLayout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(jLabel16))
        );

        FlechaLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/siguiente.png"))); // NOI18N

        FlechaLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/siguiente.png"))); // NOI18N

        nodo8JP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel18.setFont(new java.awt.Font("Noto Sans CJK SC", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("008000");

        javax.swing.GroupLayout nodo8JPLayout = new javax.swing.GroupLayout(nodo8JP);
        nodo8JP.setLayout(nodo8JPLayout);
        nodo8JPLayout.setHorizontalGroup(
            nodo8JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nodo8JPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );
        nodo8JPLayout.setVerticalGroup(
            nodo8JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo8JPLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel18))
        );

        FlechaLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/siguiente.png"))); // NOI18N

        nodo9JP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel19.setFont(new java.awt.Font("Noto Sans CJK SC", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("00900");

        javax.swing.GroupLayout nodo9JPLayout = new javax.swing.GroupLayout(nodo9JP);
        nodo9JP.setLayout(nodo9JPLayout);
        nodo9JPLayout.setHorizontalGroup(
            nodo9JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo9JPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );
        nodo9JPLayout.setVerticalGroup(
            nodo9JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo9JPLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel19))
        );

        FlechaLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/siguiente.png"))); // NOI18N

        nodo10JP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nodo10JP.setPreferredSize(new java.awt.Dimension(80, 35));

        jLabel20.setFont(new java.awt.Font("Noto Sans CJK SC", 1, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("01000");

        javax.swing.GroupLayout nodo10JPLayout = new javax.swing.GroupLayout(nodo10JP);
        nodo10JP.setLayout(nodo10JPLayout);
        nodo10JPLayout.setHorizontalGroup(
            nodo10JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo10JPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );
        nodo10JPLayout.setVerticalGroup(
            nodo10JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo10JPLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        nodo1JP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nodo1JP.setForeground(new java.awt.Color(231, 23, 39));

        Nodo1.setFont(new java.awt.Font("Noto Sans CJK SC", 1, 12)); // NOI18N
        Nodo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nodo1.setText("001000");

        javax.swing.GroupLayout nodo1JPLayout = new javax.swing.GroupLayout(nodo1JP);
        nodo1JP.setLayout(nodo1JPLayout);
        nodo1JPLayout.setHorizontalGroup(
            nodo1JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo1JPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Nodo1)
                .addContainerGap())
        );
        nodo1JPLayout.setVerticalGroup(
            nodo1JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo1JPLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(Nodo1))
        );

        nodo3JP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Noto Sans CJK SC", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("003000");

        javax.swing.GroupLayout nodo3JPLayout = new javax.swing.GroupLayout(nodo3JP);
        nodo3JP.setLayout(nodo3JPLayout);
        nodo3JPLayout.setHorizontalGroup(
            nodo3JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nodo3JPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );
        nodo3JPLayout.setVerticalGroup(
            nodo3JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo3JPLayout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(jLabel13))
        );

        nodo2JP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Noto Sans CJK SC", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("002000");

        javax.swing.GroupLayout nodo2JPLayout = new javax.swing.GroupLayout(nodo2JP);
        nodo2JP.setLayout(nodo2JPLayout);
        nodo2JPLayout.setHorizontalGroup(
            nodo2JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nodo2JPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        nodo2JPLayout.setVerticalGroup(
            nodo2JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo2JPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );

        nodo7JP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel17.setFont(new java.awt.Font("Noto Sans CJK SC", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("007000");

        javax.swing.GroupLayout nodo7JPLayout = new javax.swing.GroupLayout(nodo7JP);
        nodo7JP.setLayout(nodo7JPLayout);
        nodo7JPLayout.setHorizontalGroup(
            nodo7JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo7JPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );
        nodo7JPLayout.setVerticalGroup(
            nodo7JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo7JPLayout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(jLabel17))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nodo1JP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(FlechaLabel1)
                .addGap(1, 1, 1)
                .addComponent(nodo2JP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(FlechaLabel2)
                .addGap(3, 3, 3)
                .addComponent(nodo3JP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(FlechaLabel3)
                .addGap(0, 0, 0)
                .addComponent(nodo4JP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(FlechaLabel4)
                .addGap(1, 1, 1)
                .addComponent(nodo5JP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(FlechaLabel5)
                .addGap(0, 0, 0)
                .addComponent(nodo6JP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(FlechaLabel6)
                .addGap(0, 0, 0)
                .addComponent(nodo7JP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(FlechaLabel7)
                .addGap(0, 0, 0)
                .addComponent(nodo8JP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(FlechaLabel8)
                .addGap(2, 2, 2)
                .addComponent(nodo9JP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(FlechaLabel9)
                .addGap(0, 0, 0)
                .addComponent(nodo10JP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nodo8JP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nodo10JP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FlechaLabel8)
                                .addComponent(nodo9JP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(FlechaLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nodo4JP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nodo6JP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FlechaLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FlechaLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FlechaLabel2)
                                .addComponent(FlechaLabel1)
                                .addComponent(nodo1JP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(FlechaLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nodo3JP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nodo2JP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FlechaLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(nodo5JP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FlechaLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nodo7JP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(52, Short.MAX_VALUE))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel7.setText("Tamaño de la lista: ");

        InsertNodojBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check.png"))); // NOI18N
        InsertNodojBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertNodojBtnActionPerformed(evt);
            }
        });
        InsertNodojBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                InsertNodojBtnKeyReleased(evt);
            }
        });

        ValoresNodoJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValoresNodoJTFActionPerformed(evt);
            }
        });
        ValoresNodoJTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ValoresNodoJTFKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel8.setText("Insertar valor");

        jButton1.setText("Vaciar nodos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TamListJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TamListJTFActionPerformed(evt);
            }
        });
        TamListJTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TamListJTFKeyReleased(evt);
            }
        });

        checkJBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check.png"))); // NOI18N
        checkJBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkJBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ValoresNodoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TamListJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InsertNodojBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkJBT, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(TamListJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkJBT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(ValoresNodoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InsertNodojBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        jButton3.setText("Salir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(439, 439, 439)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12)
                                .addComponent(jButton3)
                                .addGap(30, 30, 30))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkJBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkJBTActionPerformed
        eliminaNodo();
    }//GEN-LAST:event_checkJBTActionPerformed

    private void TamListJTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TamListJTFKeyReleased
        System.out.println("entrooooo");
        validaBotonTamanio();
    }//GEN-LAST:event_TamListJTFKeyReleased

    private void TamListJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TamListJTFActionPerformed
        //System.out.println("entrooooo");
    }//GEN-LAST:event_TamListJTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ValoresNodoJTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValoresNodoJTFKeyReleased
        System.out.println("entroooooo");
        validaBotonNodo();
    }//GEN-LAST:event_ValoresNodoJTFKeyReleased

    private void ValoresNodoJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValoresNodoJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValoresNodoJTFActionPerformed

    private void InsertNodojBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertNodojBtnActionPerformed
        nodo1JP.setVisible(true);
        FlechaLabel1.setVisible(true);
        nodo2JP.setVisible(true);
        FlechaLabel2.setVisible(true);
    }//GEN-LAST:event_InsertNodojBtnActionPerformed

    private void InsertNodojBtnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InsertNodojBtnKeyReleased

    }//GEN-LAST:event_InsertNodojBtnKeyReleased

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
            java.util.logging.Logger.getLogger(ListaLig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaLig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaLig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaLig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaLig().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FlechaLabel1;
    private javax.swing.JLabel FlechaLabel2;
    private javax.swing.JLabel FlechaLabel3;
    private javax.swing.JLabel FlechaLabel4;
    private javax.swing.JLabel FlechaLabel5;
    private javax.swing.JLabel FlechaLabel6;
    private javax.swing.JLabel FlechaLabel7;
    private javax.swing.JLabel FlechaLabel8;
    private javax.swing.JLabel FlechaLabel9;
    private javax.swing.JButton InsertNodojBtn;
    private javax.swing.JLabel Nodo1;
    private javax.swing.JTextField TamListJTF;
    private javax.swing.JTextField ValoresNodoJTF;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton checkJBT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel nodo10JP;
    private javax.swing.JPanel nodo1JP;
    private javax.swing.JPanel nodo2JP;
    private javax.swing.JPanel nodo3JP;
    private javax.swing.JPanel nodo4JP;
    private javax.swing.JPanel nodo5JP;
    private javax.swing.JPanel nodo6JP;
    private javax.swing.JPanel nodo7JP;
    private javax.swing.JPanel nodo8JP;
    private javax.swing.JPanel nodo9JP;
    private javax.swing.JLabel nodoVaciadoJTf;
    // End of variables declaration//GEN-END:variables
}
