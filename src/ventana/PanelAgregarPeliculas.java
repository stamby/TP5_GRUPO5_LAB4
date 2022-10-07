package ventana;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class PanelAgregarPeliculas extends JPanel {
	private JTextField textField;
	private JLabel lblId;
	private JLabel lblNombre;
	private JLabel lblGenero;
	private JLabel lblNumeroId;
	private JComboBox cbGeneros;
	private JButton btnAceptar;
	private Peliculas pelicula;
	
	
	public PanelAgregarPeliculas() {
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
		
		pelicula = new Peliculas();
		
		lblNumeroId = new JLabel("");
		lblNumeroId.setBounds(218, 26, 69, 20);
		lblNumeroId.setText(Integer.toString(pelicula.getId()));
		add(lblNumeroId);
		
		textField = new JTextField();
		textField.setBounds(218, 72, 146, 26);
		add(textField);
		textField.setColumns(10);
		
		cbGeneros = new JComboBox();
		cbGeneros.setBounds(218, 131, 181, 26);
		cbGeneros.addItem("Seleccione un genero");
		cbGeneros.addItem("Terror");
		cbGeneros.addItem("Accion");
		cbGeneros.addItem("Suspenso");
		cbGeneros.addItem("Romantica");
		add(cbGeneros);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(71, 187, 115, 29);
		add(btnAceptar);

	}
}
