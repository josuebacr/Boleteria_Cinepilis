package Version2;

import java.util.List;
import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {

    // Estructuras principales del sistema
    private ListaClientes listaClientes;
    private ListaPeliculasCircular cartelera;
    private GrafoSalas grafoSalas;
    private ListaReservas listaReservas;
    private ListaVentas listaVentas;
    private PilaBoletos pilaBoletos;

    public GUI() {
        initComponents();

        listaClientes = new ListaClientes();
        cartelera = new ListaPeliculasCircular();
        grafoSalas = new GrafoSalas();
        listaReservas = new ListaReservas();
        listaVentas = new ListaVentas();
        pilaBoletos = new PilaBoletos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnAgregarSala = new javax.swing.JButton();
        btnVerSalas = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        btnRegistrarCliente = new javax.swing.JButton();
        btnMostrarClientes = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        jToolBar3 = new javax.swing.JToolBar();
        btnVerCartelera = new javax.swing.JButton();
        btnAgregarPelicula = new javax.swing.JButton();
        btnModificarPelicula = new javax.swing.JButton();
        jToolBar4 = new javax.swing.JToolBar();
        btnRealizarReserva = new javax.swing.JButton();
        btnVerReservas = new javax.swing.JButton();
        btnProcesarVenta = new javax.swing.JButton();
        btnAnularVenta = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);

        btnAgregarSala.setText("Agregar sala");
        btnAgregarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarSalaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAgregarSala);

        btnVerSalas.setText("Ver Salas");
        btnVerSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSalasActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVerSalas);

        jToolBar2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar2.setRollover(true);

        btnRegistrarCliente.setText("Registrar Cliente");
        btnRegistrarCliente.setFocusable(false);
        btnRegistrarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });
        jToolBar2.add(btnRegistrarCliente);

        btnMostrarClientes.setText("Mostrar Clientes");
        btnMostrarClientes.setFocusable(false);
        btnMostrarClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMostrarClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMostrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarClientesActionPerformed(evt);
            }
        });
        jToolBar2.add(btnMostrarClientes);

        btnEliminarCliente.setText("Eliminar Cliente");
        btnEliminarCliente.setFocusable(false);
        btnEliminarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });
        jToolBar2.add(btnEliminarCliente);

        jToolBar3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar3.setRollover(true);

        btnVerCartelera.setText("Ver Cartelera");
        btnVerCartelera.setFocusable(false);
        btnVerCartelera.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerCartelera.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVerCartelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCarteleraActionPerformed(evt);
            }
        });
        jToolBar3.add(btnVerCartelera);

        btnAgregarPelicula.setText("Agregar Pelicula");
        btnAgregarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPeliculaActionPerformed(evt);
            }
        });
        jToolBar3.add(btnAgregarPelicula);

        btnModificarPelicula.setText("Modificar Pelicula");
        btnModificarPelicula.setFocusable(false);
        btnModificarPelicula.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificarPelicula.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPeliculaActionPerformed(evt);
            }
        });
        jToolBar3.add(btnModificarPelicula);

        jToolBar4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar4.setRollover(true);

        btnRealizarReserva.setText("Realizar Reserva");
        btnRealizarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarReservaActionPerformed(evt);
            }
        });
        jToolBar4.add(btnRealizarReserva);

        btnVerReservas.setText("Ver Reservas");
        btnVerReservas.setFocusable(false);
        btnVerReservas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerReservas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVerReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerReservasActionPerformed(evt);
            }
        });
        jToolBar4.add(btnVerReservas);

        btnProcesarVenta.setText("Procesar Venta");
        btnProcesarVenta.setFocusable(false);
        btnProcesarVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProcesarVenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProcesarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarVentaActionPerformed(evt);
            }
        });
        jToolBar4.add(btnProcesarVenta);

        btnAnularVenta.setText("Anular Venta");
        btnAnularVenta.setFocusable(false);
        btnAnularVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAnularVenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAnularVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularVentaActionPerformed(evt);
            }
        });
        jToolBar4.add(btnAnularVenta);

        lbTitulo.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lbTitulo.setText("Boleteria Cinepilis");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boleto.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(lbTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTitulo)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSalaActionPerformed

        try {
            String numeroStr = JOptionPane.showInputDialog(this, "Ingrese el numero de la sala:");
            String cantidadStr = JOptionPane.showInputDialog(this, "Ingrese la cantidad de asientos:");

            if (numeroStr == null || cantidadStr == null) {
                return;
            }

            int numero = Integer.parseInt(numeroStr);
            int cantidadAsientos = Integer.parseInt(cantidadStr);

            // Verificamos si la sala ya existe
            if (grafoSalas.buscarSala(numero) != null) {
                JOptionPane.showMessageDialog(this, "La sala ya existe.");
                return;
            }

            Sala nuevaSala = new Sala(numero, cantidadAsientos);
            grafoSalas.agregarSala(nuevaSala);

            JOptionPane.showMessageDialog(this, "Sala agregada correctamente.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar valores numéricos válidos.");
        }

    }//GEN-LAST:event_btnAgregarSalaActionPerformed

    private void btnVerSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSalasActionPerformed
        String resultado = grafoSalas.mostrarTodasLasSalas();
        JOptionPane.showMessageDialog(this, resultado, "Sala y Cartelera", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnVerSalasActionPerformed

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed

        String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del cliente:");
        String cedula = JOptionPane.showInputDialog(this, "Ingrese la cedula del cliente:");

        if (nombre != null && cedula != null && !nombre.isEmpty() && !cedula.isEmpty()) {
            listaClientes.agregarCliente(new Cliente(nombre, cedula));
            JOptionPane.showMessageDialog(this, "Cliente registrado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Campos invalidos.");
        }
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void btnAgregarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPeliculaActionPerformed

        String titulo = JOptionPane.showInputDialog(this, "Titulo de la pelicula:");
        String genero = JOptionPane.showInputDialog(this, "Genero:");
        String duracionStr = JOptionPane.showInputDialog(this, "Duracion (minutos):");
        String clasificacion = JOptionPane.showInputDialog(this, "Clasificacion (Ej: PG-13):");

        if (titulo != null && genero != null && duracionStr != null && clasificacion != null) {
            try {
                int duracion = Integer.parseInt(duracionStr);
                Pelicula pelicula = new Pelicula(titulo, duracion, genero, clasificacion);
                cartelera.agregarPelicula(pelicula);

                // Puedes asignarla a una sala si deseas
                String numSalaStr = JOptionPane.showInputDialog(this, "¿A qué sala se asigna esta pelicula?");
                int numSala = Integer.parseInt(numSalaStr);
                Sala sala = grafoSalas.buscarSala(numSala);
                if (sala != null) {
                    sala.agregarPelicula(pelicula);
                }

                JOptionPane.showMessageDialog(this, "Pelicula agregada a la cartelera.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Duración invalida.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.");
        }
    }//GEN-LAST:event_btnAgregarPeliculaActionPerformed

    private void btnVerCarteleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCarteleraActionPerformed

        String carteleraStr = cartelera.mostrarCartelera();
        JOptionPane.showMessageDialog(this, carteleraStr, "Cartelera Actual", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnVerCarteleraActionPerformed

    private void btnRealizarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarReservaActionPerformed

        String cedula = JOptionPane.showInputDialog(this, "Ingrese la cedula del cliente:");
        Cliente cliente = listaClientes.buscarCliente(cedula);

        if (cliente == null) {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado.");
            return;
        }

        int numSala = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese numero de sala:"));
        Sala sala = grafoSalas.buscarSala(numSala);

        if (sala == null) {
            JOptionPane.showMessageDialog(this, "Sala no encontrada.");
            return;
        }

        Pelicula pelicula = sala.getCartelera().pelicula;
        Reserva reserva = new Reserva(cliente, pelicula, sala, 6500); // precio fijo

        String asientoStr = JOptionPane.showInputDialog(this, "Ingrese numero de asiento:");
        int asientoNum = Integer.parseInt(asientoStr);

        Asiento asiento = sala.getAsientos().get(asientoNum - 1);
        if (asiento.estaReservado()) {
            JOptionPane.showMessageDialog(this, "Asiento no disponible.");
            return;
        }

        reserva.agregarAsiento(asiento);
        listaReservas.agregarReserva(reserva);

        JOptionPane.showMessageDialog(this, reserva.generarRecibo(), "Reserva confirmada, recuerde procesar la venta  para confirmar su entrada", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnRealizarReservaActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed

        String cedula = JOptionPane.showInputDialog(this, "Ingrese la cedula del cliente a eliminar:");

        if (cedula != null && !cedula.isEmpty()) {
            boolean eliminado = listaClientes.eliminarCliente(cedula);
            if (eliminado) {
                JOptionPane.showMessageDialog(this, "Cliente eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "Cliente no encontrado.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar una cedula valida.");
        }

    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnModificarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPeliculaActionPerformed

        String tituloBuscado = JOptionPane.showInputDialog(this, "Ingrese el titulo de la pelicula a modificar:");

        if (tituloBuscado == null || tituloBuscado.isEmpty()) {
            return;
        }

        Pelicula pelicula = cartelera.buscarPelicula(tituloBuscado);

        if (pelicula == null) {
            JOptionPane.showMessageDialog(this, "Película no encontrada.");
            return;
        }

        // Solicitar nuevos datos
        String nuevoTitulo = JOptionPane.showInputDialog(this, "Nuevo titulo:", pelicula.getTitulo());
        String nuevoGenero = JOptionPane.showInputDialog(this, "Nuevo genero:", pelicula.getGenero());
        String nuevaDuracionStr = JOptionPane.showInputDialog(this, "Nueva duracion (min):", pelicula.getDuracion());
        String nuevaClasificacion = JOptionPane.showInputDialog(this, "Nueva clasificacion:", pelicula.getClasificacion());

        try {
            int nuevaDuracion = Integer.parseInt(nuevaDuracionStr);

            Pelicula nueva = new Pelicula(nuevoTitulo, nuevaDuracion, nuevoGenero, nuevaClasificacion);
            boolean modificado = cartelera.modificarPelicula(tituloBuscado, nueva);

            if (modificado) {
                JOptionPane.showMessageDialog(this, "Pelicula modificada correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "Error al modificar película.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Duracion invalida.");
        }

    }//GEN-LAST:event_btnModificarPeliculaActionPerformed

    private void btnVerReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerReservasActionPerformed

        String reservas = listaReservas.mostrarReservas();

        JOptionPane.showMessageDialog(this, reservas, "Reservas Registradas", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_btnVerReservasActionPerformed

    private void btnAnularVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularVentaActionPerformed

        if (pilaBoletos.estaVacia()) {
            JOptionPane.showMessageDialog(this, "No hay ventas que anular.");
            return;
        }

        Venta anulada = pilaBoletos.desapilar();

        JOptionPane.showMessageDialog(this,
                "Ultima venta anulada:\n\n" + anulada.generarComprobante(),
                "Venta Anulada", JOptionPane.WARNING_MESSAGE);

    }//GEN-LAST:event_btnAnularVentaActionPerformed

    private void btnProcesarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarVentaActionPerformed

        String cedula = JOptionPane.showInputDialog(this, "Ingrese la cedula del cliente:");
        Cliente cliente = listaClientes.buscarCliente(cedula);

        if (cliente == null) {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado.");
            return;
        }

        String[] opciones = {"1", "2"};
        int numSala = Integer.parseInt((String) JOptionPane.showInputDialog(this, "Seleccione una sala:", "Salas", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]));
        Sala sala = grafoSalas.buscarSala(numSala);

        Pelicula pelicula = sala.getCartelera().pelicula;
        String asientoStr = JOptionPane.showInputDialog(this, "Ingrese numero de asiento:");
        int asientoNum = Integer.parseInt(asientoStr);

        Asiento asiento = sala.getAsientos().get(asientoNum - 1);

        if (asiento.estaReservado()) {
            JOptionPane.showMessageDialog(this, "El asiento ya esta reservado.");
            return;
        }

        List<Asiento> lista = new java.util.ArrayList<>();
        asiento.reservar();
        lista.add(asiento);

        Venta venta = new Venta(cliente, pelicula, sala, lista, 5450);
        listaVentas.agregarVenta(venta);
        pilaBoletos.apilar(venta);

        JOptionPane.showMessageDialog(this, venta.generarComprobante(), "Venta procesada exitosamente, gracias por elegir siempre Cinepilis", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnProcesarVentaActionPerformed

    private void btnMostrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarClientesActionPerformed

        String lista = listaClientes.mostrarClientes(); // Llama al metodo de la clase
        JOptionPane.showMessageDialog(this, lista, "Lista de Clientes", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnMostrarClientesActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPelicula;
    private javax.swing.JButton btnAgregarSala;
    private javax.swing.JButton btnAnularVenta;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnModificarPelicula;
    private javax.swing.JButton btnMostrarClientes;
    private javax.swing.JButton btnProcesarVenta;
    private javax.swing.JButton btnRealizarReserva;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnVerCartelera;
    private javax.swing.JButton btnVerReservas;
    private javax.swing.JButton btnVerSalas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
