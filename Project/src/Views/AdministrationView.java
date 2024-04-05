/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controller.UserController;
import Models.User;
import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class AdministrationView extends javax.swing.JFrame {

    UserController control;
    /**
     * Creates new form Administration
     */
    public AdministrationView() {
        initComponents();
        control = new UserController();
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
        jPasswordField1 = new javax.swing.JPasswordField();
        PanelPrincipal = new javax.swing.JTabbedPane();
        PanelAdminHabita = new javax.swing.JPanel();
        PanelGestionarUsuario = new javax.swing.JPanel();
        PanelDentroGestion1 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        PanelDentroGestion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtAge = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblAddress = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblUsername = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblName1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        PanelAdminHotel = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(4, 27, 43));
        PanelPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setFont(new java.awt.Font("Lohit Devanagari", 1, 15)); // NOI18N

        javax.swing.GroupLayout PanelAdminHabitaLayout = new javax.swing.GroupLayout(PanelAdminHabita);
        PanelAdminHabita.setLayout(PanelAdminHabitaLayout);
        PanelAdminHabitaLayout.setHorizontalGroup(
            PanelAdminHabitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 885, Short.MAX_VALUE)
        );
        PanelAdminHabitaLayout.setVerticalGroup(
            PanelAdminHabitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 747, Short.MAX_VALUE)
        );

        PanelPrincipal.addTab("Administrar Habitaciones", PanelAdminHabita);

        PanelDentroGestion1.setBackground(new java.awt.Color(0, 0, 102));
        PanelDentroGestion1.setPreferredSize(new java.awt.Dimension(400, 500));

        btnDelete.setBackground(new java.awt.Color(0, 153, 255));
        btnDelete.setFont(new java.awt.Font("Lohit Devanagari", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("BORRAR");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lohit Devanagari", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gestion De Usuarios");

        btnRegister.setBackground(new java.awt.Color(0, 153, 255));
        btnRegister.setFont(new java.awt.Font("Lohit Devanagari", 1, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText(" REGISTRAR USUARIO");
        btnRegister.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 153, 255));
        btnSearch.setFont(new java.awt.Font("Lohit Devanagari", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("BUSCAR");
        btnSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 153, 255));
        btnUpdate.setFont(new java.awt.Font("Lohit Devanagari", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("ACTUALIZAR");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDentroGestion1Layout = new javax.swing.GroupLayout(PanelDentroGestion1);
        PanelDentroGestion1.setLayout(PanelDentroGestion1Layout);
        PanelDentroGestion1Layout.setHorizontalGroup(
            PanelDentroGestion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDentroGestion1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(PanelDentroGestion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(120, 120, 120))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDentroGestion1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap())
        );
        PanelDentroGestion1Layout.setVerticalGroup(
            PanelDentroGestion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDentroGestion1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelDentroGestion.setBackground(new java.awt.Color(4, 27, 43));
        PanelDentroGestion.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo_mid.jpg"))); // NOI18N

        lblName.setFont(new java.awt.Font("Lohit Devanagari", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("NOMBRE");

        txtName.setBackground(new java.awt.Color(0, 0, 102));
        txtName.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(73, 181, 172));
        txtName.setBorder(null);
        txtName.setCaretColor(new java.awt.Color(73, 181, 172));

        jSeparator1.setBackground(new java.awt.Color(0, 153, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));

        jSeparator2.setBackground(new java.awt.Color(0, 153, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));

        txtAge.setBackground(new java.awt.Color(0, 0, 102));
        txtAge.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txtAge.setForeground(new java.awt.Color(73, 181, 172));
        txtAge.setBorder(null);
        txtAge.setCaretColor(new java.awt.Color(73, 181, 172));
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeKeyTyped(evt);
            }
        });

        lblEdad.setFont(new java.awt.Font("Lohit Devanagari", 1, 18)); // NOI18N
        lblEdad.setForeground(new java.awt.Color(255, 255, 255));
        lblEdad.setText("EDAD");

        txtAddress.setBackground(new java.awt.Color(0, 0, 102));
        txtAddress.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(73, 181, 172));
        txtAddress.setBorder(null);
        txtAddress.setCaretColor(new java.awt.Color(73, 181, 172));

        jSeparator3.setBackground(new java.awt.Color(0, 153, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 153, 255));

        lblAddress.setFont(new java.awt.Font("Lohit Devanagari", 1, 18)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("DIRECCIÓN");

        txtPhoneNumber.setBackground(new java.awt.Color(0, 0, 102));
        txtPhoneNumber.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txtPhoneNumber.setForeground(new java.awt.Color(73, 181, 172));
        txtPhoneNumber.setBorder(null);
        txtPhoneNumber.setCaretColor(new java.awt.Color(73, 181, 172));

        lblPhoneNumber.setFont(new java.awt.Font("Lohit Devanagari", 1, 18)); // NOI18N
        lblPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber.setText("TELEFONO");

        txtUsername.setBackground(new java.awt.Color(0, 0, 102));
        txtUsername.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(73, 181, 172));
        txtUsername.setBorder(null);
        txtUsername.setCaretColor(new java.awt.Color(73, 181, 172));

        jSeparator5.setBackground(new java.awt.Color(0, 153, 255));
        jSeparator5.setForeground(new java.awt.Color(0, 153, 255));

        lblUsername.setFont(new java.awt.Font("Lohit Devanagari", 1, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("NOMBRE DE USUARIO");

        jSeparator6.setBackground(new java.awt.Color(0, 153, 255));
        jSeparator6.setForeground(new java.awt.Color(0, 153, 255));

        txtEmail.setBackground(new java.awt.Color(0, 0, 102));
        txtEmail.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(73, 181, 172));
        txtEmail.setBorder(null);
        txtEmail.setCaretColor(new java.awt.Color(73, 181, 172));

        lblEmail.setFont(new java.awt.Font("Lohit Devanagari", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("CORREO ELECTRONICO");

        lblPassword.setFont(new java.awt.Font("Lohit Devanagari", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("CONTRASEÑA");

        txtID.setBackground(new java.awt.Color(0, 0, 102));
        txtID.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txtID.setForeground(new java.awt.Color(73, 181, 172));
        txtID.setBorder(null);
        txtID.setCaretColor(new java.awt.Color(73, 181, 172));

        lblName1.setFont(new java.awt.Font("Lohit Devanagari", 1, 18)); // NOI18N
        lblName1.setForeground(new java.awt.Color(255, 255, 255));
        lblName1.setText("ID");

        jSeparator4.setBackground(new java.awt.Color(0, 153, 255));
        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));

        txtPassword.setBackground(new java.awt.Color(0, 0, 102));
        txtPassword.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(73, 181, 172));
        txtPassword.setBorder(null);
        txtPassword.setCaretColor(new java.awt.Color(73, 181, 172));

        jSeparator8.setBackground(new java.awt.Color(0, 153, 255));
        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));

        jSeparator9.setBackground(new java.awt.Color(0, 153, 255));
        jSeparator9.setForeground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout PanelDentroGestionLayout = new javax.swing.GroupLayout(PanelDentroGestion);
        PanelDentroGestion.setLayout(PanelDentroGestionLayout);
        PanelDentroGestionLayout.setHorizontalGroup(
            PanelDentroGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDentroGestionLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanelDentroGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelDentroGestionLayout.createSequentialGroup()
                        .addGroup(PanelDentroGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName1)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEdad)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNumber))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        PanelDentroGestionLayout.setVerticalGroup(
            PanelDentroGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDentroGestionLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PanelDentroGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDentroGestionLayout.createSequentialGroup()
                        .addComponent(lblName1)
                        .addGap(5, 5, 5)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblName))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblEdad)
                .addGap(5, 5, 5)
                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblAddress)
                .addGap(5, 5, 5)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPhoneNumber)
                .addGap(4, 4, 4)
                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblEmail)
                .addGap(5, 5, 5)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout PanelGestionarUsuarioLayout = new javax.swing.GroupLayout(PanelGestionarUsuario);
        PanelGestionarUsuario.setLayout(PanelGestionarUsuarioLayout);
        PanelGestionarUsuarioLayout.setHorizontalGroup(
            PanelGestionarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGestionarUsuarioLayout.createSequentialGroup()
                .addGroup(PanelGestionarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelGestionarUsuarioLayout.createSequentialGroup()
                        .addGap(485, 485, 485)
                        .addComponent(PanelDentroGestion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelGestionarUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelDentroGestion, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelGestionarUsuarioLayout.setVerticalGroup(
            PanelGestionarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGestionarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelGestionarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelDentroGestion1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                    .addComponent(PanelDentroGestion, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        PanelPrincipal.addTab("Gestionar Usuarios", PanelGestionarUsuario);

        javax.swing.GroupLayout PanelAdminHotelLayout = new javax.swing.GroupLayout(PanelAdminHotel);
        PanelAdminHotel.setLayout(PanelAdminHotelLayout);
        PanelAdminHotelLayout.setHorizontalGroup(
            PanelAdminHotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 885, Short.MAX_VALUE)
        );
        PanelAdminHotelLayout.setVerticalGroup(
            PanelAdminHotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 747, Short.MAX_VALUE)
        );

        PanelPrincipal.addTab("Administrar Hoteles", PanelAdminHotel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeKeyTyped

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int id =Integer.parseInt(txtID.getText());
        control.delete(id);
        clean();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        
        String name = txtName.getText();
        String username = txtUsername.getText();
        int age = Integer.parseInt(txtAge.getText());
        String email = txtEmail.getText();
        String password = (txtPassword.getText());
        String address = txtAddress.getText();
        String phone_number = txtPhoneNumber.getText();
        User user = new User(name, age, username, password, email, phone_number, 2, address);
        control.insert(user);
        clean();
        JOptionPane.showMessageDialog(null, "Ha creado el usuar de: "+name);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        int id =Integer.parseInt(txtID.getText());
        User user=control.searchAdmin(id);
        if(user !=null){
        txtName.setText(user.getName());
        txtAge.setText(Integer.toString(user.getAge()));
        txtUsername.setText(user.getUsername());
        txtPassword.setText(user.getPassword());
        txtEmail.setText(user.getEmail());
        txtPhoneNumber.setText(user.getCountDetails());
        txtAddress.setText(user.getAddress());
        }else{
        JOptionPane.showMessageDialog(null, "No se ha encontrado al usuario con esa id ");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed
    
    private void clean(){
        txtID.setText(" ");
        txtName.setText("");
        txtAge.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtEmail.setText("");
        txtPhoneNumber.setText("");
        txtAddress.setText("");
    
    }
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String name = txtName.getText();
        String username = txtUsername.getText();
        int age = Integer.parseInt(txtAge.getText());
        String email = txtEmail.getText();
        String password = (txtPassword.getText());
        String address = txtAddress.getText();
        String phone_number = txtPhoneNumber.getText();
        User user = new User(name, age, username, password, email, phone_number, 2, address);
        control.update(user);
        clean();



        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(AdministrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministrationView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAdminHabita;
    private javax.swing.JPanel PanelAdminHotel;
    private javax.swing.JPanel PanelDentroGestion;
    private javax.swing.JPanel PanelDentroGestion1;
    private javax.swing.JPanel PanelGestionarUsuario;
    private javax.swing.JTabbedPane PanelPrincipal;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}