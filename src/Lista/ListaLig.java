package Lista;

import java.awt.GridLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        setTitle("PROYECTO FINAL ESTRUCTURAS DE DATOS");
        this.setLocationRelativeTo(null);
        setResizable(false);
    }
  
    /////////////////////////////////////////////////////////Metodos de la lista ligada
    int tama=0,tamaaux=0,banderatamanio=0,t,valor,eliminar,banderalistallena=0;
    String numNodos;
    String num;
    
    private Nodo inicio;
    private int tamanio;
 
    public void Lista(){
        inicio = null;
        tamanio = 0;
    }

    public boolean esVacia(){
        return inicio == null;
    }

    public int getTamanio(){
        return tamanio;
    }
    
    public void agregarAlInicio(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
        } else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tamanio++;
    }

    public int getValor(int posicion) throws Exception{
        if(posicion>=0 && posicion<tamanio){
            if (posicion == 0) {
                return inicio.getValor();
            }else{
                Nodo aux = inicio;
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                return aux.getValor();
            }
        } else {
            throw new Exception("Posicion inexistente en la lista.");
        }
    }

 
    public void editarPorPosicion(int posicion , int valor){
        if(posicion>=0 && posicion<tamanio){
            if(posicion == 0){
                inicio.setValor(valor);
            }else{
                Nodo aux = inicio;
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                    aux.setValor(valor);
            }
        }
    }

    public void removerPorPosicion(int posicion){
        if(posicion>=0 && posicion<tamanio){
            if(posicion == 0){
                inicio = inicio.getSiguiente();
            }else{
                Nodo aux = inicio;
                for (int i = 0; i < posicion-1; i++) {
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente();
                aux.setSiguiente(siguiente.getSiguiente());
            }
            tamanio--;
        }
    }

    public void listar(){
        if (!esVacia()) {
            Nodo aux = inicio;
                switch(tama){
                    case 2:    
                        Nodo1.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente(); 
                        Nodo2.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        break;
                    case 3:    
                        Nodo1.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente(); 
                        Nodo2.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        Nodo3.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        break;
                    case 4:    
                         Nodo1.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente(); 
                        Nodo2.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        Nodo3.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        Nodo4.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        break;
                    case 5:    
                        Nodo1.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente(); 
                        Nodo2.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        Nodo3.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        Nodo4.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente(); 
                        Nodo5.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        break;
                    case 6:    
                        Nodo1.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente(); 
                        Nodo2.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        Nodo3.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        Nodo4.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente(); 
                        Nodo5.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente(); 
                        Nodo6.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        break;
                    case 7:    
                        Nodo1.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente(); 
                        Nodo2.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        Nodo3.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        Nodo4.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente(); 
                        Nodo5.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente(); 
                        Nodo6.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente(); 
                        Nodo7.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        break;
                     case 8:    
                        Nodo1.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente(); 
                        Nodo2.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        Nodo3.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        Nodo4.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente(); 
                        Nodo5.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente(); 
                        Nodo6.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente(); 
                        Nodo7.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        Nodo8.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        break;
                     case 9:    
                        Nodo1.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente(); 
                        Nodo2.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        Nodo3.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        Nodo4.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente(); 
                        Nodo5.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente(); 
                        Nodo6.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente(); 
                        Nodo7.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        Nodo8.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        Nodo9.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        break;
                     case 10:    
                        Nodo1.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente(); 
                        Nodo2.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        Nodo3.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        Nodo4.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente(); 
                        Nodo5.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente(); 
                        Nodo6.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente(); 
                        Nodo7.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        Nodo8.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        Nodo9.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                        Nodo10.setText("[ " + aux.getValor() + " ]");
                        aux = aux.getSiguiente();
                         break;
                        
                }
            }
        
        }
    
    
   public void ordena() throws Exception {
       
        int valor1,valor2,posicion1=0,posicion2=1;
        Nodo ini =inicio,aux =ini.getSiguiente();
	   
        while(aux!=null) {
                valor1=ini.getValor();
                valor2=aux.getValor();
            if(valor1<valor2) {

                editarPorPosicion(posicion2, valor1);
                editarPorPosicion(posicion1, valor2);
                listar();                   
            }
                ini=aux;
                aux=ini.getSiguiente();
                posicion1=posicion1+1;
                posicion2=posicion2+1;
        }
   }
   
   public void ordenaDespuesDeEliminar() throws Exception {
	
        int valor1,valor2,posicion1=0,posicion2=1;
	Nodo ini =inicio,aux =ini.getSiguiente();
	   
	while(aux!=null) {
                valor1=ini.getValor();
                valor2=aux.getValor();
            if(valor1<valor2) {

                editarPorPosicion(posicion2, valor1);
                editarPorPosicion(posicion1, valor2);
            }
                ini=aux;
                aux=ini.getSiguiente();
                posicion1=posicion1+1;
                posicion2=posicion2+1;
        }
   }
   
   public void eliminaFinal(){
       
    if (inicio==null)
        System.out.print("Lista Vacía...\n");
    else{
          Nodo aux=inicio; 
          for(int i=1;i<tamanio;i++)
               aux=aux.getSiguiente();
          Vaciado.setText("[ " + aux.getValor() + " ]");
          aux.setValor(999999);
        }
   }
   
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
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
    
    
    public void eliminaNodos(){
        
        numNodos = TamListJTF.getText();
        t = Integer.parseInt(numNodos);
        if(banderatamanio==0){
        if((t > 1&& t< 11)){
            switch(t){
              
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
                        tama=2;
                        tamaaux=tama;
                        eliminar=tama;
                        break;
                                              
                
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
                        tama=3;
                        tamaaux=tama;
                        eliminar=tama;
                        break;
                
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
                        tama=4;
                        tamaaux=tama;
                        eliminar=tama;
                        break;
                    
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
                        tama=5;
                        tamaaux=tama;
                        eliminar=tama;
                        break;
                    
                case 6: FlechaLabel6.setVisible(false);
                        nodo7JP.setVisible(false);
                        FlechaLabel7.setVisible(false);
                        nodo8JP.setVisible(false);
                        FlechaLabel8.setVisible(false);
                        nodo9JP.setVisible(false);
                        FlechaLabel9.setVisible(false);
                        nodo10JP.setVisible(false);
                        tama=6;
                        tamaaux=tama;
                        eliminar=tama;
                        break;
                        
                case 7: FlechaLabel7.setVisible(false);
                        nodo8JP.setVisible(false);
                        FlechaLabel8.setVisible(false);
                        nodo9JP.setVisible(false);
                        FlechaLabel9.setVisible(false);
                        nodo10JP.setVisible(false);
                        tama=7;
                        tamaaux=tama;
                        eliminar=tama;
                        break;
                        
                case 8: FlechaLabel8.setVisible(false);
                        nodo9JP.setVisible(false);
                        FlechaLabel9.setVisible(false);
                        nodo10JP.setVisible(false);
                        tama=8;
                        tamaaux=tama;
                        eliminar=tama;
                        break;
                    
                case 9: FlechaLabel9.setVisible(false);
                        nodo10JP.setVisible(false);
                        tama=9;
                        tamaaux=tama;
                        eliminar=tama;
                        break;
                    
                case 10: nodo10JP.setVisible(false);
                        tama=10;
                        tamaaux=tama;
                        eliminar=tama;
                        break;
                      
            }
        }else{
             JOptionPane.showMessageDialog(null, "La lista debe ser mayor a 1 & menor o igual a 10");
            }
        }else{
        JOptionPane.showMessageDialog(null,"El tamaño de la lista no se puede cambiar");
        }
    }
    
    public void insertaValor() throws Exception{
        num = ValoresNodoJTF.getText();
        valor = Integer.parseInt(num);
        
        if(tamaaux>0){
        editarPorPosicion(0,valor);
        tamaaux=tamaaux-1;
        ordena();
        }else{
            if(tama==0){
                JOptionPane.showMessageDialog(null, "Primero Proporcione el tamaño de la lista");
            }else{
            JOptionPane.showMessageDialog(null, "La Lista ya esta llena");
            }
        }
    }
    
    public void reinicaLista(){
        FlechaLabel2.setVisible(true);
        nodo3JP.setVisible(true);
        FlechaLabel3.setVisible(true);
        nodo4JP.setVisible(true);
        FlechaLabel4.setVisible(true);
        nodo5JP.setVisible(true);
        FlechaLabel5.setVisible(true);
        nodo6JP.setVisible(true);
        FlechaLabel6.setVisible(true);
        nodo7JP.setVisible(true);
        FlechaLabel7.setVisible(true);
        nodo8JP.setVisible(true);
        FlechaLabel8.setVisible(true);
        nodo9JP.setVisible(true);
        FlechaLabel9.setVisible(true);
        nodo10JP.setVisible(true);
        Nodo1.setText(" ");
        Nodo2.setText(" ");
        Nodo3.setText(" ");
        Nodo4.setText(" ");
        Nodo5.setText(" ");
        Nodo6.setText(" ");
        Nodo7.setText(" ");
        Nodo8.setText(" ");
        Nodo9.setText(" ");
        Nodo10.setText(" ");
        Vaciado.setText(" ");
        banderatamanio=0;
        tama=0;
        tamaaux=0;
        eliminar=0;
        t=0;
        inicio = null;
        tamanio = 0;
        valor=0;
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
        Vaciado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        FlechaLabel1 = new javax.swing.JLabel();
        FlechaLabel2 = new javax.swing.JLabel();
        FlechaLabel3 = new javax.swing.JLabel();
        nodo4JP = new javax.swing.JPanel();
        Nodo4 = new javax.swing.JLabel();
        FlechaLabel4 = new javax.swing.JLabel();
        nodo5JP = new javax.swing.JPanel();
        Nodo5 = new javax.swing.JLabel();
        FlechaLabel5 = new javax.swing.JLabel();
        nodo6JP = new javax.swing.JPanel();
        Nodo6 = new javax.swing.JLabel();
        FlechaLabel6 = new javax.swing.JLabel();
        FlechaLabel7 = new javax.swing.JLabel();
        nodo8JP = new javax.swing.JPanel();
        Nodo8 = new javax.swing.JLabel();
        FlechaLabel8 = new javax.swing.JLabel();
        nodo9JP = new javax.swing.JPanel();
        Nodo9 = new javax.swing.JLabel();
        FlechaLabel9 = new javax.swing.JLabel();
        nodo10JP = new javax.swing.JPanel();
        Nodo10 = new javax.swing.JLabel();
        nodo1JP = new javax.swing.JPanel();
        Nodo1 = new javax.swing.JLabel();
        nodo3JP = new javax.swing.JPanel();
        Nodo3 = new javax.swing.JLabel();
        nodo2JP = new javax.swing.JPanel();
        Nodo2 = new javax.swing.JLabel();
        nodo7JP = new javax.swing.JPanel();
        Nodo7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        InsertNodojBtn = new javax.swing.JButton();
        ValoresNodoJTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        VaciarNodosJbtn = new javax.swing.JButton();
        TamListJTF = new javax.swing.JTextField();
        checkJBT = new javax.swing.JButton();
        ReiniciarJbtn = new javax.swing.JButton();
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

        Vaciado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Vaciado, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Vaciado)
                .addContainerGap())
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
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.red));

        FlechaLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/siguiente.png"))); // NOI18N

        FlechaLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/siguiente.png"))); // NOI18N

        FlechaLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/siguiente.png"))); // NOI18N

        nodo4JP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nodo4JP.setMaximumSize(new java.awt.Dimension(30000, 32767));

        Nodo4.setFont(new java.awt.Font("Noto Sans CJK SC", 1, 12)); // NOI18N
        Nodo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout nodo4JPLayout = new javax.swing.GroupLayout(nodo4JP);
        nodo4JP.setLayout(nodo4JPLayout);
        nodo4JPLayout.setHorizontalGroup(
            nodo4JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nodo4JPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nodo4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );
        nodo4JPLayout.setVerticalGroup(
            nodo4JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo4JPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nodo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FlechaLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/siguiente.png"))); // NOI18N

        nodo5JP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nodo5JP.setPreferredSize(new java.awt.Dimension(80, 35));

        Nodo5.setFont(new java.awt.Font("Noto Sans CJK SC", 1, 12)); // NOI18N
        Nodo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout nodo5JPLayout = new javax.swing.GroupLayout(nodo5JP);
        nodo5JP.setLayout(nodo5JPLayout);
        nodo5JPLayout.setHorizontalGroup(
            nodo5JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo5JPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nodo5, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );
        nodo5JPLayout.setVerticalGroup(
            nodo5JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo5JPLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Nodo5))
        );

        FlechaLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/siguiente.png"))); // NOI18N

        nodo6JP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Nodo6.setFont(new java.awt.Font("Noto Sans CJK SC", 1, 12)); // NOI18N
        Nodo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout nodo6JPLayout = new javax.swing.GroupLayout(nodo6JP);
        nodo6JP.setLayout(nodo6JPLayout);
        nodo6JPLayout.setHorizontalGroup(
            nodo6JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo6JPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nodo6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );
        nodo6JPLayout.setVerticalGroup(
            nodo6JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo6JPLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Nodo6)
                .addGap(32, 32, 32))
        );

        FlechaLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/siguiente.png"))); // NOI18N

        FlechaLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/siguiente.png"))); // NOI18N

        nodo8JP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Nodo8.setFont(new java.awt.Font("Noto Sans CJK SC", 1, 12)); // NOI18N
        Nodo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout nodo8JPLayout = new javax.swing.GroupLayout(nodo8JP);
        nodo8JP.setLayout(nodo8JPLayout);
        nodo8JPLayout.setHorizontalGroup(
            nodo8JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nodo8JPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nodo8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );
        nodo8JPLayout.setVerticalGroup(
            nodo8JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo8JPLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Nodo8))
        );

        FlechaLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/siguiente.png"))); // NOI18N

        nodo9JP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Nodo9.setFont(new java.awt.Font("Noto Sans CJK SC", 1, 12)); // NOI18N
        Nodo9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout nodo9JPLayout = new javax.swing.GroupLayout(nodo9JP);
        nodo9JP.setLayout(nodo9JPLayout);
        nodo9JPLayout.setHorizontalGroup(
            nodo9JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo9JPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nodo9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );
        nodo9JPLayout.setVerticalGroup(
            nodo9JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo9JPLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Nodo9))
        );

        FlechaLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/siguiente.png"))); // NOI18N

        nodo10JP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nodo10JP.setPreferredSize(new java.awt.Dimension(80, 35));

        Nodo10.setFont(new java.awt.Font("Noto Sans CJK SC", 1, 12)); // NOI18N
        Nodo10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout nodo10JPLayout = new javax.swing.GroupLayout(nodo10JP);
        nodo10JP.setLayout(nodo10JPLayout);
        nodo10JPLayout.setHorizontalGroup(
            nodo10JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Nodo10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );
        nodo10JPLayout.setVerticalGroup(
            nodo10JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo10JPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Nodo10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        nodo1JP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nodo1JP.setForeground(new java.awt.Color(231, 23, 39));

        Nodo1.setFont(new java.awt.Font("Noto Sans CJK SC", 1, 12)); // NOI18N
        Nodo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout nodo1JPLayout = new javax.swing.GroupLayout(nodo1JP);
        nodo1JP.setLayout(nodo1JPLayout);
        nodo1JPLayout.setHorizontalGroup(
            nodo1JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo1JPLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(Nodo1)
                .addContainerGap())
        );
        nodo1JPLayout.setVerticalGroup(
            nodo1JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo1JPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Nodo1))
        );

        nodo3JP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Nodo3.setFont(new java.awt.Font("Noto Sans CJK SC", 1, 12)); // NOI18N
        Nodo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout nodo3JPLayout = new javax.swing.GroupLayout(nodo3JP);
        nodo3JP.setLayout(nodo3JPLayout);
        nodo3JPLayout.setHorizontalGroup(
            nodo3JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nodo3JPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nodo3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );
        nodo3JPLayout.setVerticalGroup(
            nodo3JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo3JPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nodo3))
        );

        nodo2JP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Nodo2.setFont(new java.awt.Font("Noto Sans CJK SC", 1, 12)); // NOI18N
        Nodo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout nodo2JPLayout = new javax.swing.GroupLayout(nodo2JP);
        nodo2JP.setLayout(nodo2JPLayout);
        nodo2JPLayout.setHorizontalGroup(
            nodo2JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nodo2JPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nodo2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );
        nodo2JPLayout.setVerticalGroup(
            nodo2JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo2JPLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Nodo2))
        );

        nodo7JP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Nodo7.setFont(new java.awt.Font("Noto Sans CJK SC", 1, 12)); // NOI18N
        Nodo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout nodo7JPLayout = new javax.swing.GroupLayout(nodo7JP);
        nodo7JP.setLayout(nodo7JPLayout);
        nodo7JPLayout.setHorizontalGroup(
            nodo7JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo7JPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nodo7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );
        nodo7JPLayout.setVerticalGroup(
            nodo7JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodo7JPLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Nodo7)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nodo1JP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
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
                .addGap(0, 0, 0)
                .addComponent(FlechaLabel4)
                .addGap(0, 0, 0)
                .addComponent(nodo5JP, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(FlechaLabel5)
                .addGap(0, 0, 0)
                .addComponent(nodo6JP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(FlechaLabel6)
                .addGap(0, 0, 0)
                .addComponent(nodo7JP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
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
                .addComponent(nodo10JP, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nodo3JP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nodo1JP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FlechaLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FlechaLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FlechaLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nodo9JP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nodo8JP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nodo10JP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FlechaLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nodo7JP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nodo4JP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nodo6JP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FlechaLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nodo5JP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                .addComponent(nodo2JP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FlechaLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FlechaLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FlechaLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FlechaLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(52, Short.MAX_VALUE))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 1, 14))); // NOI18N

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

        VaciarNodosJbtn.setText("Vaciar nodos");
        VaciarNodosJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VaciarNodosJbtnActionPerformed(evt);
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

        ReiniciarJbtn.setText("Reiniciar");
        ReiniciarJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarJbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(VaciarNodosJbtn)
                        .addGap(27, 27, 27)
                        .addComponent(ReiniciarJbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ValoresNodoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TamListJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InsertNodojBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkJBT, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 60, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VaciarNodosJbtn)
                    .addComponent(ReiniciarJbtn))
                .addGap(22, 22, 22))
        );

        jButton3.setText("Salir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(439, 439, 439)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(409, 409, 409)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton3)
                .addGap(30, 30, 30))
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
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkJBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkJBTActionPerformed
        eliminaNodos();
        if(banderatamanio==0){
            for(int i=0;i<tama;i++) {
            agregarAlInicio(999999);
            banderatamanio=1;
                }
             listar();
            }
        
    }//GEN-LAST:event_checkJBTActionPerformed

    private void TamListJTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TamListJTFKeyReleased
        //System.out.println("entrooooo");
       validaBotonTamanio();
    }//GEN-LAST:event_TamListJTFKeyReleased

    private void TamListJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TamListJTFActionPerformed
        //System.out.println("entrooooo");
    }//GEN-LAST:event_TamListJTFActionPerformed

    private void VaciarNodosJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VaciarNodosJbtnActionPerformed
       if(tama==0){
                JOptionPane.showMessageDialog(null, "Primero Proporcione el tamaño de la lista");
        }
        if(tamaaux==0){
           if(eliminar>0){
            eliminaFinal();
            try {
            for(int i=0;i<10;i++){
            ordenaDespuesDeEliminar();}
            listar();
            } catch (Exception ex) {
            Logger.getLogger(ListaLig.class.getName()).log(Level.SEVERE, null, ex);
                }
            eliminar--;
           }
       }else{
            JOptionPane.showMessageDialog(null, "Primero llene la lista");
            }
       if(eliminar==0){
           tamaaux=tama;
           eliminar=tama;
           Vaciado.setText(" ");
            }
          
    }//GEN-LAST:event_VaciarNodosJbtnActionPerformed

    private void ValoresNodoJTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValoresNodoJTFKeyReleased
        //System.out.println("entroooooo");
        validaBotonNodo();
    }//GEN-LAST:event_ValoresNodoJTFKeyReleased

    private void ValoresNodoJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValoresNodoJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValoresNodoJTFActionPerformed

    private void InsertNodojBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertNodojBtnActionPerformed
        try {
            insertaValor();
            listar();
        } catch (Exception ex) {
            Logger.getLogger(ListaLig.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_InsertNodojBtnActionPerformed

    private void InsertNodojBtnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InsertNodojBtnKeyReleased

    }//GEN-LAST:event_InsertNodojBtnKeyReleased

    private void ReiniciarJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarJbtnActionPerformed
        reinicaLista();
        TamListJTF.setText("");
        ValoresNodoJTF.setText("");
    }//GEN-LAST:event_ReiniciarJbtnActionPerformed

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
    private javax.swing.JLabel Nodo10;
    private javax.swing.JLabel Nodo2;
    private javax.swing.JLabel Nodo3;
    private javax.swing.JLabel Nodo4;
    private javax.swing.JLabel Nodo5;
    private javax.swing.JLabel Nodo6;
    private javax.swing.JLabel Nodo7;
    private javax.swing.JLabel Nodo8;
    private javax.swing.JLabel Nodo9;
    private javax.swing.JButton ReiniciarJbtn;
    private javax.swing.JTextField TamListJTF;
    private javax.swing.JLabel Vaciado;
    private javax.swing.JButton VaciarNodosJbtn;
    private javax.swing.JTextField ValoresNodoJTF;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton checkJBT;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
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
    // End of variables declaration//GEN-END:variables
}
