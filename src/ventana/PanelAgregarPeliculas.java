package ventana;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//import ventana.Peliculas;

import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.TreeSet;
//import java.awt.TextField;
import java.awt.event.ActionEvent;

public class PanelAgregarPeliculas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldNombre;
	private JLabel lblId;
	private JLabel lblNombre;
	private JLabel lblGenero;
	private JLabel lblNumeroId;
	private JComboBox<Genero> cbGeneros;
	private JButton btnAceptar;
	private JList list;
	private TreeSet<Peliculas> ListPeliculas = new TreeSet<Peliculas>();
	private DefaultListModel<Peliculas> dlModel;
	
	
	
	public void AgregarPeliculas() {
		setLayout(null);
		
		lblId = new JLabel("ID");
		lblId.setBounds(71, 26, 69, 20);
		add(lblId);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(71, 75, 69, 20);
		add(lblNombre);
		
		lblGenero = new JLabel("Genero");
		lblGenero.setBounds(71, 134, 69, 20);
		add(lblGenero);
				
		lblNumeroId = new JLabel();
		lblNumeroId.setBounds(218, 26, 69, 20);
		if(Peliculas.get_Id() == 0) {
			lblNumeroId.setText(Integer.toString(Peliculas.siguienteid()));

			System.out.println("Muestro lo que tiene LBLNUMEROID");
			System.out.println(Peliculas.get_Id());
		}else {
			lblNumeroId.setText("" + Peliculas.get_Id());
		}
		lblNumeroId.getText();
		add(lblNumeroId);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(218, 72, 146, 26);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		cbGeneros = new JComboBox<Genero>();
		cbGeneros.setBounds(218, 131, 181, 26);
		cbGeneros.addItem(new Genero(0, "Seleccione un genero"));
		cbGeneros.addItem(new Genero( 1, "Terror"));
		cbGeneros.addItem(new Genero( 2, "Accion"));
		cbGeneros.addItem(new Genero( 3, "Suspenso"));
		cbGeneros.addItem(new Genero( 4, "Romantica"));
		add(cbGeneros);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(71, 187, 115, 29);
		btnAceptar.addActionListener(new evtBtnAgregar(textFieldNombre, cbGeneros));

		add(btnAceptar);

	}
	@SuppressWarnings("unchecked")
	public PanelAgregarPeliculas() {
		AgregarPeliculas();

		list = new JList<Peliculas>();
		dlModel = new DefaultListModel<Peliculas>();
		list.setModel(dlModel);
	}
	public void setDefaultListModel(DefaultListModel<Peliculas> listModelRecibido) {
		this.dlModel = listModelRecibido;
	}
	public void reiniciarJPanelAgregar() {
		lblNumeroId.setText(Integer.toString(Peliculas.siguienteid()));
		textFieldNombre.setText("");
		cbGeneros.setSelectedIndex(0);
	}
	
	class evtBtnAgregar implements ActionListener
	{
		private JTextField Nombre;
		private JComboBox<Genero> JCBGenero;
		public evtBtnAgregar(JTextField Nombre, JComboBox<Genero> JCBGenero) {
			this.Nombre = Nombre;
			this.JCBGenero = JCBGenero;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String Mensaje="";
			if(Nombre.getText().isEmpty()) {Mensaje = "- El TextFiel Nombre esta Vacío "; }
			if(JCBGenero.getSelectedIndex() == 0){ Mensaje += "\n- No se ha Seleccionado Género"; }
			
			
			if(Mensaje.isEmpty() == false) {//Si la Variable Mensaje se encuentra no vacía se muestra en el mensaje.
				
				JOptionPane.showConfirmDialog(null, Mensaje ); 
				} else {
					Peliculas peli = new Peliculas();
					peli.setNombre(Nombre.getText().trim());
					peli.setGenero(JCBGenero.getSelectedIndex(), ((Genero)JCBGenero.getSelectedItem()).getDescripcion());
					//Muestro el Mensaje de la confirmacion de la pelicula.
					JOptionPane.showMessageDialog(null, peli.toString(), "Pelicula agregada", JOptionPane.PLAIN_MESSAGE);

					if (ListPeliculas.size() == 0)
						for (int i = 0; i < dlModel.size(); i ++)
							ListPeliculas.add(dlModel.elementAt(i));
					
					ListPeliculas.add(peli);
					dlModel.clear();
					for (Peliculas i : ListPeliculas)
					{
						dlModel.addElement(i);
					}
					
					reiniciarJPanelAgregar();
				}
		}
	}
	
	

}